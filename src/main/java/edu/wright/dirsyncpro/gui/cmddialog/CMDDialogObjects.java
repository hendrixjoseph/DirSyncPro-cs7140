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
package edu.wright.dirsyncpro.gui.cmddialog;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.tools.GuiTools;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class CMDDialogObjects extends javax.swing.JDialog {

    // Variables declaration - do not modify
    protected javax.swing.JCheckBox cmdAddAnalyzeCheckBox;

    /**
     * Creates new form GuiObjects
     */
//    public GuiObjects() {
//       initComponents();
//    }
    protected javax.swing.JLabel cmdAddAnalyzeJLabel;
    protected javax.swing.JCheckBox cmdAddIconifyCheckBox;
    protected javax.swing.JLabel cmdAddIconifyJLabel5;
    protected javax.swing.JCheckBox cmdAddNoGuiCheckBox;
    protected javax.swing.JLabel cmdAddNoGuiJLabel;
    protected javax.swing.JCheckBox cmdAddQuitCheckBox;
    protected javax.swing.JLabel cmdAddQuitJLabel;
    protected javax.swing.JCheckBox cmdAddScheduleCheckBox;
    protected javax.swing.JLabel cmdAddScheduleJLabel;
    protected javax.swing.JCheckBox cmdAddSyncCheckBox;
    protected javax.swing.JLabel cmdAddSyncJLabel;
    protected javax.swing.JButton cmdCloseButton;
    protected javax.swing.JTextArea cmdCommandField;
    protected javax.swing.JButton cmdCopyToClipboardButton;
    protected javax.swing.JButton cmdSaveBatchButton;

    public CMDDialogObjects(JFrame frame) {
        super(frame);
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel configPathPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel88 = new javax.swing.JPanel();
        cmdAddSyncCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel cmdAddSyncJLabel1 = new javax.swing.JLabel();
        cmdAddSyncJLabel = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddSyncJLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddSyncJLabel3 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel91 = new javax.swing.JPanel();
        cmdAddAnalyzeCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel cmdAddAnalyzeJLabel1 = new javax.swing.JLabel();
        cmdAddAnalyzeJLabel = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddAnalyzeJLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddAnalyzeJLabel3 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel92 = new javax.swing.JPanel();
        cmdAddNoGuiCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel cmdAddNoGuiJLabel1 = new javax.swing.JLabel();
        cmdAddNoGuiJLabel = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddNoGuiJLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddNoGuiJLabel3 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel93 = new javax.swing.JPanel();
        cmdAddQuitCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel cmdAddQuitJLabel1 = new javax.swing.JLabel();
        cmdAddQuitJLabel = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddQuitJLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddQuitJLabel3 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel94 = new javax.swing.JPanel();
        cmdAddScheduleCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel cmdAddScheduleJLabel1 = new javax.swing.JLabel();
        cmdAddScheduleJLabel = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddScheduleJLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddScheduleJLabel3 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel95 = new javax.swing.JPanel();
        cmdAddIconifyCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel cmdAddIconifyJLabel = new javax.swing.JLabel();
        cmdAddIconifyJLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddIconifyJLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel cmdAddIconifyJLabel7 = new javax.swing.JLabel();
        javax.swing.JPanel loadLastConfigPanel1 = new javax.swing.JPanel();
        javax.swing.JScrollPane cmdCommandFieldJScrollPane = new javax.swing.JScrollPane();
        cmdCommandField = new javax.swing.JTextArea();
        javax.swing.JPanel settingsButtonsPanel3 = new javax.swing.JPanel();
        cmdCloseButton = new javax.swing.JButton();
        cmdCopyToClipboardButton = new javax.swing.JButton();
        cmdSaveBatchButton = new javax.swing.JButton();

        setTitle("Command Line & Batch file generator");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(360, 270));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        configPathPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        configPathPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel88.setLayout(new java.awt.GridBagLayout());

        cmdAddSyncCheckBox.setMaximumSize(null);
        cmdAddSyncCheckBox.setMinimumSize(null);
        cmdAddSyncCheckBox.setPreferredSize(null);
        cmdAddSyncCheckBox.addActionListener(this::cmdAddSyncCheckBoxActionPerformed);
        jPanel88.add(cmdAddSyncCheckBox, new java.awt.GridBagConstraints());

        cmdAddSyncJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/start.png"))); // NOI18N
        cmdAddSyncJLabel1.setText("Add");
        jPanel88.add(cmdAddSyncJLabel1, new java.awt.GridBagConstraints());

        cmdAddSyncJLabel.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        cmdAddSyncJLabel.setText("/sync");
        jPanel88.add(cmdAddSyncJLabel, new java.awt.GridBagConstraints());

        cmdAddSyncJLabel2.setText(" option.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel88.add(cmdAddSyncJLabel2, gridBagConstraints);

        cmdAddSyncJLabel3.setText("To synchronize automatically.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel88.add(cmdAddSyncJLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        configPathPanel1.add(jPanel88, gridBagConstraints);

        jPanel91.setLayout(new java.awt.GridBagLayout());

        cmdAddAnalyzeCheckBox.setMaximumSize(null);
        cmdAddAnalyzeCheckBox.setMinimumSize(null);
        cmdAddAnalyzeCheckBox.setPreferredSize(null);
        cmdAddAnalyzeCheckBox.addActionListener(this::cmdAddAnalyzeCheckBoxActionPerformed);
        jPanel91.add(cmdAddAnalyzeCheckBox, new java.awt.GridBagConstraints());

        cmdAddAnalyzeJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preview.png"))); // NOI18N
        cmdAddAnalyzeJLabel1.setText("Add");
        jPanel91.add(cmdAddAnalyzeJLabel1, new java.awt.GridBagConstraints());

        cmdAddAnalyzeJLabel.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        cmdAddAnalyzeJLabel.setText("/analyze");
        jPanel91.add(cmdAddAnalyzeJLabel, new java.awt.GridBagConstraints());

        cmdAddAnalyzeJLabel2.setText(" option.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel91.add(cmdAddAnalyzeJLabel2, gridBagConstraints);

        cmdAddAnalyzeJLabel3.setText("To analyze automatically.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel91.add(cmdAddAnalyzeJLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        configPathPanel1.add(jPanel91, gridBagConstraints);

        jPanel92.setLayout(new java.awt.GridBagLayout());

        cmdAddNoGuiCheckBox.setMaximumSize(null);
        cmdAddNoGuiCheckBox.setMinimumSize(null);
        cmdAddNoGuiCheckBox.setPreferredSize(null);
        cmdAddNoGuiCheckBox.addActionListener(this::cmdAddNoGuiCheckBoxActionPerformed);
        jPanel92.add(cmdAddNoGuiCheckBox, new java.awt.GridBagConstraints());

        cmdAddNoGuiJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/terminal.png"))); // NOI18N
        cmdAddNoGuiJLabel1.setText("Add");
        jPanel92.add(cmdAddNoGuiJLabel1, new java.awt.GridBagConstraints());

        cmdAddNoGuiJLabel.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        cmdAddNoGuiJLabel.setText("/nogui");
        jPanel92.add(cmdAddNoGuiJLabel, new java.awt.GridBagConstraints());

        cmdAddNoGuiJLabel2.setText(" option.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel92.add(cmdAddNoGuiJLabel2, gridBagConstraints);

        cmdAddNoGuiJLabel3.setText("To start no Gui.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel92.add(cmdAddNoGuiJLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        configPathPanel1.add(jPanel92, gridBagConstraints);

        jPanel93.setLayout(new java.awt.GridBagLayout());

        cmdAddQuitCheckBox.setMaximumSize(null);
        cmdAddQuitCheckBox.setMinimumSize(null);
        cmdAddQuitCheckBox.setPreferredSize(null);
        cmdAddQuitCheckBox.addActionListener(this::cmdAddQuitCheckBoxActionPerformed);
        jPanel93.add(cmdAddQuitCheckBox, new java.awt.GridBagConstraints());

        cmdAddQuitJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quit.png"))); // NOI18N
        cmdAddQuitJLabel1.setText("Add");
        jPanel93.add(cmdAddQuitJLabel1, new java.awt.GridBagConstraints());

        cmdAddQuitJLabel.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        cmdAddQuitJLabel.setText("/quit");
        jPanel93.add(cmdAddQuitJLabel, new java.awt.GridBagConstraints());

        cmdAddQuitJLabel2.setText(" option.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel93.add(cmdAddQuitJLabel2, gridBagConstraints);

        cmdAddQuitJLabel3.setText("To quit after the sync.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel93.add(cmdAddQuitJLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        configPathPanel1.add(jPanel93, gridBagConstraints);

        jPanel94.setLayout(new java.awt.GridBagLayout());

        cmdAddScheduleCheckBox.setMaximumSize(null);
        cmdAddScheduleCheckBox.setMinimumSize(null);
        cmdAddScheduleCheckBox.setPreferredSize(null);
        cmdAddScheduleCheckBox.addActionListener(this::cmdAddScheduleCheckBoxActionPerformed);
        jPanel94.add(cmdAddScheduleCheckBox, new java.awt.GridBagConstraints());

        cmdAddScheduleJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/startSchedule.png"))); // NOI18N
        cmdAddScheduleJLabel1.setText("Add");
        jPanel94.add(cmdAddScheduleJLabel1, new java.awt.GridBagConstraints());

        cmdAddScheduleJLabel.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        cmdAddScheduleJLabel.setText("/schedule");
        jPanel94.add(cmdAddScheduleJLabel, new java.awt.GridBagConstraints());

        cmdAddScheduleJLabel2.setText(" option.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel94.add(cmdAddScheduleJLabel2, gridBagConstraints);

        cmdAddScheduleJLabel3.setText("To start the schedule engine.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel94.add(cmdAddScheduleJLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        configPathPanel1.add(jPanel94, gridBagConstraints);

        jPanel95.setLayout(new java.awt.GridBagLayout());

        cmdAddIconifyCheckBox.setMaximumSize(null);
        cmdAddIconifyCheckBox.setMinimumSize(null);
        cmdAddIconifyCheckBox.setPreferredSize(null);
        cmdAddIconifyCheckBox.addActionListener(this::cmdAddIconifyCheckBoxActionPerformed);
        jPanel95.add(cmdAddIconifyCheckBox, new java.awt.GridBagConstraints());

        cmdAddIconifyJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DirSyncPro.png"))); // NOI18N
        cmdAddIconifyJLabel.setText("Add");
        jPanel95.add(cmdAddIconifyJLabel, new java.awt.GridBagConstraints());

        cmdAddIconifyJLabel5.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        cmdAddIconifyJLabel5.setText("/iconify");
        jPanel95.add(cmdAddIconifyJLabel5, new java.awt.GridBagConstraints());

        cmdAddIconifyJLabel6.setText(" option.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel95.add(cmdAddIconifyJLabel6, gridBagConstraints);

        cmdAddIconifyJLabel7.setText("To iconify the GUI automatically.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel95.add(cmdAddIconifyJLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        configPathPanel1.add(jPanel95, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(configPathPanel1, gridBagConstraints);

        loadLastConfigPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Command Line"));
        loadLastConfigPanel1.setLayout(new java.awt.GridBagLayout());

        cmdCommandField.setColumns(20);
        cmdCommandField.setEditable(false);
        cmdCommandField.setRows(1);
        cmdCommandField.setText(" java -Xmx512M -jar dirsyncpro.jar");
        cmdCommandFieldJScrollPane.setViewportView(cmdCommandField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        loadLastConfigPanel1.add(cmdCommandFieldJScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(loadLastConfigPanel1, gridBagConstraints);

        settingsButtonsPanel3.setLayout(new java.awt.GridBagLayout());

        cmdCloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        cmdCloseButton.setText("Close");
        cmdCloseButton.setAlignmentX(0.5F);
        cmdCloseButton.addActionListener(this::cmdCloseButtoncancelActionPerformed);
        settingsButtonsPanel3.add(cmdCloseButton, new java.awt.GridBagConstraints());

        cmdCopyToClipboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyAll.png"))); // NOI18N
        cmdCopyToClipboardButton.setText("Copy to clipboard");
        cmdCopyToClipboardButton.setAlignmentX(0.5F);
        cmdCopyToClipboardButton.addActionListener(this::cmdCopyToClipboardButtonActionPerformed);
        settingsButtonsPanel3.add(cmdCopyToClipboardButton, new java.awt.GridBagConstraints());

        cmdSaveBatchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileSave.png"))); // NOI18N
        cmdSaveBatchButton.setText("Save to batch file");
        cmdSaveBatchButton.setAlignmentX(0.5F);
        cmdSaveBatchButton.addActionListener(this::cmdSaveBatchButtonActionPerformed);
        settingsButtonsPanel3.add(cmdSaveBatchButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(settingsButtonsPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>

    private void cmdAddSyncCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        cmdUpdateCommandField();
    }

    private void cmdCloseButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void cmdAddAnalyzeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        cmdUpdateCommandField();
    }

    private void cmdAddNoGuiCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        cmdUpdateCommandField();
    }

    private void cmdAddQuitCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        cmdUpdateCommandField();
    }

    private void cmdCopyToClipboardButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cmdCopyToClipboard();
    }

    private void cmdSaveBatchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cmdSaveBatch();
    }

    private void cmdAddScheduleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        cmdUpdateCommandField();
    }

    private void cmdAddIconifyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        cmdUpdateCommandField();
    }
    // End of variables declaration

    abstract protected void cmdCopyToClipboard();

    abstract protected void cmdUpdateCommandField();

    abstract protected void cmdSaveBatch();
}
