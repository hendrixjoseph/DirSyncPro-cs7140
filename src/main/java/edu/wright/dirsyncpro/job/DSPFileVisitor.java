/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wright.dirsyncpro.job;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterSet;
import edu.wright.dirsyncpro.sync.Sync;
import edu.wright.dirsyncpro.sync.SyncPair;
import edu.wright.dirsyncpro.tools.DateTool;
import edu.wright.dirsyncpro.tools.FileTools;
import edu.wright.dirsyncpro.tools.TextFormatTool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Joe
 */
class DSPFileVisitor extends SimpleFileVisitor<Path> {

    private FilterSet filters;
    private boolean ab;
    private int depth;
    private boolean deletionAnalysis;
    private Job job;

    public DSPFileVisitor(FilterSet filters, boolean ab, Job job) {
        super();
        this.filters = filters;
        this.ab = ab;
        this.depth = -1;
        this.job = job;
    }

    private SyncPair analyzeSyncPairStatus(File fA, File fB, boolean ab, boolean deletionAnalysis, boolean excluded) {
        long fADate;
        long fBDate;
        boolean fAEx;
        boolean fBEx;
        boolean fAIsDir;
        boolean fBIsDir;
        long fASize;
        long fBSize;

        fAEx = true; //will change otherwise if exception happens
        // reading dates should be run first because they can imply if there could be an I/O Error
        try {
            fADate = Files.getLastModifiedTime(fA.toPath()).toMillis();
        } catch (FileNotFoundException | NoSuchFileException e) {
            fAEx = false;
            fADate = 0;
        } catch (IOException e) {
            job.getLog().printMinimal("I/O Error: " + e.getMessage(), Const.IconKey.Error);
            return null;
        }

        fBEx = true; //will change otherwise if exception happens
        // reading dates should be run first because they can imply if there could be an I/O Error
        try {
            fBDate = Files.getLastModifiedTime(fB.toPath()).toMillis();
        } catch (FileNotFoundException | NoSuchFileException e) {
            fBEx = false;
            fBDate = 0;
        } catch (IOException e) {
            job.getLog().printMinimal("I/O Error: " + e.getMessage(), Const.IconKey.Error);
            return null;
        }

        fAIsDir = (fAEx && fA.isDirectory());
        fBIsDir = (fBEx && fB.isDirectory());
        fASize = (fAEx ? fA.length() : 0);
        fBSize = (fBEx ? fB.length() : 0);

        if (deletionAnalysis) {
            job.getLog().printExcessive("Deletion analysis info A: " + fA.getAbsolutePath() + " [" + (fAEx ? "exists" : "does not exist") + (fAIsDir ? ", dir" : ", file") + "]", Const.IconKey.Info);
            job.getLog().printExcessive("Deletion analysis info B: " + fB.getAbsolutePath() + " [" + (fBEx ? "exists" : "does not exist") + (fBIsDir ? ", dir" : ", file") + "]", Const.IconKey.Info);

            if (!excluded) {
                assert fAEx || fBEx;
                if ((job.getHowManyBackups() > 0) && (fA.getAbsolutePath().contains(Const.BACKUP_FOLDER_NAME) || fB.getAbsolutePath().contains(Const.BACKUP_FOLDER_NAME))) {
                    // don't delete things in the backup folder
                } else if (ab && fBEx && fBIsDir && !fAEx && job.isDelDirs()) {
                    job.getLog().printModerate("Redundant: " + fB.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirBIsRedundant, job);
                } else if (ab && fBEx && !fBIsDir && !fAEx && job.isDelFiles()) {
                    job.getLog().printModerate("Redundant: " + fB.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileBIsRedundant, job);
                } else if (!ab && fAEx && fAIsDir && !fBEx && job.isDelDirs()) {
                    job.getLog().printModerate("Redundant: " + fA.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirAIsRedundant, job);
                } else if (!ab && fAEx && !fAIsDir && !fBEx && job.isDelFiles()) {
                    job.getLog().printModerate("Redundant: " + fA.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileAIsRedundant, job);
                }
                // default for deletion analysis
                return null;
            }
        } else // !deletionAnalysis
        {
            if (excluded) {
                // !deletionAnalysis && excluded
                //This file is being excluded (during copy analysis). Delete it if excluded files/dirs are intended to be deleted.
                boolean isDeleteExcluded = job.getSyncMode() != Const.SyncMode.BIMirror && job.getFilterSet().hasExcludeFilters();
                if (isDeleteExcluded && !fAIsDir && fAEx && job.isDeleteExcludedFilesA()) {
                    job.getLog().printModerate("Delete excluded file from Dir A: " + fA.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileAIsRedundant, job);
                }
                if (isDeleteExcluded && fAIsDir && fAEx && job.isDeleteExcludedDirsA()) {
                    job.getLog().printModerate("Delete excluded dir from Dir A: " + fA.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirAIsRedundant, job);
                }
                if (isDeleteExcluded && !fBIsDir && fBEx && job.isDeleteExcludedFilesB()) {
                    job.getLog().printModerate("Delete excluded file from Dir B: " + fB.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileBIsRedundant, job);
                }
                if (isDeleteExcluded && fBIsDir && fBEx && job.isDeleteExcludedDirsB()) {
                    job.getLog().printModerate("Delete excluded dir from Dir B: " + fB.getAbsolutePath(), Const.IconKey.Deleted);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirBIsRedundant, job);
                }
            } else {
                // !deletionAnalysis && !!excluded
                //copy analysis
                job.getLog().printExcessive("Copy analysis info A: " + fA.getAbsolutePath() + " [" + (fAEx ? "exists" : "does not exist") + (fAIsDir ? ", dir" : ", file") + ", " + TextFormatTool.getLastModifiedLong(fADate) + ", " + fASize + " bytes]", Const.IconKey.Info);
                job.getLog().printExcessive("Copy analysis info B: " + fB.getAbsolutePath() + " [" + (fBEx ? "exists" : "does not exist") + (fBIsDir ? ", dir" : ", file") + ", " + TextFormatTool.getLastModifiedLong(fBDate) + ", " + fBSize + " bytes]", Const.IconKey.Info);

                if (ab && fAEx && fAIsDir && job.isCopyAll()) {
                    job.getLog().printModerate("Copy forced: " + fA.getAbsolutePath(), Const.IconKey.DirA);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirACopyForced, job);
                }

                if (!ab && fBEx && fBIsDir && job.isCopyAll()) {
                    job.getLog().printModerate("Copy forced: " + fB.getAbsolutePath(), Const.IconKey.DirB);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirBCopyForced, job);
                }
                if (ab && fAEx && !fAIsDir && job.isCopyAll()) {
                    job.getLog().printModerate("Copy forced: " + fA.getAbsolutePath(), Const.IconKey.CopyForced);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileACopyForced, job);
                }

                if (!ab && fBEx && !fBIsDir && job.isCopyAll()) {
                    job.getLog().printModerate("Copy forced: " + fB.getAbsolutePath(), Const.IconKey.CopyForced);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileBCopyForced, job);
                }

                if (ab && fAEx && !fBEx && fAIsDir && job.isCopyNew()) {
                    job.getLog().printModerate("New: " + fA.getAbsolutePath(), Const.IconKey.DirA);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirAIsNew, job);
                }

                if (!ab && !fAEx && fBEx && fBIsDir && job.isCopyNew()) {
                    job.getLog().printModerate("New: " + fB.getAbsolutePath(), Const.IconKey.DirB);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirBIsNew, job);
                }

                if (ab && fAEx && !fBEx && job.isCopyNew()) {
                    job.getLog().printModerate("New: " + fA.getAbsolutePath(), Const.IconKey.CopyNew);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileAIsNew, job);
                }

                if (!ab && !fAEx && fBEx && job.isCopyNew()) {
                    job.getLog().printModerate("New: " + fB.getAbsolutePath(), Const.IconKey.CopyNew);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileBIsNew, job);
                }

                assert fAEx && fBEx;

                boolean fileASameSizefileB = (fASize == fBSize);
                boolean fileAIsLarger = (fASize > fBSize);
                boolean fileBIsLarger = (fASize < fBSize);

                int modCompare = DateTool.cmpDates(fADate, fBDate, job.getGranularity(), job.isIgnoreDaylightSavingGranularity());

                boolean fileASameDatefileB = (modCompare == 0);
                boolean fileAIsModified = (modCompare == -1);
                boolean fileBIsModified = (modCompare == 1);

                if (fileASameSizefileB && job.getSyncCompareMode() == Const.CompareMode.CompareFileContents && fA.isFile() && fB.isFile()) {
                    try {
                        modCompare = FileTools.checksumIdentical(fA, fB) ? 0 : 1;
                    } catch (FileNotFoundException we) {
                        job.getLog().printMinimal("Warning: " + we.getMessage(), Const.IconKey.Warning);
                        DirSyncPro.getSync().setError(Sync.SyncError.Warning);
                    }
                    fileAIsModified = fileBIsModified = (modCompare == 1);
                }

                if (fileASameDatefileB && job.getSyncCompareMode() == Const.CompareMode.CompareFileSizesDatesMetaData) {
                    modCompare = FileTools.cmpFileAttributes(fA, fB);
                    fileAIsModified = fileBIsModified = (modCompare == 1);
                }

                if (job.isSyncDirTimeStamps() && ab && !fileASameDatefileB && fAIsDir && fBIsDir
                        && ((job.isCopyModified())
                        || (job.getSyncMode().isBI() && job.getSyncConflictResolutionMode() == Const.SyncConflictResolutionMode.CopyModified))) {
                    job.getLog().printModerate("Modified: " + fA.getAbsolutePath(), Const.IconKey.CopyModified);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirAIsModified, job);
                }

                if (job.isSyncDirTimeStamps() && !ab && !fileASameDatefileB
                        && ((job.isCopyModified())
                        || (job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyModified)))) {
                    job.getLog().printModerate("Modified: " + fB.getAbsolutePath(), Const.IconKey.CopyModified);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.DirBIsModified, job);
                }

                // do nothing if both dirs exist and not returned above
                if (!fAEx || !fBEx || fAIsDir || fBIsDir) {
                    return null;
                }

                assert !fAIsDir && !fBIsDir && fAEx && fBEx;

                if (ab
                        && ((fileAIsModified && (job.isCopyModified()) && (job.getSyncMode() == Const.SyncMode.ABMirror || job.getSyncMode() == Const.SyncMode.ABCustom))
                        || (fileAIsModified && job.getSyncMode().isBI() && job.getSyncConflictResolutionMode() == Const.SyncConflictResolutionMode.CopyModified))) {
                    job.getLog().printModerate("Modified: " + fA.getAbsolutePath(), Const.IconKey.CopyModified);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileAIsModified, job);
                }

                if (!ab
                        && ((fileBIsModified && (job.isCopyModified()) && (job.getSyncMode() == Const.SyncMode.BAMirror || job.getSyncMode() == Const.SyncMode.BACustom))
                        || (fileBIsModified && job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyModified)))) {
                    job.getLog().printModerate("Modified: " + fB.getAbsolutePath(), Const.IconKey.CopyModified);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileBIsModified, job);
                }

                if (ab && fileAIsLarger
                        && ((job.isCopyLarger() && (job.getSyncMode() == Const.SyncMode.ABMirror || job.getSyncMode() == Const.SyncMode.ABCustom))
                        || (job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyLarger)))) {
                    job.getLog().printModerate("Larger: " + fA.getAbsolutePath(), Const.IconKey.CopyLarger);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileAIsLarger, job);
                }

                if (!ab && fileBIsLarger
                        && ((job.isCopyLarger() && (job.getSyncMode() == Const.SyncMode.BAMirror || job.getSyncMode() == Const.SyncMode.BACustom))
                        || (job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyLarger)))) {
                    job.getLog().printModerate("Larger: " + fB.getAbsolutePath(), Const.IconKey.CopyLarger);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileBIsLarger, job);
                }

                if (ab && fileAIsModified && fileAIsLarger
                        && ((job.isCopyLargerModified() && (job.getSyncMode() == Const.SyncMode.ABMirror || job.getSyncMode() == Const.SyncMode.ABCustom))
                        || (job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyLargerAndModified)))) {
                    job.getLog().printModerate("Larger & Modified: " + fA.getAbsolutePath(), Const.IconKey.CopyLargerModified);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileAIsLargerAndModified, job);
                }

                if (!ab && fileBIsModified && fileBIsLarger
                        && ((job.isCopyLargerModified() && (job.getSyncMode() == Const.SyncMode.BAMirror || job.getSyncMode() == Const.SyncMode.BACustom))
                        || (job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyLargerAndModified)))) {
                    job.getLog().printModerate("Larger & Modified: " + fB.getAbsolutePath(), Const.IconKey.CopyLargerModified);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.FileBIsLargerAndModified, job);
                }

                //Monodirectional conflict resolution by copying the source
                if (ab && ((!fileASameDatefileB || !fileASameSizefileB) && !job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopySource))) {
                    job.getLog().printModerate("Monodirectional conflict resolution by copying the source: " + fA.getAbsolutePath(), Const.IconKey.SyncConflict);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.ConflictResolutionCopySourceA, job);
                }
                if (!ab && ((!fileASameDatefileB || !fileASameSizefileB) && !job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopySource))) {
                    job.getLog().printModerate("Monodirectional conflict resolution by copying the source: " + fB.getAbsolutePath(), Const.IconKey.SyncConflict);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.ConflictResolutionCopySourceB, job);
                }

                //Bidirectional conflict resolution by renaming
                if ((ab && job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyRenamed))
                        && (fileAIsModified || !fileASameSizefileB)) {
                    job.getLog().printModerate("Bidirectional conflict resolution by renaming: " + fA.getAbsolutePath() + " & " + fB.getAbsolutePath(), Const.IconKey.SyncConflict);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.ConflictResolutionRename, job);
                }
                if ((!ab && job.getSyncMode().isBI() && job.getSyncConflictResolutionMode().equals(Const.SyncConflictResolutionMode.CopyRenamed))
                        && (fileBIsModified || !fileASameSizefileB)) {
                    job.getLog().printModerate("Bidirectional conflict resolution by renaming: " + fA.getAbsolutePath() + " & " + fB.getAbsolutePath(), Const.IconKey.SyncConflict);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.ConflictResolutionRename, job);
                }

                //Bidirectional & Monodirectional conflict resolutin by warning
                if (ab && (((fileAIsModified || !fileASameSizefileB) && job.getSyncMode().isBI())
                        || ((!fileASameDatefileB || !fileASameSizefileB) && !job.getSyncMode().isBI()))
                        && job.getSyncConflictResolutionMode() == Const.SyncConflictResolutionMode.WarnUser) {
                    job.getLog().printModerate("Sync conflict warning: " + fA.getAbsolutePath() + " & " + fB.getAbsolutePath(), Const.IconKey.SyncConflict);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.ConflictResolutionWarn, job);
                }
                if (!ab && (((fileBIsModified || !fileASameSizefileB) && job.getSyncMode().isBI())
                        || ((!fileASameDatefileB || !fileASameSizefileB) && !job.getSyncMode().isBI()))
                        && job.getSyncConflictResolutionMode() == Const.SyncConflictResolutionMode.WarnUser) {
                    job.getLog().printModerate("Sync conflict warning: " + fA.getAbsolutePath() + " & " + fB.getAbsolutePath(), Const.IconKey.SyncConflict);
                    return new SyncPair(fA, fB, fAEx, fBEx, fADate, fBDate, fASize, fBSize, Const.SyncPairStatus.ConflictResolutionWarn, job);
                }
                //default
                return null;
            }
        }
        //dummy
        return null;
    }

    /**
     * Changes the path of the given file from the source path to the
     * destination path.
     *
     * @param srcFile The file in the source directory.
     * @param srcPath The source path.
     * @param dstPath The destination path.
     *
     * @return File The file with the destination path.
     */
    private static Path replacePath(Path srcFile, Path srcPath, Path dstPath) {

        // get actual path
        String path = srcFile.toAbsolutePath().toString();
        // delete source path from actual path
        String cut = path.substring(srcPath.toAbsolutePath().toString().length(), path.length());

        if (!cut.startsWith(File.separator)) {
            cut = File.separator + cut;
        }
        // add destination path with remaining actual path
        String newPath = dstPath.toAbsolutePath().toString() + cut;

        return new File(newPath).toPath();
    }

    private void analyzeFilePair(Path p, boolean ab, boolean deletionAnalysis, boolean excluded) {
        DirSyncPro.getSync().sleepOnPause();
        SyncPair sp = null;
        File fA = null, fB = null;

        if ((ab && !deletionAnalysis) || (!ab && deletionAnalysis)) {
            fA = p.toFile();
            fB = replacePath(p, job.getPathA(), job.getPathB()).toFile();
        } else if ((!ab && !deletionAnalysis) || (ab && deletionAnalysis)) {
            fB = p.toFile();
            fA = replacePath(p, job.getPathB(), job.getPathA()).toFile();
        }

        job.getLog().printModerate((deletionAnalysis ? "Deletion analysis, checking: " : "Comparison analysis, comparing: ") + fA.getAbsolutePath() + " AND " + fB.getAbsolutePath(), Const.IconKey.Info);

        sp = analyzeSyncPairStatus(fA, fB, ab, deletionAnalysis, excluded);

        if (sp != null && sp.getSyncPairStatus() != null) {
            DirSyncPro.getSync().getSyncQ().add(sp);
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (DirSyncPro.getSync().isStopping()) {
            return FileVisitResult.TERMINATE;
        }
        if (filters.matchesAnyIncludeFilter(file)) {
            if (filters.matchesAnyExcludeFilter(file)) {
                analyzeFilePair(file, ab, deletionAnalysis, true);
            } else {
                analyzeFilePair(file, ab, deletionAnalysis, false);
                DirSyncPro.getSync().getSyncQ().addTotalAnalyzedFiles(1);
            }
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        depth++;
        if (DirSyncPro.getSync().isStopping()) {
            return FileVisitResult.TERMINATE;
        }
        if (depth == 0) {
            //skip the root folders (src/dst)
            return FileVisitResult.CONTINUE;
        } else if (filters.matchesAnyIncludeFilter(dir)) {
            if (filters.matchesAnyExcludeFilter(dir)) {
                analyzeFilePair(dir, ab, deletionAnalysis, true);
                return FileVisitResult.SKIP_SUBTREE;
            } else {
                analyzeFilePair(dir, ab, deletionAnalysis, false);
                DirSyncPro.getSync().getSyncQ().addTotalAnalyzedDirs(1);
                return FileVisitResult.CONTINUE;
            }
        } else {
            return FileVisitResult.SKIP_SUBTREE;
        }
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        if (exc != null) {
            job.getLog().printMinimal("Unable to analyze: " + dir.toAbsolutePath() + " (" + exc.getMessage() + ")", Const.IconKey.Error);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        if (exc != null) {
            job.getLog().printMinimal("Unable to analyze: " + file.toAbsolutePath() + " (" + exc.getMessage() + ")", Const.IconKey.Error);
        }
        return FileVisitResult.CONTINUE;
    }

    public void setDeletionAnalysis(boolean deletionAnalysis) {
        this.deletionAnalysis = deletionAnalysis;
    }

    public void resetDepth() {
        this.depth = -1;
    }

}
