/*
 * Directory.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2003-2006, 2008 F. Gerbig
 * Copyright (C) 2002 E. Gerber
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.wright.dirsyncpro.job;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.Const.IconKey;
import edu.wright.dirsyncpro.Const.SymLinkMode;
import edu.wright.dirsyncpro.Const.SyncConflictResolutionMode;
import edu.wright.dirsyncpro.Const.SyncMode;
import edu.wright.dirsyncpro.Const.SyncPairStatus;
import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.exceptions.IncompleteConfigurationException;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.Filter;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByPattern;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterSet;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.ScheduleEngine;
import edu.wright.dirsyncpro.sync.RealtimeListener;
import edu.wright.dirsyncpro.sync.Sync;
import edu.wright.dirsyncpro.sync.Sync.SyncError;
import edu.wright.dirsyncpro.sync.SyncPair;
import edu.wright.dirsyncpro.tools.DateTool;
import edu.wright.dirsyncpro.tools.FileTools;
import edu.wright.dirsyncpro.tools.Log;
import edu.wright.dirsyncpro.tools.TextFormatTool;
import edu.wright.dirsyncpro.tools.WildcardTools;
import edu.wright.google.api.services.drive.DriveSync;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;

/**
 * Represents a directory (source and destination) to be synchronized. Contains
 * the source and destination path to sync, whether the sync will be done
 * recursive, which file extensions to fileInclude and fileExclude, if and where
 * to log what's being done and how the synchronization should be done.
 *
 * @author E. Gerber, F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public class Job extends JobObject implements Cloneable {

    /**
     * Initializes a new Directory.
     */
    private Job() {
        init();
        this.setEnabled(true);
    }

    /**
     * Initializes a new Directory.
     *
     * @param enabled The enabled state of the directory.
     */
    public Job(boolean enabled) {
        this();
        this.setEnabled(enabled);
    }

    @Override
    public String toString() {
        return getName();
    }

    /**
     * Initializes the Directory
     */
    public void init() {
        this.setLog(new Log("", this)); //dummy log. default log is used instead initially.
        if (this.getSyncMode() == null) {
            this.setSyncMode(Const.SyncMode.ABMirror);
        } else {
            //make sure all settings are ok;
            this.setSyncMode(this.getSyncMode());
        }
        this.setRecursive(true);
        this.setVerify(false);
        this.setSyncRealtime(false);
        this.setSyncRealtimeOnStart(true);
        this.setHowManyBackups(0);
        this.setBackupInline(true);
        this.setSymLinkMode(SymLinkMode.SkipSymLinks);
        this.setWriteTimestampBack(false);
        this.setSyncDirTimeStamps(false);
        this.setIgnoreDaylightSavingGranularity(false);
        this.setGranularity(0);
        this.schedules = new ArrayList<>();
    }

    /**
     * @param syncMode the syncMode to set
     */
    public void setSyncMode(Const.SyncMode syncMode) {
        this.syncMode = syncMode;
        switch (syncMode) {
            case ABMirror:
            case BAMirror:
                this.setCopyAll(false);
                this.setCopyNew(true);
                this.setCopyModified(true);
                this.setCopyLargerModified(false);
                this.setDelDirs(true);
                this.setDelFiles(true);
                this.setSyncConflictResolutionMode(Const.SyncConflictResolutionMode.CopySource);
                this.initFilters();
                break;
            case ABCustom:
            case BACustom:
            case BICustom:
                break;
            case BIMirror:
                this.setCopyAll(false);
                this.setCopyNew(true);
                this.setCopyModified(true);
                this.setCopyLargerModified(false);
                this.setDelDirs(true);
                this.setDelFiles(true);
                this.setSyncConflictResolutionMode(Const.SyncConflictResolutionMode.WarnUser);
                this.initFilters();
                break;
            case ABFull:
            case BAFull:
                this.setCopyAll(true);
                this.setCopyNew(false);
                this.setCopyModified(false);
                this.setCopyLargerModified(false);
                this.setDelDirs(true);
                this.setDelFiles(true);
                this.setSyncConflictResolutionMode(Const.SyncConflictResolutionMode.CopySource);
                this.initFilters();
                break;
            case ABContribute:
            case BAContribute:
                this.setCopyAll(false);
                this.setCopyNew(true);
                this.setCopyModified(false);
                this.setCopyLargerModified(false);
                this.setDelDirs(false);
                this.setDelFiles(false);
                this.setSyncConflictResolutionMode(Const.SyncConflictResolutionMode.Skip);
                this.initFilters();
                break;
        }
        this.setDeleteExcludedDirsA(false);
        this.setDeleteExcludedFilesA(false);
        this.setDeleteExcludedDirsB(false);
        this.setDeleteExcludedFilesB(false);
        this.setSyncCompareMode(Const.COMPARE_MODE_DEFAULT);
        this.setPreserveDOSAttributes(false);
        this.setPreservePOSIXFilePermissions(false);
        this.setPreservePOSIXFileOwnership(false);
        this.setOverrideReadOnly(false);
    }

    private void initFilters() {
        this.filterSet = new FilterSet();
        this.filterSet.addFilter(new FilterByPattern(this, Filter.Action.Include, Const.DEFAULT_INCLUDE_FILE, FilterByPattern.FilterPatternType.File, false));
        this.filterSet.addFilter(new FilterByPattern(this, Filter.Action.Include, Const.DEFAULT_INCLUDE_DIR, FilterByPattern.FilterPatternType.Directory, false));
    }

    public void resetFilters() {
        this.filterSet = new FilterSet();
    }

    private void generateSyncQ(Path pA, Path pB, boolean ab) {
        // calculate number of steps

        pathA = new File(dirA).toPath();
        pathB = new File(dirB).toPath();
        DSPFileVisitor dspFileVistor = new DSPFileVisitor(filterSet, ab, this);

        int maxDepth = (isRecursive() ? Integer.MAX_VALUE : 1);

        if (DirSyncPro.isGuiMode()) {
            DirSyncPro.getGui().registerProgressBars(-1, -1, 0, "", false, 0, 100, "Analyzing: " + this.name, true);
        }
        try {
            //deletion Analysis
            //do not delete stuff in Bidirectional Sync Mode
            boolean deletionAnalysis = (isDelFiles() || isDelDirs()) && !syncMode.isBI();
            if (deletionAnalysis) {
                dspFileVistor.setDeletionAnalysis(true);
                dspFileVistor.resetDepth();
                if (ab) {
                    Files.walkFileTree(pB, (getSymLinkMode() == SymLinkMode.FollowSymLinks ? EnumSet.of(FileVisitOption.FOLLOW_LINKS) : EnumSet.noneOf(FileVisitOption.class)), maxDepth, dspFileVistor);
                } else {
                    Files.walkFileTree(pA, (getSymLinkMode() == SymLinkMode.FollowSymLinks ? EnumSet.of(FileVisitOption.FOLLOW_LINKS) : EnumSet.noneOf(FileVisitOption.class)), maxDepth, dspFileVistor);
                }
            }

            //copy analysis
            dspFileVistor.setDeletionAnalysis(false);
            dspFileVistor.resetDepth();
            if (ab) {
                Files.walkFileTree(pA, (getSymLinkMode() == SymLinkMode.FollowSymLinks ? EnumSet.of(FileVisitOption.FOLLOW_LINKS) : EnumSet.noneOf(FileVisitOption.class)), maxDepth, dspFileVistor);
            } else {
                Files.walkFileTree(pB, (getSymLinkMode() == SymLinkMode.FollowSymLinks ? EnumSet.of(FileVisitOption.FOLLOW_LINKS) : EnumSet.noneOf(FileVisitOption.class)), maxDepth, dspFileVistor);
            }
        } catch (IOException exc) {
            getLog().printMinimal("Unable to analyze: " + this.name + " (" + exc.getMessage() + ")", IconKey.Error);
        }
    }

    private void syncFromGoogleDrive() throws IncompleteConfigurationException {
        File dirB = retrieveDirB();

        try {
            DriveSync.downloadFiles(dirB.getAbsolutePath());
        } catch (IOException exc) {
            getLog().printMinimal("Unable to analyze: " + this.name + " (" + exc.getMessage() + ")", IconKey.Error);
        }
    }

    private void syncToGoogleDrive() throws IncompleteConfigurationException {
        File dirA = retrieveDirA();

        int maxDepth = (isRecursive() ? Integer.MAX_VALUE : 1);

        try {
            Files.walkFileTree(dirA.toPath(), (getSymLinkMode() == SymLinkMode.FollowSymLinks ? EnumSet.of(FileVisitOption.FOLLOW_LINKS) : EnumSet.noneOf(FileVisitOption.class)), maxDepth, new ToGoogleDriveFileVisitor());
        } catch (IOException exc) {
            getLog().printMinimal("Unable to analyze: " + this.name + " (" + exc.getMessage() + ")", IconKey.Error);
        }
    }

    private File retrieveDirA() throws IncompleteConfigurationException {
        // check if src directory exists
        if (dirA.isEmpty()) {
            getLog().printMinimal(" Directory A is not specified!", IconKey.Error);
            throw new IncompleteConfigurationException("Directory A is not specified!");
        }
        File fA = new File(dirA);
        if (!fA.exists() || !fA.isDirectory()) {
            getLog().printMinimal(" Directory A: '" + fA.getAbsolutePath() + "' doesn't exist or isn't a directory!", IconKey.Error);
            throw new IncompleteConfigurationException();
        }
        if (fA.exists() && !fA.isDirectory()) {
            getLog().printMinimal(" Directory A: '" + fA.getAbsolutePath() + "' isn't a directory!", IconKey.Error);
            throw new IncompleteConfigurationException();
        }

        return fA;
    }

    private File retrieveDirB() throws IncompleteConfigurationException {
        // check if dst directory exists
        if (dirB.isEmpty()) {
            getLog().printMinimal(" Directory B is not specified!", IconKey.Error);
            throw new IncompleteConfigurationException("Directory B is not specified!");
        }
        File fB = new File(dirB);
        if (!fB.exists()) {
            getLog().printMinimal(" Directory B: '" + fB.getAbsolutePath() + "' doesn't exist, it will be created when synchronizing.", IconKey.Warning);
            //DirSyncPro.getSync().getSyncQ().add(new SyncPair(fA, fB, analyzeSyncPairStatus(fA, fB, true, true, false, true, true, false), this));
            DirSyncPro.getSync().setError(Sync.SyncError.Warning);
        }
        if (fB.exists() && !fB.isDirectory()) {
            getLog().printMinimal(" Directory B: '" + fB.getAbsolutePath() + "' isn't a directory!", IconKey.Error);
            throw new IncompleteConfigurationException();
        }

        return fB;
    }

    public void analyze() throws IncompleteConfigurationException {
        DirSyncPro.getSync().sleepOnPause();

        if (DirSyncPro.getSync().isStopping()) {
            return;
        }

        getLog().printMinimal("*** Analyzing job: " + name, IconKey.Info);

        printJobOptions();

        if ("Google Drive".equals(dirA) && "Google Drive".equals(dirB)) {
            getLog().printMinimal(" Can't sync Google Drive to Google Drive!", IconKey.Error);
            throw new IncompleteConfigurationException("Can't sync Google Drive to Google Drive!");
        } else if ("Google Drive".equals(dirA)) {
            syncFromGoogleDrive();
        } else if ("Google Drive".equals(dirB)) {
            syncToGoogleDrive();
        } else {
            File fA = retrieveDirA();
            File fB = retrieveDirB();

            if (syncMode == SyncMode.ABMirror || syncMode == SyncMode.ABFull || syncMode == SyncMode.ABContribute || syncMode == SyncMode.ABCustom) {
                generateSyncQ(fA.toPath(), fB.toPath(), true);
            } else if (syncMode == SyncMode.BAMirror || syncMode == SyncMode.BAFull || syncMode == SyncMode.BAContribute || syncMode == SyncMode.BACustom) {
                generateSyncQ(fA.toPath(), fB.toPath(), false);
            } else if (syncMode.isBI()) {
                generateSyncQ(fA.toPath(), fB.toPath(), true);
                generateSyncQ(fA.toPath(), fB.toPath(), false);
            }
        }
    }

    /**
     * Copies the options from the given job to this job.
     *
     * @param job The job from which to copy the options.
     */
    public void copyOptions(Job job) {
        setSyncMode(job.getSyncMode());
        setSyncConflictResolutionMode(job.getSyncConflictResolutionMode());

        setSyncCompareMode(job.getSyncCompareMode());

        setCopyAll(job.isCopyAll());
        setCopyNew(job.isCopyNew());
        setCopyLarger(job.isCopyLarger());
        setCopyModified(job.isCopyModified());
        setCopyLargerModified(job.isCopyLargerModified());

        setDelFiles(job.isDelFiles());
        setDelDirs(job.isDelDirs());
        setRecursive(job.isRecursive());
        setVerify(job.isVerify());

        setSyncRealtime(job.isSyncRealtime());
        setSyncRealtimeOnStart(job.isSyncRealtimeOnStart());
        setSyncRealtimeDelay(job.getSyncRealtimeDelay());

        setGranularity(job.getGranularity());
        setSyncDirTimeStamps(job.isSyncDirTimeStamps());
        setIgnoreDaylightSavingGranularity(job.isIgnoreDaylightSavingGranularity());

        filterSet = (FilterSet) job.getFilterSet().clone();

        setHowManyBackups(job.getHowManyBackups());
        setBackupInline(job.isBackupInline());
        setBackupDir(job.getBackupDir());

        setSymLinkMode(job.getSymLinkMode());
        setWriteTimestampBack(job.isWriteTimestampBack());

        setSchedules(job.getSchedules());
    }

    private void printJobOptions() {
        getLog().printExcessive("Options for job '" + getName() + "': ", Const.IconKey.Info);
        getLog().printExcessive("  Source Path: \"" + getDirA() + "\"", Const.IconKey.Info);
        getLog().printExcessive("  Destination Path: \"" + getDirB() + "\"", Const.IconKey.Info);
        getLog().printExcessive("  Sync Mode: \"" + getSyncMode() + "\"", Const.IconKey.Info);
        getLog().printExcessive("  Include subfolders: " + isRecursive(), Const.IconKey.Info);
        getLog().printExcessive("  Verify: " + isVerify(), Const.IconKey.Info);
        getLog().printExcessive("  Conflict mode for BiDir Sync: " + getSyncConflictResolutionMode(), Const.IconKey.Info);
        getLog().printExcessive("  Number of Backups: " + getHowManyBackups(), Const.IconKey.Info);
        getLog().printExcessive("  Backup in dest dir: " + isBackupInline(), Const.IconKey.Info);
        if (!isBackupInline()) {
            getLog().printExcessive("  Backup dir: " + getBackupDir(), Const.IconKey.Info);
        }
        getLog().printExcessive("  Write Timestamp back: " + isWriteTimestampBack(), Const.IconKey.Info);
        getLog().printExcessive("  Granularity: " + getGranularity() + " s", Const.IconKey.Info);
        getLog().printExcessive("  Ignore daylight saving granularity: " + isIgnoreDaylightSavingGranularity(), Const.IconKey.Info);
        getLog().printExcessive("  Sync timestamp of the dirs: " + isSyncDirTimeStamps(), Const.IconKey.Info);
        getLog().printExcessive("  Symbolic Link handling: " + getSymLinkMode(), Const.IconKey.Info);
        getLog().printExcessive("  Preserve DOS attributes: " + isPreserveDOSAttributes(), Const.IconKey.Info);
        getLog().printExcessive("  Preserve POSIX permissions: " + isPreservePOSIXFilePermissions(), Const.IconKey.Info);
        getLog().printExcessive("  Preserve POSIX ownership: " + isPreservePOSIXFileOwnership(), Const.IconKey.Info);

        String logFilename = getLog().getFilename();
        logFilename = WildcardTools.replaceDateWildcards(logFilename, DirSyncPro.getSync().getSyncDate());
        logFilename = WildcardTools.replaceTimeWildcards(logFilename, DirSyncPro.getSync().getSyncDate());
        //HIERRR

        getLog().printExcessive("  Logfile: \"" + logFilename + "\"", Const.IconKey.Info);

        if (filterSet.hasFilters()) {
            for (Filter filt : filterSet.getFilters()) {
                getLog().printExcessive("  Filter: " + filt.getAction().toString() + " " + filt.toString(), Const.IconKey.Info);
            }
        }

        getLog().printExcessive("  Sync options:", Const.IconKey.Info);
        getLog().printExcessive("    All: " + isCopyAll(), Const.IconKey.Info);
        getLog().printExcessive("    New: " + isCopyNew(), Const.IconKey.Info);
        getLog().printExcessive("    Modified: " + isCopyModified(), Const.IconKey.Info);
        getLog().printExcessive("    Larger: " + isCopyLarger(), Const.IconKey.Info);
        getLog().printExcessive("    LargerModified: " + isCopyLargerModified(), Const.IconKey.Info);
        getLog().printExcessive("    Delete Files: " + isDelFiles(), Const.IconKey.Info);
        getLog().printExcessive("    Delete Dirs: " + isDelDirs(), Const.IconKey.Info);
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return a clone of this instance.
     *
     * @throws CloneNotSupportedException if the object's class does not support
     * the {@code Cloneable} interface.
     * @see java.lang.Cloneable
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        restartRealtimeListeners();
    }

    /**
     * Stops running listeners and start new if necessary
     */
    public void restartRealtimeListeners() {
        //final Job j1 = this;
        //DirSyncPro.getSync().synchronize(new List<Job>(){{add(j1);}});

        stopRealtimeListeners();
        if (!enabled) {
            return;
        }

        if (!syncRealtime) {
            return;
        }
        if (dirA.isEmpty() || dirB.isEmpty()) {
            return;
        }

        // initial syncronization
        if (syncRealtimeOnStart) {
            ScheduleEngine.getRealtimeInstance().scheduleRealtime(this, 0);
        }

        // Start DirA listener
        try {
            dirAListener = new RealtimeListener(dirA);
        } catch (IOException e1) {
            getLog().printMinimal("Unable to setup realtime monitor for " + dirA + ": " + e1.getMessage(), IconKey.Error);
            return;
        }

        // Start DirB listener
        try {
            dirBListener = new RealtimeListener(dirB);
        } catch (IOException e1) {
            getLog().printMinimal("Unable to setup realtime monitor for " + dirB + ": " + e1.getMessage(), IconKey.Error);
            return;
        }

        final Job j = this;
        //schedule next syncronization once any change appears
        RealtimeListener.RealtimeChangeListener changeListener = we -> ScheduleEngine.getRealtimeInstance().scheduleRealtime(j, syncRealtimeDelay * 1000);

        dirAListener.setChangeListener(changeListener);
        dirBListener.setChangeListener(changeListener);
        dirAListener.start();
        dirBListener.start();

    }

    protected void stopRealtimeListeners() {
        if (dirAListener != null) {
            dirAListener.stop();
        }
        if (dirBListener != null) {
            dirBListener.stop();
        }
    }

}
