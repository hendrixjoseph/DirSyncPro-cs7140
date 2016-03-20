/*
 * DirectoryVarGetSet.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2006, 2008 F. Gerbig
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
import edu.wright.dirsyncpro.Const.SymLinkMode;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterSet;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.Schedule;
import edu.wright.dirsyncpro.sync.RealtimeListener;
import edu.wright.dirsyncpro.tools.Log;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

/**
 * Contains variables and getter and setter methods for the Directory class.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class JobObject {

    protected boolean enabled;
    // sync mode
    protected Const.SyncMode syncMode;
    // Conflict mode for the bidirectional sync
    protected Const.SyncConflictResolutionMode syncConflictResolutionMode;
    // Compare mode
    protected Const.CompareMode syncCompareMode;
    /*
         * Mirror implicates: copyAll=false, copyNew=true, copyLarger=false, copyModified=true, copyLargerModified=false, deleteFiles=true, deleteDirs=true, filterSet={}, compareMode=CompareFileSizesDates;
		 * Full implicates: copyAll=true, copyNew=false, copyLarger=false, copyModified=false, copyLargerModified=false, deleteFiles=true, deleteDirs=true, filterSet={}, compareMode=CompareFileSizesDates;
		 * Contribute implicates: copyAll=false, copyNew=true, copyLarger=false, copyModified=false, copyLargerModified=false, deleteFiles=false, deleteDirs=false, filterSet={}, compareMode=CompareFileSizesDates;
		 * Custom initializes like Mirror but could be change any option.
     */
    // source and destination directories
    protected String dirA = "";
    protected Path pathA;
    protected String dirB = "";
    protected Path pathB;
    protected List<Schedule> schedules;
    protected FilterSet filterSet;
    //realtime sync
    protected boolean syncRealtime;
    protected boolean syncRealtimeOnStart;
    protected int syncRealtimeDelay = Const.DefaultRealtimeSyncDelayValue;
    protected RealtimeListener dirAListener;
    protected RealtimeListener dirBListener;
    String name = "";
    // log object for this directory
    private Log log;
    // copy options
    private boolean recursive;
    private boolean verify;
    private boolean copyAll;
    private boolean copyNew;
    private boolean copyLarger;
    private boolean copyModified;
    private boolean copyLargerModified;
    private boolean deleteDirs;
    private boolean deleteFiles;
    private boolean deleteExcludedDirsA;
    private boolean deleteExcludedFilesA;
    private boolean deleteExcludedDirsB;
    private boolean deleteExcludedFilesB;
    private int howManyBackups;
    private boolean backupInline;
    private String backupDir;

    private SymLinkMode symLinkMode;
    private boolean preserveDOSAttributes;
    private boolean preservePOSIXFilePermissions;
    private boolean preservePOSIXFileOwnership;
    private boolean overrideReadOnly;
    private boolean writeTimestampBack;
    private boolean syncDirTimeStamps;
    private boolean ignoreDaylightSavingGranularity;
    private int granulaity;

    /**
     * Returns the destination path of the directory to dirsyncpro.
     *
     * @return The destination path.
     */
    public String getDirB() {
        return dirB;
    }

    /**
     * Returns the name of the dirsyncpro action.
     *
     * @return String The name of the dirsyncpro action.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the dirsyncpro action.
     *
     * @param name The name of this dirsyncpro action.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the source path of the directory to dirsyncpro.
     *
     * @return The source path.
     */
    public String getDirA() {
        return dirA;
    }

    /**
     * Returns if all files are copied.
     *
     * @return {@code true} if all files are copied, else {@code false}.
     */
    public boolean isCopyAll() {
        return copyAll;
    }

    /**
     * Sets whether all files are copied.
     *
     * @param copyAll {@code true} if all files are copied.
     */
    public void setCopyAll(boolean copyAll) {
        this.copyAll = copyAll;
    }

    /**
     * Returns if only larger files are copied.
     *
     * @return {@code true} if only larger files are copied, else {@code false}.
     */
    public boolean isCopyLarger() {
        return copyLarger;
    }

    /**
     * Sets whether only larger files are copied.
     *
     * @param copyLarger {@code true} if only larger files are copied.
     */
    public void setCopyLarger(boolean copyLarger) {
        this.copyLarger = copyLarger;
    }

    /**
     * Returns if only files are copied that are larger <b>and </b> modified.
     *
     * @return {@code true} if only are copied that are larger <b>and </b> modified, else {@code false}.
     */
    public boolean isCopyLargerModified() {
        return copyLargerModified;
    }

    /**
     * Sets whether only files are copied that are larger <b>and </b> modified.
     *
     * @param copyLargerModified {@code true} if only files are copied that are larger <b>and </b> modified.
     */
    public void setCopyLargerModified(boolean copyLargerModified) {
        this.copyLargerModified = copyLargerModified;
    }

    /**
     * Returns if only modified files are copied.
     *
     * @return {@code true} if only modified files are copied, else {@code false}.
     */
    public boolean isCopyModified() {
        return copyModified;
    }

    /**
     * Sets whether only modified files are copied.
     *
     * @param copyModified {@code true} if only modified files are copied.
     */
    public void setCopyModified(boolean copyModified) {
        this.copyModified = copyModified;
    }

    /**
     * Returns if only new files (files not existing in the destination directory) are copied.
     *
     * @return {@code true} if only new files are copied, else {@code false}.
     */
    public boolean isCopyNew() {
        return copyNew;
    }

    /**
     * Sets whether only new files (files not existing in the destination directory) are copied.
     *
     * @param copyNew {@code true} if only new files are copied.
     */
    public void setCopyNew(boolean copyNew) {
        this.copyNew = copyNew;
    }

    /**
     * Returns if directories deleted in the source directory are deleted in the destination directory.
     *
     * @return {@code true} if directories deleted in the source directory are deleted in the destination directory,
     * else {@code false}.
     */
    public boolean isDelDirs() {
        return deleteDirs;
    }

    /**
     * Sets whether directories deleted in the source directory are deleted in the destination directory.
     *
     * @param delDirs {@code true} if directories deleted in the source directory are deleted in the destination
     *                directory.
     */
    public void setDelDirs(boolean delDirs) {
        this.deleteDirs = delDirs;
    }

    /**
     * Returns if files deleted in the source directory are deleted in the destination directory.
     *
     * @return {@code true} if files deleted in the source directory are deleted in the destination directory, else
     * {@code false}.
     */
    public boolean isDelFiles() {
        return deleteFiles;
    }

    /**
     * Sets whether files deleted in the source directory are deleted in the destination directory.
     *
     * @param delFiles {@code true} if files deleted in the source directory are deleted in the destination directory.
     */
    public void setDelFiles(boolean delFiles) {
        this.deleteFiles = delFiles;
    }

    /**
     * Get how man files of a changed or deleted file should be kept.
     *
     * @return number of backups to keep ({@code 0} means none).
     */
    public int getHowManyBackups() {
        return howManyBackups;
    }

    /**
     * Set how many backups of a changed or deleted file to keep.
     *
     * @param howManyBackups
     */
    public void setHowManyBackups(int howManyBackups) {
        this.howManyBackups = Math.min(howManyBackups, Const.BACKUP_MAX_NUMBER);
    }

    /**
     * Determines whether this directory is enabled.
     *
     * @return {@code true} if the component is enabled, {@code false} otherwise.
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Enables or disables this directory, depending on the value of the parameter enabled.
     *
     * @param enabled If {@code true}, this component is enabled; otherwise this component is disabled.
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Returns if the dirsyncpro is done with verify.
     *
     * @return {@code true} if verify is enabled.
     */
    public boolean isVerify() {
        return verify;
    }

    /**
     * Sets whether copied files should be verified.
     *
     * @param b Whether copied files should be verified. Set to {@code true} to enable verify.
     */
    public void setVerify(boolean b) {
        verify = b;
    }

    /**
     * Returns if the dirsyncpro is done with subfolders.
     *
     * @return {@code true} if the job is recursive, else {@code false}.
     */
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * Sets whether the dirsyncpro is done with subfolders.
     *
     * @param recursive Whether the dirsyncpro is done with subfolders. {@code true} if the synchroize is done with
     *                  subfolders.
     */
    public void setRecursive(boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * Sets the destination path of the directory to dirsyncpro.
     *
     * @param dst The destination path.
     */
    public void setDst(String dst) {
        this.dirB = dst;
    }

    /**
     * Sets the source path of the directory to dirsyncpro.
     *
     * @param src The source path.
     */
    public void setSrc(String src) {
        this.dirA = src;
    }

    /**
     * Returns the directory log object
     *
     * @return Log log The log
     */
    public Log getLog() {
        return log;
    }

    /**
     * Sets the directory log object
     *
     * @param log The log.
     */
    public void setLog(Log log) {
        if (this.log != null) {
            // close file so it is released
            log.disable();
        }
        this.log = log;
    }

    /**
     * @return the syncMode
     */
    public Const.SyncMode getSyncMode() {
        return syncMode;
    }

    /**
     * @return the backupDir
     */
    public String getBackupDir() {
        if (this.isBackupInline() || backupDir.equals("")) {
            return "";
        } else {
            return backupDir;
        }
    }

    /**
     * @param backupDir the backupDir to set
     */
    public void setBackupDir(String backupDir) {
        this.backupDir = backupDir;
    }

    /**
     * @return the backupInline
     */
    public boolean isBackupInline() {
        return backupInline;
    }

    /**
     * @param backupInline the backupInline to set
     */
    public void setBackupInline(boolean backupInline) {
        this.backupInline = backupInline;
    }

    /**
     * @return the syncCompareMode
     */
    public Const.CompareMode getSyncCompareMode() {
        return syncCompareMode;
    }

    /**
     * @param syncCompareMode the syncCompareMode to set
     */
    public void setSyncCompareMode(Const.CompareMode syncCompareMode) {
        this.syncCompareMode = syncCompareMode;
    }

    /**
     * @return the biDirSyncConflictMode
     */
    public Const.SyncConflictResolutionMode getSyncConflictResolutionMode() {
        return syncConflictResolutionMode;
    }

    /**
     * @param scrm the Sync Conflict Resolution Mode to set
     */
    public void setSyncConflictResolutionMode(Const.SyncConflictResolutionMode scrm) {
        this.syncConflictResolutionMode = scrm;
    }

    /**
     * @return the deleteExcludedDirsA
     */
    public boolean isDeleteExcludedDirsA() {
        return deleteExcludedDirsA;
    }

    /**
     * @param deleteExcludedDirs the deleteExcludedDirsA to set
     */
    public void setDeleteExcludedDirsA(boolean deleteExcludedDirs) {
        this.deleteExcludedDirsA = deleteExcludedDirs;
    }

    /**
     * @return the deleteExcludedFilesA
     */
    public boolean isDeleteExcludedFilesA() {
        return deleteExcludedFilesA;
    }

    /**
     * @param deleteExcludedFiles the deleteExcludedFilesA to set
     */
    public void setDeleteExcludedFilesA(boolean deleteExcludedFiles) {
        this.deleteExcludedFilesA = deleteExcludedFiles;
    }

    /**
     * @return the deleteExcludedDirsB
     */
    public boolean isDeleteExcludedDirsB() {
        return deleteExcludedDirsB;
    }

    /**
     * @param deleteExcludedDirsB the deleteExcludedDirsB to set
     */
    public void setDeleteExcludedDirsB(boolean deleteExcludedDirsB) {
        this.deleteExcludedDirsB = deleteExcludedDirsB;
    }

    /**
     * @return the deleteExcludedFilesB
     */
    public boolean isDeleteExcludedFilesB() {
        return deleteExcludedFilesB;
    }

    /**
     * @param deleteExcludedFilesB the deleteExcludedFilesB to set
     */
    public void setDeleteExcludedFilesB(boolean deleteExcludedFilesB) {
        this.deleteExcludedFilesB = deleteExcludedFilesB;
    }

    public SymLinkMode getSymLinkMode() {
        return symLinkMode;
    }

    public void setSymLinkMode(SymLinkMode slm) {
        this.symLinkMode = slm;
    }

    public boolean isWriteTimestampBack() {
        return writeTimestampBack;
    }

    public void setWriteTimestampBack(boolean writeTimestampBack) {
        this.writeTimestampBack = writeTimestampBack;
    }

    public int getGranularity() {
        return granulaity;
    }

    public void setGranularity(int gran) {
        this.granulaity = gran;
    }

    /**
     * Returns whether this job has schedules
     *
     * @return boolean, whether this job has schedules
     */
    public boolean HasSchedules() {
        return (!schedules.isEmpty());
    }

    /**
     * @return the schedules
     */
    public List<Schedule> getSchedules() {
        return schedules;
    }

    /**
     * @param schedules the schedules to set
     */
    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    /**
     * @param sched
     */
    public void addSchedule(Schedule sched) {
        schedules.add(sched);
        for (Schedule sch : schedules) {
            sch.calculateNextEvent();
        }
        Collections.sort(schedules);
    }

    /**
     * @return the filters array list
     */
    public FilterSet getFilterSet() {
        return filterSet;
    }

    public boolean isSyncDirTimeStamps() {
        return syncDirTimeStamps;
    }

    public void setSyncDirTimeStamps(boolean syncDirTimeStamps) {
        this.syncDirTimeStamps = syncDirTimeStamps;
    }

    public boolean isIgnoreDaylightSavingGranularity() {
        return ignoreDaylightSavingGranularity;
    }

    public void setIgnoreDaylightSavingGranularity(boolean ignoreDaylightSavingGranularity) {
        this.ignoreDaylightSavingGranularity = ignoreDaylightSavingGranularity;
    }

    public boolean isPreserveDOSAttributes() {
        return preserveDOSAttributes;
    }

    public void setPreserveDOSAttributes(boolean preserveDOSAttributes) {
        this.preserveDOSAttributes = preserveDOSAttributes;
    }

    public boolean isPreservePOSIXFilePermissions() {
        return preservePOSIXFilePermissions;
    }

    public void setPreservePOSIXFilePermissions(boolean preservePOSIXFilePermissions) {
        this.preservePOSIXFilePermissions = preservePOSIXFilePermissions;
    }

    public boolean isPreservePOSIXFileOwnership() {
        return preservePOSIXFileOwnership;
    }

    public void setPreservePOSIXFileOwnership(boolean preservePOSIXFileOwnership) {
        this.preservePOSIXFileOwnership = preservePOSIXFileOwnership;
    }

    public boolean isSyncRealtime() {
        return syncRealtime;
    }

    public void setSyncRealtime(boolean syncRealtime) {
        this.syncRealtime = syncRealtime;
    }

    public boolean isSyncRealtimeOnStart() {
        return syncRealtimeOnStart;
    }

    public void setSyncRealtimeOnStart(boolean syncRealtimeOnStart) {
        this.syncRealtimeOnStart = syncRealtimeOnStart;
    }

    public int getSyncRealtimeDelay() {
        return syncRealtimeDelay;
    }

    public void setSyncRealtimeDelay(int syncRealtimeDelay) {
        this.syncRealtimeDelay = syncRealtimeDelay;
    }

    public boolean isOverrideReadOnly() {
        return overrideReadOnly;
    }

    public void setOverrideReadOnly(boolean overwriteReadOnly) {
        this.overrideReadOnly = overwriteReadOnly;
    }
}
