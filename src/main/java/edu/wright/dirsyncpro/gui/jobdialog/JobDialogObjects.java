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
import java.awt.Font;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
@SuppressWarnings("serial")
public abstract class JobDialogObjects extends javax.swing.JDialog {

    protected javax.swing.JButton addFilterButton;
    protected javax.swing.JButton addScheduleButton;
    protected javax.swing.JLabel bidirectionalConflictCopyLargerLabel;
    protected javax.swing.JRadioButton bidirectionalConflictCopyLargerRadioButton;
    protected javax.swing.JLabel bidirectionalConflictCopyModifiedLabel;
    protected javax.swing.JRadioButton bidirectionalConflictCopyModifiedRadioButton;
    protected javax.swing.JLabel bidirectionalConflictRenameCopyLabel;
    protected javax.swing.JRadioButton bidirectionalConflictRenameCopyRadioButton;
    protected javax.swing.JLabel bidirectionalConflictSkipLabel;
    protected javax.swing.JRadioButton bidirectionalConflictSkipRadioButton;
    protected javax.swing.JLabel bidirectionalConflictWarnUserLabel;
    protected javax.swing.JRadioButton bidirectionalConflictWarnUserRadioButton;
    protected javax.swing.JLabel compareFileContentsLabel;
    protected javax.swing.JRadioButton compareFileContentsRadioButton;
    protected javax.swing.JLabel compareFileSizesDatesLabel;
    protected javax.swing.JLabel compareFileSizesDatesMetaDataLabel;
    protected javax.swing.JRadioButton compareFileSizesDatesMetaDataRadioButton;
    protected javax.swing.JRadioButton compareFileSizesDatesRadioButton;
    protected javax.swing.JTabbedPane conflictResolutionJTabbedPane;
    protected javax.swing.JButton copySettingsToAllJobsGoButton;
    protected javax.swing.JLabel copySettingsToAllJobsLabel;
    protected javax.swing.JButton copySettingsToEnabledJobsGoButton;
    protected javax.swing.JLabel copySettingsToEnabledlJobsLabel;
    protected javax.swing.JLabel copySymLinkLabel;
    protected javax.swing.JRadioButton copySymLinkRadioButton;
    protected javax.swing.JCheckBox deleteExcludedDirsACheckBox;
    protected javax.swing.JCheckBox deleteExcludedDirsBCheckBox;
    protected javax.swing.JCheckBox deleteExcludedFilesACheckBox;
    protected javax.swing.JCheckBox deleteExcludedFilesBCheckBox;
    protected javax.swing.JButton dirBackupDirChangeButton;
    protected javax.swing.JTextField dirBackupDirField;
    protected javax.swing.JCheckBox dirBackupDirInlineCheckBox;
    protected javax.swing.JLabel dirBackupDirInlineLabel;
    protected javax.swing.JLabel dirBackupDirLabel;
    protected javax.swing.JTextField dirBackupField;
    protected javax.swing.JLabel dirBackupLabel1;
    protected javax.swing.JLabel dirBackupLabel2;
    protected javax.swing.JCheckBox dirCopyAllCheckBox;
    protected javax.swing.JLabel dirCopyAllLabel;
    protected javax.swing.JCheckBox dirCopyLargerCheckBox;
    protected javax.swing.JLabel dirCopyLargerLabel;
    protected javax.swing.JCheckBox dirCopyLargerModifiedCheckBox;
    protected javax.swing.JLabel dirCopyLargerModifiedLabel;
    protected javax.swing.JCheckBox dirCopyModifiedCheckBox;
    protected javax.swing.JLabel dirCopyModifiedLabel;
    protected javax.swing.JCheckBox dirCopyNewCheckBox;
    protected javax.swing.JLabel dirCopyNewLabel;
    protected javax.swing.JCheckBox dirDeleteDirsCheckBox;
    protected javax.swing.JLabel dirDeleteDirsLabel;
    protected javax.swing.JLabel dirDeleteExcludedDirsLabel;
    protected javax.swing.JLabel dirDeleteExcludedDirsLabel1;
    protected javax.swing.JLabel dirDeleteExcludedFilesLabel;
    protected javax.swing.JLabel dirDeleteExcludedFilesLabel1;
    protected javax.swing.JCheckBox dirDeleteFilesCheckBox;
    protected javax.swing.JLabel dirDeleteFilesLabel;
    protected javax.swing.JButton dirDstChangeButton;
    protected javax.swing.JTextField dirDstField;
    protected javax.swing.JLabel dirDstLabel;
    protected javax.swing.JCheckBox dirEnableLoggingCheckBox;
    protected javax.swing.JLabel dirEnableLoggingJLabel;
    protected javax.swing.JButton dirLogBrowseButton;
    protected javax.swing.JTextField dirLogField;
    protected javax.swing.JLabel dirLogLabel;
    protected javax.swing.JTextField dirNameField;
    protected javax.swing.JLabel dirNameLabel;
    protected javax.swing.JButton dirSrcChangeButton;
    protected javax.swing.JTextField dirSrcField;
    protected javax.swing.JLabel dirSrcLabel;
    protected javax.swing.JTextField dirTimestampDiffField;
    protected javax.swing.JLabel dirTimestampDiffLabel1;
    protected javax.swing.JLabel dirTimestampDiffLabel2;
    protected javax.swing.JLabel dirTimestampDiffLabel3;
    protected javax.swing.JCheckBox dirTimestampSyncCheckBox;
    protected javax.swing.JCheckBox dirTimestampWriteBackCheckBox;
    protected javax.swing.JCheckBox dirVerifyCheckBox;
    protected javax.swing.JLabel dirVerifyLabel;
    protected javax.swing.JCheckBox dirWithSubfoldersCheckBox;
    protected javax.swing.JLabel dirWithSubfoldersLabel;
    protected javax.swing.JButton editFilterButton;
    protected javax.swing.JButton editScheduleButton;
    protected javax.swing.JButton filtersCollapseAllButton;
    protected javax.swing.JButton filtersExpandAllButton;
    protected javax.swing.JTree filtersTree;
    protected javax.swing.JLabel followSymLinkLabel;
    protected javax.swing.JRadioButton followSymLinkRadioButton;
    protected javax.swing.JCheckBox ignoreDaylightSavingTimeCheckBox;
    protected javax.swing.JButton jobCancelButton;
    protected javax.swing.JButton jobOKButton;
    protected javax.swing.JTabbedPane jobTabbedPane;
    protected javax.swing.JLabel monodirectionalConflictCopySourceLabel;
    protected javax.swing.JRadioButton monodirectionalConflictCopySourceRadioButton;
    protected javax.swing.JLabel monodirectionalConflictSkipLabel;
    protected javax.swing.JRadioButton monodirectionalConflictSkipRadioButton;
    protected javax.swing.JLabel monodirectionalConflictWarnUserLabel;
    protected javax.swing.JRadioButton monodirectionalConflictWarnUserRadioButton;
    protected javax.swing.JCheckBox overrideReadOnlyCheckBox;
    protected javax.swing.JLabel overrideReadOnlyLabel;
    protected javax.swing.JCheckBox preserveDOSAttributesCheckBox;
    protected javax.swing.JLabel preserveDOSAttributesLabel;
    protected javax.swing.JCheckBox preserveFileOwnershipCheckBox;
    protected javax.swing.JLabel preserveFileOwnershipLabel;
    protected javax.swing.JCheckBox preserveFilePermissionsCheckBox;
    protected javax.swing.JLabel preserveFilePermissionsLabel;
    protected javax.swing.JCheckBox realtimeSyncCheckBox;
    protected javax.swing.JTextField realtimeSyncDelayField;
    protected javax.swing.JCheckBox realtimeSyncOnStartCheckBox;
    protected javax.swing.JButton removeFilterButton;
    protected javax.swing.JButton removeScheduleButton;
    protected javax.swing.JButton resetJobSettingsGoButton;
    protected javax.swing.JLabel resetJobSettingsLabel;
    protected javax.swing.JButton scheduleCollapseAllButton;
    protected javax.swing.JButton scheduleExpandAllButton;
    protected javax.swing.JTree scheduleTree;
    protected javax.swing.JLabel skipSymLinkLabel;
    protected javax.swing.JRadioButton skipSymLinkRadioButton;
    protected javax.swing.JButton swapButton;
    protected javax.swing.JComboBox syncModeComboBox;

    public JobDialogObjects(JFrame frame) {
        super(frame);
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.ButtonGroup buttonGroupSymLinks = new javax.swing.ButtonGroup();
        javax.swing.ButtonGroup buttonGroupBidirectionalConflict = new javax.swing.ButtonGroup();
        javax.swing.ButtonGroup buttonGroupMonodirectionalConflict = new javax.swing.ButtonGroup();
        javax.swing.ButtonGroup buttonGroupCompare = new javax.swing.ButtonGroup();
        jobTabbedPane = new MyJTabbedPane();
        javax.swing.JPanel basicTab = new javax.swing.JPanel();
        javax.swing.JPanel pathsPanel = new javax.swing.JPanel();
        dirSrcLabel = new javax.swing.JLabel();
        dirNameLabel = new javax.swing.JLabel();
        dirNameField = new javax.swing.JTextField();
        dirDstField = new javax.swing.JTextField();
        dirDstChangeButton = new javax.swing.JButton();
        dirSrcChangeButton = new javax.swing.JButton();
        dirSrcField = new javax.swing.JTextField();
        dirDstLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel15 = new javax.swing.JPanel();
        dirWithSubfoldersCheckBox = new javax.swing.JCheckBox();
        dirWithSubfoldersLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        swapButton = new javax.swing.JButton();
        javax.swing.JPanel spacer2 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane1 = new javax.swing.JTextPane();
        HTMLEditorKit editorKit = new HTMLEditorKit();
        StyleSheet styles = new StyleSheet();
        Font font = UIManager.getFont("Label.font");
        String bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane1.setEditorKit(editorKit);
        javax.swing.JPanel syncModeJPanel = new javax.swing.JPanel();
        javax.swing.JLabel label9 = new javax.swing.JLabel();
        syncModeComboBox = new javax.swing.JComboBox();
        javax.swing.JPanel compareTab = new javax.swing.JPanel();
        javax.swing.JPanel spacer10 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel10 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane11 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane11.setEditorKit(editorKit);
        javax.swing.JPanel compareaJpanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel97 = new javax.swing.JPanel();
        compareFileSizesDatesRadioButton = new javax.swing.JRadioButton();
        compareFileSizesDatesLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel101 = new javax.swing.JPanel();
        compareFileSizesDatesMetaDataRadioButton = new javax.swing.JRadioButton();
        compareFileSizesDatesMetaDataLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel102 = new javax.swing.JPanel();
        compareFileContentsRadioButton = new javax.swing.JRadioButton();
        compareFileContentsLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel31 = new javax.swing.JPanel();
        javax.swing.JPanel spacer27 = new javax.swing.JPanel();
        javax.swing.JPanel copyTab = new javax.swing.JPanel();
        javax.swing.JPanel copyOptionsJPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel8 = new javax.swing.JPanel();
        dirCopyAllCheckBox = new javax.swing.JCheckBox();
        dirCopyAllLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel9 = new javax.swing.JPanel();
        dirCopyNewCheckBox = new javax.swing.JCheckBox();
        dirCopyNewLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel10 = new javax.swing.JPanel();
        dirCopyLargerCheckBox = new javax.swing.JCheckBox();
        dirCopyLargerLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel11 = new javax.swing.JPanel();
        dirCopyModifiedCheckBox = new javax.swing.JCheckBox();
        dirCopyModifiedLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel12 = new javax.swing.JPanel();
        dirCopyLargerModifiedCheckBox = new javax.swing.JCheckBox();
        dirCopyLargerModifiedLabel = new javax.swing.JLabel();
        javax.swing.JPanel spacer12 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel1 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane2 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane2.setEditorKit(editorKit);
        javax.swing.JPanel conflictResolutionTab = new javax.swing.JPanel();
        conflictResolutionJTabbedPane = new MyJTabbedPane();
        javax.swing.JPanel monodirectionalSyncConflictPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel96 = new javax.swing.JPanel();
        monodirectionalConflictCopySourceRadioButton = new javax.swing.JRadioButton();
        monodirectionalConflictCopySourceLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel99 = new javax.swing.JPanel();
        monodirectionalConflictWarnUserRadioButton = new javax.swing.JRadioButton();
        monodirectionalConflictWarnUserLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel100 = new javax.swing.JPanel();
        monodirectionalConflictSkipRadioButton = new javax.swing.JRadioButton();
        monodirectionalConflictSkipLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel22 = new javax.swing.JPanel();
        javax.swing.JPanel spacer26 = new javax.swing.JPanel();
        javax.swing.JPanel bidirectionalSyncConflictPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel38 = new javax.swing.JPanel();
        bidirectionalConflictCopyModifiedRadioButton = new javax.swing.JRadioButton();
        bidirectionalConflictCopyModifiedLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel39 = new javax.swing.JPanel();
        bidirectionalConflictCopyLargerRadioButton = new javax.swing.JRadioButton();
        bidirectionalConflictCopyLargerLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel48 = new javax.swing.JPanel();
        bidirectionalConflictRenameCopyRadioButton = new javax.swing.JRadioButton();
        bidirectionalConflictRenameCopyLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel40 = new javax.swing.JPanel();
        bidirectionalConflictWarnUserRadioButton = new javax.swing.JRadioButton();
        bidirectionalConflictWarnUserLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel95 = new javax.swing.JPanel();
        bidirectionalConflictSkipRadioButton = new javax.swing.JRadioButton();
        bidirectionalConflictSkipLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel21 = new javax.swing.JPanel();
        javax.swing.JPanel spacer25 = new javax.swing.JPanel();
        javax.swing.JPanel spacer17 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel2 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane3 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane3.setEditorKit(editorKit);
        javax.swing.JPanel filtersTab = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
        filtersTree = new javax.swing.JTree();
        javax.swing.JPanel informationPanel3 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane4 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane4.setEditorKit(editorKit);
        javax.swing.JPanel viewJPanel3 = new javax.swing.JPanel();
        addFilterButton = new javax.swing.JButton();
        editFilterButton = new javax.swing.JButton();
        removeFilterButton = new javax.swing.JButton();
        javax.swing.JPanel jPanel16 = new javax.swing.JPanel();
        filtersExpandAllButton = new javax.swing.JButton();
        filtersCollapseAllButton = new javax.swing.JButton();
        javax.swing.JPanel deletionTab = new javax.swing.JPanel();
        javax.swing.JPanel dirDeleteOptionsPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
        dirDeleteFilesCheckBox = new javax.swing.JCheckBox();
        dirDeleteFilesLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel13 = new javax.swing.JPanel();
        dirDeleteDirsCheckBox = new javax.swing.JCheckBox();
        dirDeleteDirsLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel7 = new javax.swing.JPanel();
        deleteExcludedFilesACheckBox = new javax.swing.JCheckBox();
        dirDeleteExcludedFilesLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel44 = new javax.swing.JPanel();
        deleteExcludedDirsACheckBox = new javax.swing.JCheckBox();
        dirDeleteExcludedDirsLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel18 = new javax.swing.JPanel();
        deleteExcludedFilesBCheckBox = new javax.swing.JCheckBox();
        dirDeleteExcludedFilesLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel78 = new javax.swing.JPanel();
        deleteExcludedDirsBCheckBox = new javax.swing.JCheckBox();
        dirDeleteExcludedDirsLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel spacer7 = new javax.swing.JPanel();
        javax.swing.JPanel spacer6 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel4 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane5 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane5.setEditorKit(editorKit);
        javax.swing.JPanel backupTab = new javax.swing.JPanel();
        javax.swing.JPanel dirBackupPanel = new javax.swing.JPanel();
        dirBackupLabel1 = new javax.swing.JLabel();
        dirBackupField = new javax.swing.JTextField();
        dirBackupLabel2 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel30 = new javax.swing.JPanel();
        dirBackupDirInlineCheckBox = new javax.swing.JCheckBox();
        dirBackupDirInlineLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        dirBackupDirLabel = new javax.swing.JLabel();
        dirBackupDirField = new javax.swing.JTextField();
        dirBackupDirChangeButton = new javax.swing.JButton();
        javax.swing.JPanel spacer4 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel5 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane6 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane6.setEditorKit(editorKit);
        javax.swing.JPanel logTab = new javax.swing.JPanel();
        javax.swing.JPanel spacer5 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel8 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane9 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane9.setEditorKit(editorKit);
        javax.swing.JPanel dirLogFilePanel = new javax.swing.JPanel();
        dirLogLabel = new javax.swing.JLabel();
        dirLogField = new javax.swing.JTextField();
        dirLogBrowseButton = new javax.swing.JButton();
        javax.swing.JPanel jPanel73 = new javax.swing.JPanel();
        dirEnableLoggingCheckBox = new javax.swing.JCheckBox();
        dirEnableLoggingJLabel = new javax.swing.JLabel();
        javax.swing.JPanel scheduleTab = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane4 = new javax.swing.JScrollPane();
        scheduleTree = new javax.swing.JTree();
        javax.swing.JPanel informationPanel9 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane10 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane4.setEditorKit(editorKit);
        javax.swing.JPanel viewJPanel4 = new javax.swing.JPanel();
        addScheduleButton = new javax.swing.JButton();
        editScheduleButton = new javax.swing.JButton();
        removeScheduleButton = new javax.swing.JButton();
        javax.swing.JPanel jPanel17 = new javax.swing.JPanel();
        scheduleExpandAllButton = new javax.swing.JButton();
        scheduleCollapseAllButton = new javax.swing.JButton();
        javax.swing.JPanel advancedTab = new javax.swing.JPanel();
        javax.swing.JPanel dirTimestampWriteBackPanel = new javax.swing.JPanel();
        javax.swing.JPanel dirTimestampDiffFieldPanel = new javax.swing.JPanel();
        dirTimestampDiffField = new javax.swing.JTextField();
        javax.swing.JPanel jPanel28 = new javax.swing.JPanel();
        javax.swing.JLabel dirTimestampWriteBackLabel = new javax.swing.JLabel();
        dirTimestampWriteBackCheckBox = new javax.swing.JCheckBox();
        dirTimestampDiffLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel81 = new javax.swing.JPanel();
        javax.swing.JLabel dirTimestampWriteBackLabel1 = new javax.swing.JLabel();
        dirTimestampSyncCheckBox = new javax.swing.JCheckBox();
        javax.swing.JPanel jPanel84 = new javax.swing.JPanel();
        javax.swing.JLabel ignoreDaylightSavingTimeJLabel = new javax.swing.JLabel();
        ignoreDaylightSavingTimeCheckBox = new javax.swing.JCheckBox();
        javax.swing.JPanel dirSymbolicLinkPane = new javax.swing.JPanel();
        javax.swing.JPanel jPanel27 = new javax.swing.JPanel();
        skipSymLinkRadioButton = new javax.swing.JRadioButton();
        skipSymLinkLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel23 = new javax.swing.JPanel();
        copySymLinkRadioButton = new javax.swing.JRadioButton();
        copySymLinkLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel32 = new javax.swing.JPanel();
        followSymLinkRadioButton = new javax.swing.JRadioButton();
        followSymLinkLabel = new javax.swing.JLabel();
        javax.swing.JPanel spacer8 = new javax.swing.JPanel();
        javax.swing.JPanel verifyJPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel6 = new javax.swing.JPanel();
        dirVerifyCheckBox = new javax.swing.JCheckBox();
        dirVerifyLabel = new javax.swing.JLabel();
        javax.swing.JPanel informationPanel6 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane7 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane7.setEditorKit(editorKit);
        javax.swing.JPanel attributeJPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel24 = new javax.swing.JPanel();
        preserveDOSAttributesCheckBox = new javax.swing.JCheckBox();
        preserveDOSAttributesLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel25 = new javax.swing.JPanel();
        preserveFilePermissionsCheckBox = new javax.swing.JCheckBox();
        preserveFilePermissionsLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel26 = new javax.swing.JPanel();
        preserveFileOwnershipCheckBox = new javax.swing.JCheckBox();
        preserveFileOwnershipLabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel29 = new javax.swing.JPanel();
        overrideReadOnlyCheckBox = new javax.swing.JCheckBox();
        overrideReadOnlyLabel = new javax.swing.JLabel();
        javax.swing.JPanel realTimeSyncPanel = new javax.swing.JPanel();
        javax.swing.JPanel dirTimestampDiffFieldPanel1 = new javax.swing.JPanel();
        dirTimestampDiffLabel2 = new javax.swing.JLabel();
        realtimeSyncDelayField = new javax.swing.JTextField();
        dirTimestampDiffLabel3 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel85 = new javax.swing.JPanel();
        javax.swing.JLabel ignoreDaylightSavingTimeJLabel1 = new javax.swing.JLabel();
        realtimeSyncCheckBox = new javax.swing.JCheckBox();
        javax.swing.JPanel jPanel82 = new javax.swing.JPanel();
        javax.swing.JLabel dirTimestampWriteBackLabel3 = new javax.swing.JLabel();
        realtimeSyncOnStartCheckBox = new javax.swing.JCheckBox();
        javax.swing.JPanel actionsTab = new javax.swing.JPanel();
        javax.swing.JPanel settingsActionsPanel = new javax.swing.JPanel();
        copySettingsToAllJobsLabel = new javax.swing.JLabel();
        copySettingsToAllJobsGoButton = new javax.swing.JButton();
        resetJobSettingsLabel = new javax.swing.JLabel();
        resetJobSettingsGoButton = new javax.swing.JButton();
        copySettingsToEnabledlJobsLabel = new javax.swing.JLabel();
        copySettingsToEnabledJobsGoButton = new javax.swing.JButton();
        javax.swing.JPanel spacer16 = new javax.swing.JPanel();
        javax.swing.JPanel spacer14 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel7 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane8 = new javax.swing.JTextPane();
        editorKit = new HTMLEditorKit();
        styles = new StyleSheet();
        font = UIManager.getFont("Label.font");
        bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);
        jTextPane8.setEditorKit(editorKit);
        javax.swing.JPanel settingsButtonsPanel2 = new javax.swing.JPanel();
        jobOKButton = new javax.swing.JButton();
        jobCancelButton = new javax.swing.JButton();

        setTitle("Job Options");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(580, 340));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jobTabbedPane.setMaximumSize(null);
        jobTabbedPane.setMinimumSize(new java.awt.Dimension(0, 0));

        basicTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        basicTab.setLayout(new java.awt.GridBagLayout());

        pathsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Label & Paths"));
        pathsPanel.setEnabled(false);
        pathsPanel.setLayout(new java.awt.GridBagLayout());

        dirSrcLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirGreen.png"))); // NOI18N
        dirSrcLabel.setText("Dir A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pathsPanel.add(dirSrcLabel, gridBagConstraints);

        dirNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/name.png"))); // NOI18N
        dirNameLabel.setText("Label");
        dirNameLabel.setMaximumSize(null);
        dirNameLabel.setMinimumSize(null);
        dirNameLabel.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pathsPanel.add(dirNameLabel, gridBagConstraints);

        dirNameField.setToolTipText("The label for this synchronization.");
        dirNameField.setMaximumSize(null);
        dirNameField.setMinimumSize(null);
        dirNameField.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pathsPanel.add(dirNameField, gridBagConstraints);

        dirDstField.setToolTipText("<html>The destination directory. You can use the following wildcards:<br>\"<b>&lt;date</b>&gt;\" for the current date (or \"<b>&lt;DD</b>&gt;\" for day, \"<b>&lt;MM</b>&gt;\" for month, and \"<b>&lt;YYYY</b>&gt;\" for year) and<br>\"<b>&lt;time</b>&gt;\" for the current time (or \"<b>&lt;hh</b>&gt;\" for hour, \"<b>&lt;mm</b>&gt;\" for minute, and \"<b>&lt;ss</b>&gt;\" for second).</html>");
        dirDstField.setInputVerifier(new PathVerifier(this, dirDstField));
        dirDstField.setMaximumSize(null);
        dirDstField.setMinimumSize(null);
        dirDstField.setPreferredSize(null);
        setFileDragNDrop(dirDstField);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        pathsPanel.add(dirDstField, gridBagConstraints);

        dirDstChangeButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dirDstChangeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirDstChangeButton.setToolTipText("Browse for the destination directory.");
        dirDstChangeButton.setIconTextGap(2);
        dirDstChangeButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        dirDstChangeButton.addActionListener(this::dirDstChangeButtonbrowseDstActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pathsPanel.add(dirDstChangeButton, gridBagConstraints);

        dirSrcChangeButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dirSrcChangeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirSrcChangeButton.setToolTipText("Browse for the source directory.");
        dirSrcChangeButton.setIconTextGap(2);
        dirSrcChangeButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        dirSrcChangeButton.addActionListener(this::dirSrcChangeButtonbrowseSrcActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pathsPanel.add(dirSrcChangeButton, gridBagConstraints);

        dirSrcField.setToolTipText("<html>The source directory. You can use the following wildcards:<br />\"<b>&lt;username&gt;</b>\" for the name of the current user, and <br />\"<b>&lt;userhome&gt;</b>\" for the home directory of the current user.</html>");
        dirSrcField.setInputVerifier(new PathVerifier(this, dirSrcField));
        dirSrcField.setMaximumSize(null);
        dirSrcField.setMinimumSize(null);
        dirSrcField.setPreferredSize(null);
        setFileDragNDrop(dirSrcField);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        pathsPanel.add(dirSrcField, gridBagConstraints);

        dirDstLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirOrange.png"))); // NOI18N
        dirDstLabel.setText("Dir B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pathsPanel.add(dirDstLabel, gridBagConstraints);

        jPanel15.setMaximumSize(null);
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirWithSubfoldersCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dirWithSubfoldersCheckBox.setMaximumSize(null);
        dirWithSubfoldersCheckBox.setMinimumSize(null);
        dirWithSubfoldersCheckBox.setPreferredSize(null);
        jPanel15.add(dirWithSubfoldersCheckBox);

        dirWithSubfoldersLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/withSubdirs.png"))); // NOI18N
        dirWithSubfoldersLabel.setText("Include subfolders");
        jPanel15.add(dirWithSubfoldersLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 8);
        pathsPanel.add(jPanel15, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pathsPanel.add(jPanel3, gridBagConstraints);

        swapButton.setText("Swap");
        swapButton.setAlignmentX(0.5F);
        swapButton.addActionListener(this::swapButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        pathsPanel.add(swapButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        basicTab.add(pathsPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        basicTab.add(spacer2, gridBagConstraints);

        informationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel.setLayout(new java.awt.GridBagLayout());

        jTextPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setText("<html>\n  <head>\n\n  </head>\n  <body>\n    <p style=\"margin-top: 0\">\n    \nSet up the directories and the sync mode: <u>Mirror A -&gt; B (incremental)</u> and <u>Mirror B -&gt; A (incremental)</u> are mono-directional (one way). \nOnly new and modified files from the source are copied to the destination; redundant files in the destination will be deleted. The directories are exactly the same after the sync. \n<u>Synchronize A &lt;-&gt; B (incremental)</u> is bi-directional (two-ways). Only new and modified files from both dirs are copied to each other. Both directories are exactly the same after the \nsync. <u>Backup A -&gt; B</u> and <u>Restore B -&gt; A</u> will copy all files from A to B (or vice versa). <u>Contribute A -&gt; B</u> and <u>Contribute B -&gt; A</u> will \ncopy only the new files from A to B (or vice versa). Choose <u>Synchronize A -&gt; B (custom)</u>, <u>Synchronize B -&gt; A (custom)</u> or <u>Synchronize A &lt;-&gt; B (custom)</u> to \nsetup the sync behavior as you wish (advanced). <span style=\"color: blue;\">Some tabs get available only in a 'custom' mode.</span>\n    </p>\n  </body>\n</html>\n");
        jTextPane1.setFocusCycleRoot(false);
        jTextPane1.setMinimumSize(new java.awt.Dimension(101, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel.add(jTextPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        basicTab.add(informationPanel, gridBagConstraints);

        syncModeJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sync using this mode"));
        syncModeJPanel.setLayout(new java.awt.GridBagLayout());

        label9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DirSyncPro.png"))); // NOI18N
        label9.setText("Sync Mode:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        syncModeJPanel.add(label9, gridBagConstraints);

        syncModeComboBox.setMaximumRowCount(Const.SyncMode.values().length);
        syncModeComboBox.addItemListener(this::syncModeComboBoxItemStateChanged);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        syncModeJPanel.add(syncModeComboBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.03;
        basicTab.add(syncModeJPanel, gridBagConstraints);

        jobTabbedPane.addTab("Basics", basicTab);

        compareTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        compareTab.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        compareTab.add(spacer10, gridBagConstraints);

        informationPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel10.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel10.setLayout(new java.awt.GridBagLayout());

        jTextPane11.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane11.setContentType("text/html"); // NOI18N
        jTextPane11.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here how the comparison is actually carried out. When it is based on <u>file sizes and modification dates</u>, only the file sizes and modification dates are compared to conclude if a file is changed. \nThis is adequate for most cases because mostly the file sizes and/or modification dates change when files are modified. If the comparison is based on <u>file sizes, modifcation dates and file meta data</u>, \nthe changes in meta data (besides file sizes and modification dates) will also cause the file to be marked as 'modified'. If the file sizes are the same, and <u>file contents</u> is selected, DirSync Pro \nwill compare the contents of the files byte-by-byte to verify if the files are different. Please notice that comapring file contents could make the synchronization extremely slow.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane11.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel10.add(jTextPane11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        compareTab.add(informationPanel10, gridBagConstraints);

        compareaJpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Compare"));
        compareaJpanel.setLayout(new java.awt.GridBagLayout());

        jPanel97.setMaximumSize(null);
        jPanel97.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupCompare.add(compareFileSizesDatesRadioButton);
        compareFileSizesDatesRadioButton.setMaximumSize(null);
        compareFileSizesDatesRadioButton.setMinimumSize(null);
        compareFileSizesDatesRadioButton.setPreferredSize(null);
        jPanel97.add(compareFileSizesDatesRadioButton);

        compareFileSizesDatesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        compareFileSizesDatesLabel.setText("Compare only file sizes and modification dates (fastest)");
        jPanel97.add(compareFileSizesDatesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        compareaJpanel.add(jPanel97, gridBagConstraints);

        jPanel101.setMaximumSize(null);
        jPanel101.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupCompare.add(compareFileSizesDatesMetaDataRadioButton);
        compareFileSizesDatesMetaDataRadioButton.setMaximumSize(null);
        compareFileSizesDatesMetaDataRadioButton.setMinimumSize(null);
        compareFileSizesDatesMetaDataRadioButton.setPreferredSize(null);
        jPanel101.add(compareFileSizesDatesMetaDataRadioButton);

        compareFileSizesDatesMetaDataLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N
        compareFileSizesDatesMetaDataLabel.setText("Compare file sizes, modification dates and file meta data (attribute, permissions, ownerships)");
        jPanel101.add(compareFileSizesDatesMetaDataLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        compareaJpanel.add(jPanel101, gridBagConstraints);

        jPanel102.setMaximumSize(null);
        jPanel102.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupCompare.add(compareFileContentsRadioButton);
        compareFileContentsRadioButton.setMaximumSize(null);
        compareFileContentsRadioButton.setMinimumSize(null);
        compareFileContentsRadioButton.setPreferredSize(null);
        jPanel102.add(compareFileContentsRadioButton);

        compareFileContentsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_file.png"))); // NOI18N
        compareFileContentsLabel.setText("Compare file contents (slowest)");
        jPanel102.add(compareFileContentsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        compareaJpanel.add(jPanel102, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 1.0;
        compareaJpanel.add(jPanel31, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        compareaJpanel.add(spacer27, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        compareTab.add(compareaJpanel, gridBagConstraints);

        jobTabbedPane.addTab("Compare", compareTab);

        copyTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        copyTab.setLayout(new java.awt.GridBagLayout());

        copyOptionsJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Copy these files and dirs"));
        copyOptionsJPanel.setLayout(new javax.swing.BoxLayout(copyOptionsJPanel, javax.swing.BoxLayout.Y_AXIS));

        jPanel8.setMaximumSize(null);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirCopyAllCheckBox.setMaximumSize(null);
        dirCopyAllCheckBox.setMinimumSize(null);
        dirCopyAllCheckBox.setPreferredSize(null);
        dirCopyAllCheckBox.addActionListener(this::dirCopyAllCheckBoxdirEventActionPerformed);
        jPanel8.add(dirCopyAllCheckBox);

        dirCopyAllLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyAll.png"))); // NOI18N
        dirCopyAllLabel.setText("Forced copy all files");
        jPanel8.add(dirCopyAllLabel);

        copyOptionsJPanel.add(jPanel8);

        jPanel9.setMaximumSize(null);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirCopyNewCheckBox.setMaximumSize(null);
        dirCopyNewCheckBox.setMinimumSize(null);
        dirCopyNewCheckBox.setPreferredSize(null);
        dirCopyNewCheckBox.addActionListener(this::dirCopyNewCheckBoxdirEventActionPerformed);
        jPanel9.add(dirCopyNewCheckBox);

        dirCopyNewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyNew.png"))); // NOI18N
        dirCopyNewLabel.setText("New");
        dirCopyNewLabel.setMaximumSize(null);
        dirCopyNewLabel.setMinimumSize(null);
        dirCopyNewLabel.setPreferredSize(null);
        jPanel9.add(dirCopyNewLabel);

        copyOptionsJPanel.add(jPanel9);

        jPanel10.setMaximumSize(null);
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirCopyLargerCheckBox.setMaximumSize(null);
        dirCopyLargerCheckBox.setMinimumSize(null);
        dirCopyLargerCheckBox.setPreferredSize(null);
        dirCopyLargerCheckBox.addActionListener(this::dirCopyLargerCheckBoxdirEventActionPerformed);
        jPanel10.add(dirCopyLargerCheckBox);

        dirCopyLargerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        dirCopyLargerLabel.setText("Larger");
        dirCopyLargerLabel.setMaximumSize(null);
        dirCopyLargerLabel.setMinimumSize(null);
        dirCopyLargerLabel.setPreferredSize(null);
        jPanel10.add(dirCopyLargerLabel);

        copyOptionsJPanel.add(jPanel10);

        jPanel11.setMaximumSize(null);
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirCopyModifiedCheckBox.setMaximumSize(null);
        dirCopyModifiedCheckBox.setMinimumSize(null);
        dirCopyModifiedCheckBox.setPreferredSize(null);
        dirCopyModifiedCheckBox.addActionListener(this::dirCopyModifiedCheckBoxdirEventActionPerformed);
        jPanel11.add(dirCopyModifiedCheckBox);

        dirCopyModifiedLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        dirCopyModifiedLabel.setText("Modified");
        dirCopyModifiedLabel.setMaximumSize(new java.awt.Dimension(16, 16));
        dirCopyModifiedLabel.setMinimumSize(null);
        dirCopyModifiedLabel.setPreferredSize(null);
        jPanel11.add(dirCopyModifiedLabel);

        copyOptionsJPanel.add(jPanel11);

        jPanel12.setMaximumSize(null);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirCopyLargerModifiedCheckBox.setMaximumSize(null);
        dirCopyLargerModifiedCheckBox.setMinimumSize(null);
        dirCopyLargerModifiedCheckBox.setPreferredSize(null);
        dirCopyLargerModifiedCheckBox.addActionListener(this::dirCopyLargerModifiedCheckBoxdirEventActionPerformed);
        jPanel12.add(dirCopyLargerModifiedCheckBox);

        dirCopyLargerModifiedLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLargerModified.png"))); // NOI18N
        dirCopyLargerModifiedLabel.setText("Both larger and modified");
        dirCopyLargerModifiedLabel.setMaximumSize(null);
        dirCopyLargerModifiedLabel.setMinimumSize(null);
        dirCopyLargerModifiedLabel.setPreferredSize(null);
        jPanel12.add(dirCopyLargerModifiedLabel);

        copyOptionsJPanel.add(jPanel12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.01;
        copyTab.add(copyOptionsJPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        copyTab.add(spacer12, gridBagConstraints);

        informationPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel1.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel1.setLayout(new java.awt.GridBagLayout());

        jTextPane2.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane2.setContentType("text/html"); // NOI18N
        jTextPane2.setText("<html>\n  <head>\n\n  </head>\n  <body>\n    <p style=\"margin-top: 0\">\n    \nYou may define these copy options only if the Sync Mode under the tab Basics is set to 'custom'. Options: <u>Forced copy all files</u> will cause a forced full copy of all files. <u>New</u>, <u>Larger</u>, <u>Modified</u> cause to copy only the new, larger and/or modified files, respectively. <u>Both larger and Modified</u> causes to copy the files which not only are larger but also modified.\n    </p>\n  </body>\n</html>");
        jTextPane2.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel1.add(jTextPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        copyTab.add(informationPanel1, gridBagConstraints);

        jobTabbedPane.addTab("Copy", copyTab);

        conflictResolutionTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        conflictResolutionTab.setLayout(new java.awt.GridBagLayout());

        monodirectionalSyncConflictPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Monodirectional sync conflict resolution mode"));
        monodirectionalSyncConflictPanel.setLayout(new java.awt.GridBagLayout());

        jPanel96.setMaximumSize(null);
        jPanel96.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupMonodirectionalConflict.add(monodirectionalConflictCopySourceRadioButton);
        monodirectionalConflictCopySourceRadioButton.setMaximumSize(null);
        monodirectionalConflictCopySourceRadioButton.setMinimumSize(null);
        monodirectionalConflictCopySourceRadioButton.setPreferredSize(null);
        jPanel96.add(monodirectionalConflictCopySourceRadioButton);

        monodirectionalConflictCopySourceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        monodirectionalConflictCopySourceLabel.setText("Overwrite the file in destination with the file from source");
        jPanel96.add(monodirectionalConflictCopySourceLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        monodirectionalSyncConflictPanel.add(jPanel96, gridBagConstraints);

        jPanel99.setMaximumSize(null);
        jPanel99.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupMonodirectionalConflict.add(monodirectionalConflictWarnUserRadioButton);
        monodirectionalConflictWarnUserRadioButton.setMaximumSize(null);
        monodirectionalConflictWarnUserRadioButton.setMinimumSize(null);
        monodirectionalConflictWarnUserRadioButton.setPreferredSize(null);
        jPanel99.add(monodirectionalConflictWarnUserRadioButton);

        monodirectionalConflictWarnUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_warning.png"))); // NOI18N
        monodirectionalConflictWarnUserLabel.setText("Do nothing. Just warn me!");
        jPanel99.add(monodirectionalConflictWarnUserLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        monodirectionalSyncConflictPanel.add(jPanel99, gridBagConstraints);

        jPanel100.setMaximumSize(null);
        jPanel100.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupMonodirectionalConflict.add(monodirectionalConflictSkipRadioButton);
        monodirectionalConflictSkipRadioButton.setMaximumSize(null);
        monodirectionalConflictSkipRadioButton.setMinimumSize(null);
        monodirectionalConflictSkipRadioButton.setPreferredSize(null);
        jPanel100.add(monodirectionalConflictSkipRadioButton);

        monodirectionalConflictSkipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excludeFile.png"))); // NOI18N
        monodirectionalConflictSkipLabel.setText("Do nothing. Just skip silently!");
        jPanel100.add(monodirectionalConflictSkipLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        monodirectionalSyncConflictPanel.add(jPanel100, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 1.0;
        monodirectionalSyncConflictPanel.add(jPanel22, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        monodirectionalSyncConflictPanel.add(spacer26, gridBagConstraints);

        conflictResolutionJTabbedPane.addTab("Monodirectional", monodirectionalSyncConflictPanel);

        bidirectionalSyncConflictPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Bidirectional sync conflict resolution mode"));
        bidirectionalSyncConflictPanel.setLayout(new java.awt.GridBagLayout());

        jPanel38.setMaximumSize(null);
        jPanel38.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictCopyModifiedRadioButton);
        bidirectionalConflictCopyModifiedRadioButton.setMaximumSize(null);
        bidirectionalConflictCopyModifiedRadioButton.setMinimumSize(null);
        bidirectionalConflictCopyModifiedRadioButton.setPreferredSize(null);
        jPanel38.add(bidirectionalConflictCopyModifiedRadioButton);

        bidirectionalConflictCopyModifiedLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        bidirectionalConflictCopyModifiedLabel.setText("Copy the latest modified file to both dirs");
        jPanel38.add(bidirectionalConflictCopyModifiedLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel38, gridBagConstraints);

        jPanel39.setMaximumSize(null);
        jPanel39.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictCopyLargerRadioButton);
        bidirectionalConflictCopyLargerRadioButton.setMaximumSize(null);
        bidirectionalConflictCopyLargerRadioButton.setMinimumSize(null);
        bidirectionalConflictCopyLargerRadioButton.setPreferredSize(null);
        jPanel39.add(bidirectionalConflictCopyLargerRadioButton);

        bidirectionalConflictCopyLargerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        bidirectionalConflictCopyLargerLabel.setText("Copy the largest file to both dirs");
        jPanel39.add(bidirectionalConflictCopyLargerLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel39, gridBagConstraints);

        jPanel48.setMaximumSize(null);
        jPanel48.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictRenameCopyRadioButton);
        bidirectionalConflictRenameCopyRadioButton.setMaximumSize(null);
        bidirectionalConflictRenameCopyRadioButton.setMinimumSize(null);
        bidirectionalConflictRenameCopyRadioButton.setPreferredSize(null);
        jPanel48.add(bidirectionalConflictRenameCopyRadioButton);

        bidirectionalConflictRenameCopyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyAll.png"))); // NOI18N
        bidirectionalConflictRenameCopyLabel.setText("Rename & copy both files to both dirs");
        jPanel48.add(bidirectionalConflictRenameCopyLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel48, gridBagConstraints);

        jPanel40.setMaximumSize(null);
        jPanel40.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictWarnUserRadioButton);
        bidirectionalConflictWarnUserRadioButton.setMaximumSize(null);
        bidirectionalConflictWarnUserRadioButton.setMinimumSize(null);
        bidirectionalConflictWarnUserRadioButton.setPreferredSize(null);
        jPanel40.add(bidirectionalConflictWarnUserRadioButton);

        bidirectionalConflictWarnUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_warning.png"))); // NOI18N
        bidirectionalConflictWarnUserLabel.setText("Do nothing. Just warn me!");
        jPanel40.add(bidirectionalConflictWarnUserLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel40, gridBagConstraints);

        jPanel95.setMaximumSize(null);
        jPanel95.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupBidirectionalConflict.add(bidirectionalConflictSkipRadioButton);
        bidirectionalConflictSkipRadioButton.setMaximumSize(null);
        bidirectionalConflictSkipRadioButton.setMinimumSize(null);
        bidirectionalConflictSkipRadioButton.setPreferredSize(null);
        jPanel95.add(bidirectionalConflictSkipRadioButton);

        bidirectionalConflictSkipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excludeFile.png"))); // NOI18N
        bidirectionalConflictSkipLabel.setText("Do nothing. Just skip silently!");
        jPanel95.add(bidirectionalConflictSkipLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        bidirectionalSyncConflictPanel.add(jPanel95, gridBagConstraints);
        bidirectionalSyncConflictPanel.add(jPanel21, new java.awt.GridBagConstraints());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        bidirectionalSyncConflictPanel.add(spacer25, gridBagConstraints);

        conflictResolutionJTabbedPane.addTab("Bidirectional", bidirectionalSyncConflictPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        conflictResolutionTab.add(conflictResolutionJTabbedPane, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        conflictResolutionTab.add(spacer17, gridBagConstraints);

        informationPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel2.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel2.setLayout(new java.awt.GridBagLayout());

        jTextPane3.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane3.setContentType("text/html"); // NOI18N
        jTextPane3.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may set the conflict resolution mode only if the Sync Mode under the tab Basic is set to a 'custom' mode. Options for bidirectional sync:\n<u>Copy the latest modified/largest file to both dirs</u>: if a file is modified in both dir individually, copy the latest modified/largest to both dirs.\n<u>Rename & copy both files to both dirs</u>: if a file is modified in both dir individually, rename them first and then copy them both to both dirs. When renaming, extensions '.DirA' and '.DirB' are added to the files form DirA and DirB respectively.\n<u>Do nothing. Just warn me!</u>: ignore if a file is modified in both dir individually. Shows a warning.\n<u>Do nothing. Just skip them silently!</u>: ignore silently if a file is modified in both dir individually.\nOptions for monodirectional sync:\n<u>Overwrite the file in destination with the file from source</u>: If the file in destination is modified individually, copy the file from source and overwrite the file in destination.\n<u>Do nothing. Just warn me!</u>: ignore if a file is modified in Dir B and show a warning.\n<u>Do nothing. Skip the file silently!</u>: ignore silently if a file is modified in Dir B individually.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane3.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel2.add(jTextPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        conflictResolutionTab.add(informationPanel2, gridBagConstraints);

        jobTabbedPane.addTab("Conflict resolution", conflictResolutionTab);

        filtersTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersTab.setName(""); // NOI18N
        filtersTab.setLayout(new java.awt.GridBagLayout());

        jScrollPane3.setPreferredSize(new java.awt.Dimension(74, 200));

        filtersTree.setModel(new FiltersTreeModel(getFiltersTree()));
        filtersTree.setCellEditor(new FiltersTreeNodeEditor(filtersTree));
        filtersTree.setCellRenderer(new FiltersTreeCellRenderer());
        filtersTree.setEditable(true);
        filtersTree.setMinimumSize(new java.awt.Dimension(72, 64));
        jScrollPane3.setViewportView(filtersTree);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        filtersTab.add(jScrollPane3, gridBagConstraints);

        informationPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel3.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel3.setLayout(new java.awt.GridBagLayout());

        jTextPane4.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane4.setContentType("text/html"); // NOI18N
        jTextPane4.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may (re)define here filters for inclusion and exclusions of files and directories if the Sync Mode under the tab Basics is set to 'custom'. 'Edit' and 'Remove' buttons get available only if a filter is selected. Filter tree nodes get grayed out if they do not contain any filter.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane4.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel3.add(jTextPane4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersTab.add(informationPanel3, gridBagConstraints);

        viewJPanel3.setMinimumSize(new java.awt.Dimension(100, 29));
        viewJPanel3.setLayout(new java.awt.GridBagLayout());

        addFilterButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        addFilterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirNew.png"))); // NOI18N
        addFilterButton.setText("New");
        addFilterButton.setToolTipText("Add a new Job.");
        addFilterButton.setIconTextGap(2);
        addFilterButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        addFilterButton.addActionListener(this::addFilterButtonlistAddActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel3.add(addFilterButton, gridBagConstraints);

        editFilterButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        editFilterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editFilterButton.setText("Edit");
        editFilterButton.setToolTipText("Edit the selected Job");
        editFilterButton.setIconTextGap(2);
        editFilterButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        editFilterButton.addActionListener(this::editFilterButtonlistAddActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel3.add(editFilterButton, gridBagConstraints);

        removeFilterButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        removeFilterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        removeFilterButton.setText("Remove");
        removeFilterButton.setToolTipText("Remove the selected Job.");
        removeFilterButton.setIconTextGap(2);
        removeFilterButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        removeFilterButton.setMaximumSize(null);
        removeFilterButton.setMinimumSize(null);
        removeFilterButton.setPreferredSize(null);
        removeFilterButton.addActionListener(this::removeFilterButtonlistRemoveActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel3.add(removeFilterButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel3.add(jPanel16, gridBagConstraints);

        filtersExpandAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        filtersExpandAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expandAll.png"))); // NOI18N
        filtersExpandAllButton.setText("Expand");
        filtersExpandAllButton.setToolTipText("Expand all Jobs in the job tree.");
        filtersExpandAllButton.setActionCommand("Enable all");
        filtersExpandAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        filtersExpandAllButton.setMaximumSize(null);
        filtersExpandAllButton.setPreferredSize(new java.awt.Dimension(70, 17));
        filtersExpandAllButton.addActionListener(this::filtersExpandAllButtonenableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel3.add(filtersExpandAllButton, gridBagConstraints);

        filtersCollapseAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        filtersCollapseAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/collapseAll.png"))); // NOI18N
        filtersCollapseAllButton.setText("Collapse");
        filtersCollapseAllButton.setToolTipText("Collapse all Jobs in the job tree.");
        filtersCollapseAllButton.setActionCommand("Disable all");
        filtersCollapseAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        filtersCollapseAllButton.setMaximumSize(null);
        filtersCollapseAllButton.setPreferredSize(new java.awt.Dimension(70, 17));
        filtersCollapseAllButton.addActionListener(this::filtersCollapseAllButtondisableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 8);
        viewJPanel3.add(filtersCollapseAllButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        filtersTab.add(viewJPanel3, gridBagConstraints);

        jobTabbedPane.addTab("Filters", filtersTab);

        deletionTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        deletionTab.setLayout(new java.awt.GridBagLayout());

        dirDeleteOptionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Deletion"));
        dirDeleteOptionsPanel.setLayout(new java.awt.GridBagLayout());

        jPanel5.setMaximumSize(null);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirDeleteFilesCheckBox.setMaximumSize(null);
        dirDeleteFilesCheckBox.setMinimumSize(null);
        dirDeleteFilesCheckBox.setPreferredSize(null);
        jPanel5.add(dirDeleteFilesCheckBox);

        dirDeleteFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        dirDeleteFilesLabel.setText("Delete orphan files in the destination (files that do not exist in the source)");
        jPanel5.add(dirDeleteFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel5, gridBagConstraints);

        jPanel13.setMaximumSize(null);
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirDeleteDirsCheckBox.setMaximumSize(null);
        dirDeleteDirsCheckBox.setMinimumSize(null);
        dirDeleteDirsCheckBox.setPreferredSize(null);
        jPanel13.add(dirDeleteDirsCheckBox);

        dirDeleteDirsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        dirDeleteDirsLabel.setText("Delete orphan dirs in the destination (dirs that do not exist in the source)");
        jPanel13.add(dirDeleteDirsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel13, gridBagConstraints);

        jPanel7.setMaximumSize(null);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        deleteExcludedFilesACheckBox.setMaximumSize(null);
        deleteExcludedFilesACheckBox.setMinimumSize(null);
        deleteExcludedFilesACheckBox.setPreferredSize(null);
        jPanel7.add(deleteExcludedFilesACheckBox);

        dirDeleteExcludedFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        dirDeleteExcludedFilesLabel.setText("Force deleting excluded files from Dir A");
        jPanel7.add(dirDeleteExcludedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel7, gridBagConstraints);

        jPanel44.setMaximumSize(null);
        jPanel44.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        deleteExcludedDirsACheckBox.setMaximumSize(null);
        deleteExcludedDirsACheckBox.setMinimumSize(null);
        deleteExcludedDirsACheckBox.setPreferredSize(null);
        jPanel44.add(deleteExcludedDirsACheckBox);

        dirDeleteExcludedDirsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        dirDeleteExcludedDirsLabel.setText("Force deleting excluded directories from Dir A");
        jPanel44.add(dirDeleteExcludedDirsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel44, gridBagConstraints);

        jPanel18.setMaximumSize(null);
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        deleteExcludedFilesBCheckBox.setMaximumSize(null);
        deleteExcludedFilesBCheckBox.setMinimumSize(null);
        deleteExcludedFilesBCheckBox.setPreferredSize(null);
        jPanel18.add(deleteExcludedFilesBCheckBox);

        dirDeleteExcludedFilesLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        dirDeleteExcludedFilesLabel1.setText("Force deleting excluded files from Dir B");
        jPanel18.add(dirDeleteExcludedFilesLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel18, gridBagConstraints);

        jPanel78.setMaximumSize(null);
        jPanel78.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        deleteExcludedDirsBCheckBox.setMaximumSize(null);
        deleteExcludedDirsBCheckBox.setMinimumSize(null);
        deleteExcludedDirsBCheckBox.setPreferredSize(null);
        jPanel78.add(deleteExcludedDirsBCheckBox);

        dirDeleteExcludedDirsLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        dirDeleteExcludedDirsLabel1.setText("Force deleting excluded directories from Dir B");
        jPanel78.add(dirDeleteExcludedDirsLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirDeleteOptionsPanel.add(jPanel78, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        dirDeleteOptionsPanel.add(spacer7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.03;
        deletionTab.add(dirDeleteOptionsPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        deletionTab.add(spacer6, gridBagConstraints);

        informationPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel4.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel4.setLayout(new java.awt.GridBagLayout());

        jTextPane5.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane5.setContentType("text/html"); // NOI18N
        jTextPane5.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may set deletion options only if the Sync Mode under the tab Basics is set to 'custom'. Options: <u>Orphan files from destination</u> and <u>Orphan dirs from destination</u> will cause the files/dirs in the destination to be deleted if the corresponding file in the source does not exist.\n<u>Force deleting excluded files from Dir A/Dir B</u> and <u>Force deleting excluded directories from Dir A/Dir B</u> will cause the files/dirs in Dir A/Dir B to be deleted \nif they match any exclusion pattern. This could be helpful while cleaning stuff, for example to deleting all temporary files matching *.tmp.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane5.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel4.add(jTextPane5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        deletionTab.add(informationPanel4, gridBagConstraints);

        jobTabbedPane.addTab("Deletion", deletionTab);

        backupTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        backupTab.setLayout(new java.awt.GridBagLayout());

        dirBackupPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Backup"));
        dirBackupPanel.setLayout(new java.awt.GridBagLayout());

        dirBackupLabel1.setText("Keep");
        dirBackupLabel1.setMaximumSize(null);
        dirBackupLabel1.setMinimumSize(null);
        dirBackupLabel1.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirBackupPanel.add(dirBackupLabel1, gridBagConstraints);

        dirBackupField.setColumns(2);
        dirBackupField.setText("0");
        dirBackupField.setToolTipText("<html>Number of backups of changed or deleted files to keep.<br>\nZero means no backups at all, the maximum number of backups is " + Const.BACKUP_MAX_NUMBER + ".</html>");
        dirBackupField.setInputVerifier(new LongIntVerifier(this, dirBackupField, 0, Const.BACKUP_MAX_NUMBER));
        dirBackupField.setMaximumSize(null);
        dirBackupPanel.add(dirBackupField, new java.awt.GridBagConstraints());

        dirBackupLabel2.setText("backups of changed or deleted files");
        dirBackupLabel2.setMaximumSize(null);
        dirBackupLabel2.setMinimumSize(null);
        dirBackupLabel2.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirBackupPanel.add(dirBackupLabel2, gridBagConstraints);

        jPanel30.setMaximumSize(null);
        jPanel30.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirBackupDirInlineCheckBox.setToolTipText("");
        dirBackupDirInlineCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dirBackupDirInlineCheckBox.setMaximumSize(null);
        dirBackupDirInlineCheckBox.setMinimumSize(null);
        dirBackupDirInlineCheckBox.setPreferredSize(null);
        jPanel30.add(dirBackupDirInlineCheckBox);

        dirBackupDirInlineLabel.setText("Keep the backup-dir in the destination directory.");
        jPanel30.add(dirBackupDirInlineLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirBackupPanel.add(jPanel30, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        dirBackupDirLabel.setText("Backup dir:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(dirBackupDirLabel, gridBagConstraints);

        dirBackupDirField.setEditable(false);
        dirBackupDirField.setMaximumSize(null);
        dirBackupDirField.setMinimumSize(null);
        dirBackupDirField.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        jPanel2.add(dirBackupDirField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirBackupPanel.add(jPanel2, gridBagConstraints);

        dirBackupDirChangeButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dirBackupDirChangeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirBackupDirChangeButton.setIconTextGap(2);
        dirBackupDirChangeButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        dirBackupDirChangeButton.addActionListener(this::dirBackupDirChangeButtonbrowseSrcActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        dirBackupPanel.add(dirBackupDirChangeButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.01;
        backupTab.add(dirBackupPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        backupTab.add(spacer4, gridBagConstraints);

        informationPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel5.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel5.setLayout(new java.awt.GridBagLayout());

        jTextPane6.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane6.setContentType("text/html"); // NOI18N
        jTextPane6.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nDefine here the number of backups of a file which should be made if the file is being deleted or overwritten. You may use these options only if the Sync Mode under the tab Basics is set to 'custom'. When creating a backup, the file name is extended with a rank number. You may let the backups be created in the destination directory or you may define a custom directory. The backups are always placed in a directory named '.DirSyncProBackup' within the backup-directory. You may set/edit backup options only if the Sync Mode under the tab Basics is not set to 'Bi-directional'. The number of backups is set to 0 by default (no backups). You may create 50 backups at most.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane6.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel5.add(jTextPane6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        backupTab.add(informationPanel5, gridBagConstraints);

        jobTabbedPane.addTab("Backup", backupTab);

        logTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        logTab.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        logTab.add(spacer5, gridBagConstraints);

        informationPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel8.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel8.setLayout(new java.awt.GridBagLayout());

        jTextPane9.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane9.setContentType("text/html"); // NOI18N
        jTextPane9.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may enable or disable logging for each job individually. If enabled, all the messages will also be written to the log file 'JOB_NAME.log'. \nYou may define here a custom log file as well. If no custom log file is defined, the log files are saved in the directory which is defined in the DirSync Pro options \n(Menu/Tools/Options). You may include some wild cards into your log filename (please read the help for more details). \nThe log entries are appended to a log file if it already exists.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane9.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel8.add(jTextPane9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        logTab.add(informationPanel8, gridBagConstraints);

        dirLogFilePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Log file"));
        dirLogFilePanel.setLayout(new java.awt.GridBagLayout());

        dirLogLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/log.png"))); // NOI18N
        dirLogLabel.setText("Logfile");
        dirLogLabel.setMaximumSize(null);
        dirLogLabel.setMinimumSize(null);
        dirLogLabel.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        dirLogFilePanel.add(dirLogLabel, gridBagConstraints);

        dirLogField.setToolTipText("<html>The logfile.. You can use the following wildcards:<br>\n\"<b>&lt;jobname&gt;</b>\" for the name of the current job definition,<br>\n\"<b>&lt;date&gt;</b>\" for the current date or \"<b>&lt;DD&gt;</b>\" for day, \"<b>&lt;MM&gt;</b>\" for month, and \"<b>&lt;YYYY&gt;</b>\" for year,<br>\n\"<b>&lt;time&gt;</b>\" for the current time or \"<b>&lt;hh&gt;</b>\" for hour, \"<b>&lt;mm&gt;</b>\" for minute, and \"<b>&lt;ss&gt;</b>\" for second,<br>\n\"<b>&lt;username&gt;</b>\" for the name of the current user, and<br>\n\"<b>&lt;userhome&gt;</b>\" for the home directory of the current user.</html> \n");
        dirLogField.setInputVerifier(new WildCardVerifier(this, dirLogField));
        dirLogField.setMaximumSize(null);
        dirLogField.setMinimumSize(null);
        dirLogField.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        dirLogFilePanel.add(dirLogField, gridBagConstraints);

        dirLogBrowseButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dirLogBrowseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        dirLogBrowseButton.setIconTextGap(2);
        dirLogBrowseButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        dirLogBrowseButton.addActionListener(this::dirLogBrowseButtonbrowseSrcActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        dirLogFilePanel.add(dirLogBrowseButton, gridBagConstraints);

        jPanel73.setMaximumSize(null);
        jPanel73.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirEnableLoggingCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dirEnableLoggingCheckBox.setMaximumSize(null);
        dirEnableLoggingCheckBox.setMinimumSize(null);
        dirEnableLoggingCheckBox.setPreferredSize(null);
        dirEnableLoggingCheckBox.addActionListener(this::dirEnableLoggingCheckBoxdirEventActionPerformed);
        jPanel73.add(dirEnableLoggingCheckBox);

        dirEnableLoggingJLabel.setText("Enable logging.");
        jPanel73.add(dirEnableLoggingJLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirLogFilePanel.add(jPanel73, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.03;
        logTab.add(dirLogFilePanel, gridBagConstraints);

        jobTabbedPane.addTab("Log", logTab);

        scheduleTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        scheduleTab.setName(""); // NOI18N
        scheduleTab.setLayout(new java.awt.GridBagLayout());

        jScrollPane4.setMinimumSize(new java.awt.Dimension(74, 200));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(74, 200));

        scheduleTree.setModel(new ScheduleTreeModel(getScheduleTree()));
        scheduleTree.setCellEditor(new ScheduleTreeNodeEditor(scheduleTree));
        scheduleTree.setCellRenderer(new ScheduleTreeCellRenderer());
        scheduleTree.setEditable(true);
        jScrollPane4.setViewportView(scheduleTree);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        scheduleTab.add(jScrollPane4, gridBagConstraints);

        informationPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel9.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel9.setLayout(new java.awt.GridBagLayout());

        jTextPane10.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane10.setContentType("text/html"); // NOI18N
        jTextPane10.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here schedules for this task. Use 'New' to add a new schedule. 'Edit' and 'Remove' buttons get available only if a scheduled task is selected. \nSchedule tree nodes get grayed out if they do not contain any schedule. If you add a schedule type which already exist, it will be overwritten.<br\\>\nIf a schedule task of type Once has already run or if a recurrent schedule task does not have a valid next event date due to its constraints, the schedule \ngets suffixed with '(Expired)' in the schedule tree'.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane10.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel9.add(jTextPane10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        scheduleTab.add(informationPanel9, gridBagConstraints);

        viewJPanel4.setMinimumSize(new java.awt.Dimension(100, 29));
        viewJPanel4.setLayout(new java.awt.GridBagLayout());

        addScheduleButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        addScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirNew.png"))); // NOI18N
        addScheduleButton.setText("New");
        addScheduleButton.setToolTipText("Add a new Job.");
        addScheduleButton.setIconTextGap(2);
        addScheduleButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        addScheduleButton.addActionListener(this::addScheduleButtonlistAddActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel4.add(addScheduleButton, gridBagConstraints);

        editScheduleButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        editScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editScheduleButton.setText("Edit");
        editScheduleButton.setToolTipText("Edit the selected Job");
        editScheduleButton.setIconTextGap(2);
        editScheduleButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        editScheduleButton.addActionListener(this::editScheduleButtonlistAddActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel4.add(editScheduleButton, gridBagConstraints);

        removeScheduleButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        removeScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        removeScheduleButton.setText("Remove");
        removeScheduleButton.setToolTipText("Remove the selected Job.");
        removeScheduleButton.setIconTextGap(2);
        removeScheduleButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        removeScheduleButton.setMaximumSize(null);
        removeScheduleButton.setMinimumSize(null);
        removeScheduleButton.setPreferredSize(null);
        removeScheduleButton.addActionListener(this::removeScheduleButtonlistRemoveActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel4.add(removeScheduleButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel4.add(jPanel17, gridBagConstraints);

        scheduleExpandAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        scheduleExpandAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expandAll.png"))); // NOI18N
        scheduleExpandAllButton.setText("Expand");
        scheduleExpandAllButton.setToolTipText("Expand all Jobs in the job tree.");
        scheduleExpandAllButton.setActionCommand("Enable all");
        scheduleExpandAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        scheduleExpandAllButton.setMaximumSize(null);
        scheduleExpandAllButton.setPreferredSize(new java.awt.Dimension(70, 17));
        scheduleExpandAllButton.addActionListener(this::scheduleExpandAllButtonenableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel4.add(scheduleExpandAllButton, gridBagConstraints);

        scheduleCollapseAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        scheduleCollapseAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/collapseAll.png"))); // NOI18N
        scheduleCollapseAllButton.setText("Collapse");
        scheduleCollapseAllButton.setToolTipText("Collapse all Jobs in the job tree.");
        scheduleCollapseAllButton.setActionCommand("Disable all");
        scheduleCollapseAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        scheduleCollapseAllButton.setMaximumSize(null);
        scheduleCollapseAllButton.setPreferredSize(new java.awt.Dimension(70, 17));
        scheduleCollapseAllButton.addActionListener(this::scheduleCollapseAllButtondisableAllDirsActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 8);
        viewJPanel4.add(scheduleCollapseAllButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        scheduleTab.add(viewJPanel4, gridBagConstraints);

        jobTabbedPane.addTab("Schedule", scheduleTab);

        advancedTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        advancedTab.setLayout(new java.awt.GridBagLayout());

        dirTimestampWriteBackPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Timestamps"));
        dirTimestampWriteBackPanel.setLayout(new java.awt.GridBagLayout());

        dirTimestampDiffFieldPanel.setMaximumSize(null);
        dirTimestampDiffFieldPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        dirTimestampDiffField.setColumns(5);
        dirTimestampDiffField.setText("0");
        dirTimestampDiffField.setToolTipText("<html>If you specify more than one second in this option the timestamp of \"12:05:00\" would be treated as equal to the timestamp \"12:05:01\".<br>If  you synchronize this file with the \"Modified\" option it will not be copied because both files have an equal timestamp.<br /> This option is somethime useful while synchronizing to a little slower media, like network drives.</html>");
        dirTimestampDiffField.setInputVerifier(new LongIntVerifier(this, dirTimestampDiffField, 0, 86401));
        dirTimestampDiffField.setMaximumSize(null);
        dirTimestampDiffField.setMinimumSize(new java.awt.Dimension(10, 20));
        dirTimestampDiffFieldPanel.add(dirTimestampDiffField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(dirTimestampDiffFieldPanel, gridBagConstraints);
        dirTimestampDiffFieldPanel.getAccessibleContext().setAccessibleDescription("<html>This ensures that timestamps that differ due to filesystem inaccuracy are handled as the same.<br><br>PROBLEM: If this value is chosen too big some files that are actually different might be falsely considered to be identical.</html>");

        jPanel28.setLayout(new java.awt.GridBagLayout());

        dirTimestampWriteBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/writeTimestampBack.png"))); // NOI18N
        dirTimestampWriteBackLabel.setText("<html>Write timestamps back to <b><u>source</u></b> <span style=\"color: red;\">(Caution! Use wisely!)</span>.</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel28.add(dirTimestampWriteBackLabel, gridBagConstraints);

        dirTimestampWriteBackCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        dirTimestampWriteBackCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel28.add(dirTimestampWriteBackCheckBox, gridBagConstraints);
        dirTimestampWriteBackCheckBox.getAccessibleContext().setAccessibleDescription("<html>After a file has been copied the destination timestamp is written back to the source file; this ensures that the timestamps are identical.<br><br>PROBLEM: This is not possible if the source is read-only.</html>");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(jPanel28, gridBagConstraints);

        dirTimestampDiffLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/timestampDiff.png"))); // NOI18N
        dirTimestampDiffLabel1.setText("Timestamp granularity (seconds):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirTimestampWriteBackPanel.add(dirTimestampDiffLabel1, gridBagConstraints);

        jPanel81.setLayout(new java.awt.GridBagLayout());

        dirTimestampWriteBackLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/timestampDiffDir.png"))); // NOI18N
        dirTimestampWriteBackLabel1.setText("Preserve timestamps of the directories.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel81.add(dirTimestampWriteBackLabel1, gridBagConstraints);

        dirTimestampSyncCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        dirTimestampSyncCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel81.add(dirTimestampSyncCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(jPanel81, gridBagConstraints);

        jPanel84.setLayout(new java.awt.GridBagLayout());

        ignoreDaylightSavingTimeJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/timestamp.png"))); // NOI18N
        ignoreDaylightSavingTimeJLabel.setText("Ignore daylight saving granularity.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel84.add(ignoreDaylightSavingTimeJLabel, gridBagConstraints);

        ignoreDaylightSavingTimeCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        ignoreDaylightSavingTimeCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel84.add(ignoreDaylightSavingTimeCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        dirTimestampWriteBackPanel.add(jPanel84, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(dirTimestampWriteBackPanel, gridBagConstraints);
        dirTimestampWriteBackPanel.getAccessibleContext().setAccessibleDescription("");

        dirSymbolicLinkPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Symbolic links"));
        dirSymbolicLinkPane.setLayout(new java.awt.GridBagLayout());

        jPanel27.setMaximumSize(null);
        jPanel27.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupSymLinks.add(skipSymLinkRadioButton);
        skipSymLinkRadioButton.setMaximumSize(null);
        skipSymLinkRadioButton.setMinimumSize(null);
        skipSymLinkRadioButton.setPreferredSize(null);
        jPanel27.add(skipSymLinkRadioButton);

        skipSymLinkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/skipLinks.png"))); // NOI18N
        skipSymLinkLabel.setText("Skip sym links");
        jPanel27.add(skipSymLinkLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        dirSymbolicLinkPane.add(jPanel27, gridBagConstraints);

        jPanel23.setMaximumSize(null);
        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupSymLinks.add(copySymLinkRadioButton);
        copySymLinkRadioButton.setMaximumSize(null);
        copySymLinkRadioButton.setMinimumSize(null);
        copySymLinkRadioButton.setPreferredSize(null);
        jPanel23.add(copySymLinkRadioButton);

        copySymLinkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        copySymLinkLabel.setText("Copy sym links (create symbolic links)");
        jPanel23.add(copySymLinkLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        dirSymbolicLinkPane.add(jPanel23, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        dirSymbolicLinkPane.add(jPanel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        dirSymbolicLinkPane.add(jPanel1, gridBagConstraints);

        jPanel32.setMaximumSize(null);
        jPanel32.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupSymLinks.add(followSymLinkRadioButton);
        followSymLinkRadioButton.setMaximumSize(null);
        followSymLinkRadioButton.setMinimumSize(null);
        followSymLinkRadioButton.setPreferredSize(null);
        jPanel32.add(followSymLinkRadioButton);

        followSymLinkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        followSymLinkLabel.setText("Follow sym links (copy linked files/dirs)");
        jPanel32.add(followSymLinkLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        dirSymbolicLinkPane.add(jPanel32, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(dirSymbolicLinkPane, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weighty = 1.0;
        advancedTab.add(spacer8, gridBagConstraints);

        verifyJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Verify"));
        verifyJPanel.setLayout(new java.awt.GridBagLayout());

        jPanel6.setMaximumSize(null);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        dirVerifyCheckBox.setActionCommand("Verify files");
        dirVerifyCheckBox.setMaximumSize(null);
        dirVerifyCheckBox.setMinimumSize(null);
        dirVerifyCheckBox.setPreferredSize(null);
        jPanel6.add(dirVerifyCheckBox);

        dirVerifyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/verify.png"))); // NOI18N
        dirVerifyLabel.setText("Verify the content of the synchronized files");
        jPanel6.add(dirVerifyLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        verifyJPanel.add(jPanel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(verifyJPanel, gridBagConstraints);

        informationPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel6.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel6.setLayout(new java.awt.GridBagLayout());

        jTextPane7.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane7.setContentType("text/html"); // NOI18N
        jTextPane7.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\n<u>Timestamp granularity</u> defines the tolerance  in seconds when comparing modification times of files. \nNormally the granularity should be 0 but in some cases the file system lacks precision to set the exact modification time, e.g. when using a network drive or copying files cross platforms. \n<u>Ignore daylight saving granularity</u> could be useful when synchronizing between FAT and other file systems. This option causes that two files with modification time difference \nof <i>exactly 1 hour</i> are treated as equal. Some file systems update the timestamp of a parent directory when changing the content of it. \nYou may define here to <u>preserve the timestamps of the directories</u>. <u>Write timestamp back to source</u> could be useful e.g. when using slower file systems. If you choose \n<u>Skip sym links</u> they are just ignored. <u>Copy sym links</u> will create sym links in the destination and <u>Follow sym link</u> will copy linked files/dirs to destination.\n <u>Preserve DOS attributes</u> will copy 'Read only', 'Hidden',  'System' and 'Archive' flags for MS Windows/DOS and 'group information' and 'file permissions' for POSIX systems from\n the source the directory. <u>Attempt to override read-only</u> will try to overwrite/delete the destination file (if needed) even if it is marked as read-only.\nYou may choose to <u>verify</u> the content of the copied files byte by byte. This could be convenient on less trusted media. <u>Realtime Sync</u> watches the source directory continuously; \nSynchronization starts after <u>Delay</u> seconds passed since latest change is detected. <u>Sync on start</u> option performs initial synchronization before starting to monitor realtime changes.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane7.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel6.add(jTextPane7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        advancedTab.add(informationPanel6, gridBagConstraints);

        attributeJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("File Attributes"));
        attributeJPanel.setLayout(new java.awt.GridBagLayout());

        jPanel24.setMaximumSize(null);
        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        preserveDOSAttributesCheckBox.setActionCommand("Verify files");
        preserveDOSAttributesCheckBox.setMaximumSize(null);
        preserveDOSAttributesCheckBox.setMinimumSize(null);
        preserveDOSAttributesCheckBox.setPreferredSize(null);
        jPanel24.add(preserveDOSAttributesCheckBox);

        preserveDOSAttributesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file.png"))); // NOI18N
        preserveDOSAttributesLabel.setText("Preserve DOS attributes (MS Windows/DOS only)");
        jPanel24.add(preserveDOSAttributesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel24, gridBagConstraints);

        jPanel25.setMaximumSize(null);
        jPanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        preserveFilePermissionsCheckBox.setActionCommand("Verify files");
        preserveFilePermissionsCheckBox.setMaximumSize(null);
        preserveFilePermissionsCheckBox.setMinimumSize(null);
        preserveFilePermissionsCheckBox.setPreferredSize(null);
        jPanel25.add(preserveFilePermissionsCheckBox);

        preserveFilePermissionsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/permissions.png"))); // NOI18N
        preserveFilePermissionsLabel.setText("Preserve file permissions (POSIX only)");
        jPanel25.add(preserveFilePermissionsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel25, gridBagConstraints);

        jPanel26.setMaximumSize(null);
        jPanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        preserveFileOwnershipCheckBox.setActionCommand("Verify files");
        preserveFileOwnershipCheckBox.setMaximumSize(null);
        preserveFileOwnershipCheckBox.setMinimumSize(null);
        preserveFileOwnershipCheckBox.setPreferredSize(null);
        jPanel26.add(preserveFileOwnershipCheckBox);

        preserveFileOwnershipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N
        preserveFileOwnershipLabel.setText("Preserve file ownership (POSIX only)");
        jPanel26.add(preserveFileOwnershipLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel26, gridBagConstraints);

        jPanel29.setMaximumSize(null);
        jPanel29.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        overrideReadOnlyCheckBox.setActionCommand("Verify files");
        overrideReadOnlyCheckBox.setMaximumSize(null);
        overrideReadOnlyCheckBox.setMinimumSize(null);
        overrideReadOnlyCheckBox.setPreferredSize(null);
        jPanel29.add(overrideReadOnlyCheckBox);

        overrideReadOnlyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/link.png"))); // NOI18N
        overrideReadOnlyLabel.setText("Attempt to override read-only attribute in destination when copying/deleting.");
        jPanel29.add(overrideReadOnlyLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        attributeJPanel.add(jPanel29, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(attributeJPanel, gridBagConstraints);

        realTimeSyncPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Realtime Synchronization"));
        realTimeSyncPanel.setLayout(new java.awt.GridBagLayout());

        dirTimestampDiffFieldPanel1.setLayout(new java.awt.GridBagLayout());

        dirTimestampDiffLabel2.setText("Delay:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirTimestampDiffFieldPanel1.add(dirTimestampDiffLabel2, gridBagConstraints);

        realtimeSyncDelayField.setColumns(5);
        realtimeSyncDelayField.setText("0");
        realtimeSyncDelayField.setToolTipText("<html>If you specify more than one second in this option the timestamp of \"12:05:00\" would be treated as equal to the timestamp \"12:05:01\".<br>If  you synchronize this file with the \"Modified\" option it will not be copied because both files have an equal timestamp.<br /> This option is somethime useful while synchronizing to a little slower media, like network drives.</html>");
        realtimeSyncDelayField.setInputVerifier(new LongIntVerifier(this, realtimeSyncDelayField, 0, 86401));
        realtimeSyncDelayField.setMaximumSize(null);
        realtimeSyncDelayField.setMinimumSize(new java.awt.Dimension(10, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        dirTimestampDiffFieldPanel1.add(realtimeSyncDelayField, gridBagConstraints);

        dirTimestampDiffLabel3.setText("seconds");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirTimestampDiffFieldPanel1.add(dirTimestampDiffLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        realTimeSyncPanel.add(dirTimestampDiffFieldPanel1, gridBagConstraints);

        jPanel85.setLayout(new java.awt.GridBagLayout());

        ignoreDaylightSavingTimeJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/start.png"))); // NOI18N
        ignoreDaylightSavingTimeJLabel1.setText("Enable realtime synchronization");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel85.add(ignoreDaylightSavingTimeJLabel1, gridBagConstraints);

        realtimeSyncCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        realtimeSyncCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        realtimeSyncCheckBox.addActionListener(this::realtimeSyncCheckBoxActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel85.add(realtimeSyncCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        realTimeSyncPanel.add(jPanel85, gridBagConstraints);

        jPanel82.setLayout(new java.awt.GridBagLayout());

        dirTimestampWriteBackLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_sync.png"))); // NOI18N
        dirTimestampWriteBackLabel3.setText("Synchronize on start");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel82.add(dirTimestampWriteBackLabel3, gridBagConstraints);

        realtimeSyncOnStartCheckBox.setToolTipText("<html>The timestamp of the destination file would be written back to the source file.<br>The next time you synchronize this file with the \"Modified\" option it will not be copied again because both files have the same timestamp.<br /> This is useful when synchronizing to slow media (like zip drives).</html>");
        realtimeSyncOnStartCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel82.add(realtimeSyncOnStartCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        realTimeSyncPanel.add(jPanel82, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        advancedTab.add(realTimeSyncPanel, gridBagConstraints);

        jobTabbedPane.addTab("Advanced", advancedTab);

        actionsTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        actionsTab.setLayout(new java.awt.GridBagLayout());

        settingsActionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Job settings"));
        settingsActionsPanel.setLayout(new java.awt.GridBagLayout());

        copySettingsToAllJobsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        copySettingsToAllJobsLabel.setText("Copy the settings of this job (except the paths) to all jobs:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        settingsActionsPanel.add(copySettingsToAllJobsLabel, gridBagConstraints);

        copySettingsToAllJobsGoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        copySettingsToAllJobsGoButton.setText("Go");
        copySettingsToAllJobsGoButton.setAlignmentX(0.5F);
        copySettingsToAllJobsGoButton.addActionListener(this::copySettingsToAllJobsGoButtonActionPerformed);
        settingsActionsPanel.add(copySettingsToAllJobsGoButton, new java.awt.GridBagConstraints());

        resetJobSettingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        resetJobSettingsLabel.setText("Reset the  settings of this job (except the paths) to inital default values:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        settingsActionsPanel.add(resetJobSettingsLabel, gridBagConstraints);

        resetJobSettingsGoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        resetJobSettingsGoButton.setText("Go");
        resetJobSettingsGoButton.setAlignmentX(0.5F);
        resetJobSettingsGoButton.addActionListener(this::resetJobSettingsGoButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        settingsActionsPanel.add(resetJobSettingsGoButton, gridBagConstraints);

        copySettingsToEnabledlJobsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        copySettingsToEnabledlJobsLabel.setText("Copy the settings of this job (except the paths) to enabled jobs:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        settingsActionsPanel.add(copySettingsToEnabledlJobsLabel, gridBagConstraints);

        copySettingsToEnabledJobsGoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        copySettingsToEnabledJobsGoButton.setText("Go");
        copySettingsToEnabledJobsGoButton.setAlignmentX(0.5F);
        copySettingsToEnabledJobsGoButton.addActionListener(this::copySettingsToEnabledJobsGoButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        settingsActionsPanel.add(copySettingsToEnabledJobsGoButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        settingsActionsPanel.add(spacer16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        actionsTab.add(settingsActionsPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        actionsTab.add(spacer14, gridBagConstraints);

        informationPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel7.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel7.setLayout(new java.awt.GridBagLayout());

        jTextPane8.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextPane8.setContentType("text/html"); // NOI18N
        jTextPane8.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may copy the job settings, except the paths, to all existing or enabled jobs. You may also reset the job settings (except the paths) to initial default settings for a job.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jTextPane8.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel7.add(jTextPane8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        actionsTab.add(informationPanel7, gridBagConstraints);

        jobTabbedPane.addTab("Actions", actionsTab);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jobTabbedPane, gridBagConstraints);

        settingsButtonsPanel2.setMaximumSize(new java.awt.Dimension(0, 0));
        settingsButtonsPanel2.setLayout(new javax.swing.BoxLayout(settingsButtonsPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jobOKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        jobOKButton.setText("OK");
        jobOKButton.setAlignmentX(0.5F);
        jobOKButton.setMaximumSize(null);
        jobOKButton.setMinimumSize(null);
        jobOKButton.setPreferredSize(null);
        jobOKButton.addActionListener(this::jobOKButtonActionPerformed);
        settingsButtonsPanel2.add(jobOKButton);

        jobCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jobCancelButton.setText("Cancel");
        jobCancelButton.setAlignmentX(0.5F);
        jobCancelButton.setMaximumSize(null);
        jobCancelButton.setMinimumSize(null);
        jobCancelButton.setPreferredSize(null);
        jobCancelButton.addActionListener(this::jobCancelButtoncancelActionPerformed);
        settingsButtonsPanel2.add(jobCancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(settingsButtonsPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>

    private void dirLogBrowseButtonbrowseSrcActionPerformed(java.awt.event.ActionEvent evt) {
        browseLog();
    }

    private void dirDstChangeButtonbrowseDstActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.browseFolder(this, dirDstField);
    }

    private void dirCopyLargerCheckBoxdirEventActionPerformed(java.awt.event.ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirCopyModifiedCheckBoxdirEventActionPerformed(java.awt.event.ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirCopyLargerModifiedCheckBoxdirEventActionPerformed(java.awt.event.ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirSrcChangeButtonbrowseSrcActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.browseFolder(this, dirSrcField);
    }

    private void dirBackupDirChangeButtonbrowseSrcActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.browseFolder(this, dirBackupDirField);
    }

    private void dirEnableLoggingCheckBoxdirEventActionPerformed(java.awt.event.ActionEvent evt) {
        jobEnableLoggingCheckBoxClicked();
    }

    private void jobOKButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // If no focus -> a fields has blocked applying settings
        if (jobOKButton.hasFocus()) {
            applyJobSettings();
            this.setVisible(false);
        }
    }

    private void jobCancelButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void dirCopyNewCheckBoxdirEventActionPerformed(java.awt.event.ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void dirCopyAllCheckBoxdirEventActionPerformed(java.awt.event.ActionEvent evt) {
        verifyCopyOptionsInGUI();
    }

    private void copySettingsToAllJobsGoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        copyOptionsToAllJobs();
    }

    private void resetJobSettingsGoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        resetJobSettings();
    }

    private void copySettingsToEnabledJobsGoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        copyOptionsToEnabledJobs();
    }

    private void filtersCollapseAllButtondisableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.collapseAll(filtersTree);
    }

    private void filtersExpandAllButtonenableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.expandAll(filtersTree);
    }

    private void removeFilterButtonlistRemoveActionPerformed(java.awt.event.ActionEvent evt) {
        removeFilter();
    }

    private void editFilterButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {
        openEditFilterDialog();
    }

    private void addFilterButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {
        openAddFilterDialog();
    }

    private void addScheduleButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {
        openAddScheduleDialog();
    }

    private void editScheduleButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {
        openEditScheduleDialog();
    }

    private void removeScheduleButtonlistRemoveActionPerformed(java.awt.event.ActionEvent evt) {
        removeSchedule();
    }

    private void scheduleExpandAllButtonenableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.expandOneLevel(scheduleTree);
    }

    private void scheduleCollapseAllButtondisableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {
        GuiTools.collapseAll(scheduleTree);
    }

    private void swapButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String s = dirSrcField.getText();
        dirSrcField.setText(dirDstField.getText());
        dirDstField.setText(s);
    }

    private void realtimeSyncCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        adjustRealtimeSyncOptions();
    }

    private void syncModeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {
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
