/*
 * GuiObjects.java
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
package edu.wright.dirsyncpro.gui.jobdialog;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.FiltersTree;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.FiltersTreeCellRenderer;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.FiltersTreeModel;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.FiltersTreeNodeEditor;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.ScheduleTree;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.ScheduleTreeCellRenderer;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.ScheduleTreeModel;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.ScheduleTreeNodeEditor;
import edu.wright.dirsyncpro.gui.swing.MyJTabbedPane;
import edu.wright.dirsyncpro.gui.verifier.LongIntVerifier;
import edu.wright.dirsyncpro.gui.verifier.PathVerifier;
import edu.wright.dirsyncpro.gui.verifier.WildCardVerifier;
import edu.wright.dirsyncpro.tools.GuiTools;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
@SuppressWarnings("serial")
public abstract class JobDialogObjects extends JDialog {

    protected JButton dirSrcChangeButton1 = new JButton();
    protected JButton addFilterButton = new JButton();
    protected JButton addScheduleButton = new JButton();
    protected JLabel bidirectionalConflictCopyLargerLabel = new JLabel();
    protected JRadioButton bidirectionalConflictCopyLargerRadioButton = new JRadioButton();
    protected JLabel bidirectionalConflictCopyModifiedLabel = new JLabel();
    protected JRadioButton bidirectionalConflictCopyModifiedRadioButton = new JRadioButton();
    protected JLabel bidirectionalConflictRenameCopyLabel = new JLabel();
    protected JRadioButton bidirectionalConflictRenameCopyRadioButton = new JRadioButton();
    protected JLabel bidirectionalConflictSkipLabel = new JLabel();
    protected JRadioButton bidirectionalConflictSkipRadioButton = new JRadioButton();
    protected JLabel bidirectionalConflictWarnUserLabel = new JLabel();
    protected JRadioButton bidirectionalConflictWarnUserRadioButton = new JRadioButton();
    protected JLabel compareFileContentsLabel = new JLabel();
    protected JRadioButton compareFileContentsRadioButton = new JRadioButton();
    protected JLabel compareFileSizesDatesLabel = new JLabel();
    protected JLabel compareFileSizesDatesMetaDataLabel = new JLabel();
    protected JRadioButton compareFileSizesDatesMetaDataRadioButton = new JRadioButton();
    protected JRadioButton compareFileSizesDatesRadioButton = new JRadioButton();
    protected JTabbedPane conflictResolutionJTabbedPane = new MyJTabbedPane();
    protected JButton copySettingsToAllJobsGoButton;
    protected JLabel copySettingsToAllJobsLabel;
    protected JButton copySettingsToEnabledJobsGoButton;
    protected JLabel copySettingsToEnabledlJobsLabel;
    protected JLabel copySymLinkLabel;
    protected JRadioButton copySymLinkRadioButton = new JRadioButton();
    protected JCheckBox deleteExcludedDirsACheckBox = new JCheckBox();
    protected JCheckBox deleteExcludedDirsBCheckBox = new JCheckBox();
    protected JCheckBox deleteExcludedFilesACheckBox = new JCheckBox();
    protected JCheckBox deleteExcludedFilesBCheckBox = new JCheckBox();
    protected JButton dirBackupDirChangeButton = new JButton();
    protected JTextField dirBackupDirField = new JTextField();
    protected JCheckBox dirBackupDirInlineCheckBox = new JCheckBox();
    protected JLabel dirBackupDirInlineLabel = new JLabel();
    protected JLabel dirBackupDirLabel = new JLabel();
    protected JTextField dirBackupField = new JTextField();
    protected JLabel dirBackupLabel1 = new JLabel();
    protected JLabel dirBackupLabel2 = new JLabel();
    protected JCheckBox dirCopyAllCheckBox = new JCheckBox();
    protected JLabel dirCopyAllLabel = new JLabel();
    protected JCheckBox dirCopyLargerCheckBox = new JCheckBox();
    protected JLabel dirCopyLargerLabel = new JLabel();
    protected JCheckBox dirCopyLargerModifiedCheckBox = new JCheckBox();
    protected JLabel dirCopyLargerModifiedLabel = new JLabel();
    protected JCheckBox dirCopyModifiedCheckBox = new JCheckBox();
    protected JLabel dirCopyModifiedLabel = new JLabel();
    protected JCheckBox dirCopyNewCheckBox = new JCheckBox();
    protected JLabel dirCopyNewLabel = new JLabel();
    protected JCheckBox dirDeleteDirsCheckBox = new JCheckBox();
    protected JLabel dirDeleteDirsLabel = new JLabel();
    protected JLabel dirDeleteExcludedDirsLabel = new JLabel();
    protected JLabel dirDeleteExcludedDirsLabel1 = new JLabel();
    protected JLabel dirDeleteExcludedFilesLabel = new JLabel();
    protected JLabel dirDeleteExcludedFilesLabel1 = new JLabel();
    protected JCheckBox dirDeleteFilesCheckBox = new JCheckBox();
    protected JLabel dirDeleteFilesLabel = new JLabel();
    protected JButton dirDstChangeButton = new JButton();
    protected JTextField dirDstField = new JTextField();
    protected JLabel dirDstLabel = new JLabel();
    protected JCheckBox dirEnableLoggingCheckBox = new JCheckBox();
    protected JLabel dirEnableLoggingJLabel = new JLabel();
    protected JButton dirLogBrowseButton = new JButton();
    protected JTextField dirLogField = new JTextField();
    protected JLabel dirLogLabel = new JLabel();
    protected JTextField dirNameField = new JTextField();
    protected JLabel dirNameLabel = new JLabel();
    protected JButton dirSrcChangeButton = new JButton();
    protected JTextField dirSrcField = new JTextField();
    protected JLabel dirSrcLabel = new JLabel();
    protected JTextField dirTimestampDiffField = new JTextField();
    protected JLabel dirTimestampDiffLabel1 = new JLabel();
    protected JLabel dirTimestampDiffLabel2;
    protected JLabel dirTimestampDiffLabel3;
    protected JCheckBox dirTimestampSyncCheckBox = new JCheckBox();
    protected JCheckBox dirTimestampWriteBackCheckBox = new JCheckBox();
    protected JCheckBox dirVerifyCheckBox = new JCheckBox();
    protected JLabel dirVerifyLabel;
    protected JCheckBox dirWithSubfoldersCheckBox = new JCheckBox();
    protected JLabel dirWithSubfoldersLabel = new JLabel();
    protected JButton editFilterButton = new JButton();
    protected JButton editScheduleButton = new JButton();
    protected JButton filtersCollapseAllButton = new JButton();
    protected JButton filtersExpandAllButton = new JButton();
    protected JTree filtersTree = new JTree();
    protected JLabel followSymLinkLabel;
    protected JRadioButton followSymLinkRadioButton = new JRadioButton();
    protected JCheckBox ignoreDaylightSavingTimeCheckBox = new JCheckBox();
    protected JButton jobCancelButton;
    protected JButton jobOKButton;
    protected JTabbedPane jobTabbedPane = new MyJTabbedPane();
    protected JLabel monodirectionalConflictCopySourceLabel = new JLabel();
    protected JRadioButton monodirectionalConflictCopySourceRadioButton = new JRadioButton();
    protected JLabel monodirectionalConflictSkipLabel = new JLabel();
    protected JRadioButton monodirectionalConflictSkipRadioButton = new JRadioButton();
    protected JLabel monodirectionalConflictWarnUserLabel = new JLabel();
    protected JRadioButton monodirectionalConflictWarnUserRadioButton = new JRadioButton();
    protected JCheckBox overrideReadOnlyCheckBox;
    protected JLabel overrideReadOnlyLabel;
    protected JCheckBox preserveDOSAttributesCheckBox;
    protected JLabel preserveDOSAttributesLabel;
    protected JCheckBox preserveFileOwnershipCheckBox;
    protected JLabel preserveFileOwnershipLabel;
    protected JCheckBox preserveFilePermissionsCheckBox;
    protected JLabel preserveFilePermissionsLabel;
    protected JCheckBox realtimeSyncCheckBox;
    protected JTextField realtimeSyncDelayField;
    protected JCheckBox realtimeSyncOnStartCheckBox;
    protected JButton removeFilterButton = new JButton();
    protected JButton removeScheduleButton = new JButton();
    protected JButton resetJobSettingsGoButton;
    protected JLabel resetJobSettingsLabel;
    protected JButton scheduleCollapseAllButton = new JButton();
    protected JButton scheduleExpandAllButton = new JButton();
    protected JTree scheduleTree = new JTree();
    protected JLabel skipSymLinkLabel;
    protected JRadioButton skipSymLinkRadioButton = new JRadioButton();
    protected JButton swapButton = new JButton();
    protected JComboBox syncModeComboBox = new JComboBox();

    public JobDialogObjects(JFrame frame) {
        super(frame);
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        ButtonGroup buttonGroupSymLinks = new ButtonGroup();
        ButtonGroup buttonGroupBidirectionalConflict = new ButtonGroup();
        ButtonGroup buttonGroupMonodirectionalConflict = new ButtonGroup();
        ButtonGroup buttonGroupCompare = new ButtonGroup();
        JPanel basicTab = new JPanel();
        JPanel pathsPanel = new JPanel();

        JPanel jPanel15 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel spacer2 = new JPanel();
        JPanel informationPanel = new JPanel();
        JTextPane jTextPane1 = new JTextPane();
        HTMLEditorKit editorKit = new HTMLEditorKit();
        StyleSheet styles = new StyleSheet();
        Font font = UIManager.getFont("Label.font");
        String bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane1.setEditorKit(editorKit);
        JPanel syncModeJPanel = new JPanel();
        JLabel label9 = new JLabel();
        JPanel compareTab = new JPanel();
        JPanel spacer10 = new JPanel();
        JPanel informationPanel10 = new JPanel();
        JTextPane jTextPane11 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane11.setEditorKit(editorKit);
        JPanel compareaJpanel = new JPanel();
        JPanel jPanel97 = new JPanel();
        JPanel jPanel101 = new JPanel();
        JPanel jPanel102 = new JPanel();
        JPanel jPanel31 = new JPanel();
        JPanel spacer27 = new JPanel();
        JPanel copyTab = new JPanel();
        JPanel copyOptionsJPanel = new JPanel();
        JPanel jPanel8 = new JPanel();
        JPanel jPanel9 = new JPanel();
        JPanel jPanel10 = new JPanel();
        JPanel jPanel11 = new JPanel();
        JPanel jPanel12 = new JPanel();
        JPanel spacer12 = new JPanel();
        JPanel informationPanel1 = new JPanel();
        JTextPane jTextPane2 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane2.setEditorKit(editorKit);
        JPanel conflictResolutionTab = new JPanel();
        JPanel monodirectionalSyncConflictPanel = new JPanel();
        JPanel jPanel96 = new JPanel();
        JPanel jPanel99 = new JPanel();
        JPanel jPanel100 = new JPanel();
        JPanel jPanel22 = new JPanel();
        JPanel spacer26 = new JPanel();
        JPanel bidirectionalSyncConflictPanel = new JPanel();
        JPanel jPanel38 = new JPanel();
        JPanel jPanel39 = new JPanel();
        JPanel jPanel48 = new JPanel();
        JPanel jPanel40 = new JPanel();
        JPanel jPanel95 = new JPanel();
        JPanel jPanel21 = new JPanel();
        JPanel spacer25 = new JPanel();
        JPanel spacer17 = new JPanel();
        JPanel informationPanel2 = new JPanel();
        JTextPane jTextPane3 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane3.setEditorKit(editorKit);
        JPanel filtersTab = new JPanel();
        JScrollPane jScrollPane3 = new JScrollPane();
        JPanel informationPanel3 = new JPanel();
        JTextPane jTextPane4 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane4.setEditorKit(editorKit);
        JPanel viewJPanel3 = new JPanel();
        JPanel jPanel16 = new JPanel();
        JPanel deletionTab = new JPanel();
        JPanel dirDeleteOptionsPanel = new JPanel();
        JPanel jPanel5 = new JPanel();
        JPanel jPanel13 = new JPanel();
        JPanel jPanel7 = new JPanel();
        JPanel jPanel44 = new JPanel();
        JPanel jPanel18 = new JPanel();
        JPanel jPanel78 = new JPanel();
        JPanel spacer7 = new JPanel();
        JPanel spacer6 = new JPanel();
        JPanel informationPanel4 = new JPanel();
        JTextPane jTextPane5 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane5.setEditorKit(editorKit);
        JPanel backupTab = new JPanel();
        JPanel dirBackupPanel = new JPanel();
        JPanel jPanel30 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel spacer4 = new JPanel();
        JPanel informationPanel5 = new JPanel();
        JTextPane jTextPane6 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane6.setEditorKit(editorKit);
        JPanel logTab = new JPanel();
        JPanel spacer5 = new JPanel();
        JPanel informationPanel8 = new JPanel();
        JTextPane jTextPane9 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane9.setEditorKit(editorKit);
        JPanel dirLogFilePanel = new JPanel();
        JPanel jPanel73 = new JPanel();
        JPanel scheduleTab = new JPanel();
        JScrollPane jScrollPane4 = new JScrollPane();
        JPanel informationPanel9 = new JPanel();
        JTextPane jTextPane10 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane4.setEditorKit(editorKit);
        JPanel viewJPanel4 = new JPanel();
        JPanel jPanel17 = new JPanel();
        JPanel advancedTab = new JPanel();
        JPanel dirTimestampWriteBackPanel = new JPanel();
        JPanel dirTimestampDiffFieldPanel = new JPanel();
        JPanel jPanel28 = new JPanel();
        JLabel dirTimestampWriteBackLabel = new JLabel();
        JPanel jPanel81 = new JPanel();
        JLabel dirTimestampWriteBackLabel1 = new JLabel();
        JPanel jPanel84 = new JPanel();
        JLabel ignoreDaylightSavingTimeJLabel = new JLabel();
        JPanel dirSymbolicLinkPane = new JPanel();
        JPanel jPanel27 = new JPanel();
        skipSymLinkLabel = new JLabel();
        JPanel jPanel23 = new JPanel();
        copySymLinkLabel = new JLabel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel32 = new JPanel();
        followSymLinkLabel = new JLabel();
        JPanel spacer8 = new JPanel();
        JPanel verifyJPanel = new JPanel();
        JPanel jPanel6 = new JPanel();
        dirVerifyLabel = new JLabel();
        JPanel informationPanel6 = new JPanel();
        JTextPane jTextPane7 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane7.setEditorKit(editorKit);
        JPanel attributeJPanel = new JPanel();
        JPanel jPanel24 = new JPanel();
        preserveDOSAttributesCheckBox = new JCheckBox();
        preserveDOSAttributesLabel = new JLabel();
        JPanel jPanel25 = new JPanel();
        preserveFilePermissionsCheckBox = new JCheckBox();
        preserveFilePermissionsLabel = new JLabel();
        JPanel jPanel26 = new JPanel();
        preserveFileOwnershipCheckBox = new JCheckBox();
        preserveFileOwnershipLabel = new JLabel();
        JPanel jPanel29 = new JPanel();
        overrideReadOnlyCheckBox = new JCheckBox();
        overrideReadOnlyLabel = new JLabel();
        JPanel realTimeSyncPanel = new JPanel();
        JPanel dirTimestampDiffFieldPanel1 = new JPanel();
        dirTimestampDiffLabel2 = new JLabel();
        realtimeSyncDelayField = new JTextField();
        dirTimestampDiffLabel3 = new JLabel();
        JPanel jPanel85 = new JPanel();
        JLabel ignoreDaylightSavingTimeJLabel1 = new JLabel();
        realtimeSyncCheckBox = new JCheckBox();
        JPanel jPanel82 = new JPanel();
        JLabel dirTimestampWriteBackLabel3 = new JLabel();
        realtimeSyncOnStartCheckBox = new JCheckBox();
        JPanel actionsTab = new JPanel();
        JPanel settingsActionsPanel = new JPanel();
        copySettingsToAllJobsLabel = new JLabel();
        copySettingsToAllJobsGoButton = new JButton();
        resetJobSettingsLabel = new JLabel();
        resetJobSettingsGoButton = new JButton();
        copySettingsToEnabledlJobsLabel = new JLabel();
        copySettingsToEnabledJobsGoButton = new JButton();
        JPanel spacer16 = new JPanel();
        JPanel spacer14 = new JPanel();
        JPanel informationPanel7 = new JPanel();
        JTextPane jTextPane8 = new JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane8.setEditorKit(editorKit);
        JPanel settingsButtonsPanel2 = new JPanel();
        jobOKButton = new JButton();
        jobCancelButton = new JButton();

        setTitle("Job Options");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new Dimension(580, 340));
        setModal(true);
        getContentPane().setLayout(new GridBagLayout());

        jobTabbedPane.setMaximumSize(null);
        jobTabbedPane.setMinimumSize(new Dimension(0, 0));

        basicTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        basicTab.setLayout(new GridBagLayout());

        pathsPanel.setBorder(BorderFactory.createTitledBorder("Label & Paths"));
        pathsPanel.setEnabled(false);
        pathsPanel.setLayout(new GridBagLayout());

        dirSrcLabel.setIcon(new ImageIcon(getClass().getResource("/icons/dirGreen.png"))); // NOI18N
        dirSrcLabel.setText("Dir A");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(dirSrcLabel, gridBagConstraints);

        dirNameLabel.setIcon(new ImageIcon(getClass().getResource("/icons/name.png"))); // NOI18N
        dirNameLabel.setText("Label");
        dirNameLabel.setMaximumSize(null);
        dirNameLabel.setMinimumSize(null);
        dirNameLabel.setPreferredSize(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(dirNameLabel, gridBagConstraints);

        dirNameField.setToolTipText("The label for this synchronization.");
        dirNameField.setMaximumSize(null);
        dirNameField.setMinimumSize(null);
        dirNameField.setPreferredSize(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.insets = new Insets(4, 0, 4, 0);
        pathsPanel.add(dirNameField, gridBagConstraints);

        dirDstField.setToolTipText("<html>The destination directory. You can use the following wildcards:<br>\"<b>&lt;date</b>&gt;\" for the current date (or \"<b>&lt;DD</b>&gt;\" for day, \"<b>&lt;MM</b>&gt;\" for month, and \"<b>&lt;YYYY</b>&gt;\" for year) and<br>\"<b>&lt;time</b>&gt;\" for the current time (or \"<b>&lt;hh</b>&gt;\" for hour, \"<b>&lt;mm</b>&gt;\" for minute, and \"<b>&lt;ss</b>&gt;\" for second).</html>");
        dirDstField.setInputVerifier(new PathVerifier(this, dirDstField));
        dirDstField.setMaximumSize(null);
        dirDstField.setMinimumSize(null);
        dirDstField.setPreferredSize(null);
        setFileDragNDrop(dirDstField);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        pathsPanel.add(dirDstField, gridBagConstraints);

        dirDstChangeButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        dirDstChangeButton.setIcon(new ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirDstChangeButton.setToolTipText("Browse for the destination directory.");
        dirDstChangeButton.setIconTextGap(2);
        dirDstChangeButton.setMargin(new Insets(2, 2, 2, 2));
        dirDstChangeButton.addActionListener(this::dirDstChangeButtonbrowseDstActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(dirDstChangeButton, gridBagConstraints);

        dirSrcChangeButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        dirSrcChangeButton.setIcon(new ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirSrcChangeButton.setToolTipText("Browse for the source directory.");
        dirSrcChangeButton.setIconTextGap(2);
        dirSrcChangeButton.setMargin(new Insets(2, 2, 2, 2));
        dirSrcChangeButton.addActionListener(this::dirSrcChangeButtonbrowseSrcActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(dirSrcChangeButton, gridBagConstraints);

        dirSrcField.setToolTipText("<html>The source directory. You can use the following wildcards:<br />\"<b>&lt;username&gt;</b>\" for the name of the current user, and <br />\"<b>&lt;userhome&gt;</b>\" for the home directory of the current user.</html>");
        dirSrcField.setInputVerifier(new PathVerifier(this, dirSrcField));
        dirSrcField.setMaximumSize(null);
        dirSrcField.setMinimumSize(null);
        dirSrcField.setPreferredSize(null);
        setFileDragNDrop(dirSrcField);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        pathsPanel.add(dirSrcField, gridBagConstraints);

        dirDstLabel.setIcon(new ImageIcon(getClass().getResource("/icons/dirOrange.png"))); // NOI18N
        dirDstLabel.setText("Dir B");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(dirDstLabel, gridBagConstraints);

        jPanel15.setMaximumSize(null);
        jPanel15.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirWithSubfoldersCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
        dirWithSubfoldersCheckBox.setMaximumSize(null);
        dirWithSubfoldersCheckBox.setMinimumSize(null);
        dirWithSubfoldersCheckBox.setPreferredSize(null);
        jPanel15.add(dirWithSubfoldersCheckBox);

        dirWithSubfoldersLabel.setIcon(new ImageIcon(getClass().getResource("/icons/withSubdirs.png"))); // NOI18N
        dirWithSubfoldersLabel.setText("Include subfolders");
        jPanel15.add(dirWithSubfoldersLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        gridBagConstraints.insets = new Insets(0, 0, 0, 8);
        pathsPanel.add(jPanel15, gridBagConstraints);

        jPanel3.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(jPanel3, gridBagConstraints);

        swapButton.setText("Swap");
        swapButton.setAlignmentX(0.5F);
        swapButton.addActionListener(this::swapButtonActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        pathsPanel.add(swapButton, gridBagConstraints);

        dirSrcChangeButton1.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        dirSrcChangeButton1.setIcon(new ImageIcon(getClass().getResource("/icons/GDrive.png")));
        // NOI18N
        dirSrcChangeButton1.setToolTipText("Browse for the source directory.");
        dirSrcChangeButton1.setIconTextGap(2);
        dirSrcChangeButton1.setMargin(new Insets(2, 2, 2, 2));
        dirSrcChangeButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
//                 dirSrcChangeButton1browseSrcActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(dirSrcChangeButton1, gridBagConstraints);
        dirSrcChangeButton1.getAccessibleContext().setAccessibleDescription("");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        basicTab.add(pathsPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        basicTab.add(spacer2, gridBagConstraints);

        informationPanel.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel.setPreferredSize(new Dimension(298, 180));
        informationPanel.setLayout(new GridBagLayout());

        jTextPane1.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setText("<html>\n  <head>\n\n  </head>\n  <body>\n    <p style=\"margin-top: 0\">\n    \nSet up the directories and the sync mode: <u>Mirror A -&gt; B (incremental)</u> and <u>Mirror B -&gt; A (incremental)</u> are mono-directional (one way). \nOnly new and modified files from the source are copied to the destination; redundant files in the destination will be deleted. The directories are exactly the same after the sync. \n<u>Synchronize A &lt;-&gt; B (incremental)</u> is bi-directional (two-ways). Only new and modified files from both dirs are copied to each other. Both directories are exactly the same after the \nsync. <u>Backup A -&gt; B</u> and <u>Restore B -&gt; A</u> will copy all files from A to B (or vice versa). <u>Contribute A -&gt; B</u> and <u>Contribute B -&gt; A</u> will \ncopy only the new files from A to B (or vice versa). Choose <u>Synchronize A -&gt; B (custom)</u>, <u>Synchronize B -&gt; A (custom)</u> or <u>Synchronize A &lt;-&gt; B (custom)</u> to \nsetup the sync behavior as you wish (advanced). <span style=\"color: blue;\">Some tabs get available only in a 'custom' mode.</span>\n    </p>\n  </body>\n</html>\n");
        jTextPane1.setFocusCycleRoot(false);
        jTextPane1.setMinimumSize(new Dimension(101, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel.add(jTextPane1, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        basicTab.add(informationPanel, gridBagConstraints);

        syncModeJPanel.setBorder(BorderFactory.createTitledBorder("Sync using this mode"));
        syncModeJPanel.setLayout(new GridBagLayout());

        label9.setIcon(new ImageIcon(getClass().getResource("/icons/DirSyncPro.png"))); // NOI18N
        label9.setText("Sync Mode:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(0, 5, 0, 0);
        syncModeJPanel.add(label9, gridBagConstraints);

        syncModeComboBox.setMaximumRowCount(Const.SyncMode.values().length);
        syncModeComboBox.addItemListener(this::syncModeComboBoxItemStateChanged);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        syncModeJPanel.add(syncModeComboBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.03;
        basicTab.add(syncModeJPanel, gridBagConstraints);

        jobTabbedPane.addTab("Basics", basicTab);

        compareTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        compareTab.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        compareTab.add(spacer10, gridBagConstraints);

        informationPanel10.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel10.setPreferredSize(new Dimension(298, 180));
        informationPanel10.setLayout(new GridBagLayout());

        jTextPane11.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane11.setContentType("text/html"); // NOI18N
        jTextPane11.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here how the comparison is actually carried out. When it is based on <u>file sizes and modification dates</u>, only the file sizes and modification dates are compared to conclude if a file is changed. \nThis is adequate for most cases because mostly the file sizes and/or modification dates change when files are modified. If the comparison is based on <u>file sizes, modifcation dates and file meta data</u>, \nthe changes in meta data (besides file sizes and modification dates) will also cause the file to be marked as 'modified'. If the file sizes are the same, and <u>file contents</u> is selected, DirSync Pro \nwill compare the contents of the files byte-by-byte to verify if the files are different. Please notice that comapring file contents could make the synchronization extremely slow.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane11.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel10.add(jTextPane11, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        compareTab.add(informationPanel10, gridBagConstraints);

        compareaJpanel.setBorder(BorderFactory.createTitledBorder("Compare"));
        compareaJpanel.setLayout(new GridBagLayout());

        jPanel97.setMaximumSize(null);
        jPanel97.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupCompare.add(compareFileSizesDatesRadioButton);
        compareFileSizesDatesRadioButton.setMaximumSize(null);
        compareFileSizesDatesRadioButton.setMinimumSize(null);
        compareFileSizesDatesRadioButton.setPreferredSize(null);
        jPanel97.add(compareFileSizesDatesRadioButton);

        compareFileSizesDatesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        compareFileSizesDatesLabel.setText("Compare only file sizes and modification dates (fastest)");
        jPanel97.add(compareFileSizesDatesLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        compareaJpanel.add(jPanel97, gridBagConstraints);

        jPanel101.setMaximumSize(null);
        jPanel101.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupCompare.add(compareFileSizesDatesMetaDataRadioButton);
        compareFileSizesDatesMetaDataRadioButton.setMaximumSize(null);
        compareFileSizesDatesMetaDataRadioButton.setMinimumSize(null);
        compareFileSizesDatesMetaDataRadioButton.setPreferredSize(null);
        jPanel101.add(compareFileSizesDatesMetaDataRadioButton);

        compareFileSizesDatesMetaDataLabel.setIcon(new ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N
        compareFileSizesDatesMetaDataLabel.setText("Compare file sizes, modification dates and file meta data (attribute, permissions, ownerships)");
        jPanel101.add(compareFileSizesDatesMetaDataLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        compareaJpanel.add(jPanel101, gridBagConstraints);

        jPanel102.setMaximumSize(null);
        jPanel102.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupCompare.add(compareFileContentsRadioButton);
        compareFileContentsRadioButton.setMaximumSize(null);
        compareFileContentsRadioButton.setMinimumSize(null);
        compareFileContentsRadioButton.setPreferredSize(null);
        jPanel102.add(compareFileContentsRadioButton);

        compareFileContentsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/icon_file.png"))); // NOI18N
        compareFileContentsLabel.setText("Compare file contents (slowest)");
        jPanel102.add(compareFileContentsLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        compareaJpanel.add(jPanel102, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 1.0;
        compareaJpanel.add(jPanel31, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        compareaJpanel.add(spacer27, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        compareTab.add(compareaJpanel, gridBagConstraints);

        jobTabbedPane.addTab("Compare", compareTab);

        copyTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        copyTab.setLayout(new GridBagLayout());

        copyOptionsJPanel.setBorder(BorderFactory.createTitledBorder("Copy these files and dirs"));
        copyOptionsJPanel.setLayout(new BoxLayout(copyOptionsJPanel, BoxLayout.Y_AXIS));

        jPanel8.setMaximumSize(null);
        jPanel8.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirCopyAllCheckBox.setMaximumSize(null);
        dirCopyAllCheckBox.setMinimumSize(null);
        dirCopyAllCheckBox.setPreferredSize(null);
        dirCopyAllCheckBox.addActionListener(this::dirCopyAllCheckBoxdirEventActionPerformed);
        jPanel8.add(dirCopyAllCheckBox);

        dirCopyAllLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyAll.png"))); // NOI18N
        dirCopyAllLabel.setText("Forced copy all files");
        jPanel8.add(dirCopyAllLabel);

        copyOptionsJPanel.add(jPanel8);

        jPanel9.setMaximumSize(null);
        jPanel9.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirCopyNewCheckBox.setMaximumSize(null);
        dirCopyNewCheckBox.setMinimumSize(null);
        dirCopyNewCheckBox.setPreferredSize(null);
        dirCopyNewCheckBox.addActionListener(this::dirCopyNewCheckBoxdirEventActionPerformed);
        jPanel9.add(dirCopyNewCheckBox);

        dirCopyNewLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyNew.png"))); // NOI18N
        dirCopyNewLabel.setText("New");
        dirCopyNewLabel.setMaximumSize(null);
        dirCopyNewLabel.setMinimumSize(null);
        dirCopyNewLabel.setPreferredSize(null);
        jPanel9.add(dirCopyNewLabel);

        copyOptionsJPanel.add(jPanel9);

        jPanel10.setMaximumSize(null);
        jPanel10.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirCopyLargerCheckBox.setMaximumSize(null);
        dirCopyLargerCheckBox.setMinimumSize(null);
        dirCopyLargerCheckBox.setPreferredSize(null);
        dirCopyLargerCheckBox.addActionListener(this::dirCopyLargerCheckBoxdirEventActionPerformed);
        jPanel10.add(dirCopyLargerCheckBox);

        dirCopyLargerLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        dirCopyLargerLabel.setText("Larger");
        dirCopyLargerLabel.setMaximumSize(null);
        dirCopyLargerLabel.setMinimumSize(null);
        dirCopyLargerLabel.setPreferredSize(null);
        jPanel10.add(dirCopyLargerLabel);

        copyOptionsJPanel.add(jPanel10);

        jPanel11.setMaximumSize(null);
        jPanel11.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirCopyModifiedCheckBox.setMaximumSize(null);
        dirCopyModifiedCheckBox.setMinimumSize(null);
        dirCopyModifiedCheckBox.setPreferredSize(null);
        dirCopyModifiedCheckBox.addActionListener(this::dirCopyModifiedCheckBoxdirEventActionPerformed);
        jPanel11.add(dirCopyModifiedCheckBox);

        dirCopyModifiedLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        dirCopyModifiedLabel.setText("Modified");
        dirCopyModifiedLabel.setMaximumSize(new Dimension(16, 16));
        dirCopyModifiedLabel.setMinimumSize(null);
        dirCopyModifiedLabel.setPreferredSize(null);
        jPanel11.add(dirCopyModifiedLabel);

        copyOptionsJPanel.add(jPanel11);

        jPanel12.setMaximumSize(null);
        jPanel12.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirCopyLargerModifiedCheckBox.setMaximumSize(null);
        dirCopyLargerModifiedCheckBox.setMinimumSize(null);
        dirCopyLargerModifiedCheckBox.setPreferredSize(null);
        dirCopyLargerModifiedCheckBox.addActionListener(this::dirCopyLargerModifiedCheckBoxdirEventActionPerformed);
        jPanel12.add(dirCopyLargerModifiedCheckBox);

        dirCopyLargerModifiedLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLargerModified.png"))); // NOI18N
        dirCopyLargerModifiedLabel.setText("Both larger and modified");
        dirCopyLargerModifiedLabel.setMaximumSize(null);
        dirCopyLargerModifiedLabel.setMinimumSize(null);
        dirCopyLargerModifiedLabel.setPreferredSize(null);
        jPanel12.add(dirCopyLargerModifiedLabel);

        copyOptionsJPanel.add(jPanel12);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.01;
        copyTab.add(copyOptionsJPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        copyTab.add(spacer12, gridBagConstraints);

        informationPanel1.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel1.setPreferredSize(new Dimension(298, 180));
        informationPanel1.setLayout(new GridBagLayout());

        jTextPane2.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane2.setContentType("text/html"); // NOI18N
        jTextPane2.setText("<html>\n  <head>\n\n  </head>\n  <body>\n    <p style=\"margin-top: 0\">\n    \nYou may define these copy options only if the Sync Mode under the tab Basics is set to 'custom'. Options: <u>Forced copy all files</u> will cause a forced full copy of all files. <u>New</u>, <u>Larger</u>, <u>Modified</u> cause to copy only the new, larger and/or modified files, respectively. <u>Both larger and Modified</u> causes to copy the files which not only are larger but also modified.\n    </p>\n  </body>\n</html>");
        jTextPane2.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel1.add(jTextPane2, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        copyTab.add(informationPanel1, gridBagConstraints);

        jobTabbedPane.addTab("Copy", copyTab);

        conflictResolutionTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        conflictResolutionTab.setLayout(new GridBagLayout());

        monodirectionalSyncConflictPanel.setBorder(BorderFactory.createTitledBorder("Monodirectional sync conflict resolution mode"));
        monodirectionalSyncConflictPanel.setLayout(new GridBagLayout());

        jPanel96.setMaximumSize(null);
        jPanel96.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupMonodirectionalConflict.add(monodirectionalConflictCopySourceRadioButton);
        monodirectionalConflictCopySourceRadioButton.setMaximumSize(null);
        monodirectionalConflictCopySourceRadioButton.setMinimumSize(null);
        monodirectionalConflictCopySourceRadioButton.setPreferredSize(null);
        jPanel96.add(monodirectionalConflictCopySourceRadioButton);

        monodirectionalConflictCopySourceLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        monodirectionalConflictCopySourceLabel.setText("Overwrite the file in destination with the file from source");
        jPanel96.add(monodirectionalConflictCopySourceLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        monodirectionalSyncConflictPanel.add(jPanel96, gridBagConstraints);

        jPanel99.setMaximumSize(null);
        jPanel99.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupMonodirectionalConflict.add(monodirectionalConflictWarnUserRadioButton);
        monodirectionalConflictWarnUserRadioButton.setMaximumSize(null);
        monodirectionalConflictWarnUserRadioButton.setMinimumSize(null);
        monodirectionalConflictWarnUserRadioButton.setPreferredSize(null);
        jPanel99.add(monodirectionalConflictWarnUserRadioButton);

        monodirectionalConflictWarnUserLabel.setIcon(new ImageIcon(getClass().getResource("/icons/icon_warning.png"))); // NOI18N
        monodirectionalConflictWarnUserLabel.setText("Do nothing. Just warn me!");
        jPanel99.add(monodirectionalConflictWarnUserLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        monodirectionalSyncConflictPanel.add(jPanel99, gridBagConstraints);

        jPanel100.setMaximumSize(null);
        jPanel100.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupMonodirectionalConflict.add(monodirectionalConflictSkipRadioButton);
        monodirectionalConflictSkipRadioButton.setMaximumSize(null);
        monodirectionalConflictSkipRadioButton.setMinimumSize(null);
        monodirectionalConflictSkipRadioButton.setPreferredSize(null);
        jPanel100.add(monodirectionalConflictSkipRadioButton);

        monodirectionalConflictSkipLabel.setIcon(new ImageIcon(getClass().getResource("/icons/excludeFile.png"))); // NOI18N
        monodirectionalConflictSkipLabel.setText("Do nothing. Just skip silently!");
        jPanel100.add(monodirectionalConflictSkipLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        monodirectionalSyncConflictPanel.add(jPanel100, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 1.0;
        monodirectionalSyncConflictPanel.add(jPanel22, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        monodirectionalSyncConflictPanel.add(spacer26, gridBagConstraints);

        conflictResolutionJTabbedPane.addTab("Monodirectional", monodirectionalSyncConflictPanel);

        bidirectionalSyncConflictPanel.setBorder(BorderFactory.createTitledBorder("Bidirectional sync conflict resolution mode"));
        bidirectionalSyncConflictPanel.setLayout(new GridBagLayout());

        jPanel38.setMaximumSize(null);
        jPanel38.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictCopyModifiedRadioButton);
        bidirectionalConflictCopyModifiedRadioButton.setMaximumSize(null);
        bidirectionalConflictCopyModifiedRadioButton.setMinimumSize(null);
        bidirectionalConflictCopyModifiedRadioButton.setPreferredSize(null);
        jPanel38.add(bidirectionalConflictCopyModifiedRadioButton);

        bidirectionalConflictCopyModifiedLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        bidirectionalConflictCopyModifiedLabel.setText("Copy the latest modified file to both dirs");
        jPanel38.add(bidirectionalConflictCopyModifiedLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel38, gridBagConstraints);

        jPanel39.setMaximumSize(null);
        jPanel39.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictCopyLargerRadioButton);
        bidirectionalConflictCopyLargerRadioButton.setMaximumSize(null);
        bidirectionalConflictCopyLargerRadioButton.setMinimumSize(null);
        bidirectionalConflictCopyLargerRadioButton.setPreferredSize(null);
        jPanel39.add(bidirectionalConflictCopyLargerRadioButton);

        bidirectionalConflictCopyLargerLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        bidirectionalConflictCopyLargerLabel.setText("Copy the largest file to both dirs");
        jPanel39.add(bidirectionalConflictCopyLargerLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel39, gridBagConstraints);

        jPanel48.setMaximumSize(null);
        jPanel48.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictRenameCopyRadioButton);
        bidirectionalConflictRenameCopyRadioButton.setMaximumSize(null);
        bidirectionalConflictRenameCopyRadioButton.setMinimumSize(null);
        bidirectionalConflictRenameCopyRadioButton.setPreferredSize(null);
        jPanel48.add(bidirectionalConflictRenameCopyRadioButton);

        bidirectionalConflictRenameCopyLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyAll.png"))); // NOI18N
        bidirectionalConflictRenameCopyLabel.setText("Rename & copy both files to both dirs");
        jPanel48.add(bidirectionalConflictRenameCopyLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel48, gridBagConstraints);

        jPanel40.setMaximumSize(null);
        jPanel40.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictWarnUserRadioButton);
        bidirectionalConflictWarnUserRadioButton.setMaximumSize(null);
        bidirectionalConflictWarnUserRadioButton.setMinimumSize(null);
        bidirectionalConflictWarnUserRadioButton.setPreferredSize(null);
        jPanel40.add(bidirectionalConflictWarnUserRadioButton);

        bidirectionalConflictWarnUserLabel.setIcon(new ImageIcon(getClass().getResource("/icons/icon_warning.png"))); // NOI18N
        bidirectionalConflictWarnUserLabel.setText("Do nothing. Just warn me!");
        jPanel40.add(bidirectionalConflictWarnUserLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel40, gridBagConstraints);

        jPanel95.setMaximumSize(null);
        jPanel95.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictSkipRadioButton);
        bidirectionalConflictSkipRadioButton.setMaximumSize(null);
        bidirectionalConflictSkipRadioButton.setMinimumSize(null);
        bidirectionalConflictSkipRadioButton.setPreferredSize(null);
        jPanel95.add(bidirectionalConflictSkipRadioButton);

        bidirectionalConflictSkipLabel.setIcon(new ImageIcon(getClass().getResource("/icons/excludeFile.png"))); // NOI18N
        bidirectionalConflictSkipLabel.setText("Do nothing. Just skip silently!");
        jPanel95.add(bidirectionalConflictSkipLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel95, gridBagConstraints);
        bidirectionalSyncConflictPanel.add(jPanel21, new GridBagConstraints());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        bidirectionalSyncConflictPanel.add(spacer25, gridBagConstraints);

        conflictResolutionJTabbedPane.addTab("Bidirectional", bidirectionalSyncConflictPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        conflictResolutionTab.add(conflictResolutionJTabbedPane, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        conflictResolutionTab.add(spacer17, gridBagConstraints);

        informationPanel2.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel2.setPreferredSize(new Dimension(298, 180));
        informationPanel2.setLayout(new GridBagLayout());

        jTextPane3.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane3.setContentType("text/html"); // NOI18N
        jTextPane3.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may set the conflict resolution mode only if the Sync Mode under the tab Basic is set to a 'custom' mode. Options for bidirectional sync:\n<u>Copy the latest modified/largest file to both dirs</u>: if a file is modified in both dir individually, copy the latest modified/largest to both dirs.\n<u>Rename & copy both files to both dirs</u>: if a file is modified in both dir individually, rename them first and then copy them both to both dirs. When renaming, extensions '.DirA' and '.DirB' are added to the files form DirA and DirB respectively.\n<u>Do nothing. Just warn me!</u>: ignore if a file is modified in both dir individually. Shows a warning.\n<u>Do nothing. Just skip them silently!</u>: ignore silently if a file is modified in both dir individually.\nOptions for monodirectional sync:\n<u>Overwrite the file in destination with the file from source</u>: If the file in destination is modified individually, copy the file from source and overwrite the file in destination.\n<u>Do nothing. Just warn me!</u>: ignore if a file is modified in Dir B and show a warning.\n<u>Do nothing. Skip the file silently!</u>: ignore silently if a file is modified in Dir B individually.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane3.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel2.add(jTextPane3, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        conflictResolutionTab.add(informationPanel2, gridBagConstraints);

        jobTabbedPane.addTab("Conflict resolution", conflictResolutionTab);

        filtersTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersTab.setName(""); // NOI18N
        filtersTab.setLayout(new GridBagLayout());

        jScrollPane3.setPreferredSize(new Dimension(74, 200));

        filtersTree.setModel(new FiltersTreeModel(getFiltersTree()));
        filtersTree.setCellEditor(new FiltersTreeNodeEditor(filtersTree));
        filtersTree.setCellRenderer(new FiltersTreeCellRenderer());
        filtersTree.setEditable(true);
        filtersTree.setMinimumSize(new Dimension(72, 64));
        jScrollPane3.setViewportView(filtersTree);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        filtersTab.add(jScrollPane3, gridBagConstraints);

        informationPanel3.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel3.setPreferredSize(new Dimension(298, 180));
        informationPanel3.setLayout(new GridBagLayout());

        jTextPane4.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane4.setContentType("text/html"); // NOI18N
        jTextPane4.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may (re)define here filters for inclusion and exclusions of files and directories if the Sync Mode under the tab Basics is set to 'custom'. 'Edit' and 'Remove' buttons get available only if a filter is selected. Filter tree nodes get grayed out if they do not contain any filter.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane4.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel3.add(jTextPane4, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersTab.add(informationPanel3, gridBagConstraints);

        viewJPanel3.setMinimumSize(new Dimension(100, 29));
        viewJPanel3.setLayout(new GridBagLayout());

        addFilterButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        addFilterButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirNew.png"))); // NOI18N
        addFilterButton.setText("New");
        addFilterButton.setToolTipText("Add a new Job.");
        addFilterButton.setIconTextGap(2);
        addFilterButton.setMargin(new Insets(2, 2, 2, 2));
        addFilterButton.addActionListener(this::addFilterButtonlistAddActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel3.add(addFilterButton, gridBagConstraints);

        editFilterButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        editFilterButton.setIcon(new ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editFilterButton.setText("Edit");
        editFilterButton.setToolTipText("Edit the selected Job");
        editFilterButton.setIconTextGap(2);
        editFilterButton.setMargin(new Insets(2, 2, 2, 2));
        editFilterButton.addActionListener(this::editFilterButtonlistAddActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel3.add(editFilterButton, gridBagConstraints);

        removeFilterButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        removeFilterButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        removeFilterButton.setText("Remove");
        removeFilterButton.setToolTipText("Remove the selected Job.");
        removeFilterButton.setIconTextGap(2);
        removeFilterButton.setMargin(new Insets(2, 2, 2, 2));
        removeFilterButton.setMaximumSize(null);
        removeFilterButton.setMinimumSize(null);
        removeFilterButton.setPreferredSize(null);
        removeFilterButton.addActionListener(this::removeFilterButtonlistRemoveActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel3.add(removeFilterButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel3.add(jPanel16, gridBagConstraints);

        filtersExpandAllButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        filtersExpandAllButton.setIcon(new ImageIcon(getClass().getResource("/icons/expandAll.png"))); // NOI18N
        filtersExpandAllButton.setText("Expand");
        filtersExpandAllButton.setToolTipText("Expand all Jobs in the job tree.");
        filtersExpandAllButton.setActionCommand("Enable all");
        filtersExpandAllButton.setMargin(new Insets(2, 2, 2, 2));
        filtersExpandAllButton.setMaximumSize(null);
        filtersExpandAllButton.setPreferredSize(new Dimension(70, 17));
        filtersExpandAllButton.addActionListener(this::filtersExpandAllButtonenableAllDirsActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(0, 8, 4, 0);
        viewJPanel3.add(filtersExpandAllButton, gridBagConstraints);

        filtersCollapseAllButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        filtersCollapseAllButton.setIcon(new ImageIcon(getClass().getResource("/icons/collapseAll.png"))); // NOI18N
        filtersCollapseAllButton.setText("Collapse");
        filtersCollapseAllButton.setToolTipText("Collapse all Jobs in the job tree.");
        filtersCollapseAllButton.setActionCommand("Disable all");
        filtersCollapseAllButton.setMargin(new Insets(2, 2, 2, 2));
        filtersCollapseAllButton.setMaximumSize(null);
        filtersCollapseAllButton.setPreferredSize(new Dimension(70, 17));
        filtersCollapseAllButton.addActionListener(this::filtersCollapseAllButtondisableAllDirsActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(0, 0, 4, 8);
        viewJPanel3.add(filtersCollapseAllButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        filtersTab.add(viewJPanel3, gridBagConstraints);

        jobTabbedPane.addTab("Filters", filtersTab);

        deletionTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        deletionTab.setLayout(new GridBagLayout());

        dirDeleteOptionsPanel.setBorder(BorderFactory.createTitledBorder("Deletion"));
        dirDeleteOptionsPanel.setLayout(new GridBagLayout());

        jPanel5.setMaximumSize(null);
        jPanel5.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirDeleteFilesCheckBox.setMaximumSize(null);
        dirDeleteFilesCheckBox.setMinimumSize(null);
        dirDeleteFilesCheckBox.setPreferredSize(null);
        jPanel5.add(dirDeleteFilesCheckBox);

        dirDeleteFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        dirDeleteFilesLabel.setText("Delete orphan files in the destination (files that do not exist in the source)");
        jPanel5.add(dirDeleteFilesLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel5, gridBagConstraints);

        jPanel13.setMaximumSize(null);
        jPanel13.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirDeleteDirsCheckBox.setMaximumSize(null);
        dirDeleteDirsCheckBox.setMinimumSize(null);
        dirDeleteDirsCheckBox.setPreferredSize(null);
        jPanel13.add(dirDeleteDirsCheckBox);

        dirDeleteDirsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        dirDeleteDirsLabel.setText("Delete orphan dirs in the destination (dirs that do not exist in the source)");
        jPanel13.add(dirDeleteDirsLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel13, gridBagConstraints);

        jPanel7.setMaximumSize(null);
        jPanel7.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        deleteExcludedFilesACheckBox.setMaximumSize(null);
        deleteExcludedFilesACheckBox.setMinimumSize(null);
        deleteExcludedFilesACheckBox.setPreferredSize(null);
        jPanel7.add(deleteExcludedFilesACheckBox);

        dirDeleteExcludedFilesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        dirDeleteExcludedFilesLabel.setText("Force deleting excluded files from Dir A");
        jPanel7.add(dirDeleteExcludedFilesLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel7, gridBagConstraints);

        jPanel44.setMaximumSize(null);
        jPanel44.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        deleteExcludedDirsACheckBox.setMaximumSize(null);
        deleteExcludedDirsACheckBox.setMinimumSize(null);
        deleteExcludedDirsACheckBox.setPreferredSize(null);
        jPanel44.add(deleteExcludedDirsACheckBox);

        dirDeleteExcludedDirsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        dirDeleteExcludedDirsLabel.setText("Force deleting excluded directories from Dir A");
        jPanel44.add(dirDeleteExcludedDirsLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel44, gridBagConstraints);

        jPanel18.setMaximumSize(null);
        jPanel18.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        deleteExcludedFilesBCheckBox.setMaximumSize(null);
        deleteExcludedFilesBCheckBox.setMinimumSize(null);
        deleteExcludedFilesBCheckBox.setPreferredSize(null);
        jPanel18.add(deleteExcludedFilesBCheckBox);

        dirDeleteExcludedFilesLabel1.setIcon(new ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        dirDeleteExcludedFilesLabel1.setText("Force deleting excluded files from Dir B");
        jPanel18.add(dirDeleteExcludedFilesLabel1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel18, gridBagConstraints);

        jPanel78.setMaximumSize(null);
        jPanel78.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        deleteExcludedDirsBCheckBox.setMaximumSize(null);
        deleteExcludedDirsBCheckBox.setMinimumSize(null);
        deleteExcludedDirsBCheckBox.setPreferredSize(null);
        jPanel78.add(deleteExcludedDirsBCheckBox);

        dirDeleteExcludedDirsLabel1.setIcon(new ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        dirDeleteExcludedDirsLabel1.setText("Force deleting excluded directories from Dir B");
        jPanel78.add(dirDeleteExcludedDirsLabel1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel78, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        dirDeleteOptionsPanel.add(spacer7, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.03;
        deletionTab.add(dirDeleteOptionsPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        deletionTab.add(spacer6, gridBagConstraints);

        informationPanel4.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel4.setPreferredSize(new Dimension(298, 180));
        informationPanel4.setLayout(new GridBagLayout());

        jTextPane5.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane5.setContentType("text/html"); // NOI18N
        jTextPane5.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may set deletion options only if the Sync Mode under the tab Basics is set to 'custom'. Options: <u>Orphan files from destination</u> and <u>Orphan dirs from destination</u> will cause the files/dirs in the destination to be deleted if the corresponding file in the source does not exist.\n<u>Force deleting excluded files from Dir A/Dir B</u> and <u>Force deleting excluded directories from Dir A/Dir B</u> will cause the files/dirs in Dir A/Dir B to be deleted \nif they match any exclusion pattern. This could be helpful while cleaning stuff, for example to deleting all temporary files matching *.tmp.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane5.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel4.add(jTextPane5, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        deletionTab.add(informationPanel4, gridBagConstraints);

        jobTabbedPane.addTab("Deletion", deletionTab);

        backupTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        backupTab.setLayout(new GridBagLayout());

        dirBackupPanel.setBorder(BorderFactory.createTitledBorder("Backup"));
        dirBackupPanel.setLayout(new GridBagLayout());

        dirBackupLabel1.setText("Keep");
        dirBackupLabel1.setMaximumSize(null);
        dirBackupLabel1.setMinimumSize(null);
        dirBackupLabel1.setPreferredSize(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirBackupPanel.add(dirBackupLabel1, gridBagConstraints);

        dirBackupField.setColumns(2);
        dirBackupField.setText("0");
        dirBackupField.setToolTipText("<html>Number of backups of changed or deleted files to keep.<br>\nZero means no backups at all, the maximum number of backups is " + Const.BACKUP_MAX_NUMBER + ".</html>");
        dirBackupField.setInputVerifier(new LongIntVerifier(this, dirBackupField, 0, Const.BACKUP_MAX_NUMBER));
        dirBackupField.setMaximumSize(null);
        dirBackupPanel.add(dirBackupField, new GridBagConstraints());

        dirBackupLabel2.setText("backups of changed or deleted files");
        dirBackupLabel2.setMaximumSize(null);
        dirBackupLabel2.setMinimumSize(null);
        dirBackupLabel2.setPreferredSize(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.insets = new Insets(0, 2, 0, 0);
        dirBackupPanel.add(dirBackupLabel2, gridBagConstraints);

        jPanel30.setMaximumSize(null);
        jPanel30.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirBackupDirInlineCheckBox.setToolTipText("");
        dirBackupDirInlineCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
        dirBackupDirInlineCheckBox.setMaximumSize(null);
        dirBackupDirInlineCheckBox.setMinimumSize(null);
        dirBackupDirInlineCheckBox.setPreferredSize(null);
        jPanel30.add(dirBackupDirInlineCheckBox);

        dirBackupDirInlineLabel.setText("Keep the backup-dir in the destination directory.");
        jPanel30.add(dirBackupDirInlineLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirBackupPanel.add(jPanel30, gridBagConstraints);

        jPanel2.setLayout(new GridBagLayout());

        dirBackupDirLabel.setText("Backup dir:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        jPanel2.add(dirBackupDirLabel, gridBagConstraints);

        dirBackupDirField.setEditable(false);
        dirBackupDirField.setMaximumSize(null);
        dirBackupDirField.setMinimumSize(null);
        dirBackupDirField.setPreferredSize(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        jPanel2.add(dirBackupDirField, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirBackupPanel.add(jPanel2, gridBagConstraints);

        dirBackupDirChangeButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        dirBackupDirChangeButton.setIcon(new ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirBackupDirChangeButton.setIconTextGap(2);
        dirBackupDirChangeButton.setMargin(new Insets(2, 2, 2, 2));
        dirBackupDirChangeButton.addActionListener(this::dirBackupDirChangeButtonbrowseSrcActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        dirBackupPanel.add(dirBackupDirChangeButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.01;
        backupTab.add(dirBackupPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        backupTab.add(spacer4, gridBagConstraints);

        informationPanel5.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel5.setPreferredSize(new Dimension(298, 180));
        informationPanel5.setLayout(new GridBagLayout());

        jTextPane6.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane6.setContentType("text/html"); // NOI18N
        jTextPane6.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nDefine here the number of backups of a file which should be made if the file is being deleted or overwritten. You may use these options only if the Sync Mode under the tab Basics is set to 'custom'. When creating a backup, the file name is extended with a rank number. You may let the backups be created in the destination directory or you may define a custom directory. The backups are always placed in a directory named '.DirSyncProBackup' within the backup-directory. You may set/edit backup options only if the Sync Mode under the tab Basics is not set to 'Bi-directional'. The number of backups is set to 0 by default (no backups). You may create 50 backups at most.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane6.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel5.add(jTextPane6, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        backupTab.add(informationPanel5, gridBagConstraints);

        jobTabbedPane.addTab("Backup", backupTab);

        logTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        logTab.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        logTab.add(spacer5, gridBagConstraints);

        informationPanel8.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel8.setPreferredSize(new Dimension(298, 180));
        informationPanel8.setLayout(new GridBagLayout());

        jTextPane9.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane9.setContentType("text/html"); // NOI18N
        jTextPane9.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may enable or disable logging for each job individually. If enabled, all the messages will also be written to the log file 'JOB_NAME.log'. \nYou may define here a custom log file as well. If no custom log file is defined, the log files are saved in the directory which is defined in the DirSync Pro options \n(Menu/Tools/Options). You may include some wild cards into your log filename (please read the help for more details). \nThe log entries are appended to a log file if it already exists.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane9.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel8.add(jTextPane9, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        logTab.add(informationPanel8, gridBagConstraints);

        dirLogFilePanel.setBorder(BorderFactory.createTitledBorder("Log file"));
        dirLogFilePanel.setLayout(new GridBagLayout());

        dirLogLabel.setIcon(new ImageIcon(getClass().getResource("/icons/log.png"))); // NOI18N
        dirLogLabel.setText("Logfile");
        dirLogLabel.setMaximumSize(null);
        dirLogLabel.setMinimumSize(null);
        dirLogLabel.setPreferredSize(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        dirLogFilePanel.add(dirLogLabel, gridBagConstraints);

        dirLogField.setToolTipText("<html>The logfile.. You can use the following wildcards:<br>\n\"<b>&lt;jobname&gt;</b>\" for the name of the current job definition,<br>\n\"<b>&lt;date&gt;</b>\" for the current date or \"<b>&lt;DD&gt;</b>\" for day, \"<b>&lt;MM&gt;</b>\" for month, and \"<b>&lt;YYYY&gt;</b>\" for year,<br>\n\"<b>&lt;time&gt;</b>\" for the current time or \"<b>&lt;hh&gt;</b>\" for hour, \"<b>&lt;mm&gt;</b>\" for minute, and \"<b>&lt;ss&gt;</b>\" for second,<br>\n\"<b>&lt;username&gt;</b>\" for the name of the current user, and<br>\n\"<b>&lt;userhome&gt;</b>\" for the home directory of the current user.</html> \n");
        dirLogField.setInputVerifier(new WildCardVerifier(this, dirLogField));
        dirLogField.setMaximumSize(null);
        dirLogField.setMinimumSize(null);
        dirLogField.setPreferredSize(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        dirLogFilePanel.add(dirLogField, gridBagConstraints);

        dirLogBrowseButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        dirLogBrowseButton.setIcon(new ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirLogBrowseButton.setIconTextGap(2);
        dirLogBrowseButton.setMargin(new Insets(2, 2, 2, 2));
        dirLogBrowseButton.addActionListener(this::dirLogBrowseButtonbrowseSrcActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        dirLogFilePanel.add(dirLogBrowseButton, gridBagConstraints);

        jPanel73.setMaximumSize(null);
        jPanel73.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirEnableLoggingCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
        dirEnableLoggingCheckBox.setMaximumSize(null);
        dirEnableLoggingCheckBox.setMinimumSize(null);
        dirEnableLoggingCheckBox.setPreferredSize(null);
        dirEnableLoggingCheckBox.addActionListener(this::dirEnableLoggingCheckBoxdirEventActionPerformed);
        jPanel73.add(dirEnableLoggingCheckBox);

        dirEnableLoggingJLabel.setText("Enable logging.");
        jPanel73.add(dirEnableLoggingJLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirLogFilePanel.add(jPanel73, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.03;
        logTab.add(dirLogFilePanel, gridBagConstraints);

        jobTabbedPane.addTab("Log", logTab);

        scheduleTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        scheduleTab.setName(""); // NOI18N
        scheduleTab.setLayout(new GridBagLayout());

        jScrollPane4.setMinimumSize(new Dimension(74, 200));
        jScrollPane4.setPreferredSize(new Dimension(74, 200));

        scheduleTree.setModel(new ScheduleTreeModel(getScheduleTree()));
        scheduleTree.setCellEditor(new ScheduleTreeNodeEditor(scheduleTree));
        scheduleTree.setCellRenderer(new ScheduleTreeCellRenderer());
        scheduleTree.setEditable(true);
        jScrollPane4.setViewportView(scheduleTree);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        scheduleTab.add(jScrollPane4, gridBagConstraints);

        informationPanel9.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel9.setPreferredSize(new Dimension(298, 180));
        informationPanel9.setLayout(new GridBagLayout());

        jTextPane10.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane10.setContentType("text/html"); // NOI18N
        jTextPane10.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here schedules for this task. Use 'New' to add a new schedule. 'Edit' and 'Remove' buttons get available only if a scheduled task is selected. \nSchedule tree nodes get grayed out if they do not contain any schedule. If you add a schedule type which already exist, it will be overwritten.<br\\>\nIf a schedule task of type Once has already run or if a recurrent schedule task does not have a valid next event date due to its constraints, the schedule \ngets suffixed with '(Expired)' in the schedule tree'.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane10.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel9.add(jTextPane10, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        scheduleTab.add(informationPanel9, gridBagConstraints);

        viewJPanel4.setMinimumSize(new Dimension(100, 29));
        viewJPanel4.setLayout(new GridBagLayout());

        addScheduleButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        addScheduleButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirNew.png"))); // NOI18N
        addScheduleButton.setText("New");
        addScheduleButton.setToolTipText("Add a new Job.");
        addScheduleButton.setIconTextGap(2);
        addScheduleButton.setMargin(new Insets(2, 2, 2, 2));
        addScheduleButton.addActionListener(this::addScheduleButtonlistAddActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel4.add(addScheduleButton, gridBagConstraints);

        editScheduleButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        editScheduleButton.setIcon(new ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editScheduleButton.setText("Edit");
        editScheduleButton.setToolTipText("Edit the selected Job");
        editScheduleButton.setIconTextGap(2);
        editScheduleButton.setMargin(new Insets(2, 2, 2, 2));
        editScheduleButton.addActionListener(this::editScheduleButtonlistAddActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel4.add(editScheduleButton, gridBagConstraints);

        removeScheduleButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        removeScheduleButton.setIcon(new ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        removeScheduleButton.setText("Remove");
        removeScheduleButton.setToolTipText("Remove the selected Job.");
        removeScheduleButton.setIconTextGap(2);
        removeScheduleButton.setMargin(new Insets(2, 2, 2, 2));
        removeScheduleButton.setMaximumSize(null);
        removeScheduleButton.setMinimumSize(null);
        removeScheduleButton.setPreferredSize(null);
        removeScheduleButton.addActionListener(this::removeScheduleButtonlistRemoveActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel4.add(removeScheduleButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 0, 4, 0);
        viewJPanel4.add(jPanel17, gridBagConstraints);

        scheduleExpandAllButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        scheduleExpandAllButton.setIcon(new ImageIcon(getClass().getResource("/icons/expandAll.png"))); // NOI18N
        scheduleExpandAllButton.setText("Expand");
        scheduleExpandAllButton.setToolTipText("Expand all Jobs in the job tree.");
        scheduleExpandAllButton.setActionCommand("Enable all");
        scheduleExpandAllButton.setMargin(new Insets(2, 2, 2, 2));
        scheduleExpandAllButton.setMaximumSize(null);
        scheduleExpandAllButton.setPreferredSize(new Dimension(70, 17));
        scheduleExpandAllButton.addActionListener(this::scheduleExpandAllButtonenableAllDirsActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(0, 8, 4, 0);
        viewJPanel4.add(scheduleExpandAllButton, gridBagConstraints);

        scheduleCollapseAllButton.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        scheduleCollapseAllButton.setIcon(new ImageIcon(getClass().getResource("/icons/collapseAll.png"))); // NOI18N
        scheduleCollapseAllButton.setText("Collapse");
        scheduleCollapseAllButton.setToolTipText("Collapse all Jobs in the job tree.");
        scheduleCollapseAllButton.setActionCommand("Disable all");
        scheduleCollapseAllButton.setMargin(new Insets(2, 2, 2, 2));
        scheduleCollapseAllButton.setMaximumSize(null);
        scheduleCollapseAllButton.setPreferredSize(new Dimension(70, 17));
        scheduleCollapseAllButton.addActionListener(this::scheduleCollapseAllButtondisableAllDirsActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(0, 0, 4, 8);
        viewJPanel4.add(scheduleCollapseAllButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        scheduleTab.add(viewJPanel4, gridBagConstraints);

        jobTabbedPane.addTab("Schedule", scheduleTab);

        advancedTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        advancedTab.setLayout(new GridBagLayout());

        dirTimestampWriteBackPanel.setBorder(BorderFactory.createTitledBorder("Timestamps"));
        dirTimestampWriteBackPanel.setLayout(new GridBagLayout());

        dirTimestampDiffFieldPanel.setMaximumSize(null);
        dirTimestampDiffFieldPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        dirTimestampDiffField.setColumns(5);
        dirTimestampDiffField.setText("0");
        dirTimestampDiffField.setToolTipText("<html>If you specify more than one second in this option the timestamp of \"12:05:00\" would be treated as equal to the timestamp \"12:05:01\".<br>If  you synchronize this file with the \"Modified\" option it will not be copied because both files have an equal timestamp.<br /> This option is somethime useful while synchronizing to a little slower media, like network drives.</html>");
        dirTimestampDiffField.setInputVerifier(new LongIntVerifier(this, dirTimestampDiffField, 0, 86401));
        dirTimestampDiffField.setMaximumSize(null);
        dirTimestampDiffField.setMinimumSize(new Dimension(10, 20));
        dirTimestampDiffFieldPanel.add(dirTimestampDiffField);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(dirTimestampDiffFieldPanel, gridBagConstraints);
        dirTimestampDiffFieldPanel.getAccessibleContext().setAccessibleDescription("<html>This ensures that timestamps that differ due to filesystem inaccuracy are handled as the same.<br><br>PROBLEM: If this value is chosen too big some files that are actually different might be falsely considered to be identical.</html>");

        jPanel28.setLayout(new GridBagLayout());

        dirTimestampWriteBackLabel.setIcon(new ImageIcon(getClass().getResource("/icons/writeTimestampBack.png"))); // NOI18N
        dirTimestampWriteBackLabel.setText("<html>Write timestamps back to <b><u>source</u></b> <span style=\"color: red;\">(Caution! Use wisely!)</span>.</html>");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel28.add(dirTimestampWriteBackLabel, gridBagConstraints);

        dirTimestampWriteBackCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        dirTimestampWriteBackCheckBox.setVerticalTextPosition(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel28.add(dirTimestampWriteBackCheckBox, gridBagConstraints);
        dirTimestampWriteBackCheckBox.getAccessibleContext().setAccessibleDescription("<html>After a file has been copied the destination timestamp is written back to the source file; this ensures that the timestamps are identical.<br><br>PROBLEM: This is not possible if the source is read-only.</html>");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(jPanel28, gridBagConstraints);

        dirTimestampDiffLabel1.setIcon(new ImageIcon(getClass().getResource("/icons/timestampDiff.png"))); // NOI18N
        dirTimestampDiffLabel1.setText("Timestamp granularity (seconds):");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirTimestampWriteBackPanel.add(dirTimestampDiffLabel1, gridBagConstraints);

        jPanel81.setLayout(new GridBagLayout());

        dirTimestampWriteBackLabel1.setIcon(new ImageIcon(getClass().getResource("/icons/timestampDiffDir.png"))); // NOI18N
        dirTimestampWriteBackLabel1.setText("Preserve timestamps of the directories.");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel81.add(dirTimestampWriteBackLabel1, gridBagConstraints);

        dirTimestampSyncCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        dirTimestampSyncCheckBox.setVerticalTextPosition(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel81.add(dirTimestampSyncCheckBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(jPanel81, gridBagConstraints);

        jPanel84.setLayout(new GridBagLayout());

        ignoreDaylightSavingTimeJLabel.setIcon(new ImageIcon(getClass().getResource("/icons/timestamp.png"))); // NOI18N
        ignoreDaylightSavingTimeJLabel.setText("Ignore daylight saving granularity.");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel84.add(ignoreDaylightSavingTimeJLabel, gridBagConstraints);

        ignoreDaylightSavingTimeCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        ignoreDaylightSavingTimeCheckBox.setVerticalTextPosition(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel84.add(ignoreDaylightSavingTimeCheckBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(jPanel84, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(dirTimestampWriteBackPanel, gridBagConstraints);
        dirTimestampWriteBackPanel.getAccessibleContext().setAccessibleDescription("");

        dirSymbolicLinkPane.setBorder(BorderFactory.createTitledBorder("Symbolic links"));
        dirSymbolicLinkPane.setLayout(new GridBagLayout());

        jPanel27.setMaximumSize(null);
        jPanel27.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupSymLinks.add(skipSymLinkRadioButton);
        skipSymLinkRadioButton.setMaximumSize(null);
        skipSymLinkRadioButton.setMinimumSize(null);
        skipSymLinkRadioButton.setPreferredSize(null);
        jPanel27.add(skipSymLinkRadioButton);

        skipSymLinkLabel.setIcon(new ImageIcon(getClass().getResource("/icons/skipLinks.png"))); // NOI18N
        skipSymLinkLabel.setText("Skip sym links");
        jPanel27.add(skipSymLinkLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        dirSymbolicLinkPane.add(jPanel27, gridBagConstraints);

        jPanel23.setMaximumSize(null);
        jPanel23.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupSymLinks.add(copySymLinkRadioButton);
        copySymLinkRadioButton.setMaximumSize(null);
        copySymLinkRadioButton.setMinimumSize(null);
        copySymLinkRadioButton.setPreferredSize(null);
        jPanel23.add(copySymLinkRadioButton);

        copySymLinkLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        copySymLinkLabel.setText("Copy sym links (create symbolic links)");
        jPanel23.add(copySymLinkLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        dirSymbolicLinkPane.add(jPanel23, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        dirSymbolicLinkPane.add(jPanel4, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        dirSymbolicLinkPane.add(jPanel1, gridBagConstraints);

        jPanel32.setMaximumSize(null);
        jPanel32.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonGroupSymLinks.add(followSymLinkRadioButton);
        followSymLinkRadioButton.setMaximumSize(null);
        followSymLinkRadioButton.setMinimumSize(null);
        followSymLinkRadioButton.setPreferredSize(null);
        jPanel32.add(followSymLinkRadioButton);

        followSymLinkLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        followSymLinkLabel.setText("Follow sym links (copy linked files/dirs)");
        jPanel32.add(followSymLinkLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        dirSymbolicLinkPane.add(jPanel32, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(dirSymbolicLinkPane, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weighty = 1.0;
        advancedTab.add(spacer8, gridBagConstraints);

        verifyJPanel.setBorder(BorderFactory.createTitledBorder("Verify"));
        verifyJPanel.setLayout(new GridBagLayout());

        jPanel6.setMaximumSize(null);
        jPanel6.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirVerifyCheckBox.setActionCommand("Verify files");
        dirVerifyCheckBox.setMaximumSize(null);
        dirVerifyCheckBox.setMinimumSize(null);
        dirVerifyCheckBox.setPreferredSize(null);
        jPanel6.add(dirVerifyCheckBox);

        dirVerifyLabel.setIcon(new ImageIcon(getClass().getResource("/icons/verify.png"))); // NOI18N
        dirVerifyLabel.setText("Verify the content of the synchronized files");
        jPanel6.add(dirVerifyLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        verifyJPanel.add(jPanel6, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(verifyJPanel, gridBagConstraints);

        informationPanel6.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel6.setPreferredSize(new Dimension(298, 180));
        informationPanel6.setLayout(new GridBagLayout());

        jTextPane7.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane7.setContentType("text/html"); // NOI18N
        jTextPane7.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\n<u>Timestamp granularity</u> defines the tolerance  in seconds when comparing modification times of files. \nNormally the granularity should be 0 but in some cases the file system lacks precision to set the exact modification time, e.g. when using a network drive or copying files cross platforms. \n<u>Ignore daylight saving granularity</u> could be useful when synchronizing between FAT and other file systems. This option causes that two files with modification time difference \nof <i>exactly 1 hour</i> are treated as equal. Some file systems update the timestamp of a parent directory when changing the content of it. \nYou may define here to <u>preserve the timestamps of the directories</u>. <u>Write timestamp back to source</u> could be useful e.g. when using slower file systems. If you choose \n<u>Skip sym links</u> they are just ignored. <u>Copy sym links</u> will create sym links in the destination and <u>Follow sym link</u> will copy linked files/dirs to destination.\n <u>Preserve DOS attributes</u> will copy 'Read only', 'Hidden',  'System' and 'Archive' flags for MS Windows/DOS and 'group information' and 'file permissions' for POSIX systems from\n the source the directory. <u>Attempt to override read-only</u> will try to overwrite/delete the destination file (if needed) even if it is marked as read-only.\nYou may choose to <u>verify</u> the content of the copied files byte by byte. This could be convenient on less trusted media. <u>Realtime Sync</u> watches the source directory continuously; \nSynchronization starts after <u>Delay</u> seconds passed since latest change is detected. <u>Sync on start</u> option performs initial synchronization before starting to monitor realtime changes.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane7.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel6.add(jTextPane7, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        advancedTab.add(informationPanel6, gridBagConstraints);

        attributeJPanel.setBorder(BorderFactory.createTitledBorder("File Attributes"));
        attributeJPanel.setLayout(new GridBagLayout());

        jPanel24.setMaximumSize(null);
        jPanel24.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        preserveDOSAttributesCheckBox.setActionCommand("Verify files");
        preserveDOSAttributesCheckBox.setMaximumSize(null);
        preserveDOSAttributesCheckBox.setMinimumSize(null);
        preserveDOSAttributesCheckBox.setPreferredSize(null);
        jPanel24.add(preserveDOSAttributesCheckBox);

        preserveDOSAttributesLabel.setIcon(new ImageIcon(getClass().getResource("/icons/file.png"))); // NOI18N
        preserveDOSAttributesLabel.setText("Preserve DOS attributes (MS Windows/DOS only)");
        jPanel24.add(preserveDOSAttributesLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel24, gridBagConstraints);

        jPanel25.setMaximumSize(null);
        jPanel25.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        preserveFilePermissionsCheckBox.setActionCommand("Verify files");
        preserveFilePermissionsCheckBox.setMaximumSize(null);
        preserveFilePermissionsCheckBox.setMinimumSize(null);
        preserveFilePermissionsCheckBox.setPreferredSize(null);
        jPanel25.add(preserveFilePermissionsCheckBox);

        preserveFilePermissionsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/permissions.png"))); // NOI18N
        preserveFilePermissionsLabel.setText("Preserve file permissions (POSIX only)");
        jPanel25.add(preserveFilePermissionsLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel25, gridBagConstraints);

        jPanel26.setMaximumSize(null);
        jPanel26.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        preserveFileOwnershipCheckBox.setActionCommand("Verify files");
        preserveFileOwnershipCheckBox.setMaximumSize(null);
        preserveFileOwnershipCheckBox.setMinimumSize(null);
        preserveFileOwnershipCheckBox.setPreferredSize(null);
        jPanel26.add(preserveFileOwnershipCheckBox);

        preserveFileOwnershipLabel.setIcon(new ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N
        preserveFileOwnershipLabel.setText("Preserve file ownership (POSIX only)");
        jPanel26.add(preserveFileOwnershipLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel26, gridBagConstraints);

        jPanel29.setMaximumSize(null);
        jPanel29.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        overrideReadOnlyCheckBox.setActionCommand("Verify files");
        overrideReadOnlyCheckBox.setMaximumSize(null);
        overrideReadOnlyCheckBox.setMinimumSize(null);
        overrideReadOnlyCheckBox.setPreferredSize(null);
        jPanel29.add(overrideReadOnlyCheckBox);

        overrideReadOnlyLabel.setIcon(new ImageIcon(getClass().getResource("/icons/link.png"))); // NOI18N
        overrideReadOnlyLabel.setText("Attempt to override read-only attribute in destination when copying/deleting.");
        jPanel29.add(overrideReadOnlyLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel29, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(attributeJPanel, gridBagConstraints);

        realTimeSyncPanel.setBorder(BorderFactory.createTitledBorder("Realtime Synchronization"));
        realTimeSyncPanel.setLayout(new GridBagLayout());

        dirTimestampDiffFieldPanel1.setLayout(new GridBagLayout());

        dirTimestampDiffLabel2.setText("Delay:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirTimestampDiffFieldPanel1.add(dirTimestampDiffLabel2, gridBagConstraints);

        realtimeSyncDelayField.setColumns(5);
        realtimeSyncDelayField.setText("0");
        realtimeSyncDelayField.setToolTipText("<html>If you specify more than one second in this option the timestamp of \"12:05:00\" would be treated as equal to the timestamp \"12:05:01\".<br>If  you synchronize this file with the \"Modified\" option it will not be copied because both files have an equal timestamp.<br /> This option is somethime useful while synchronizing to a little slower media, like network drives.</html>");
        realtimeSyncDelayField.setInputVerifier(new LongIntVerifier(this, realtimeSyncDelayField, 0, 86401));
        realtimeSyncDelayField.setMaximumSize(null);
        realtimeSyncDelayField.setMinimumSize(new Dimension(10, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        dirTimestampDiffFieldPanel1.add(realtimeSyncDelayField, gridBagConstraints);

        dirTimestampDiffLabel3.setText("seconds");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        dirTimestampDiffFieldPanel1.add(dirTimestampDiffLabel3, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(0, 10, 0, 0);
        realTimeSyncPanel.add(dirTimestampDiffFieldPanel1, gridBagConstraints);

        jPanel85.setLayout(new GridBagLayout());

        ignoreDaylightSavingTimeJLabel1.setIcon(new ImageIcon(getClass().getResource("/icons/start.png"))); // NOI18N
        ignoreDaylightSavingTimeJLabel1.setText("Enable realtime synchronization");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel85.add(ignoreDaylightSavingTimeJLabel1, gridBagConstraints);

        realtimeSyncCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        realtimeSyncCheckBox.setVerticalTextPosition(SwingConstants.TOP);
        realtimeSyncCheckBox.addActionListener(this::realtimeSyncCheckBoxActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel85.add(realtimeSyncCheckBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        realTimeSyncPanel.add(jPanel85, gridBagConstraints);

        jPanel82.setLayout(new GridBagLayout());

        dirTimestampWriteBackLabel3.setIcon(new ImageIcon(getClass().getResource("/icons/icon_sync.png"))); // NOI18N
        dirTimestampWriteBackLabel3.setText("Synchronize on start");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel82.add(dirTimestampWriteBackLabel3, gridBagConstraints);

        realtimeSyncOnStartCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        realtimeSyncOnStartCheckBox.setVerticalTextPosition(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel82.add(realtimeSyncOnStartCheckBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        realTimeSyncPanel.add(jPanel82, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(realTimeSyncPanel, gridBagConstraints);

        jobTabbedPane.addTab("Advanced", advancedTab);

        actionsTab.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        actionsTab.setLayout(new GridBagLayout());

        settingsActionsPanel.setBorder(BorderFactory.createTitledBorder("Job settings"));
        settingsActionsPanel.setLayout(new GridBagLayout());

        copySettingsToAllJobsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        copySettingsToAllJobsLabel.setText("Copy the settings of this job (except the paths) to all jobs:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        settingsActionsPanel.add(copySettingsToAllJobsLabel, gridBagConstraints);

        copySettingsToAllJobsGoButton.setIcon(new ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        copySettingsToAllJobsGoButton.setText("Go");
        copySettingsToAllJobsGoButton.setAlignmentX(0.5F);
        copySettingsToAllJobsGoButton.addActionListener(this::copySettingsToAllJobsGoButtonActionPerformed);
        settingsActionsPanel.add(copySettingsToAllJobsGoButton, new GridBagConstraints());

        resetJobSettingsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        resetJobSettingsLabel.setText("Reset the  settings of this job (except the paths) to inital default values:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        settingsActionsPanel.add(resetJobSettingsLabel, gridBagConstraints);

        resetJobSettingsGoButton.setIcon(new ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        resetJobSettingsGoButton.setText("Go");
        resetJobSettingsGoButton.setAlignmentX(0.5F);
        resetJobSettingsGoButton.addActionListener(this::resetJobSettingsGoButtonActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        settingsActionsPanel.add(resetJobSettingsGoButton, gridBagConstraints);

        copySettingsToEnabledlJobsLabel.setIcon(new ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        copySettingsToEnabledlJobsLabel.setText("Copy the settings of this job (except the paths) to enabled jobs:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        settingsActionsPanel.add(copySettingsToEnabledlJobsLabel, gridBagConstraints);

        copySettingsToEnabledJobsGoButton.setIcon(new ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        copySettingsToEnabledJobsGoButton.setText("Go");
        copySettingsToEnabledJobsGoButton.setAlignmentX(0.5F);
        copySettingsToEnabledJobsGoButton.addActionListener(this::copySettingsToEnabledJobsGoButtonActionPerformed);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        settingsActionsPanel.add(copySettingsToEnabledJobsGoButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        settingsActionsPanel.add(spacer16, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        actionsTab.add(settingsActionsPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        actionsTab.add(spacer14, gridBagConstraints);

        informationPanel7.setBorder(BorderFactory.createTitledBorder("Information"));
        informationPanel7.setPreferredSize(new Dimension(298, 180));
        informationPanel7.setLayout(new GridBagLayout());

        jTextPane8.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane8.setContentType("text/html"); // NOI18N
        jTextPane8.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may copy the job settings, except the paths, to all existing or enabled jobs. You may also reset the job settings (except the paths) to initial default settings for a job.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane8.setFocusable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel7.add(jTextPane8, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        actionsTab.add(informationPanel7, gridBagConstraints);

        jobTabbedPane.addTab("Actions", actionsTab);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jobTabbedPane, gridBagConstraints);

        settingsButtonsPanel2.setMaximumSize(new Dimension(0, 0));
        settingsButtonsPanel2.setLayout(new BoxLayout(settingsButtonsPanel2, BoxLayout.LINE_AXIS));

        jobOKButton.setIcon(new ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        jobOKButton.setText("OK");
        jobOKButton.setAlignmentX(0.5F);
        jobOKButton.setMaximumSize(null);
        jobOKButton.setMinimumSize(null);
        jobOKButton.setPreferredSize(null);
        jobOKButton.addActionListener(this::jobOKButtonActionPerformed);
        settingsButtonsPanel2.add(jobOKButton);

        jobCancelButton.setIcon(new ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jobCancelButton.setText("Cancel");
        jobCancelButton.setAlignmentX(0.5F);
        jobCancelButton.setMaximumSize(null);
        jobCancelButton.setMinimumSize(null);
        jobCancelButton.setPreferredSize(null);
        jobCancelButton.addActionListener(this::jobCancelButtoncancelActionPerformed);
        settingsButtonsPanel2.add(jobCancelButton);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(settingsButtonsPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>

    private void dirLogBrowseButtonbrowseSrcActionPerformed(ActionEvent evt) {
        browseLog();
    }

    private void dirDstChangeButtonbrowseDstActionPerformed(ActionEvent evt) {
        GuiTools.browseFolder(this, dirDstField);
    }

    private void dirCopyLargerCheckBoxdirEventActionPerformed(ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirCopyModifiedCheckBoxdirEventActionPerformed(ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirCopyLargerModifiedCheckBoxdirEventActionPerformed(ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirSrcChangeButtonbrowseSrcActionPerformed(ActionEvent evt) {
        GuiTools.browseFolder(this, dirSrcField);
    }

    private void dirBackupDirChangeButtonbrowseSrcActionPerformed(ActionEvent evt) {
        GuiTools.browseFolder(this, dirBackupDirField);
    }

    private void dirEnableLoggingCheckBoxdirEventActionPerformed(ActionEvent evt) {
        jobEnableLoggingCheckBoxClicked();
    }

    private void jobOKButtonActionPerformed(ActionEvent evt) {
        // If no focus -> a fields has blocked applying settings
        if (jobOKButton.hasFocus()) {
            applyJobSettings();
            this.setVisible(false);
        }
    }

    private void jobCancelButtoncancelActionPerformed(ActionEvent evt) {
        this.setVisible(false);
    }

    private void dirCopyNewCheckBoxdirEventActionPerformed(ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirCopyAllCheckBoxdirEventActionPerformed(ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void copySettingsToAllJobsGoButtonActionPerformed(ActionEvent evt) {
        copyOptionsToAllJobs();
    }

    private void resetJobSettingsGoButtonActionPerformed(ActionEvent evt) {
        resetJobSettings();
    }

    private void copySettingsToEnabledJobsGoButtonActionPerformed(ActionEvent evt) {
        copyOptionsToEnabledJobs();
    }

    private void filtersCollapseAllButtondisableAllDirsActionPerformed(ActionEvent evt) {
        GuiTools.collapseAll(filtersTree);
    }

    private void filtersExpandAllButtonenableAllDirsActionPerformed(ActionEvent evt) {
        GuiTools.expandAll(filtersTree);
    }

    private void removeFilterButtonlistRemoveActionPerformed(ActionEvent evt) {
        removeFilter();
    }

    private void editFilterButtonlistAddActionPerformed(ActionEvent evt) {
        openEditFilterDialog();
    }

    private void addFilterButtonlistAddActionPerformed(ActionEvent evt) {
        openAddFilterDialog();
    }

    private void addScheduleButtonlistAddActionPerformed(ActionEvent evt) {
        openAddScheduleDialog();
    }

    private void editScheduleButtonlistAddActionPerformed(ActionEvent evt) {
        openEditScheduleDialog();
    }

    private void removeScheduleButtonlistRemoveActionPerformed(ActionEvent evt) {
        removeSchedule();
    }

    private void scheduleExpandAllButtonenableAllDirsActionPerformed(ActionEvent evt) {
        GuiTools.expandOneLevel(scheduleTree);
    }

    private void scheduleCollapseAllButtondisableAllDirsActionPerformed(ActionEvent evt) {
        GuiTools.collapseAll(scheduleTree);
    }

    private void swapButtonActionPerformed(ActionEvent evt) {
        String s = dirSrcField.getText();
        dirSrcField.setText(dirDstField.getText());
        dirDstField.setText(s);
    }

    private void realtimeSyncCheckBoxActionPerformed(ActionEvent evt) {
        adjustRealtimeSyncOptions();
    }

    private void syncModeComboBoxItemStateChanged(ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            syncModeComboBoxClicked();
        }
    }

    abstract protected void adjustRealtimeSyncOptions();

    abstract protected void openAddFilterDialog();

    abstract protected void openAddScheduleDialog();

    abstract protected void applyJobSettings();

    abstract protected void browseLog();

    abstract protected void copyOptionsToAllJobs();

    abstract protected void copyOptionsToEnabledJobs();

    abstract protected void jobEnableLoggingCheckBoxClicked();

    abstract protected ScheduleTree getScheduleTree();

    abstract protected FiltersTree getFiltersTree();

    abstract protected void openEditFilterDialog();

    abstract protected void openEditScheduleDialog();

    abstract protected void removeFilter();

    abstract protected void removeSchedule();

    abstract protected void resetJobSettings();

    abstract protected void setFileDragNDrop(JTextField jtf);

    abstract protected void syncModeComboBoxClicked();

    abstract protected void verifyCopyOptionsInGUI();
}
