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
package edu.wright.dirsyncpro.gui.updatedialog;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.tools.GuiTools;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class UpdateDialogObjects extends javax.swing.JDialog {

    // Variables declaration - do not modify
    protected javax.swing.JLabel changelogURL;

    /**
     * Creates new form GuiObjects
     */
//    public GuiObjects() {
//       initComponents();
//    }
    protected javax.swing.JLabel downloadURL;
    protected javax.swing.JButton gotodownloadsButton;
    protected javax.swing.JLabel localVersion;
    protected javax.swing.JButton notNowButton;
    protected javax.swing.JLabel remoteVersion;

    public UpdateDialogObjects(JFrame frame) {
        super(frame);
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

        javax.swing.JPanel updateButtonsPanel = new javax.swing.JPanel();
        gotodownloadsButton = new javax.swing.JButton();
        notNowButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel spacer = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        downloadURL = new javax.swing.JLabel();
        localVersion = new javax.swing.JLabel();
        remoteVersion = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        changelogURL = new javax.swing.JLabel();
        javax.swing.JPanel spacer1 = new javax.swing.JPanel();

        setTitle("DirSync Pro updates");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(520, 100));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        updateButtonsPanel.setLayout(new javax.swing.BoxLayout(updateButtonsPanel, javax.swing.BoxLayout.LINE_AXIS));

        gotodownloadsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        gotodownloadsButton.setText("Go to download page");
        gotodownloadsButton.setAlignmentX(0.5F);
        gotodownloadsButton.setPreferredSize(null);
        gotodownloadsButton.addActionListener(this::gotodownloadsButtonActionPerformed);
        updateButtonsPanel.add(gotodownloadsButton);

        notNowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        notNowButton.setText("Not Now");
        notNowButton.setAlignmentX(0.5F);
        notNowButton.setPreferredSize(null);
        notNowButton.addActionListener(this::notNowButtoncancelActionPerformed);
        updateButtonsPanel.add(notNowButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(updateButtonsPanel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Program updates available");
        jLabel1.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(jLabel1, gridBagConstraints);

        spacer.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(spacer, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Your Version:");
        jLabel2.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("New version:");
        jLabel3.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Changes:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLabel4, gridBagConstraints);

        downloadURL.setForeground(new java.awt.Color(0, 51, 255));
        downloadURL.setText("<html><u>http://www.dirsyncpro.org</u></html>");
        downloadURL.setPreferredSize(null);
        downloadURL.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downloadURLMouseClicked(evt);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downloadURLMouseEntered(evt);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                downloadURLMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(downloadURL, gridBagConstraints);

        localVersion.setText("Your Version");
        localVersion.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(localVersion, gridBagConstraints);

        remoteVersion.setText("New Version");
        remoteVersion.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(remoteVersion, gridBagConstraints);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update48x48.png"))); // NOI18N
        jLabel10.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 6);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Download link:");
        jLabel24.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel24, gridBagConstraints);

        changelogURL.setForeground(new java.awt.Color(0, 51, 255));
        changelogURL.setText("<html><u>http://www.dirsyncpro.org</u></html>");
        changelogURL.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changelogURLMouseClicked(evt);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changelogURLMouseEntered(evt);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changelogURLMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(changelogURL, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(spacer1, gridBagConstraints);

        pack();
    }// </editor-fold>

    private void gotodownloadsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        openBrowser();
        this.setVisible(false);
    }

    private void notNowButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void downloadURLMouseClicked(java.awt.event.MouseEvent evt) {
        downloadURLClicked();
    }

    private void changelogURLMouseClicked(java.awt.event.MouseEvent evt) {
        changelogURLClicked();
    }

    private void downloadURLMouseEntered(java.awt.event.MouseEvent evt) {
        downloadURL.setForeground(Color.RED);
    }

    private void downloadURLMouseExited(java.awt.event.MouseEvent evt) {
        downloadURL.setForeground(Color.BLUE);
    }

    private void changelogURLMouseEntered(java.awt.event.MouseEvent evt) {
        changelogURL.setForeground(Color.RED);
    }

    private void changelogURLMouseExited(java.awt.event.MouseEvent evt) {
        changelogURL.setForeground(Color.BLUE);
    }
    // End of variables declaration

    abstract protected void changelogURLClicked();

    abstract protected void downloadURLClicked();

    abstract protected void openBrowser();

}
