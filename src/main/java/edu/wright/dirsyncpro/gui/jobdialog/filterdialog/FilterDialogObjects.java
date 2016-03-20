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
package edu.wright.dirsyncpro.gui.jobdialog.filterdialog;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.gui.swing.MyJTabbedPane;
import edu.wright.dirsyncpro.gui.verifier.DateTimeVerifier;
import edu.wright.dirsyncpro.gui.verifier.LongIntVerifier;
import edu.wright.dirsyncpro.gui.verifier.PathVerifier;
import edu.wright.dirsyncpro.gui.verifier.PatternVerifier;
import edu.wright.dirsyncpro.gui.verifier.PermissionNumberVerifier;
import edu.wright.dirsyncpro.tools.GuiTools;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class FilterDialogObjects extends javax.swing.JDialog {

    protected javax.swing.JLabel archiveAtttributeJLabel;

    /**
     * Creates new form GuiObjects
     */
//    public GuiObjects() {
//       initComponents();
//    }
    protected javax.swing.JLabel dirFileIncludeLabel;
    protected javax.swing.JLabel dirFileIncludeLabel1;
    protected javax.swing.JLabel dirFileIncludeLabel2;
    protected javax.swing.JCheckBox filtersArchiveAttributeCheckBox;
    protected javax.swing.JLabel filtersByDateLabel;
    protected javax.swing.JRadioButton filtersByDateRadioButton;
    protected javax.swing.JLabel filtersByFileAttributeLabel;
    protected javax.swing.JRadioButton filtersByFileAttributeRadioButton;
    protected javax.swing.JLabel filtersByFileOwnershipLabel;
    protected javax.swing.JRadioButton filtersByFileOwnershipRadioButton;
    protected javax.swing.JLabel filtersByFilePermissionsLabel;
    protected javax.swing.JRadioButton filtersByFilePermissionsRadioButton;
    protected javax.swing.JLabel filtersByFileSizeLabel;
    protected javax.swing.JRadioButton filtersByFileSizeRadioButton;
    protected javax.swing.JLabel filtersByPathLabel;
    protected javax.swing.JRadioButton filtersByPathRadioButton;
    protected javax.swing.JLabel filtersByPatternLabel;
    protected javax.swing.JRadioButton filtersByPatternRadioButton;
    protected javax.swing.JButton filtersCancelButton;
    protected javax.swing.JRadioButton filtersDateModeSpecificTimeRadioButton;
    protected javax.swing.JRadioButton filtersDateModeTimeUnitRadioButton;
    protected javax.swing.JLabel filtersDateSpecificTimeJLabelAfter;
    protected javax.swing.JFormattedTextField filtersDateTextField;
    protected javax.swing.JComboBox filtersDateTimeUnitComboBox;
    protected javax.swing.JFormattedTextField filtersDateTimeUnitField;
    protected javax.swing.JLabel filtersDateTimeUnitJLabelAfter;
    protected javax.swing.JRadioButton filtersDirPatternRadioButton;
    protected javax.swing.JRadioButton filtersEarlierDateRadioButton;
    protected javax.swing.JRadioButton filtersExactFileSizeRadioButton;
    protected javax.swing.JRadioButton filtersExcludeRadioButton;
    protected javax.swing.JRadioButton filtersFilePatternRadioButton;
    protected javax.swing.JTextField filtersFileSizeField;
    protected javax.swing.JTextField filtersGroupFilterField;
    protected javax.swing.JCheckBox filtersHiddenAttributeCheckBox;
    protected javax.swing.JRadioButton filtersIncludeRadioButton;
    protected javax.swing.JRadioButton filtersLargerFileSizeRadioButton;
    protected javax.swing.JRadioButton filtersLaterDateRadioButton;
    protected javax.swing.JButton filtersOKButton;
    protected javax.swing.JTextField filtersOwnerFilterField;
    protected javax.swing.JTextField filtersPathFilterField;
    protected javax.swing.JTextField filtersPatternField;
    protected javax.swing.JTextField filtersPermissionFilterField;
    protected javax.swing.JCheckBox filtersPermissionFilterGRCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterGWCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterGXCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterORCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterOWCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterOXCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterURCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterUWCheckBox;
    protected javax.swing.JCheckBox filtersPermissionFilterUXCheckBox;
    protected javax.swing.JCheckBox filtersReadOnlyAttributeCheckBox;
    protected javax.swing.JCheckBox filtersRegularExpressionCheckBox;
    protected javax.swing.JRadioButton filtersSameDateRadioButton;
    protected javax.swing.JRadioButton filtersSmallerFileSizeRadioButton;
    protected javax.swing.JCheckBox filtersSystemAttributeCheckBox;
    protected javax.swing.JTabbedPane filtersTabbedPane;
    protected javax.swing.JLabel hiddenAttributeJLabel;
    protected javax.swing.JButton pathFilterBrowseButton;
    protected javax.swing.JLabel pathFilterJLabel;
    protected javax.swing.JLabel pathFilterJLabel2;
    protected javax.swing.JLabel pathFilterJLabel3;
    protected javax.swing.JLabel permissionFilterJLabel;
    protected javax.swing.JLabel permissionFilterJLabel1;
    protected javax.swing.JLabel permissionFilterJLabel2;
    protected javax.swing.JLabel permissionFilterJLabel3;
    protected javax.swing.JLabel permissionFilterJLabel4;
    protected javax.swing.JLabel permissionFilterJLabel5;
    protected javax.swing.JLabel permissionFilterJLabel6;
    protected javax.swing.JLabel readOnlyAttributeJLabel;
    protected javax.swing.JLabel regularExpressionJLabel;
    protected javax.swing.JLabel systemAtttributeJLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Spacer11;
    private javax.swing.JPanel Spacer13;
    private javax.swing.JPanel Spacer15;
    private javax.swing.JPanel Spacer27;
    private javax.swing.JPanel Spacer28;
    private javax.swing.JPanel Spacer29;
    private javax.swing.JPanel Spacer30;
    private javax.swing.JPanel Spacer31;
    private javax.swing.JPanel Spacer32;
    private javax.swing.JPanel Spacer33;
    private javax.swing.JPanel Spacer9;
    private javax.swing.ButtonGroup buttonGroupFilterDate;
    private javax.swing.ButtonGroup buttonGroupFilterDateMode;
    private javax.swing.ButtonGroup buttonGroupFilterFileDir;
    private javax.swing.ButtonGroup buttonGroupFilterFileSize;
    private javax.swing.ButtonGroup buttonGroupFilterIncludeExclude;
    private javax.swing.ButtonGroup buttonGroupFilterType;
    private javax.swing.JPanel dirIncludeAndExcludeFilesPanel1;
    private javax.swing.JPanel dirIncludeAndExcludeFilesPanel8;
    private javax.swing.JPanel fileattributesJPanel;
    private javax.swing.JPanel filtersButtonsPanel;
    private javax.swing.JPanel inExcludeJPanel;
    private javax.swing.JPanel inExcludeJPanel1;
    private javax.swing.JPanel inExcludeJPanel2;
    private javax.swing.JPanel inExcludeJPanel3;
    private javax.swing.JPanel inExcludeJPanel4;
    private javax.swing.JPanel informationPanel12;
    private javax.swing.JPanel informationPanel13;
    private javax.swing.JPanel informationPanel14;
    private javax.swing.JPanel informationPanel22;
    private javax.swing.JPanel informationPanel23;
    private javax.swing.JPanel informationPanel24;
    private javax.swing.JPanel informationPanel25;
    private javax.swing.JPanel informationPanel26;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JTextPane jTextPane13;
    private javax.swing.JTextPane jTextPane14;
    private javax.swing.JTextPane jTextPane15;
    private javax.swing.JTextPane jTextPane23;
    private javax.swing.JTextPane jTextPane24;
    private javax.swing.JTextPane jTextPane25;
    private javax.swing.JTextPane jTextPane26;
    private javax.swing.JTextPane jTextPane27;
    private javax.swing.JLabel lookNfeelLabel2;
    private javax.swing.JLabel lookNfeelLabel3;
    private javax.swing.JPanel lookNfeelPanel1;
    private javax.swing.JPanel patternFilterPanel;
    public FilterDialogObjects(JDialog dialog) {
        super(dialog);
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupFilterType = new javax.swing.ButtonGroup();
        buttonGroupFilterIncludeExclude = new javax.swing.ButtonGroup();
        buttonGroupFilterFileDir = new javax.swing.ButtonGroup();
        buttonGroupFilterFileSize = new javax.swing.ButtonGroup();
        buttonGroupFilterDate = new javax.swing.ButtonGroup();
        buttonGroupFilterDateMode = new javax.swing.ButtonGroup();
        filtersTabbedPane = new MyJTabbedPane();
        javax.swing.JPanel basicFilterJPanel = new javax.swing.JPanel();
        lookNfeelPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lookNfeelLabel2 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        filtersByPatternRadioButton = new javax.swing.JRadioButton();
        filtersByPatternLabel = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        filtersByFileSizeRadioButton = new javax.swing.JRadioButton();
        filtersByFileSizeLabel = new javax.swing.JLabel();
        jPanel104 = new javax.swing.JPanel();
        filtersByPathRadioButton = new javax.swing.JRadioButton();
        filtersByPathLabel = new javax.swing.JLabel();
        jPanel105 = new javax.swing.JPanel();
        filtersByFileAttributeRadioButton = new javax.swing.JRadioButton();
        filtersByFileAttributeLabel = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        filtersByFileOwnershipRadioButton = new javax.swing.JRadioButton();
        filtersByFileOwnershipLabel = new javax.swing.JLabel();
        jPanel107 = new javax.swing.JPanel();
        filtersByFilePermissionsRadioButton = new javax.swing.JRadioButton();
        filtersByFilePermissionsLabel = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        filtersByDateRadioButton = new javax.swing.JRadioButton();
        filtersByDateLabel = new javax.swing.JLabel();
        Spacer13 = new javax.swing.JPanel();
        informationPanel13 = new javax.swing.JPanel();
        jTextPane14 = new javax.swing.JTextPane();
        jTextPane14.setEditorKit(GuiTools.getDefaultEditorKit());
        inExcludeJPanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        lookNfeelLabel3 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        filtersIncludeRadioButton = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        filtersExcludeRadioButton = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        javax.swing.JPanel patternFilterJPanel = new javax.swing.JPanel();
        Spacer11 = new javax.swing.JPanel();
        informationPanel12 = new javax.swing.JPanel();
        jTextPane13 = new javax.swing.JTextPane();
        jTextPane13.setEditorKit(GuiTools.getDefaultEditorKit());
        patternFilterPanel = new javax.swing.JPanel();
        dirFileIncludeLabel = new javax.swing.JLabel();
        filtersPatternField = new javax.swing.JTextField();
        inExcludeJPanel1 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        filtersFilePatternRadioButton = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        filtersDirPatternRadioButton = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        filtersRegularExpressionCheckBox = new javax.swing.JCheckBox();
        regularExpressionJLabel = new javax.swing.JLabel();
        javax.swing.JPanel sizeFiltersJPanel = new javax.swing.JPanel();
        Spacer15 = new javax.swing.JPanel();
        informationPanel14 = new javax.swing.JPanel();
        jTextPane15 = new javax.swing.JTextPane();
        jTextPane15.setEditorKit(GuiTools.getDefaultEditorKit());
        dirIncludeAndExcludeFilesPanel1 = new javax.swing.JPanel();
        dirFileIncludeLabel1 = new javax.swing.JLabel();
        filtersFileSizeField = new javax.swing.JTextField();
        inExcludeJPanel2 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        filtersSmallerFileSizeRadioButton = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        filtersExactFileSizeRadioButton = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        filtersLargerFileSizeRadioButton = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        dirFileIncludeLabel2 = new javax.swing.JLabel();
        javax.swing.JPanel dateFiltersJPanel = new javax.swing.JPanel();
        dirIncludeAndExcludeFilesPanel8 = new javax.swing.JPanel();
        inExcludeJPanel4 = new javax.swing.JPanel();
        jPanel108 = new javax.swing.JPanel();
        filtersEarlierDateRadioButton = new javax.swing.JRadioButton();
        jLabel78 = new javax.swing.JLabel();
        jPanel109 = new javax.swing.JPanel();
        filtersSameDateRadioButton = new javax.swing.JRadioButton();
        jLabel79 = new javax.swing.JLabel();
        jPanel110 = new javax.swing.JPanel();
        filtersLaterDateRadioButton = new javax.swing.JRadioButton();
        jLabel80 = new javax.swing.JLabel();
        inExcludeJPanel3 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        filtersDateModeSpecificTimeRadioButton = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        filtersDateModeTimeUnitRadioButton = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        filtersDateTextField = new javax.swing.JFormattedTextField();
        filtersDateSpecificTimeJLabelAfter = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        filtersDateTimeUnitComboBox = new javax.swing.JComboBox();
        filtersDateTimeUnitField = new javax.swing.JFormattedTextField();
        filtersDateTimeUnitJLabelAfter = new javax.swing.JLabel();
        Spacer33 = new javax.swing.JPanel();
        Spacer32 = new javax.swing.JPanel();
        Spacer30 = new javax.swing.JPanel();
        informationPanel26 = new javax.swing.JPanel();
        jTextPane27 = new javax.swing.JTextPane();
        jTextPane27.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel pathFilterJPanel = new javax.swing.JPanel();
        javax.swing.JPanel absoultePathFilterJPanel = new javax.swing.JPanel();
        pathFilterJLabel = new javax.swing.JLabel();
        pathFilterBrowseButton = new javax.swing.JButton();
        filtersPathFilterField = new javax.swing.JTextField();
        Spacer27 = new javax.swing.JPanel();
        informationPanel22 = new javax.swing.JPanel();
        jTextPane23 = new javax.swing.JTextPane();
        jTextPane23.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel attributeFilterJPanel = new javax.swing.JPanel();
        javax.swing.JPanel absoultePathFilterJPanel1 = new javax.swing.JPanel();
        fileattributesJPanel = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        filtersReadOnlyAttributeCheckBox = new javax.swing.JCheckBox();
        readOnlyAttributeJLabel = new javax.swing.JLabel();
        jPanel97 = new javax.swing.JPanel();
        filtersHiddenAttributeCheckBox = new javax.swing.JCheckBox();
        hiddenAttributeJLabel = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        filtersSystemAttributeCheckBox = new javax.swing.JCheckBox();
        systemAtttributeJLabel = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        filtersArchiveAttributeCheckBox = new javax.swing.JCheckBox();
        archiveAtttributeJLabel = new javax.swing.JLabel();
        Spacer9 = new javax.swing.JPanel();
        Spacer28 = new javax.swing.JPanel();
        informationPanel23 = new javax.swing.JPanel();
        jTextPane24 = new javax.swing.JTextPane();
        jTextPane24.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel byGroupFilterJPanel = new javax.swing.JPanel();
        javax.swing.JPanel groupFilterJPanel = new javax.swing.JPanel();
        pathFilterJLabel2 = new javax.swing.JLabel();
        filtersGroupFilterField = new javax.swing.JTextField();
        jPanel102 = new javax.swing.JPanel();
        pathFilterJLabel3 = new javax.swing.JLabel();
        filtersOwnerFilterField = new javax.swing.JTextField();
        Spacer29 = new javax.swing.JPanel();
        informationPanel24 = new javax.swing.JPanel();
        jTextPane25 = new javax.swing.JTextPane();
        jTextPane25.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel byPermissionsFilterJPanel = new javax.swing.JPanel();
        javax.swing.JPanel permissionsFilterJPanel = new javax.swing.JPanel();
        permissionFilterJLabel = new javax.swing.JLabel();
        permissionFilterJLabel1 = new javax.swing.JLabel();
        permissionFilterJLabel2 = new javax.swing.JLabel();
        permissionFilterJLabel3 = new javax.swing.JLabel();
        permissionFilterJLabel4 = new javax.swing.JLabel();
        permissionFilterJLabel5 = new javax.swing.JLabel();
        filtersPermissionFilterURCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterUWCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterUXCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterGRCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterGWCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterGXCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterORCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterOWCheckBox = new javax.swing.JCheckBox();
        filtersPermissionFilterOXCheckBox = new javax.swing.JCheckBox();
        permissionFilterJLabel6 = new javax.swing.JLabel();
        filtersPermissionFilterField = new javax.swing.JTextField();
        jPanel103 = new javax.swing.JPanel();
        Spacer31 = new javax.swing.JPanel();
        informationPanel25 = new javax.swing.JPanel();
        jTextPane26 = new javax.swing.JTextPane();
        jTextPane26.setEditorKit(GuiTools.getDefaultEditorKit());
        filtersButtonsPanel = new javax.swing.JPanel();
        filtersOKButton = new javax.swing.JButton();
        filtersCancelButton = new javax.swing.JButton();

        setTitle("Filter Options");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(500, 550));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        filtersTabbedPane.setMaximumSize(null);
        filtersTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtersTabbedPaneMouseClicked(evt);
            }
        });

        basicFilterJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        basicFilterJPanel.setLayout(new java.awt.GridBagLayout());

        lookNfeelPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter type"));
        lookNfeelPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/filter.png"))); // NOI18N
        jLabel26.setMaximumSize(null);
        jLabel26.setMinimumSize(null);
        jLabel26.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        lookNfeelPanel1.add(jLabel26, gridBagConstraints);

        lookNfeelLabel2.setText("Filter by:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        lookNfeelPanel1.add(lookNfeelLabel2, gridBagConstraints);

        jPanel36.setMaximumSize(null);
        jPanel36.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterType.add(filtersByPatternRadioButton);
        filtersByPatternRadioButton.setMaximumSize(null);
        filtersByPatternRadioButton.setMinimumSize(null);
        filtersByPatternRadioButton.setPreferredSize(null);
        filtersByPatternRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersByPatternRadioButtonActionPerformed(evt);
            }
        });
        jPanel36.add(filtersByPatternRadioButton);

        filtersByPatternLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pattern.png"))); // NOI18N
        filtersByPatternLabel.setText("File/dir pattern");
        jPanel36.add(filtersByPatternLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel1.add(jPanel36, gridBagConstraints);

        jPanel37.setMaximumSize(null);
        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterType.add(filtersByFileSizeRadioButton);
        filtersByFileSizeRadioButton.setMaximumSize(null);
        filtersByFileSizeRadioButton.setMinimumSize(null);
        filtersByFileSizeRadioButton.setPreferredSize(null);
        filtersByFileSizeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersByFileSizeRadioButtonActionPerformed(evt);
            }
        });
        jPanel37.add(filtersByFileSizeRadioButton);

        filtersByFileSizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/smaller.png"))); // NOI18N
        filtersByFileSizeLabel.setText("File size");
        jPanel37.add(filtersByFileSizeLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel1.add(jPanel37, gridBagConstraints);

        jPanel104.setMaximumSize(null);
        jPanel104.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterType.add(filtersByPathRadioButton);
        filtersByPathRadioButton.setMaximumSize(null);
        filtersByPathRadioButton.setMinimumSize(null);
        filtersByPathRadioButton.setPreferredSize(null);
        filtersByPathRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersByPathRadioButtonActionPerformed(evt);
            }
        });
        jPanel104.add(filtersByPathRadioButton);

        filtersByPathLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirBlue.png"))); // NOI18N
        filtersByPathLabel.setText("Path");
        jPanel104.add(filtersByPathLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel1.add(jPanel104, gridBagConstraints);

        jPanel105.setMaximumSize(null);
        jPanel105.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterType.add(filtersByFileAttributeRadioButton);
        filtersByFileAttributeRadioButton.setMaximumSize(null);
        filtersByFileAttributeRadioButton.setMinimumSize(null);
        filtersByFileAttributeRadioButton.setPreferredSize(null);
        filtersByFileAttributeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersByFileAttributeRadioButtonActionPerformed(evt);
            }
        });
        jPanel105.add(filtersByFileAttributeRadioButton);

        filtersByFileAttributeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file.png"))); // NOI18N
        filtersByFileAttributeLabel.setText("File attributes (MS Windows/DOS only)");
        jPanel105.add(filtersByFileAttributeLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel1.add(jPanel105, gridBagConstraints);

        jPanel106.setMaximumSize(null);
        jPanel106.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterType.add(filtersByFileOwnershipRadioButton);
        filtersByFileOwnershipRadioButton.setMaximumSize(null);
        filtersByFileOwnershipRadioButton.setMinimumSize(null);
        filtersByFileOwnershipRadioButton.setPreferredSize(null);
        filtersByFileOwnershipRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersByFileOwnershipRadioButtonActionPerformed(evt);
            }
        });
        jPanel106.add(filtersByFileOwnershipRadioButton);

        filtersByFileOwnershipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N
        filtersByFileOwnershipLabel.setText("File ownership (Posix only)");
        jPanel106.add(filtersByFileOwnershipLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel1.add(jPanel106, gridBagConstraints);

        jPanel107.setMaximumSize(null);
        jPanel107.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterType.add(filtersByFilePermissionsRadioButton);
        filtersByFilePermissionsRadioButton.setMaximumSize(null);
        filtersByFilePermissionsRadioButton.setMinimumSize(null);
        filtersByFilePermissionsRadioButton.setPreferredSize(null);
        filtersByFilePermissionsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersByFilePermissionsRadioButtonActionPerformed(evt);
            }
        });
        jPanel107.add(filtersByFilePermissionsRadioButton);

        filtersByFilePermissionsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/permissions.png"))); // NOI18N
        filtersByFilePermissionsLabel.setText("File Permissions (Posix only)");
        jPanel107.add(filtersByFilePermissionsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel1.add(jPanel107, gridBagConstraints);

        jPanel38.setMaximumSize(null);
        jPanel38.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterType.add(filtersByDateRadioButton);
        filtersByDateRadioButton.setMaximumSize(null);
        filtersByDateRadioButton.setMinimumSize(null);
        filtersByDateRadioButton.setPreferredSize(null);
        filtersByDateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersByDateRadioButtonActionPerformed(evt);
            }
        });
        jPanel38.add(filtersByDateRadioButton);

        filtersByDateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/date.png"))); // NOI18N
        filtersByDateLabel.setText("Date");
        jPanel38.add(filtersByDateLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel1.add(jPanel38, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        basicFilterJPanel.add(lookNfeelPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        basicFilterJPanel.add(Spacer13, gridBagConstraints);

        informationPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel13.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel13.setLayout(new java.awt.GridBagLayout());

        jTextPane14.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane14.setContentType("text/html"); // NOI18N
        jTextPane14.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nChoose here the filter type: by <u>File/dir pattern</u> or by <u>File size</u> after which the corresponding tab will get enabled in which you may define the filter. Choose also if you would like to add a filter to <u>Include</u> or <u>Exclude</u> files/directories.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel13.add(jTextPane14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        basicFilterJPanel.add(informationPanel13, gridBagConstraints);

        inExcludeJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("In-/Exclude"));
        inExcludeJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/filter.png"))); // NOI18N
        jLabel29.setMaximumSize(null);
        jLabel29.setMinimumSize(null);
        jLabel29.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        inExcludeJPanel.add(jLabel29, gridBagConstraints);

        lookNfeelLabel3.setText("What to do:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        inExcludeJPanel.add(lookNfeelLabel3, gridBagConstraints);

        jPanel41.setMaximumSize(null);
        jPanel41.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterIncludeExclude.add(filtersIncludeRadioButton);
        filtersIncludeRadioButton.setMaximumSize(null);
        filtersIncludeRadioButton.setMinimumSize(null);
        filtersIncludeRadioButton.setPreferredSize(null);
        jPanel41.add(filtersIncludeRadioButton);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/includeFile.png"))); // NOI18N
        jLabel30.setText("Include");
        jPanel41.add(jLabel30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel.add(jPanel41, gridBagConstraints);

        jPanel42.setMaximumSize(null);
        jPanel42.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterIncludeExclude.add(filtersExcludeRadioButton);
        filtersExcludeRadioButton.setMaximumSize(null);
        filtersExcludeRadioButton.setMinimumSize(null);
        filtersExcludeRadioButton.setPreferredSize(null);
        jPanel42.add(filtersExcludeRadioButton);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excludeFile.png"))); // NOI18N
        jLabel31.setText("Exclude");
        jPanel42.add(jLabel31);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel.add(jPanel42, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        basicFilterJPanel.add(inExcludeJPanel, gridBagConstraints);

        filtersTabbedPane.addTab("Basics", basicFilterJPanel);

        patternFilterJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        patternFilterJPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        patternFilterJPanel.add(Spacer11, gridBagConstraints);

        informationPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel12.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel12.setLayout(new java.awt.GridBagLayout());

        jTextPane13.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane13.setContentType("text/html"); // NOI18N
        jTextPane13.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here patterns to in-/exclude <u>Files</u> & <u>Directories</u>. The patterns are exactly the same as the wild cards which are used in the file system.\n A pattern should match the whole name of the file or a directory according to your file system or a <u>regular expression</u> if selected here so. By default the include patterns \nare '*' (which means all files/dirs) and exclude patterns are empty (which means nothing to exclude). \nA dir is synced if its name matches the dir include patterns, its name does not match the dir exclusion patterns and its path does not match the dir exclusion patterns. A file is synced if its name matches the file include patterns, \nits name does not match the file exclusion patterns and its path does not match the dir exclusion patterns. You may enter multiple patterns at once by seprating them using semi-column character (e.g. *.gif;*.jpg;*.png). The mutiple patterns will \nbe parsed and split into individual pattern filters when the OK button is clicked.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel12.add(jTextPane13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        patternFilterJPanel.add(informationPanel12, gridBagConstraints);

        patternFilterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pattern"));
        patternFilterPanel.setLayout(new java.awt.GridBagLayout());

        dirFileIncludeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/includeFile.png"))); // NOI18N
        dirFileIncludeLabel.setText("Pattern");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        patternFilterPanel.add(dirFileIncludeLabel, gridBagConstraints);

        filtersPatternField.setInputVerifier(new PatternVerifier(this, filtersPatternField));
        filtersPatternField.setMaximumSize(null);
        filtersPatternField.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.01;
        patternFilterPanel.add(filtersPatternField, gridBagConstraints);

        inExcludeJPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel43.setMaximumSize(null);
        jPanel43.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterFileDir.add(filtersFilePatternRadioButton);
        filtersFilePatternRadioButton.setMaximumSize(null);
        filtersFilePatternRadioButton.setMinimumSize(null);
        filtersFilePatternRadioButton.setPreferredSize(null);
        jPanel43.add(filtersFilePatternRadioButton);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/includeFile.png"))); // NOI18N
        jLabel33.setText("File");
        jPanel43.add(jLabel33);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel1.add(jPanel43, gridBagConstraints);

        jPanel45.setMaximumSize(null);
        jPanel45.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterFileDir.add(filtersDirPatternRadioButton);
        filtersDirPatternRadioButton.setMaximumSize(null);
        filtersDirPatternRadioButton.setMinimumSize(null);
        filtersDirPatternRadioButton.setPreferredSize(null);
        jPanel45.add(filtersDirPatternRadioButton);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/includeDir.png"))); // NOI18N
        jLabel36.setText("Directory");
        jPanel45.add(jLabel36);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel1.add(jPanel45, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        patternFilterPanel.add(inExcludeJPanel1, gridBagConstraints);

        jPanel26.setMaximumSize(null);
        jPanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        filtersRegularExpressionCheckBox.setMaximumSize(null);
        filtersRegularExpressionCheckBox.setMinimumSize(null);
        filtersRegularExpressionCheckBox.setPreferredSize(null);
        filtersRegularExpressionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersRegularExpressionCheckBoxActionPerformed(evt);
            }
        });
        jPanel26.add(filtersRegularExpressionCheckBox);

        regularExpressionJLabel.setText("Regular Expression");
        jPanel26.add(regularExpressionJLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        patternFilterPanel.add(jPanel26, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        patternFilterJPanel.add(patternFilterPanel, gridBagConstraints);

        filtersTabbedPane.addTab("By Pattern", patternFilterJPanel);

        sizeFiltersJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        sizeFiltersJPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        sizeFiltersJPanel.add(Spacer15, gridBagConstraints);

        informationPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel14.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel14.setLayout(new java.awt.GridBagLayout());

        jTextPane15.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane15.setContentType("text/html"); // NOI18N
        jTextPane15.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou can define here a filter to include/exclude files based on their sizes. A file size is checked to be smaller than, larger than or same as the file size defined.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel14.add(jTextPane15, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        sizeFiltersJPanel.add(informationPanel14, gridBagConstraints);

        dirIncludeAndExcludeFilesPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("File Size"));
        dirIncludeAndExcludeFilesPanel1.setLayout(new java.awt.GridBagLayout());

        dirFileIncludeLabel1.setText("bytes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel1.add(dirFileIncludeLabel1, gridBagConstraints);

        filtersFileSizeField.setInputVerifier(new LongIntVerifier(this, filtersFileSizeField, 0, Long.MAX_VALUE));
        filtersFileSizeField.setMaximumSize(null);
        filtersFileSizeField.setMinimumSize(new java.awt.Dimension(6, 100));
        filtersFileSizeField.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel1.add(filtersFileSizeField, gridBagConstraints);

        inExcludeJPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel46.setMaximumSize(null);
        jPanel46.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterFileSize.add(filtersSmallerFileSizeRadioButton);
        filtersSmallerFileSizeRadioButton.setMaximumSize(null);
        filtersSmallerFileSizeRadioButton.setMinimumSize(null);
        filtersSmallerFileSizeRadioButton.setPreferredSize(null);
        jPanel46.add(filtersSmallerFileSizeRadioButton);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/smaller.png"))); // NOI18N
        jLabel37.setText("Smaller than:");
        jPanel46.add(jLabel37);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel2.add(jPanel46, gridBagConstraints);

        jPanel47.setMaximumSize(null);
        jPanel47.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterFileSize.add(filtersExactFileSizeRadioButton);
        filtersExactFileSizeRadioButton.setMaximumSize(null);
        filtersExactFileSizeRadioButton.setMinimumSize(null);
        filtersExactFileSizeRadioButton.setPreferredSize(null);
        jPanel47.add(filtersExactFileSizeRadioButton);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sameSize.png"))); // NOI18N
        jLabel39.setText("Exactly:");
        jPanel47.add(jLabel39);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel2.add(jPanel47, gridBagConstraints);

        jPanel49.setMaximumSize(null);
        jPanel49.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterFileSize.add(filtersLargerFileSizeRadioButton);
        filtersLargerFileSizeRadioButton.setMaximumSize(null);
        filtersLargerFileSizeRadioButton.setMinimumSize(null);
        filtersLargerFileSizeRadioButton.setPreferredSize(null);
        jPanel49.add(filtersLargerFileSizeRadioButton);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/larger.png"))); // NOI18N
        jLabel40.setText("Larger than:");
        jPanel49.add(jLabel40);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel2.add(jPanel49, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        dirIncludeAndExcludeFilesPanel1.add(inExcludeJPanel2, gridBagConstraints);

        dirFileIncludeLabel2.setText("Size:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel1.add(dirFileIncludeLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        sizeFiltersJPanel.add(dirIncludeAndExcludeFilesPanel1, gridBagConstraints);

        filtersTabbedPane.addTab("By Size", sizeFiltersJPanel);

        dateFiltersJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        dateFiltersJPanel.setLayout(new java.awt.GridBagLayout());

        dirIncludeAndExcludeFilesPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Files/Directories modified"));
        dirIncludeAndExcludeFilesPanel8.setLayout(new java.awt.GridBagLayout());

        inExcludeJPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel108.setMaximumSize(null);
        jPanel108.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterDate.add(filtersEarlierDateRadioButton);
        filtersEarlierDateRadioButton.setMaximumSize(null);
        filtersEarlierDateRadioButton.setMinimumSize(null);
        filtersEarlierDateRadioButton.setPreferredSize(null);
        jPanel108.add(filtersEarlierDateRadioButton);

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/smaller.png"))); // NOI18N
        jLabel78.setText("Earlier than:");
        jPanel108.add(jLabel78);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel4.add(jPanel108, gridBagConstraints);

        jPanel109.setMaximumSize(null);
        jPanel109.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterDate.add(filtersSameDateRadioButton);
        filtersSameDateRadioButton.setMaximumSize(null);
        filtersSameDateRadioButton.setMinimumSize(null);
        filtersSameDateRadioButton.setPreferredSize(null);
        jPanel109.add(filtersSameDateRadioButton);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sameSize.png"))); // NOI18N
        jLabel79.setText("Exactly on:");
        jPanel109.add(jLabel79);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel4.add(jPanel109, gridBagConstraints);

        jPanel110.setMaximumSize(null);
        jPanel110.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterDate.add(filtersLaterDateRadioButton);
        filtersLaterDateRadioButton.setMaximumSize(null);
        filtersLaterDateRadioButton.setMinimumSize(null);
        filtersLaterDateRadioButton.setPreferredSize(null);
        jPanel110.add(filtersLaterDateRadioButton);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/larger.png"))); // NOI18N
        jLabel80.setText("Later than:");
        jPanel110.add(jLabel80);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel4.add(jPanel110, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel8.add(inExcludeJPanel4, gridBagConstraints);

        inExcludeJPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel44.setMaximumSize(null);
        jPanel44.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterDateMode.add(filtersDateModeSpecificTimeRadioButton);
        filtersDateModeSpecificTimeRadioButton.setMaximumSize(null);
        filtersDateModeSpecificTimeRadioButton.setMinimumSize(null);
        filtersDateModeSpecificTimeRadioButton.setPreferredSize(null);
        filtersDateModeSpecificTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersDateModeSpecificTimeRadioButtonActionPerformed(evt);
            }
        });
        jPanel44.add(filtersDateModeSpecificTimeRadioButton);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1day.png"))); // NOI18N
        jLabel34.setText("Specific time");
        jPanel44.add(jLabel34);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel3.add(jPanel44, gridBagConstraints);

        jPanel48.setMaximumSize(null);
        jPanel48.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupFilterDateMode.add(filtersDateModeTimeUnitRadioButton);
        filtersDateModeTimeUnitRadioButton.setMaximumSize(null);
        filtersDateModeTimeUnitRadioButton.setMinimumSize(null);
        filtersDateModeTimeUnitRadioButton.setPreferredSize(null);
        filtersDateModeTimeUnitRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersDateModeTimeUnitRadioButtonActionPerformed(evt);
            }
        });
        jPanel48.add(filtersDateModeTimeUnitRadioButton);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/date.png"))); // NOI18N
        jLabel35.setText("Time unit");
        jPanel48.add(jLabel35);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel3.add(jPanel48, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        filtersDateTextField.setColumns(12);
        filtersDateTextField.setText("01-01-2010  00:00");
        filtersDateTextField.setInputVerifier(new DateTimeVerifier(this, filtersDateTextField));
        filtersDateTextField.setMinimumSize(new java.awt.Dimension(96, 20));
        filtersDateTextField.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffiltersDateTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(filtersDateTextField, gridBagConstraints);

        filtersDateSpecificTimeJLabelAfter.setText("(dd-MM-yyyy HH:mm)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        jPanel1.add(filtersDateSpecificTimeJLabelAfter, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        inExcludeJPanel3.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        filtersDateTimeUnitComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        jPanel2.add(filtersDateTimeUnitComboBox, gridBagConstraints);

        filtersDateTimeUnitField.setColumns(4);
        filtersDateTimeUnitField.setText("0");
        filtersDateTimeUnitField.setInputVerifier(new LongIntVerifier(this, filtersDateTimeUnitField, 0, Long.MAX_VALUE));
        filtersDateTimeUnitField.setMinimumSize(new java.awt.Dimension(40, 20));
        filtersDateTimeUnitField.setName(""); // NOI18N
        filtersDateTimeUnitField.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffiltersDateTimeUnitFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(filtersDateTimeUnitField, gridBagConstraints);

        filtersDateTimeUnitJLabelAfter.setText("ago");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        jPanel2.add(filtersDateTimeUnitJLabelAfter, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        inExcludeJPanel3.add(jPanel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        inExcludeJPanel3.add(Spacer33, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        dirIncludeAndExcludeFilesPanel8.add(inExcludeJPanel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        dirIncludeAndExcludeFilesPanel8.add(Spacer32, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        dateFiltersJPanel.add(dirIncludeAndExcludeFilesPanel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        dateFiltersJPanel.add(Spacer30, gridBagConstraints);

        informationPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel26.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel26.setLayout(new java.awt.GridBagLayout());

        jTextPane27.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane27.setContentType("text/html"); // NOI18N
        jTextPane27.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou can define here a filter to include/exclude files/directories based on their modification date. A modification date is checked to be earlier than, later than or exactly on a specific time \nor a given time unit (like 10 days ago).\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel26.add(jTextPane27, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        dateFiltersJPanel.add(informationPanel26, gridBagConstraints);

        filtersTabbedPane.addTab("By Date", dateFiltersJPanel);

        pathFilterJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pathFilterJPanel.setLayout(new java.awt.GridBagLayout());

        absoultePathFilterJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Path"));
        absoultePathFilterJPanel.setEnabled(false);
        absoultePathFilterJPanel.setLayout(new java.awt.GridBagLayout());

        pathFilterJLabel.setText("File/dir: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        absoultePathFilterJPanel.add(pathFilterJLabel, gridBagConstraints);

        pathFilterBrowseButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pathFilterBrowseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        pathFilterBrowseButton.setToolTipText("Browse");
        pathFilterBrowseButton.setIconTextGap(2);
        pathFilterBrowseButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        pathFilterBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathFilterBrowseButtonbrowseSrcActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        absoultePathFilterJPanel.add(pathFilterBrowseButton, gridBagConstraints);

        filtersPathFilterField.setEnabled(false);
        filtersPathFilterField.setInputVerifier(new PathVerifier(this, filtersPathFilterField));
        filtersPathFilterField.setMaximumSize(null);
        filtersPathFilterField.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        absoultePathFilterJPanel.add(filtersPathFilterField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pathFilterJPanel.add(absoultePathFilterJPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        pathFilterJPanel.add(Spacer27, gridBagConstraints);

        informationPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel22.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel22.setLayout(new java.awt.GridBagLayout());

        jTextPane23.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane23.setContentType("text/html"); // NOI18N
        jTextPane23.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nIf you would like to include or exlude a specific <u>file</u> or a <u>directory</u>, you may select here the absolute <u>path</u> to it. Please pay attention when combining an 'absolute path inclusion' with 'pattern inclusion'. The combination could be pretty complicated to understand the behavior.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel22.add(jTextPane23, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pathFilterJPanel.add(informationPanel22, gridBagConstraints);

        filtersTabbedPane.addTab("By Path", pathFilterJPanel);

        attributeFilterJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        attributeFilterJPanel.setLayout(new java.awt.GridBagLayout());

        absoultePathFilterJPanel1.setEnabled(false);
        absoultePathFilterJPanel1.setLayout(new java.awt.GridLayout(1, 0));

        fileattributesJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("File attributes (MS Windows)"));
        fileattributesJPanel.setLayout(new java.awt.GridBagLayout());

        jPanel25.setMaximumSize(null);
        jPanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        filtersReadOnlyAttributeCheckBox.setMaximumSize(null);
        filtersReadOnlyAttributeCheckBox.setMinimumSize(null);
        filtersReadOnlyAttributeCheckBox.setPreferredSize(null);
        jPanel25.add(filtersReadOnlyAttributeCheckBox);

        readOnlyAttributeJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        readOnlyAttributeJLabel.setText("Read only");
        jPanel25.add(readOnlyAttributeJLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        fileattributesJPanel.add(jPanel25, gridBagConstraints);

        jPanel97.setMaximumSize(null);
        jPanel97.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        filtersHiddenAttributeCheckBox.setMaximumSize(null);
        filtersHiddenAttributeCheckBox.setMinimumSize(null);
        filtersHiddenAttributeCheckBox.setPreferredSize(null);
        jPanel97.add(filtersHiddenAttributeCheckBox);

        hiddenAttributeJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        hiddenAttributeJLabel.setText("Hidden");
        jPanel97.add(hiddenAttributeJLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        fileattributesJPanel.add(jPanel97, gridBagConstraints);

        jPanel98.setMaximumSize(null);
        jPanel98.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        filtersSystemAttributeCheckBox.setMaximumSize(null);
        filtersSystemAttributeCheckBox.setMinimumSize(null);
        filtersSystemAttributeCheckBox.setPreferredSize(null);
        jPanel98.add(filtersSystemAttributeCheckBox);

        systemAtttributeJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        systemAtttributeJLabel.setText("System");
        jPanel98.add(systemAtttributeJLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        fileattributesJPanel.add(jPanel98, gridBagConstraints);

        jPanel101.setMaximumSize(null);
        jPanel101.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        filtersArchiveAttributeCheckBox.setMaximumSize(null);
        filtersArchiveAttributeCheckBox.setMinimumSize(null);
        filtersArchiveAttributeCheckBox.setPreferredSize(null);
        jPanel101.add(filtersArchiveAttributeCheckBox);

        archiveAtttributeJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        archiveAtttributeJLabel.setText("Archive");
        jPanel101.add(archiveAtttributeJLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        fileattributesJPanel.add(jPanel101, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        fileattributesJPanel.add(Spacer9, gridBagConstraints);

        absoultePathFilterJPanel1.add(fileattributesJPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        attributeFilterJPanel.add(absoultePathFilterJPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        attributeFilterJPanel.add(Spacer28, gridBagConstraints);

        informationPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel23.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel23.setLayout(new java.awt.GridBagLayout());

        jTextPane24.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane24.setContentType("text/html"); // NOI18N
        jTextPane24.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here a filter to include/exclude files based on the file attributes (MS Windows/DOS only).\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel23.add(jTextPane24, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        attributeFilterJPanel.add(informationPanel23, gridBagConstraints);

        filtersTabbedPane.addTab("By Attribute", attributeFilterJPanel);

        byGroupFilterJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        byGroupFilterJPanel.setLayout(new java.awt.GridBagLayout());

        groupFilterJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ownership (Posix)"));
        groupFilterJPanel.setLayout(new java.awt.GridBagLayout());

        pathFilterJLabel2.setText("Group:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        groupFilterJPanel.add(pathFilterJLabel2, gridBagConstraints);

        filtersGroupFilterField.setMaximumSize(null);
        filtersGroupFilterField.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        groupFilterJPanel.add(filtersGroupFilterField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        groupFilterJPanel.add(jPanel102, gridBagConstraints);

        pathFilterJLabel3.setText("Owner:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        groupFilterJPanel.add(pathFilterJLabel3, gridBagConstraints);

        filtersOwnerFilterField.setMaximumSize(null);
        filtersOwnerFilterField.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        groupFilterJPanel.add(filtersOwnerFilterField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        byGroupFilterJPanel.add(groupFilterJPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        byGroupFilterJPanel.add(Spacer29, gridBagConstraints);

        informationPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel24.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel24.setLayout(new java.awt.GridBagLayout());

        jTextPane25.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane25.setContentType("text/html"); // NOI18N
        jTextPane25.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here a filter to include files/directories based on the file ownerships. You may define either an owner, a group or both. This filter will be applied only on Posix systems (like Linux).\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel24.add(jTextPane25, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        byGroupFilterJPanel.add(informationPanel24, gridBagConstraints);

        filtersTabbedPane.addTab("By Ownership", byGroupFilterJPanel);

        byPermissionsFilterJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        byPermissionsFilterJPanel.setLayout(new java.awt.GridBagLayout());

        permissionsFilterJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("FIie Permissions (Posix)"));
        permissionsFilterJPanel.setLayout(new java.awt.GridBagLayout());

        permissionFilterJLabel.setText("r");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        permissionsFilterJPanel.add(permissionFilterJLabel, gridBagConstraints);

        permissionFilterJLabel1.setText("w");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        permissionsFilterJPanel.add(permissionFilterJLabel1, gridBagConstraints);

        permissionFilterJLabel2.setText("User:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        permissionsFilterJPanel.add(permissionFilterJLabel2, gridBagConstraints);

        permissionFilterJLabel3.setText("Group:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        permissionsFilterJPanel.add(permissionFilterJLabel3, gridBagConstraints);

        permissionFilterJLabel4.setText("Public:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        permissionsFilterJPanel.add(permissionFilterJLabel4, gridBagConstraints);

        permissionFilterJLabel5.setText("x");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        permissionsFilterJPanel.add(permissionFilterJLabel5, gridBagConstraints);

        filtersPermissionFilterURCheckBox.setMaximumSize(null);
        filtersPermissionFilterURCheckBox.setMinimumSize(null);
        filtersPermissionFilterURCheckBox.setPreferredSize(null);
        filtersPermissionFilterURCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        permissionsFilterJPanel.add(filtersPermissionFilterURCheckBox, gridBagConstraints);

        filtersPermissionFilterUWCheckBox.setMaximumSize(null);
        filtersPermissionFilterUWCheckBox.setMinimumSize(null);
        filtersPermissionFilterUWCheckBox.setPreferredSize(null);
        filtersPermissionFilterUWCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        permissionsFilterJPanel.add(filtersPermissionFilterUWCheckBox, gridBagConstraints);

        filtersPermissionFilterUXCheckBox.setMaximumSize(null);
        filtersPermissionFilterUXCheckBox.setMinimumSize(null);
        filtersPermissionFilterUXCheckBox.setPreferredSize(null);
        filtersPermissionFilterUXCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        permissionsFilterJPanel.add(filtersPermissionFilterUXCheckBox, gridBagConstraints);

        filtersPermissionFilterGRCheckBox.setMaximumSize(null);
        filtersPermissionFilterGRCheckBox.setMinimumSize(null);
        filtersPermissionFilterGRCheckBox.setPreferredSize(null);
        filtersPermissionFilterGRCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        permissionsFilterJPanel.add(filtersPermissionFilterGRCheckBox, gridBagConstraints);

        filtersPermissionFilterGWCheckBox.setMaximumSize(null);
        filtersPermissionFilterGWCheckBox.setMinimumSize(null);
        filtersPermissionFilterGWCheckBox.setPreferredSize(null);
        filtersPermissionFilterGWCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        permissionsFilterJPanel.add(filtersPermissionFilterGWCheckBox, gridBagConstraints);

        filtersPermissionFilterGXCheckBox.setMaximumSize(null);
        filtersPermissionFilterGXCheckBox.setMinimumSize(null);
        filtersPermissionFilterGXCheckBox.setPreferredSize(null);
        filtersPermissionFilterGXCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        permissionsFilterJPanel.add(filtersPermissionFilterGXCheckBox, gridBagConstraints);

        filtersPermissionFilterORCheckBox.setMaximumSize(null);
        filtersPermissionFilterORCheckBox.setMinimumSize(null);
        filtersPermissionFilterORCheckBox.setPreferredSize(null);
        filtersPermissionFilterORCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        permissionsFilterJPanel.add(filtersPermissionFilterORCheckBox, gridBagConstraints);

        filtersPermissionFilterOWCheckBox.setMaximumSize(null);
        filtersPermissionFilterOWCheckBox.setMinimumSize(null);
        filtersPermissionFilterOWCheckBox.setPreferredSize(null);
        filtersPermissionFilterOWCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        permissionsFilterJPanel.add(filtersPermissionFilterOWCheckBox, gridBagConstraints);

        filtersPermissionFilterOXCheckBox.setMaximumSize(null);
        filtersPermissionFilterOXCheckBox.setMinimumSize(null);
        filtersPermissionFilterOXCheckBox.setPreferredSize(null);
        filtersPermissionFilterOXCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionFilterCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        permissionsFilterJPanel.add(filtersPermissionFilterOXCheckBox, gridBagConstraints);

        permissionFilterJLabel6.setText("Numeric:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        permissionsFilterJPanel.add(permissionFilterJLabel6, gridBagConstraints);

        filtersPermissionFilterField.setInputVerifier(new PermissionNumberVerifier(this, filtersPermissionFilterField));
        filtersPermissionFilterField.setMaximumSize(null);
        filtersPermissionFilterField.setMinimumSize(new java.awt.Dimension(3, 20));
        filtersPermissionFilterField.setPreferredSize(new java.awt.Dimension(40, 20));
        filtersPermissionFilterField.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtersPermissionFilterFieldKeyPressed(evt);
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtersPermissionFilterFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        permissionsFilterJPanel.add(filtersPermissionFilterField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        permissionsFilterJPanel.add(jPanel103, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        byPermissionsFilterJPanel.add(permissionsFilterJPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        byPermissionsFilterJPanel.add(Spacer31, gridBagConstraints);

        informationPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel25.setPreferredSize(new java.awt.Dimension(298, 180));
        informationPanel25.setLayout(new java.awt.GridBagLayout());

        jTextPane26.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane26.setContentType("text/html"); // NOI18N
        jTextPane26.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here a filter to include/exclude files/directories based on the Posix file permissions. This filter will be applied only on Posix systems (like Linux).\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel25.add(jTextPane26, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        byPermissionsFilterJPanel.add(informationPanel25, gridBagConstraints);

        filtersTabbedPane.addTab("By Permissions", byPermissionsFilterJPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(filtersTabbedPane, gridBagConstraints);

        filtersButtonsPanel.setLayout(new javax.swing.BoxLayout(filtersButtonsPanel, javax.swing.BoxLayout.LINE_AXIS));

        filtersOKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        filtersOKButton.setText("OK");
        filtersOKButton.setAlignmentX(0.5F);
        filtersOKButton.setMaximumSize(null);
        filtersOKButton.setMinimumSize(null);
        filtersOKButton.setPreferredSize(null);
        filtersOKButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersOKButtonActionPerformed(evt);
            }
        });
        filtersButtonsPanel.add(filtersOKButton);

        filtersCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        filtersCancelButton.setText("Cancel");
        filtersCancelButton.setAlignmentX(0.5F);
        filtersCancelButton.setMaximumSize(null);
        filtersCancelButton.setMinimumSize(null);
        filtersCancelButton.setPreferredSize(null);
        filtersCancelButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtersCancelButtoncancelActionPerformed(evt);
            }
        });
        filtersButtonsPanel.add(filtersCancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(filtersButtonsPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtersOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersOKButtonActionPerformed
        // If no focus -> a fields has blocked applying settings
        if (filtersOKButton.hasFocus()) {
            applyFilter();
            this.setVisible(false);
        }
    }//GEN-LAST:event_filtersOKButtonActionPerformed

    private void filtersCancelButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersCancelButtoncancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_filtersCancelButtoncancelActionPerformed

    private void filtersByPatternRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersByPatternRadioButtonActionPerformed
        filterEvent();
    }//GEN-LAST:event_filtersByPatternRadioButtonActionPerformed

    private void filtersByFileSizeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersByFileSizeRadioButtonActionPerformed
        filterEvent();
    }//GEN-LAST:event_filtersByFileSizeRadioButtonActionPerformed

    private void pathFilterBrowseButtonbrowseSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathFilterBrowseButtonbrowseSrcActionPerformed
        GuiTools.browseFileAndFolder(this, filtersPathFilterField);
    }//GEN-LAST:event_pathFilterBrowseButtonbrowseSrcActionPerformed

    private void filtersByPathRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersByPathRadioButtonActionPerformed
        filterEvent();
    }//GEN-LAST:event_filtersByPathRadioButtonActionPerformed

    private void filtersByFileAttributeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersByFileAttributeRadioButtonActionPerformed
        filterEvent();
    }//GEN-LAST:event_filtersByFileAttributeRadioButtonActionPerformed

    private void filtersByFileOwnershipRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersByFileOwnershipRadioButtonActionPerformed
        filterEvent();
    }//GEN-LAST:event_filtersByFileOwnershipRadioButtonActionPerformed

    private void filtersByFilePermissionsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersByFilePermissionsRadioButtonActionPerformed
        filterEvent();
    }//GEN-LAST:event_filtersByFilePermissionsRadioButtonActionPerformed

    private void filtersByDateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersByDateRadioButtonActionPerformed
        filterEvent();
    }//GEN-LAST:event_filtersByDateRadioButtonActionPerformed

    private void permissionFilterCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permissionFilterCheckBoxActionPerformed
        permissionFilterCheckBoxClicked();
    }//GEN-LAST:event_permissionFilterCheckBoxActionPerformed

    private void ffiltersDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffiltersDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ffiltersDateTextFieldActionPerformed

    private void filtersTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtersTabbedPaneMouseClicked
    }//GEN-LAST:event_filtersTabbedPaneMouseClicked

    private void filtersPermissionFilterFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtersPermissionFilterFieldKeyReleased
        permissionFilterValueChanged();
    }//GEN-LAST:event_filtersPermissionFilterFieldKeyReleased

    private void filtersPermissionFilterFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtersPermissionFilterFieldKeyPressed
        permissionFilterValueChanged();
    }//GEN-LAST:event_filtersPermissionFilterFieldKeyPressed

    private void filtersRegularExpressionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersRegularExpressionCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtersRegularExpressionCheckBoxActionPerformed

    private void ffiltersDateTimeUnitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffiltersDateTimeUnitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ffiltersDateTimeUnitFieldActionPerformed

    private void filtersDateModeSpecificTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersDateModeSpecificTimeRadioButtonActionPerformed
        adjustFilterDateTypeRadioButtons();
    }//GEN-LAST:event_filtersDateModeSpecificTimeRadioButtonActionPerformed

    private void filtersDateModeTimeUnitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtersDateModeTimeUnitRadioButtonActionPerformed
        adjustFilterDateTypeRadioButtons();
    }//GEN-LAST:event_filtersDateModeTimeUnitRadioButtonActionPerformed
    // End of variables declaration//GEN-END:variables

    abstract protected void adjustFilterDateTypeRadioButtons();

    abstract protected void applyFilter();

    abstract protected void filterEvent();

    abstract protected void permissionFilterCheckBoxClicked();

    abstract protected void permissionFilterValueChanged();
}
