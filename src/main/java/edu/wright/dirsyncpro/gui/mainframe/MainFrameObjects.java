/*
 * MainFrameObjects.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2006 F. Gerbig
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
 /*
 * Created on 2 februari 2008, 18:40
 */
package edu.wright.dirsyncpro.gui.mainframe;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.gui.jobdialog.JobDialog;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobTree;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobsTreeCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobsTreeModel;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobsTreeNodeEditor;
import edu.wright.dirsyncpro.gui.mainframe.messagetable.MessagesTableCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.messagetable.MessagesTableModel;
import edu.wright.dirsyncpro.gui.mainframe.scheduletable.ScheduleTableCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.scheduletable.ScheduleTableModel;
import edu.wright.dirsyncpro.gui.mainframe.syncqtable.SyncQTableCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.syncqtable.SyncQTableModel;
import edu.wright.dirsyncpro.tools.GuiTools;
import javax.swing.*;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class MainFrameObjects extends JFrame {

    // Variables declaration - do not modify
    protected JButton analyzeButton;
    protected JMenuItem analyzeMenuItem;
    protected JMenuItem appendMenuItem;
    protected JMenuItem cmdMenuItem;
    protected JProgressBar currentProgress;
    protected JLabel jLabel;
    protected JLabel jLabel11;
    protected JLabel jLabel13;
    protected JLabel jLabel14;
    protected JLabel jLabel15;
    protected JLabel jLabel21;
    protected JLabel jLabel22;
    protected JLabel jLabel23;
    protected JLabel jLabel25;
    protected JLabel jLabel34;
    protected JLabel jLabel35;
    protected JLabel jLabel46;
    protected JLabel jLabel70;
    protected JLabel jLabel71;
    protected JLabel jLabel72;
    protected JLabel jLabel73;
    protected JLabel jLabel77;
    protected JButton jobAddButton;
    protected JButton jobCollapseAllButton;
    protected JButton jobCopyButton;
    protected JButton jobDisableAllButton;
    protected JButton jobDownButton;
    protected JButton jobEditButton;
    protected JButton jobEnableAllButton;
    protected JButton jobExpandOneLevelButton;
    protected JButton jobRemoveButton;
    protected JButton jobUpButton;
    protected JTree jobsTree;
    protected JButton messagesCleanButton;
    protected JTable messagesTable;
    protected JScrollPane messagesTableScrollPane;
    protected JCheckBox messagesViewFilterErrorsCheckBox;
    protected JLabel messagesViewFilterErrorsLabel;
    protected JCheckBox messagesViewFilterFileOperationsCheckBox;
    protected JLabel messagesViewFilterFileOperationsLabel;
    protected JCheckBox messagesViewFilterInfosCheckBox;
    protected JLabel messagesViewFilterInfosLabel;
    protected JButton messagesViewFilterOKButton;
    protected JButton messagesViewFilterResetButton;
    protected JCheckBox messagesViewFilterWarningsCheckBox;
    protected JLabel messagesViewFilterWarningsLabel;
    protected JButton newButton;
    protected JMenuItem newMenuItem;
    protected JButton openButton;
    protected JMenuItem openMenuItem;
    protected JMenu openRecentMenu;
    protected JMenuItem optionsMenuItem;
    protected JToggleButton pauseButton;
    protected JButton saveAsButton;
    protected JMenuItem saveAsMenuItem;
    protected JButton saveButton;
    protected JMenuItem saveEnabledAsMenuItem;
    protected JMenuItem saveMenuItem;
    protected JLabel scheduleEngineStatusField;
    protected JButton scheduleStartButton;
    protected JButton scheduleStopButton;
    protected JTable scheduleTable;
    protected JButton shutDownButton;
    protected JMenuItem startScheduledTasksMenuItem;
    protected JMenuItem stopScheduledTasksMenuItem;
    protected JMenuItem swapSrcDstMenuItem;
    protected JLabel syncQBytesAllwaysFilesDirs;
    protected JLabel syncQBytesDeletedFilesDirs;
    protected JLabel syncQBytesFilesDirsToBeSynced;
    protected JLabel syncQBytesLargerAndModifiedFilesDirs;
    protected JLabel syncQBytesLargerFilesDirs;
    protected JLabel syncQBytesModifieldFilesDirs;
    protected JLabel syncQBytesNewFilesDirs;
    protected JLabel syncQNumberOfAllwaysDirs;
    protected JLabel syncQNumberOfAllwaysFiles;
    protected JLabel syncQNumberOfAllwaysFilesDirs;
    protected JLabel syncQNumberOfConflictFiles;
    protected JLabel syncQNumberOfConflictFilesDirs;
    protected JLabel syncQNumberOfDeletedDirs;
    protected JLabel syncQNumberOfDeletedFiles;
    protected JLabel syncQNumberOfDeletedFilesDirs;
    protected JLabel syncQNumberOfDirsToBeSynced;
    protected JLabel syncQNumberOfFilesDirsToBeSynced;
    protected JLabel syncQNumberOfFilesToBeSynced;
    protected JLabel syncQNumberOfLargerAndModifiedFiles;
    protected JLabel syncQNumberOfLargerAndModifiedFilesDirs;
    protected JLabel syncQNumberOfLargerFiles;
    protected JLabel syncQNumberOfLargerFilesDirs;
    protected JLabel syncQNumberOfModifieldDirs;
    protected JLabel syncQNumberOfModifieldFiles;
    protected JLabel syncQNumberOfModifieldFilesDirs;
    protected JLabel syncQNumberOfNewDirs;
    protected JLabel syncQNumberOfNewFiles;
    protected JLabel syncQNumberOfNewFilesDirs;
    protected JCheckBox syncQSyncFilterConflictFilesCheckBox;
    protected JLabel syncQSyncFilterConflictFilesLabel;
    protected JCheckBox syncQSyncFilterDeletedDirsCheckBox;
    protected JLabel syncQSyncFilterDeletedDirsLabel;
    protected JCheckBox syncQSyncFilterDeletedFilesCheckBox;
    protected JLabel syncQSyncFilterDeletedFilesLabel;
    protected JCheckBox syncQSyncFilterLargerAndModifiedFilesCheckBox;
    protected JLabel syncQSyncFilterLargerAndModifiedFilesLabel;
    protected JCheckBox syncQSyncFilterLargerFilesCheckBox;
    protected JLabel syncQSyncFilterLargerFilesLabel;
    protected JCheckBox syncQSyncFilterModifiedFilesCheckBox;
    protected JLabel syncQSyncFilterModifiedFilesLabel;
    protected JCheckBox syncQSyncFilterNewFilesCheckBox;
    protected JLabel syncQSyncFilterNewFilesLabel;
    protected JButton syncQSyncFilterOKButton;
    protected JButton syncQSyncFilterResetButton;
    protected JTable syncQTable;
    protected JLabel syncQTotalNumberOfAnalyzedDirs;
    protected JLabel syncQTotalNumberOfAnalyzedFiles;
    protected JLabel syncQTotalNumberOfFilesDirs;
    protected JCheckBox syncQViewFilterConflictFilesCheckBox;
    protected JLabel syncQViewFilterConflictFilesLabel;
    protected JCheckBox syncQViewFilterDeletedDirsCheckBox;
    protected JLabel syncQViewFilterDeletedDirsLabel;
    protected JCheckBox syncQViewFilterDeletedFilesCheckBox;
    protected JLabel syncQViewFilterDeletedFilesLabel;
    protected JCheckBox syncQViewFilterLargerAndModifiedFilesCheckBox;
    protected JLabel syncQViewFilterLargerAndModifiedFilesLabel;
    protected JCheckBox syncQViewFilterLargerFilesCheckBox;
    protected JLabel syncQViewFilterLargerFilesLabel;
    protected JCheckBox syncQViewFilterModifiedFilesCheckBox;
    protected JLabel syncQViewFilterModifiedFilesLabel;
    protected JCheckBox syncQViewFilterNewFilesCheckBox;
    protected JLabel syncQViewFilterNewFilesLabel;
    protected JButton syncQViewFilterOKButton;
    protected JButton syncQViewFilterResetButton;
    protected JButton synchronizeButton;
    protected JMenuItem synchronizeMenuItem;
    protected JTabbedPane tabbedPane;
    protected JProgressBar totalProgress;

    public MainFrameObjects() {
        super();
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        JToolBar toolBar = new JToolBar();
        newButton = new JButton();
        openButton = new JButton();
        saveButton = new JButton();
        saveAsButton = new JButton();
        JSeparator jSeparator2 = new JSeparator();
        analyzeButton = new JButton();
        synchronizeButton = new JButton();
        pauseButton = new JToggleButton();
        JButton stopButton = new JButton();
        shutDownButton = new JButton();
        JSeparator jSeparator3 = new JSeparator();
        scheduleStartButton = new JButton();
        scheduleStopButton = new JButton();
        JSeparator jSeparator6 = new JSeparator();
        JButton aboutButton = new JButton();
        JButton contentsButton = new JButton();
        JButton donateButton = new JButton();

        JPanel mainPanel = new JPanel();
        tabbedPane = new JTabbedPane();
        JPanel jobsJPanel = new JPanel();
        JPanel viewJPanel2 = new JPanel();
        jobEnableAllButton = new JButton();
        jobDisableAllButton = new JButton();
        jobDownButton = new JButton();
        jobUpButton = new JButton();
        jobAddButton = new JButton();
        jobEditButton = new JButton();
        jobCopyButton = new JButton();
        jobRemoveButton = new JButton();
        JPanel jPanel1 = new JPanel();
        jobExpandOneLevelButton = new JButton();
        jobCollapseAllButton = new JButton();
        JScrollPane jScrollPane5 = new JScrollPane();
        jobsTree = new JTree();
        JPanel syncQPanel = new JPanel();
        JTabbedPane jTabbedPane1 = new JTabbedPane();
        JPanel summaryJPanel = new JPanel();
        jLabel = new JLabel();
        jLabel11 = new JLabel();
        syncQNumberOfFilesToBeSynced = new JLabel();
        jLabel22 = new JLabel();
        syncQNumberOfNewFiles = new JLabel();
        jLabel15 = new JLabel();
        syncQNumberOfModifieldFiles = new JLabel();
        jLabel21 = new JLabel();
        syncQNumberOfLargerFiles = new JLabel();
        jLabel14 = new JLabel();
        syncQNumberOfLargerAndModifiedFiles = new JLabel();
        jLabel23 = new JLabel();
        syncQNumberOfDeletedFiles = new JLabel();
        JPanel spacer6 = new JPanel();
        jLabel13 = new JLabel();
        jLabel25 = new JLabel();
        syncQNumberOfAllwaysFiles = new JLabel();
        jLabel70 = new JLabel();
        syncQNumberOfDirsToBeSynced = new JLabel();
        syncQNumberOfAllwaysDirs = new JLabel();
        syncQNumberOfNewDirs = new JLabel();
        syncQNumberOfModifieldDirs = new JLabel();
        syncQNumberOfDeletedDirs = new JLabel();
        jLabel71 = new JLabel();
        syncQTotalNumberOfFilesDirs = new JLabel();
        syncQNumberOfFilesDirsToBeSynced = new JLabel();
        syncQNumberOfAllwaysFilesDirs = new JLabel();
        syncQNumberOfNewFilesDirs = new JLabel();
        syncQNumberOfModifieldFilesDirs = new JLabel();
        syncQNumberOfLargerFilesDirs = new JLabel();
        syncQNumberOfLargerAndModifiedFilesDirs = new JLabel();
        syncQNumberOfDeletedFilesDirs = new JLabel();
        syncQTotalNumberOfAnalyzedFiles = new JLabel();
        syncQTotalNumberOfAnalyzedDirs = new JLabel();
        jLabel72 = new JLabel();
        syncQNumberOfConflictFiles = new JLabel();
        syncQNumberOfConflictFilesDirs = new JLabel();
        jLabel73 = new JLabel();
        syncQBytesFilesDirsToBeSynced = new JLabel();
        syncQBytesAllwaysFilesDirs = new JLabel();
        syncQBytesNewFilesDirs = new JLabel();
        syncQBytesModifieldFilesDirs = new JLabel();
        syncQBytesLargerFilesDirs = new JLabel();
        syncQBytesLargerAndModifiedFilesDirs = new JLabel();
        syncQBytesDeletedFilesDirs = new JLabel();
        JPanel viewJPanel = new JPanel();
        JPanel jPanel58 = new JPanel();
        JPanel jPanel53 = new JPanel();
        syncQViewFilterNewFilesCheckBox = new JCheckBox();
        syncQViewFilterNewFilesLabel = new JLabel();
        JPanel jPanel55 = new JPanel();
        syncQViewFilterLargerFilesCheckBox = new JCheckBox();
        syncQViewFilterLargerFilesLabel = new JLabel();
        JPanel jPanel57 = new JPanel();
        syncQViewFilterDeletedFilesCheckBox = new JCheckBox();
        syncQViewFilterDeletedFilesLabel = new JLabel();
        JPanel jPanel54 = new JPanel();
        syncQViewFilterModifiedFilesCheckBox = new JCheckBox();
        syncQViewFilterModifiedFilesLabel = new JLabel();
        JPanel jPanel56 = new JPanel();
        syncQViewFilterLargerAndModifiedFilesCheckBox = new JCheckBox();
        syncQViewFilterLargerAndModifiedFilesLabel = new JLabel();
        JPanel jPanel71 = new JPanel();
        syncQViewFilterDeletedDirsCheckBox = new JCheckBox();
        syncQViewFilterDeletedDirsLabel = new JLabel();
        JPanel jPanel68 = new JPanel();
        syncQViewFilterConflictFilesCheckBox = new JCheckBox();
        syncQViewFilterConflictFilesLabel = new JLabel();
        JPanel jPanel50 = new JPanel();
        syncQViewFilterResetButton = new JButton();
        syncQViewFilterOKButton = new JButton();
        jLabel34 = new JLabel();
        JPanel syncJPanel = new JPanel();
        JPanel jPanel59 = new JPanel();
        JPanel jPanel60 = new JPanel();
        syncQSyncFilterNewFilesCheckBox = new JCheckBox();
        syncQSyncFilterNewFilesLabel = new JLabel();
        JPanel jPanel61 = new JPanel();
        syncQSyncFilterLargerFilesCheckBox = new JCheckBox();
        syncQSyncFilterLargerFilesLabel = new JLabel();
        JPanel jPanel64 = new JPanel();
        syncQSyncFilterDeletedFilesCheckBox = new JCheckBox();
        syncQSyncFilterDeletedFilesLabel = new JLabel();
        JPanel jPanel62 = new JPanel();
        syncQSyncFilterModifiedFilesCheckBox = new JCheckBox();
        syncQSyncFilterModifiedFilesLabel = new JLabel();
        JPanel jPanel63 = new JPanel();
        syncQSyncFilterLargerAndModifiedFilesCheckBox = new JCheckBox();
        syncQSyncFilterLargerAndModifiedFilesLabel = new JLabel();
        JPanel jPanel72 = new JPanel();
        syncQSyncFilterDeletedDirsCheckBox = new JCheckBox();
        syncQSyncFilterDeletedDirsLabel = new JLabel();
        JPanel jPanel73 = new JPanel();
        syncQSyncFilterConflictFilesCheckBox = new JCheckBox();
        syncQSyncFilterConflictFilesLabel = new JLabel();
        JPanel jPanel52 = new JPanel();
        syncQSyncFilterResetButton = new JButton();
        syncQSyncFilterOKButton = new JButton();
        jLabel35 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        syncQTable = new JTable();
        JPanel scheduleQJPanel = new JPanel();
        JPanel scheduleStatusJPanel = new JPanel();
        scheduleEngineStatusField = new JLabel();
        JPanel spacer3 = new JPanel();
        JPanel spacer7 = new JPanel();
        jLabel77 = new JLabel();
        JScrollPane jScrollPane6 = new JScrollPane();
        scheduleTable = new JTable();
        JPanel messagesQJPanel = new JPanel();
        JPanel viewJPanel1 = new JPanel();
        JPanel jPanel65 = new JPanel();
        JPanel jPanel66 = new JPanel();
        messagesViewFilterInfosCheckBox = new JCheckBox();
        messagesViewFilterInfosLabel = new JLabel();
        JPanel jPanel67 = new JPanel();
        messagesViewFilterErrorsCheckBox = new JCheckBox();
        messagesViewFilterErrorsLabel = new JLabel();
        JPanel jPanel69 = new JPanel();
        messagesViewFilterWarningsCheckBox = new JCheckBox();
        messagesViewFilterWarningsLabel = new JLabel();
        JPanel jPanel70 = new JPanel();
        messagesViewFilterFileOperationsCheckBox = new JCheckBox();
        messagesViewFilterFileOperationsLabel = new JLabel();
        JPanel jPanel51 = new JPanel();
        messagesViewFilterResetButton = new JButton();
        messagesViewFilterOKButton = new JButton();
        messagesCleanButton = new JButton();
        jLabel46 = new JLabel();
        messagesTableScrollPane = new JScrollPane();
        messagesTable = new JTable();
        JPanel progressPanel = new JPanel();
        JLabel currentProgressLabel = new JLabel();
        currentProgress = new JProgressBar();
        JLabel totalProgressLabel = new JLabel();
        totalProgress = new JProgressBar();
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu();
        newMenuItem = new JMenuItem();
        openMenuItem = new JMenuItem();
        openRecentMenu = new JMenu();
        appendMenuItem = new JMenuItem();
        JPopupMenu.Separator jSeparator7 = new JPopupMenu.Separator();
        saveMenuItem = new JMenuItem();
        saveAsMenuItem = new JMenuItem();
        saveEnabledAsMenuItem = new JMenuItem();
        JSeparator jSeparator4 = new JSeparator();
        JMenuItem quitMenuItem = new JMenuItem();
        JMenu runMenu = new JMenu();
        analyzeMenuItem = new JMenuItem();
        synchronizeMenuItem = new JMenuItem();
        JMenuItem pauseMenuItem = new JMenuItem();
        JMenuItem stopMenuItem = new JMenuItem();
        JMenuItem shutDownMenuItem = new JMenuItem();
        JSeparator jSeparator5 = new JSeparator();
        startScheduledTasksMenuItem = new JMenuItem();
        stopScheduledTasksMenuItem = new JMenuItem();
        JMenu toolsMenu = new JMenu();
        swapSrcDstMenuItem = new JMenuItem();
        cmdMenuItem = new JMenuItem();
        optionsMenuItem = new JMenuItem();
        JMenu helpMenu = new JMenu();
        JMenuItem contentsMenuItem = new JMenuItem();
        JMenuItem donateMenuItem = new JMenuItem();
        JSeparator jSeparator1 = new JSeparator();
        JMenuItem updateMenuItem = new JMenuItem();
        JMenuItem aboutMenuItem = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DirSync Pro");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(600, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            @Override
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        toolBar.setFloatable(false);

        newButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonFileNew.png"))); // NOI18N
        newButton.setToolTipText("New Job set");
        newButton.setBorderPainted(false);
        newButton.setMaximumSize(new java.awt.Dimension(30, 30));
        newButton.setMinimumSize(new java.awt.Dimension(30, 30));
        newButton.setOpaque(false);
        newButton.setPreferredSize(new java.awt.Dimension(30, 30));
        newButton.addActionListener(this::newButtonnewConfigActionPerformed);
        toolBar.add(newButton);

        openButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonFileOpen.png"))); // NOI18N
        openButton.setToolTipText("Open Job set");
        openButton.setBorderPainted(false);
        openButton.setMaximumSize(new java.awt.Dimension(30, 30));
        openButton.setMinimumSize(new java.awt.Dimension(30, 30));
        openButton.setOpaque(false);
        openButton.setPreferredSize(new java.awt.Dimension(30, 30));
        openButton.addActionListener(this::openButtonopenConfigActionPerformed);
        toolBar.add(openButton);

        saveButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonFileSave.png"))); // NOI18N
        saveButton.setToolTipText("Save Job set");
        saveButton.setBorderPainted(false);
        saveButton.setMaximumSize(new java.awt.Dimension(30, 30));
        saveButton.setMinimumSize(new java.awt.Dimension(30, 30));
        saveButton.setOpaque(false);
        saveButton.setPreferredSize(new java.awt.Dimension(30, 30));
        saveButton.addActionListener(this::saveButtonsaveConfigActionPerformed);
        toolBar.add(saveButton);

        saveAsButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonFileSaveAs.png"))); // NOI18N
        saveAsButton.setToolTipText("Save Job set As");
        saveAsButton.setBorderPainted(false);
        saveAsButton.setFocusable(false);
        saveAsButton.setHorizontalTextPosition(SwingConstants.CENTER);
        saveAsButton.setMaximumSize(new java.awt.Dimension(30, 30));
        saveAsButton.setMinimumSize(new java.awt.Dimension(30, 30));
        saveAsButton.setOpaque(false);
        saveAsButton.setPreferredSize(new java.awt.Dimension(30, 30));
        saveAsButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        saveAsButton.addActionListener(this::saveAsButtonsaveConfigActionPerformed);
        toolBar.add(saveAsButton);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(SwingConstants.VERTICAL);
        jSeparator2.setMaximumSize(new java.awt.Dimension(16, 16));
        toolBar.add(jSeparator2);

        analyzeButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonPreview.png"))); // NOI18N
        analyzeButton.setToolTipText("Analyze");
        analyzeButton.setBorderPainted(false);
        analyzeButton.setMaximumSize(new java.awt.Dimension(30, 30));
        analyzeButton.setMinimumSize(new java.awt.Dimension(30, 30));
        analyzeButton.setOpaque(false);
        analyzeButton.setPreferredSize(new java.awt.Dimension(30, 30));
        analyzeButton.addActionListener(this::analyzeButtonpreviewStartActionPerformed);
        toolBar.add(analyzeButton);

        synchronizeButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonStart.png"))); // NOI18N
        synchronizeButton.setToolTipText("Synchronize");
        synchronizeButton.setBorderPainted(false);
        synchronizeButton.setMaximumSize(new java.awt.Dimension(30, 30));
        synchronizeButton.setMinimumSize(new java.awt.Dimension(30, 30));
        synchronizeButton.setOpaque(false);
        synchronizeButton.setPreferredSize(new java.awt.Dimension(30, 30));
        synchronizeButton.addActionListener(this::synchronizeButtonsynchronizationStartActionPerformed);
        toolBar.add(synchronizeButton);

        pauseButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonPause.png"))); // NOI18N
        pauseButton.setToolTipText("Pause");
        pauseButton.setBorderPainted(false);
        pauseButton.setMaximumSize(new java.awt.Dimension(30, 30));
        pauseButton.setMinimumSize(new java.awt.Dimension(30, 30));
        pauseButton.setPreferredSize(new java.awt.Dimension(30, 30));
        pauseButton.addActionListener(this::pauseButtonsynchronizationPauseActionPerformed);
        toolBar.add(pauseButton);

        stopButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonStop.png"))); // NOI18N
        stopButton.setToolTipText("Stop");
        stopButton.setBorderPainted(false);
        stopButton.setMaximumSize(new java.awt.Dimension(30, 30));
        stopButton.setMinimumSize(new java.awt.Dimension(30, 30));
        stopButton.setOpaque(false);
        stopButton.setPreferredSize(new java.awt.Dimension(30, 30));
        stopButton.addActionListener(this::stopButtonsynchronizationStopActionPerformed);
        toolBar.add(stopButton);

        shutDownButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonExit.png"))); // NOI18N
        shutDownButton.setToolTipText("Shut down the system after the sync.");
        shutDownButton.setBorderPainted(false);
        shutDownButton.setFocusable(false);
        shutDownButton.setHorizontalTextPosition(SwingConstants.CENTER);
        shutDownButton.setMaximumSize(new java.awt.Dimension(30, 30));
        shutDownButton.setMinimumSize(new java.awt.Dimension(30, 30));
        shutDownButton.setOpaque(false);
        shutDownButton.setPreferredSize(new java.awt.Dimension(30, 30));
        shutDownButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        shutDownButton.addActionListener(this::shutDownButtonsynchronizationStopActionPerformed);
        toolBar.add(shutDownButton);

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(SwingConstants.VERTICAL);
        jSeparator3.setMaximumSize(new java.awt.Dimension(16, 16));
        toolBar.add(jSeparator3);

        scheduleStartButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonStartSchedule.png"))); // NOI18N
        scheduleStartButton.setToolTipText("Start Schedule Engine");
        scheduleStartButton.setBorderPainted(false);
        scheduleStartButton.setHorizontalTextPosition(SwingConstants.CENTER);
        scheduleStartButton.setMaximumSize(new java.awt.Dimension(30, 30));
        scheduleStartButton.setMinimumSize(new java.awt.Dimension(30, 30));
        scheduleStartButton.setOpaque(false);
        scheduleStartButton.setPreferredSize(new java.awt.Dimension(30, 30));
        scheduleStartButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        scheduleStartButton.addActionListener(this::scheduleStartButtonsynchronizationStartActionPerformed);
        toolBar.add(scheduleStartButton);

        scheduleStopButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonStopSchedule.png"))); // NOI18N
        scheduleStopButton.setToolTipText("Stop Schedule Engine");
        scheduleStopButton.setBorderPainted(false);
        scheduleStopButton.setHorizontalTextPosition(SwingConstants.CENTER);
        scheduleStopButton.setMaximumSize(new java.awt.Dimension(30, 30));
        scheduleStopButton.setMinimumSize(new java.awt.Dimension(30, 30));
        scheduleStopButton.setOpaque(false);
        scheduleStopButton.setPreferredSize(new java.awt.Dimension(30, 30));
        scheduleStopButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        scheduleStopButton.addActionListener(this::scheduleStopButtonsynchronizationStartActionPerformed);
        toolBar.add(scheduleStopButton);

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(SwingConstants.VERTICAL);
        jSeparator6.setMaximumSize(new java.awt.Dimension(16, 16));
        toolBar.add(jSeparator6);

        aboutButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonAbout.png"))); // NOI18N
        aboutButton.setToolTipText("About");
        aboutButton.setBorderPainted(false);
        aboutButton.setMaximumSize(new java.awt.Dimension(30, 30));
        aboutButton.setMinimumSize(new java.awt.Dimension(30, 30));
        aboutButton.setOpaque(false);
        aboutButton.setPreferredSize(new java.awt.Dimension(30, 30));
        aboutButton.addActionListener(this::aboutButtonaboutActionPerformed);
        toolBar.add(aboutButton);

        contentsButton.setIcon(new ImageIcon(getClass().getResource("/icons/buttonContents.png"))); // NOI18N
        contentsButton.setToolTipText("Help contents");
        contentsButton.setBorderPainted(false);
        contentsButton.setMaximumSize(new java.awt.Dimension(30, 30));
        contentsButton.setMinimumSize(new java.awt.Dimension(30, 30));
        contentsButton.setOpaque(false);
        contentsButton.setPreferredSize(new java.awt.Dimension(30, 30));
        contentsButton.addActionListener(this::contentsButtoncontentsActionPerformed);
        toolBar.add(contentsButton);

        donateButton.setIcon(new ImageIcon(getClass().getResource("/icons/donate22x22.png"))); // NOI18N
        donateButton.setToolTipText("<html>If this program is good for your purpose please consider a donation, <br />any amount you would like, as a gesture to encourage us developing this program.<br />Click this button to go to the SourceForge donation page.<br /><br />Thank you!</html>");
        donateButton.setBorderPainted(false);
        donateButton.setHorizontalTextPosition(SwingConstants.CENTER);
        donateButton.setMaximumSize(new java.awt.Dimension(30, 30));
        donateButton.setMinimumSize(new java.awt.Dimension(30, 30));
        donateButton.setOpaque(false);
        donateButton.setPreferredSize(new java.awt.Dimension(30, 30));
        donateButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        donateButton.addActionListener(this::donateButtoncontentsActionPerformed);
        toolBar.add(donateButton);

        getContentPane().add(toolBar, java.awt.BorderLayout.NORTH);

        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);

        jobsJPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jobsJPanel.setLayout(new java.awt.GridBagLayout());

        viewJPanel2.setMinimumSize(new java.awt.Dimension(100, 29));
        viewJPanel2.setLayout(new java.awt.GridBagLayout());

        jobEnableAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobEnableAllButton.setIcon(new ImageIcon(getClass().getResource("/icons/checkbox_checked.png"))); // NOI18N
        jobEnableAllButton.setText("all");
        jobEnableAllButton.setToolTipText("Enables all Jobs.");
        jobEnableAllButton.setActionCommand("Enable all");
        jobEnableAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobEnableAllButton.setMaximumSize(null);
        jobEnableAllButton.setMinimumSize(null);
        jobEnableAllButton.setPreferredSize(null);
        jobEnableAllButton.addActionListener(this::jobEnableAllButtonenableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel2.add(jobEnableAllButton, gridBagConstraints);

        jobDisableAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobDisableAllButton.setIcon(new ImageIcon(getClass().getResource("/icons/checkbox_unchecked.png"))); // NOI18N
        jobDisableAllButton.setText("none");
        jobDisableAllButton.setToolTipText("Disables all Jobs.");
        jobDisableAllButton.setActionCommand("Disable all");
        jobDisableAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobDisableAllButton.setMaximumSize(null);
        jobDisableAllButton.setMinimumSize(null);
        jobDisableAllButton.setPreferredSize(null);
        jobDisableAllButton.addActionListener(this::jobDisableAllButtondisableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobDisableAllButton, gridBagConstraints);

        jobDownButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobDownButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirDown.png"))); // NOI18N
        jobDownButton.setText("Down");
        jobDownButton.setToolTipText("Move the selected Job down.");
        jobDownButton.setIconTextGap(2);
        jobDownButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobDownButton.setMaximumSize(null);
        jobDownButton.setMinimumSize(null);
        jobDownButton.setPreferredSize(null);
        jobDownButton.addActionListener(this::jobDownButtonlistDownActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 8);
        viewJPanel2.add(jobDownButton, gridBagConstraints);

        jobUpButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobUpButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirUp.png"))); // NOI18N
        jobUpButton.setText("Up");
        jobUpButton.setToolTipText("Move the selected Job up.");
        jobUpButton.setIconTextGap(2);
        jobUpButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobUpButton.addActionListener(this::jobUpButtonlistUpActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel2.add(jobUpButton, gridBagConstraints);

        jobAddButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobAddButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirNew.png"))); // NOI18N
        jobAddButton.setText("New");
        jobAddButton.setToolTipText("Add a new Job.");
        jobAddButton.setIconTextGap(2);
        jobAddButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobAddButton.setMaximumSize(null);
        jobAddButton.setMinimumSize(null);
        jobAddButton.setPreferredSize(null);
        jobAddButton.addActionListener(this::jobAddButtonlistAddActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobAddButton, gridBagConstraints);

        jobEditButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobEditButton.setIcon(new ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        jobEditButton.setText("Edit");
        jobEditButton.setToolTipText("Edit the selected Job");
        jobEditButton.setIconTextGap(2);
        jobEditButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobEditButton.addActionListener(this::jobEditButtonlistAddActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobEditButton, gridBagConstraints);

        jobCopyButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobCopyButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirCopy.png"))); // NOI18N
        jobCopyButton.setText("Copy");
        jobCopyButton.setToolTipText("Duplicate the selected Job.");
        jobCopyButton.setIconTextGap(2);
        jobCopyButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobCopyButton.setMaximumSize(null);
        jobCopyButton.setMinimumSize(null);
        jobCopyButton.setPreferredSize(null);
        jobCopyButton.addActionListener(this::jobCopyButtonlistCopyActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobCopyButton, gridBagConstraints);

        jobRemoveButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobRemoveButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        jobRemoveButton.setText("Remove");
        jobRemoveButton.setToolTipText("Remove the selected Job.");
        jobRemoveButton.setIconTextGap(2);
        jobRemoveButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobRemoveButton.setMaximumSize(null);
        jobRemoveButton.setMinimumSize(null);
        jobRemoveButton.setPreferredSize(null);
        jobRemoveButton.addActionListener(this::jobRemoveButtonlistRemoveActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobRemoveButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jPanel1, gridBagConstraints);

        jobExpandOneLevelButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobExpandOneLevelButton.setIcon(new ImageIcon(getClass().getResource("/icons/expandAll.png"))); // NOI18N
        jobExpandOneLevelButton.setText("Expand");
        jobExpandOneLevelButton.setToolTipText("Expand all Jobs in the job tree.");
        jobExpandOneLevelButton.setActionCommand("Enable all");
        jobExpandOneLevelButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobExpandOneLevelButton.setMaximumSize(null);
        jobExpandOneLevelButton.setMinimumSize(null);
        jobExpandOneLevelButton.setPreferredSize(null);
        jobExpandOneLevelButton.addActionListener(this::jobExpandOneLevelButtonenableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel2.add(jobExpandOneLevelButton, gridBagConstraints);

        jobCollapseAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobCollapseAllButton.setIcon(new ImageIcon(getClass().getResource("/icons/collapseAll.png"))); // NOI18N
        jobCollapseAllButton.setText("Collapse");
        jobCollapseAllButton.setToolTipText("Collapse all Jobs in the job tree.");
        jobCollapseAllButton.setActionCommand("Disable all");
        jobCollapseAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobCollapseAllButton.setMaximumSize(null);
        jobCollapseAllButton.setMinimumSize(null);
        jobCollapseAllButton.setPreferredSize(null);
        jobCollapseAllButton.addActionListener(this::jobCollapseAllButtondisableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 8);
        viewJPanel2.add(jobCollapseAllButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jobsJPanel.add(viewJPanel2, gridBagConstraints);

        jobsTree.setModel(new JobsTreeModel(getJobTree()));
        jobsTree.setCellEditor(new JobsTreeNodeEditor(jobsTree));
        jobsTree.setCellRenderer(new JobsTreeCellRenderer());
        jobsTree.setEditable(true);
        jobsTree.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobsTreeMouseClicked(evt);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jobsTreeMousePressed(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jobsTreeMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jobsTree);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jobsJPanel.add(jScrollPane5, gridBagConstraints);

        tabbedPane.addTab("Jobs", jobsJPanel);

        syncQPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        syncQPanel.setLayout(new java.awt.GridBagLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        summaryJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel.setText("New");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel, gridBagConstraints);

        jLabel11.setText("Analyzed");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel11, gridBagConstraints);

        syncQNumberOfFilesToBeSynced.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfFilesToBeSynced, gridBagConstraints);

        jLabel22.setText("Syncing");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel22, gridBagConstraints);

        syncQNumberOfNewFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfNewFiles, gridBagConstraints);

        jLabel15.setText("Modified");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel15, gridBagConstraints);

        syncQNumberOfModifieldFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfModifieldFiles, gridBagConstraints);

        jLabel21.setText(" Larger");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel21, gridBagConstraints);

        syncQNumberOfLargerFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerFiles, gridBagConstraints);

        jLabel14.setText("Larger&Modified");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel14, gridBagConstraints);

        syncQNumberOfLargerAndModifiedFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerAndModifiedFiles, gridBagConstraints);

        jLabel23.setText("To be deleted");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel23, gridBagConstraints);

        syncQNumberOfDeletedFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDeletedFiles, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        summaryJPanel.add(spacer6, gridBagConstraints);

        jLabel13.setText("Files:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel13, gridBagConstraints);

        jLabel25.setText("Forced");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel25, gridBagConstraints);

        syncQNumberOfAllwaysFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfAllwaysFiles, gridBagConstraints);

        jLabel70.setText("Dirs:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel70, gridBagConstraints);

        syncQNumberOfDirsToBeSynced.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDirsToBeSynced, gridBagConstraints);

        syncQNumberOfAllwaysDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfAllwaysDirs, gridBagConstraints);

        syncQNumberOfNewDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfNewDirs, gridBagConstraints);

        syncQNumberOfModifieldDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfModifieldDirs, gridBagConstraints);

        syncQNumberOfDeletedDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDeletedDirs, gridBagConstraints);

        jLabel71.setText("<html><b>Total:</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel71, gridBagConstraints);

        syncQTotalNumberOfFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQTotalNumberOfFilesDirs, gridBagConstraints);

        syncQNumberOfFilesDirsToBeSynced.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfFilesDirsToBeSynced, gridBagConstraints);

        syncQNumberOfAllwaysFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfAllwaysFilesDirs, gridBagConstraints);

        syncQNumberOfNewFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfNewFilesDirs, gridBagConstraints);

        syncQNumberOfModifieldFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfModifieldFilesDirs, gridBagConstraints);

        syncQNumberOfLargerFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerFilesDirs, gridBagConstraints);

        syncQNumberOfLargerAndModifiedFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerAndModifiedFilesDirs, gridBagConstraints);

        syncQNumberOfDeletedFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDeletedFilesDirs, gridBagConstraints);

        syncQTotalNumberOfAnalyzedFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQTotalNumberOfAnalyzedFiles, gridBagConstraints);

        syncQTotalNumberOfAnalyzedDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQTotalNumberOfAnalyzedDirs, gridBagConstraints);

        jLabel72.setText("Conflicts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel72, gridBagConstraints);

        syncQNumberOfConflictFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfConflictFiles, gridBagConstraints);

        syncQNumberOfConflictFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfConflictFilesDirs, gridBagConstraints);

        jLabel73.setText("Bytes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel73, gridBagConstraints);

        syncQBytesFilesDirsToBeSynced.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesFilesDirsToBeSynced, gridBagConstraints);

        syncQBytesAllwaysFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesAllwaysFilesDirs, gridBagConstraints);

        syncQBytesNewFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesNewFilesDirs, gridBagConstraints);

        syncQBytesModifieldFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesModifieldFilesDirs, gridBagConstraints);

        syncQBytesLargerFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesLargerFilesDirs, gridBagConstraints);

        syncQBytesLargerAndModifiedFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesLargerAndModifiedFilesDirs, gridBagConstraints);

        syncQBytesDeletedFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesDeletedFilesDirs, gridBagConstraints);

        jTabbedPane1.addTab("Summary", summaryJPanel);

        viewJPanel.setLayout(new java.awt.GridBagLayout());

        jPanel58.setLayout(new java.awt.GridBagLayout());

        jPanel53.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterNewFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        jPanel53.add(syncQViewFilterNewFilesCheckBox);

        syncQViewFilterNewFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyNew.png"))); // NOI18N
        syncQViewFilterNewFilesLabel.setText("New files/dirs");
        jPanel53.add(syncQViewFilterNewFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel53, gridBagConstraints);

        jPanel55.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterLargerFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterLargerFilesCheckBox.setMaximumSize(null);
        syncQViewFilterLargerFilesCheckBox.setMinimumSize(null);
        syncQViewFilterLargerFilesCheckBox.setPreferredSize(null);
        jPanel55.add(syncQViewFilterLargerFilesCheckBox);

        syncQViewFilterLargerFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        syncQViewFilterLargerFilesLabel.setText("Larger files");
        jPanel55.add(syncQViewFilterLargerFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel55, gridBagConstraints);

        jPanel57.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterDeletedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterDeletedFilesCheckBox.setMaximumSize(null);
        syncQViewFilterDeletedFilesCheckBox.setMinimumSize(null);
        syncQViewFilterDeletedFilesCheckBox.setPreferredSize(null);
        jPanel57.add(syncQViewFilterDeletedFilesCheckBox);

        syncQViewFilterDeletedFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        syncQViewFilterDeletedFilesLabel.setText("Files to be deleted");
        jPanel57.add(syncQViewFilterDeletedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel57, gridBagConstraints);

        jPanel54.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterModifiedFilesCheckBox.setMaximumSize(null);
        syncQViewFilterModifiedFilesCheckBox.setMinimumSize(null);
        syncQViewFilterModifiedFilesCheckBox.setPreferredSize(null);
        jPanel54.add(syncQViewFilterModifiedFilesCheckBox);

        syncQViewFilterModifiedFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        syncQViewFilterModifiedFilesLabel.setText("Modified files");
        jPanel54.add(syncQViewFilterModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel54, gridBagConstraints);

        jPanel56.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterLargerAndModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterLargerAndModifiedFilesCheckBox.setMaximumSize(null);
        syncQViewFilterLargerAndModifiedFilesCheckBox.setMinimumSize(null);
        syncQViewFilterLargerAndModifiedFilesCheckBox.setPreferredSize(null);
        jPanel56.add(syncQViewFilterLargerAndModifiedFilesCheckBox);

        syncQViewFilterLargerAndModifiedFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLargerModified.png"))); // NOI18N
        syncQViewFilterLargerAndModifiedFilesLabel.setText("Larger & Modified files");
        jPanel56.add(syncQViewFilterLargerAndModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel56, gridBagConstraints);

        jPanel71.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterDeletedDirsCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterDeletedDirsCheckBox.setMaximumSize(null);
        syncQViewFilterDeletedDirsCheckBox.setMinimumSize(null);
        syncQViewFilterDeletedDirsCheckBox.setPreferredSize(null);
        jPanel71.add(syncQViewFilterDeletedDirsCheckBox);

        syncQViewFilterDeletedDirsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        syncQViewFilterDeletedDirsLabel.setText("Dirs to be deleted");
        jPanel71.add(syncQViewFilterDeletedDirsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel71, gridBagConstraints);

        jPanel68.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterConflictFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterConflictFilesCheckBox.setMaximumSize(null);
        syncQViewFilterConflictFilesCheckBox.setMinimumSize(null);
        syncQViewFilterConflictFilesCheckBox.setPreferredSize(null);
        jPanel68.add(syncQViewFilterConflictFilesCheckBox);

        syncQViewFilterConflictFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/conflict_icon.png"))); // NOI18N
        syncQViewFilterConflictFilesLabel.setText("Conflicts");
        jPanel68.add(syncQViewFilterConflictFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel68, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        viewJPanel.add(jPanel58, gridBagConstraints);

        jPanel50.setLayout(new BoxLayout(jPanel50, BoxLayout.LINE_AXIS));

        syncQViewFilterResetButton.setIcon(new ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        syncQViewFilterResetButton.setText("Reset");
        syncQViewFilterResetButton.setToolTipText("Reset the default options to their defaults.");
        syncQViewFilterResetButton.setAlignmentX(0.5F);
        syncQViewFilterResetButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQViewFilterResetButton.addActionListener(this::syncQViewFilterResetButtonActionPerformed);
        jPanel50.add(syncQViewFilterResetButton);

        syncQViewFilterOKButton.setIcon(new ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        syncQViewFilterOKButton.setText("OK");
        syncQViewFilterOKButton.setToolTipText("Reset the default options to their defaults.");
        syncQViewFilterOKButton.setAlignmentX(0.5F);
        syncQViewFilterOKButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQViewFilterOKButton.addActionListener(this::syncQViewFilterOKButtonActionPerformed);
        jPanel50.add(syncQViewFilterOKButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        viewJPanel.add(jPanel50, gridBagConstraints);

        jLabel34.setText("Show these files/dirs in the sync queue (does not affect synchronization queue):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        viewJPanel.add(jLabel34, gridBagConstraints);

        jTabbedPane1.addTab("View", viewJPanel);

        syncJPanel.setLayout(new java.awt.GridBagLayout());

        jPanel59.setLayout(new java.awt.GridBagLayout());

        jPanel60.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterNewFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        jPanel60.add(syncQSyncFilterNewFilesCheckBox);

        syncQSyncFilterNewFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyNew.png"))); // NOI18N
        syncQSyncFilterNewFilesLabel.setText("New files/dirs");
        jPanel60.add(syncQSyncFilterNewFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel60, gridBagConstraints);

        jPanel61.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterLargerFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterLargerFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterLargerFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterLargerFilesCheckBox.setPreferredSize(null);
        jPanel61.add(syncQSyncFilterLargerFilesCheckBox);

        syncQSyncFilterLargerFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        syncQSyncFilterLargerFilesLabel.setText("Larger files");
        jPanel61.add(syncQSyncFilterLargerFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel61, gridBagConstraints);

        jPanel64.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterDeletedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterDeletedFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterDeletedFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterDeletedFilesCheckBox.setPreferredSize(null);
        jPanel64.add(syncQSyncFilterDeletedFilesCheckBox);

        syncQSyncFilterDeletedFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        syncQSyncFilterDeletedFilesLabel.setText("Files to be deleted");
        jPanel64.add(syncQSyncFilterDeletedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel64, gridBagConstraints);

        jPanel62.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterModifiedFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterModifiedFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterModifiedFilesCheckBox.setPreferredSize(null);
        jPanel62.add(syncQSyncFilterModifiedFilesCheckBox);

        syncQSyncFilterModifiedFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        syncQSyncFilterModifiedFilesLabel.setText("Modified files");
        jPanel62.add(syncQSyncFilterModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel62, gridBagConstraints);

        jPanel63.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterLargerAndModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterLargerAndModifiedFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterLargerAndModifiedFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterLargerAndModifiedFilesCheckBox.setPreferredSize(null);
        jPanel63.add(syncQSyncFilterLargerAndModifiedFilesCheckBox);

        syncQSyncFilterLargerAndModifiedFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLargerModified.png"))); // NOI18N
        syncQSyncFilterLargerAndModifiedFilesLabel.setText("Larger & Modified files");
        jPanel63.add(syncQSyncFilterLargerAndModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel63, gridBagConstraints);

        jPanel72.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterDeletedDirsCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterDeletedDirsCheckBox.setMaximumSize(null);
        syncQSyncFilterDeletedDirsCheckBox.setMinimumSize(null);
        syncQSyncFilterDeletedDirsCheckBox.setPreferredSize(null);
        jPanel72.add(syncQSyncFilterDeletedDirsCheckBox);

        syncQSyncFilterDeletedDirsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        syncQSyncFilterDeletedDirsLabel.setText("Dirs to be deleted");
        jPanel72.add(syncQSyncFilterDeletedDirsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel72, gridBagConstraints);

        jPanel73.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterConflictFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterConflictFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterConflictFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterConflictFilesCheckBox.setPreferredSize(null);
        jPanel73.add(syncQSyncFilterConflictFilesCheckBox);

        syncQSyncFilterConflictFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/conflict_icon.png"))); // NOI18N
        syncQSyncFilterConflictFilesLabel.setText("Conflicts");
        jPanel73.add(syncQSyncFilterConflictFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel73, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        syncJPanel.add(jPanel59, gridBagConstraints);

        jPanel52.setLayout(new BoxLayout(jPanel52, BoxLayout.LINE_AXIS));

        syncQSyncFilterResetButton.setIcon(new ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        syncQSyncFilterResetButton.setText("Reset");
        syncQSyncFilterResetButton.setToolTipText("Reset the default options to their defaults.");
        syncQSyncFilterResetButton.setAlignmentX(0.5F);
        syncQSyncFilterResetButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQSyncFilterResetButton.addActionListener(this::syncQSyncFilterResetButtonActionPerformed);
        jPanel52.add(syncQSyncFilterResetButton);

        syncQSyncFilterOKButton.setIcon(new ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        syncQSyncFilterOKButton.setText("OK");
        syncQSyncFilterOKButton.setToolTipText("Reset the default options to their defaults.");
        syncQSyncFilterOKButton.setAlignmentX(0.5F);
        syncQSyncFilterOKButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQSyncFilterOKButton.addActionListener(this::syncQSyncFilterOKButtonActionPerformed);
        jPanel52.add(syncQSyncFilterOKButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        syncJPanel.add(jPanel52, gridBagConstraints);

        jLabel35.setText("If exist, keep these files in the sync queue (affects the synchronization queue):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        syncJPanel.add(jLabel35, gridBagConstraints);

        jTabbedPane1.addTab("Filter", syncJPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        syncQPanel.add(jTabbedPane1, gridBagConstraints);

        syncQTable.setModel(new SyncQTableModel());
        syncQTable.setDefaultRenderer(String.class, new SyncQTableCellRenderer());
        syncQTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        syncQTable.setIntercellSpacing(new java.awt.Dimension(3, 1));
        syncQTable.getTableHeader().setReorderingAllowed(false);
        syncQTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                syncQTableMouseClicked(evt);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                syncQTableMousePressed(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                syncQTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(syncQTable);
        syncQTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (syncQTable.getColumnModel().getColumnCount() > 0) {
            syncQTable.getColumnModel().getColumn(0).setMinWidth(100);
            syncQTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            syncQTable.getColumnModel().getColumn(1).setResizable(false);
            syncQTable.getColumnModel().getColumn(1).setMinWidth(80);
            syncQTable.getColumnModel().getColumn(1).setPreferredWidth(80);
            syncQTable.getColumnModel().getColumn(1).setMaxWidth(80);
            syncQTable.getColumnModel().getColumn(2).setResizable(false);
            syncQTable.getColumnModel().getColumn(2).setMinWidth(50);
            syncQTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            syncQTable.getColumnModel().getColumn(2).setMaxWidth(50);
            syncQTable.getColumnModel().getColumn(3).setResizable(false);
            syncQTable.getColumnModel().getColumn(3).setMinWidth(55);
            syncQTable.getColumnModel().getColumn(3).setPreferredWidth(55);
            syncQTable.getColumnModel().getColumn(3).setMaxWidth(55);
            syncQTable.getColumnModel().getColumn(4).setMinWidth(100);
            syncQTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            syncQTable.getColumnModel().getColumn(5).setResizable(false);
            syncQTable.getColumnModel().getColumn(5).setMinWidth(80);
            syncQTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            syncQTable.getColumnModel().getColumn(5).setMaxWidth(80);
            syncQTable.getColumnModel().getColumn(6).setResizable(false);
            syncQTable.getColumnModel().getColumn(6).setMinWidth(50);
            syncQTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            syncQTable.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        syncQPanel.add(jScrollPane1, gridBagConstraints);

        tabbedPane.addTab("Sync Queue", syncQPanel);

        scheduleQJPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        scheduleQJPanel.setLayout(new java.awt.GridBagLayout());

        scheduleStatusJPanel.setLayout(new java.awt.GridBagLayout());

        scheduleEngineStatusField.setText("Not running!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        scheduleStatusJPanel.add(scheduleEngineStatusField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        scheduleStatusJPanel.add(spacer3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        scheduleStatusJPanel.add(spacer7, gridBagConstraints);

        jLabel77.setText("Schedule engine status:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        scheduleStatusJPanel.add(jLabel77, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        scheduleQJPanel.add(scheduleStatusJPanel, gridBagConstraints);

        scheduleTable.setModel(new ScheduleTableModel());
        scheduleTable.setDefaultRenderer(String.class, new ScheduleTableCellRenderer());
        scheduleTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        scheduleTable.setIntercellSpacing(new java.awt.Dimension(3, 1));
        scheduleTable.setRowSelectionAllowed(false);
        scheduleTable.getTableHeader().setResizingAllowed(false);
        scheduleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(scheduleTable);
        scheduleTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (scheduleTable.getColumnModel().getColumnCount() > 0) {
            scheduleTable.getColumnModel().getColumn(0).setResizable(false);
            scheduleTable.getColumnModel().getColumn(0).setMinWidth(70);
            scheduleTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            scheduleTable.getColumnModel().getColumn(0).setMaxWidth(130);
            scheduleTable.getColumnModel().getColumn(1).setResizable(false);
            scheduleTable.getColumnModel().getColumn(1).setMinWidth(130);
            scheduleTable.getColumnModel().getColumn(1).setPreferredWidth(130);
            scheduleTable.getColumnModel().getColumn(1).setMaxWidth(130);
            scheduleTable.getColumnModel().getColumn(2).setResizable(false);
            scheduleTable.getColumnModel().getColumn(2).setMinWidth(100);
            scheduleTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            scheduleTable.getColumnModel().getColumn(2).setMaxWidth(130);
            scheduleTable.getColumnModel().getColumn(3).setMinWidth(650);
            scheduleTable.getColumnModel().getColumn(3).setPreferredWidth(650);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        scheduleQJPanel.add(jScrollPane6, gridBagConstraints);

        tabbedPane.addTab("Schedules", scheduleQJPanel);

        messagesQJPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        messagesQJPanel.setLayout(new java.awt.GridBagLayout());

        viewJPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel65.setLayout(new java.awt.GridBagLayout());

        jPanel66.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterInfosCheckBox.setToolTipText("Synchronize all files and dirs.");
        jPanel66.add(messagesViewFilterInfosCheckBox);

        messagesViewFilterInfosLabel.setIcon(new ImageIcon(getClass().getResource("/icons/icon_info.png"))); // NOI18N
        messagesViewFilterInfosLabel.setText("Info's");
        jPanel66.add(messagesViewFilterInfosLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel66, gridBagConstraints);

        jPanel67.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterErrorsCheckBox.setToolTipText("Synchronize all files and dirs.");
        messagesViewFilterErrorsCheckBox.setMaximumSize(null);
        messagesViewFilterErrorsCheckBox.setMinimumSize(null);
        messagesViewFilterErrorsCheckBox.setPreferredSize(null);
        jPanel67.add(messagesViewFilterErrorsCheckBox);

        messagesViewFilterErrorsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/icon_error.png"))); // NOI18N
        messagesViewFilterErrorsLabel.setText("Errors");
        jPanel67.add(messagesViewFilterErrorsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel67, gridBagConstraints);

        jPanel69.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterWarningsCheckBox.setToolTipText("Synchronize all files and dirs.");
        messagesViewFilterWarningsCheckBox.setMaximumSize(null);
        messagesViewFilterWarningsCheckBox.setMinimumSize(null);
        messagesViewFilterWarningsCheckBox.setPreferredSize(null);
        jPanel69.add(messagesViewFilterWarningsCheckBox);

        messagesViewFilterWarningsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/icon_warning.png"))); // NOI18N
        messagesViewFilterWarningsLabel.setText("Warnings");
        jPanel69.add(messagesViewFilterWarningsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel69, gridBagConstraints);

        jPanel70.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterFileOperationsCheckBox.setToolTipText("Synchronize all files and dirs.");
        messagesViewFilterFileOperationsCheckBox.setMaximumSize(null);
        messagesViewFilterFileOperationsCheckBox.setMinimumSize(null);
        messagesViewFilterFileOperationsCheckBox.setPreferredSize(null);
        jPanel70.add(messagesViewFilterFileOperationsCheckBox);

        messagesViewFilterFileOperationsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        messagesViewFilterFileOperationsLabel.setText("File operations");
        jPanel70.add(messagesViewFilterFileOperationsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel70, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        viewJPanel1.add(jPanel65, gridBagConstraints);

        jPanel51.setLayout(new BoxLayout(jPanel51, BoxLayout.LINE_AXIS));

        messagesViewFilterResetButton.setIcon(new ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        messagesViewFilterResetButton.setText("Reset");
        messagesViewFilterResetButton.setToolTipText("Reset the message filter options.");
        messagesViewFilterResetButton.setAlignmentX(0.5F);
        messagesViewFilterResetButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        messagesViewFilterResetButton.addActionListener(this::messagesViewFilterResetButtonActionPerformed);
        jPanel51.add(messagesViewFilterResetButton);

        messagesViewFilterOKButton.setIcon(new ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        messagesViewFilterOKButton.setText("OK");
        messagesViewFilterOKButton.setToolTipText("Filter the messages according to the message filter options.");
        messagesViewFilterOKButton.setAlignmentX(0.5F);
        messagesViewFilterOKButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        messagesViewFilterOKButton.addActionListener(this::messagesViewFilterOKButtonActionPerformed);
        jPanel51.add(messagesViewFilterOKButton);

        messagesCleanButton.setIcon(new ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        messagesCleanButton.setText("Clean");
        messagesCleanButton.setToolTipText("Delete all messages.");
        messagesCleanButton.setAlignmentX(0.5F);
        messagesCleanButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        messagesCleanButton.addActionListener(this::messagesCleanButtonActionPerformed);
        jPanel51.add(messagesCleanButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        viewJPanel1.add(jPanel51, gridBagConstraints);

        jLabel46.setText("View these files/dirs in the messages queue:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        viewJPanel1.add(jLabel46, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        messagesQJPanel.add(viewJPanel1, gridBagConstraints);

        messagesTable.setModel(new MessagesTableModel());
        messagesTable.setDefaultRenderer(String.class, new MessagesTableCellRenderer());
        messagesTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        messagesTable.setIntercellSpacing(new java.awt.Dimension(3, 1));
        messagesTable.getTableHeader().setResizingAllowed(false);
        messagesTable.getTableHeader().setReorderingAllowed(false);
        messagesTableScrollPane.setViewportView(messagesTable);
        messagesTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (messagesTable.getColumnModel().getColumnCount() > 0) {
            messagesTable.getColumnModel().getColumn(0).setResizable(false);
            messagesTable.getColumnModel().getColumn(0).setMinWidth(150);
            messagesTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            messagesTable.getColumnModel().getColumn(0).setMaxWidth(130);
            messagesTable.getColumnModel().getColumn(1).setMinWidth(650);
            messagesTable.getColumnModel().getColumn(1).setPreferredWidth(650);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        messagesQJPanel.add(messagesTableScrollPane, gridBagConstraints);

        tabbedPane.addTab("Messages", messagesQJPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(tabbedPane, gridBagConstraints);
        tabbedPane.getAccessibleContext().setAccessibleName("");

        progressPanel.setBorder(BorderFactory.createTitledBorder("Progress"));
        progressPanel.setLayout(new java.awt.GridBagLayout());

        currentProgressLabel.setIcon(new ImageIcon(getClass().getResource("/icons/icon_file.png"))); // NOI18N
        currentProgressLabel.setText("Current:");
        currentProgressLabel.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        progressPanel.add(currentProgressLabel, gridBagConstraints);

        currentProgress.setToolTipText("The progress of the synchronization of the current directory.");
        currentProgress.setFocusable(false);
        currentProgress.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        progressPanel.add(currentProgress, gridBagConstraints);

        totalProgressLabel.setIcon(new ImageIcon(getClass().getResource("/icons/DirSyncPro16x16.gif"))); // NOI18N
        totalProgressLabel.setText("Total:");
        totalProgressLabel.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        progressPanel.add(totalProgressLabel, gridBagConstraints);

        totalProgress.setToolTipText("The overall progress of the synchronization.");
        totalProgress.setFocusable(false);
        totalProgress.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        progressPanel.add(totalProgress, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        mainPanel.add(progressPanel, gridBagConstraints);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/fileNew.png"))); // NOI18N
        newMenuItem.setText("New");
        newMenuItem.addActionListener(this::newMenuItemnewConfigActionPerformed);
        fileMenu.add(newMenuItem);

        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/fileOpen.png"))); // NOI18N
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(this::openMenuItemopenConfigActionPerformed);
        fileMenu.add(openMenuItem);

        openRecentMenu.setIcon(new ImageIcon(getClass().getResource("/icons/fileOpen.png"))); // NOI18N
        openRecentMenu.setText("Open Recent");
        fileMenu.add(openRecentMenu);

        appendMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/fileOpen.png"))); // NOI18N
        appendMenuItem.setText("Append");
        appendMenuItem.addActionListener(this::appendMenuItemopenConfigActionPerformed);
        fileMenu.add(appendMenuItem);
        fileMenu.add(jSeparator7);

        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/fileSave.png"))); // NOI18N
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(this::saveMenuItemsaveConfigActionPerformed);
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/fileSaveAs.png"))); // NOI18N
        saveAsMenuItem.setText("Save As");
        saveAsMenuItem.addActionListener(this::saveAsMenuItemsaveConfigActionPerformed);
        fileMenu.add(saveAsMenuItem);

        saveEnabledAsMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/fileSaveAs.png"))); // NOI18N
        saveEnabledAsMenuItem.setText("Save enabled jobs As");
        saveEnabledAsMenuItem.addActionListener(this::saveEnabledAsMenuItemsaveConfigActionPerformed);
        fileMenu.add(saveEnabledAsMenuItem);
        fileMenu.add(jSeparator4);

        quitMenuItem.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        quitMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/quit.png"))); // NOI18N
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(this::quitMenuItemquitActionPerformed);
        fileMenu.add(quitMenuItem);

        menuBar.add(fileMenu);

        runMenu.setText("Run");

        analyzeMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/preview.png"))); // NOI18N
        analyzeMenuItem.setText("Analyze");
        analyzeMenuItem.addActionListener(this::analyzeMenuItempreviewStartActionPerformed);
        runMenu.add(analyzeMenuItem);

        synchronizeMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/start.png"))); // NOI18N
        synchronizeMenuItem.setText("Synchronize");
        synchronizeMenuItem.addActionListener(this::synchronizeMenuItemsynchronizationStartActionPerformed);
        runMenu.add(synchronizeMenuItem);

        pauseMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/pause.png"))); // NOI18N
        pauseMenuItem.setText("Pause");
        pauseMenuItem.addActionListener(this::pauseMenuItemsynchronizationStopActionPerformed);
        runMenu.add(pauseMenuItem);

        stopMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/stop.png"))); // NOI18N
        stopMenuItem.setText("Stop");
        stopMenuItem.addActionListener(this::stopMenuItemsynchronizationStopActionPerformed);
        runMenu.add(stopMenuItem);

        shutDownMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/exit16x16.png"))); // NOI18N
        shutDownMenuItem.setText("Shut down after sync");
        shutDownMenuItem.addActionListener(this::shutDownMenuItemsynchronizationStopActionPerformed);
        runMenu.add(shutDownMenuItem);
        runMenu.add(jSeparator5);

        startScheduledTasksMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/startSchedule.png"))); // NOI18N
        startScheduledTasksMenuItem.setText("Start Schedule Engine");
        startScheduledTasksMenuItem.addActionListener(this::startScheduledTasksMenuItemsynchronizationStartActionPerformed);
        runMenu.add(startScheduledTasksMenuItem);

        stopScheduledTasksMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/stopSchedule.png"))); // NOI18N
        stopScheduledTasksMenuItem.setText("Stop Schedule Engine");
        stopScheduledTasksMenuItem.addActionListener(this::stopScheduledTasksMenuItemsynchronizationStartActionPerformed);
        runMenu.add(stopScheduledTasksMenuItem);

        menuBar.add(runMenu);

        toolsMenu.setText("Tools");

        swapSrcDstMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/swapSrcDst.png"))); // NOI18N
        swapSrcDstMenuItem.setText("Swap all source and destination directories");
        swapSrcDstMenuItem.addActionListener(this::swapSrcDstMenuItemtoolsSwapSrcDstActionPerformed);
        toolsMenu.add(swapSrcDstMenuItem);

        cmdMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/terminal.png"))); // NOI18N
        cmdMenuItem.setText("Generate command line");
        cmdMenuItem.addActionListener(this::cmdMenuItemOptionsActionPerformed);
        toolsMenu.add(cmdMenuItem);

        optionsMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/icon_config.png"))); // NOI18N
        optionsMenuItem.setText("Options");
        optionsMenuItem.addActionListener(this::optionsMenuItemOptionsActionPerformed);
        toolsMenu.add(optionsMenuItem);

        menuBar.add(toolsMenu);

        helpMenu.setText("Help");

        contentsMenuItem.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        contentsMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/contents.png"))); // NOI18N
        contentsMenuItem.setText("Help contents");
        contentsMenuItem.addActionListener(this::contentsMenuItemcontentsActionPerformed);
        helpMenu.add(contentsMenuItem);

        donateMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/donate16x16.png"))); // NOI18N
        donateMenuItem.setText("Make a donation!");
        donateMenuItem.setToolTipText("<html>If this program is good for your purpose please consider a donation <br />as less as you would like as a gesture to encourage us developing this program.<br />Click this menu item to go to the SourceForge donation page.<br /><br />Thank you!</html>");
        donateMenuItem.addActionListener(this::donateMenuItemcontentsActionPerformed);
        helpMenu.add(donateMenuItem);
        helpMenu.add(jSeparator1);

        updateMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/update16x16.png"))); // NOI18N
        updateMenuItem.setText("Check for updates");
        updateMenuItem.addActionListener(this::updateMenuItemaboutActionPerformed);
        helpMenu.add(updateMenuItem);

        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new ImageIcon(getClass().getResource("/icons/about.png"))); // NOI18N
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(this::aboutMenuItemaboutActionPerformed);
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>

    private void newMenuItemnewConfigActionPerformed(java.awt.event.ActionEvent evt) {
        newConfig();
    }

    private void openMenuItemopenConfigActionPerformed(java.awt.event.ActionEvent evt) {
        openConfig();
    }

    private void saveMenuItemsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {
        saveConfig();
    }

    private void quitMenuItemquitActionPerformed(java.awt.event.ActionEvent evt) {
        quit();
    }

    private void analyzeMenuItempreviewStartActionPerformed(java.awt.event.ActionEvent evt) {
        analyzeStart();
    }

    private void synchronizeMenuItemsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {
        synchronizationStart();
    }

    private void stopMenuItemsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {
        stop();
    }

    private void swapSrcDstMenuItemtoolsSwapSrcDstActionPerformed(java.awt.event.ActionEvent evt) {
        toolsSwapSrcDst();
    }

    private void optionsMenuItemOptionsActionPerformed(java.awt.event.ActionEvent evt) {
        optionsOptionsMenuItemClicked();
    }

    private void contentsMenuItemcontentsActionPerformed(java.awt.event.ActionEvent evt) {
        contents();
    }

    private void aboutMenuItemaboutActionPerformed(java.awt.event.ActionEvent evt) {
        about();
    }

    private void newButtonnewConfigActionPerformed(java.awt.event.ActionEvent evt) {
        newConfig();
    }

    private void openButtonopenConfigActionPerformed(java.awt.event.ActionEvent evt) {
        openConfig();
    }

    private void saveButtonsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {
        saveConfig();
    }

    private void analyzeButtonpreviewStartActionPerformed(java.awt.event.ActionEvent evt) {
        analyzeStart();
    }

    private void synchronizeButtonsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {
        synchronizationStart();
    }

    private void pauseButtonsynchronizationPauseActionPerformed(java.awt.event.ActionEvent evt) {
        pause();
    }

    private void stopButtonsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {
        stop();
    }

    private void aboutButtonaboutActionPerformed(java.awt.event.ActionEvent evt) {
        about();
    }

    private void contentsButtoncontentsActionPerformed(java.awt.event.ActionEvent evt) {
        contents();
    }

    private void jobAddButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.collapseAll(jobsTree);
        getJobDialog().setToBasicOptions();
        addJob();
    }

    private void jobCopyButtonlistCopyActionPerformed(java.awt.event.ActionEvent evt) {
        copyJob();
    }

    private void jobUpButtonlistUpActionPerformed(java.awt.event.ActionEvent evt) {
        upwardeJob();
    }

    private void jobDownButtonlistDownActionPerformed(java.awt.event.ActionEvent evt) {
        downwardJob();
    }

    private void jobRemoveButtonlistRemoveActionPerformed(java.awt.event.ActionEvent evt) {
        removeJob();
    }

    private void jobEnableAllButtonenableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        enableAllDirs();
    }

    private void jobDisableAllButtondisableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        disableAllDirs();
    }

    private void saveAsButtonsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {
        saveAsConfig();
    }

    private void pauseMenuItemsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {
        pause();
    }

    private void saveAsMenuItemsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {
        saveAsConfig();
    }

    private void donateButtoncontentsActionPerformed(java.awt.event.ActionEvent evt) {
        donate();
    }

    private void donateMenuItemcontentsActionPerformed(java.awt.event.ActionEvent evt) {
        donate();
    }

    private void syncQViewFilterResetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        syncQViewFilterChanged(true);
    }

    private void syncQViewFilterOKButtonActionPerformed(java.awt.event.ActionEvent evt) {
        syncQViewFilterChanged(false);
    }

    private void syncQSyncFilterResetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        syncQSyncFilterChanged(true);
    }

    private void syncQSyncFilterOKButtonActionPerformed(java.awt.event.ActionEvent evt) {
        syncQSyncFilterChanged(false);
    }

    private void messagesViewFilterOKButtonActionPerformed(java.awt.event.ActionEvent evt) {
        messagesQViewFilterChanged(false);
    }

    private void messagesViewFilterResetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        messagesQViewFilterChanged(true);
    }

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {
        syncQViewFilterChanged(true);
    }

    private void messagesCleanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cleanLog();
    }

    private void jobEditButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {
        openEditJobDialog();
    }

    private void jobExpandOneLevelButtonenableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.expandOneLevel(jobsTree);
    }

    private void jobCollapseAllButtondisableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.collapseAll(jobsTree);
    }

    private void jobsTreeMouseClicked(java.awt.event.MouseEvent evt) {
        jobsTreeMouseHandler(evt);
    }

    private void jobsTreeMousePressed(java.awt.event.MouseEvent evt) {
        jobsTreeMouseHandler(evt);
    }

    private void jobsTreeMouseReleased(java.awt.event.MouseEvent evt) {
        jobsTreeMouseHandler(evt);
    }

    private void syncQTableMouseClicked(java.awt.event.MouseEvent evt) {
        syncQMouseHandler(evt);
    }

    private void syncQTableMousePressed(java.awt.event.MouseEvent evt) {
        syncQMouseHandler(evt);
    }

    private void syncQTableMouseReleased(java.awt.event.MouseEvent evt) {
        syncQMouseHandler(evt);
    }

    private void startScheduledTasksMenuItemsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {
        schedulerStart();
    }

    private void stopScheduledTasksMenuItemsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {
        schedulerStop();
    }

    private void scheduleStartButtonsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {
        schedulerStart();
    }

    private void scheduleStopButtonsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {
        schedulerStop();
    }

    private void cmdMenuItemOptionsActionPerformed(java.awt.event.ActionEvent evt) {
        cmdMenuItemClicked();
    }

    private void updateMenuItemaboutActionPerformed(java.awt.event.ActionEvent evt) {
        DirSyncPro.getGui().getUpdateDialog().checkForUpdate(false, this);
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        exitForm();
    }

    private void formWindowIconified(java.awt.event.WindowEvent evt) {
        iconifyForm();
    }

    private void appendMenuItemopenConfigActionPerformed(java.awt.event.ActionEvent evt) {
        appendJobs();
    }

    private void saveEnabledAsMenuItemsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {
        saveEnabledJobs();
    }

    private void shutDownButtonsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {
        shutDownButton.setSelected(!shutDownButton.isSelected());
    }

    private void shutDownMenuItemsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {
        shutDownButton.setSelected(!shutDownButton.isSelected());
    }

    abstract protected void about();

    abstract protected void addJob();

    abstract protected void analyzeStart();

    abstract protected void appendJobs();

    abstract protected void cleanLog();

    abstract protected void cmdMenuItemClicked();

    abstract protected void contents();

    abstract protected void copyJob();

    abstract protected void disableAllDirs();

    abstract protected void donate();

    abstract protected void downwardJob();

    abstract protected void openEditJobDialog();

    abstract protected void enableAllDirs();

    abstract protected void exitForm();

    abstract protected JobDialog getJobDialog();

    abstract protected JobTree getJobTree();

    abstract protected void iconifyForm();

    abstract protected void jobsTreeMouseHandler(java.awt.event.MouseEvent evt);

    abstract protected void messagesQViewFilterChanged(boolean reset);

    abstract protected void newConfig();

    abstract protected void openConfig();

    abstract protected void optionsOptionsMenuItemClicked();

    abstract protected void pause();

    abstract protected void quit();

    abstract protected void removeJob();

    abstract protected void saveAsConfig();

    abstract protected void saveConfig();

    abstract protected void saveEnabledJobs();

    abstract protected void schedulerStart();

    abstract protected void schedulerStop();

    abstract protected void stop();

    abstract protected void synchronizationStart();

    abstract protected void syncQMouseHandler(java.awt.event.MouseEvent evt);

    abstract protected void syncQSyncFilterChanged(boolean reset);

    abstract protected void syncQViewFilterChanged(boolean reset);

    abstract protected void toolsSwapSrcDst();

    abstract protected void upwardeJob();
}
