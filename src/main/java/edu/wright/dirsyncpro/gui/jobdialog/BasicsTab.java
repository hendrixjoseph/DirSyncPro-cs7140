package edu.wright.dirsyncpro.gui.jobdialog;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.gui.verifier.PathVerifier;
import edu.wright.dirsyncpro.tools.GuiTools;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author Joe Hendrix <hendrix.11@wright.edu>
 */
public final class BasicsTab extends JPanel {

    private JComboBox syncModeComboBox = new JComboBox();
    private JLabel dirDstLabel = new JLabel();
    private JButton swapButton = new JButton();
    private JLabel dirWithSubfoldersLabel = new JLabel();
    private JCheckBox dirWithSubfoldersCheckBox = new JCheckBox();
    private JLabel dirSrcLabel = new JLabel();
    private JLabel dirNameLabel = new JLabel();
    private JTextField dirNameField = new JTextField();
    private JTextField dirDstField = new JTextField();
    private JButton dirDstChangeButton = new JButton();
    private JButton dirSrcChangeButton = new JButton();
    private JButton dirSrcChangeButton1 = new JButton();
    private JTextField dirSrcField = new JTextField();
    private JobDialogObjects jobDialog;

    public JComboBox getSyncModeComboBox() {
        return syncModeComboBox;
    }

    public JTextField getDirNameField() {
        return dirNameField;
    }

    public JTextField getDirDstField() {
        return dirDstField;
    }

    public JTextField getDirSrcField() {
        return dirSrcField;
    }

    public JCheckBox getDirWithSubfoldersCheckBox() {
        return dirWithSubfoldersCheckBox;
    }



    public BasicsTab(JobDialogObjects jobDialog) {
        this.jobDialog = jobDialog;

        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new GridBagLayout());

        HTMLEditorKit editorKit = new HTMLEditorKit();
        StyleSheet styles = new StyleSheet();
        Font font = UIManager.getFont("Label.font");
        String bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);

        JPanel syncModeJPanel = new JPanel();
        JPanel spacer = new JPanel();
        JPanel pathsPanel = new JPanel();
        JPanel infoPanel = new JPanel();
        JLabel label = new JLabel();
        JTextPane jTextPane = new JTextPane();
        jTextPane.setEditorKit(editorKit);

        JPanel jPanels[] = new JPanel[2];

        for (int i = 0; i < jPanels.length; i++) {
            jPanels[i] = new JPanel();
        }

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(pathsPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        add(spacer, gridBagConstraints);

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
        dirDstField.setInputVerifier(new PathVerifier(this.jobDialog, dirDstField));
        dirDstField.setMaximumSize(null);
        dirDstField.setMinimumSize(null);
        dirDstField.setPreferredSize(null);
        this.jobDialog.setFileDragNDrop(dirDstField);
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
        dirSrcField.setInputVerifier(new PathVerifier(this.jobDialog, dirSrcField));
        dirSrcField.setMaximumSize(null);
        dirSrcField.setMinimumSize(null);
        dirSrcField.setPreferredSize(null);
        this.jobDialog.setFileDragNDrop(dirSrcField);
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

        jPanels[0].setMaximumSize(null);
        jPanels[0].setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirWithSubfoldersCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
        dirWithSubfoldersCheckBox.setMaximumSize(null);
        dirWithSubfoldersCheckBox.setMinimumSize(null);
        dirWithSubfoldersCheckBox.setPreferredSize(null);
        jPanels[0].add(dirWithSubfoldersCheckBox);

        dirWithSubfoldersLabel.setIcon(new ImageIcon(getClass().getResource("/icons/withSubdirs.png"))); // NOI18N
        dirWithSubfoldersLabel.setText("Include subfolders");
        jPanels[0].add(dirWithSubfoldersLabel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        gridBagConstraints.insets = new Insets(0, 0, 0, 8);
        pathsPanel.add(jPanels[0], gridBagConstraints);

        jPanels[1].setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(jPanels[1], gridBagConstraints);

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

        infoPanel.setBorder(BorderFactory.createTitledBorder("Information"));
        infoPanel.setPreferredSize(new Dimension(298, 180));
        infoPanel.setLayout(new GridBagLayout());

        jTextPane.setBackground(UIManager.getDefaults().getColor("Label.background"));
        jTextPane.setContentType("text/html"); // NOI18N
        jTextPane.setText("<html>\n  <head>\n\n  </head>\n  <body>\n    <p style=\"margin-top: 0\">\n    \nSet up the directories and the sync mode: <u>Mirror A -&gt; B (incremental)</u> and <u>Mirror B -&gt; A (incremental)</u> are mono-directional (one way). \nOnly new and modified files from the source are copied to the destination; redundant files in the destination will be deleted. The directories are exactly the same after the sync. \n<u>Synchronize A &lt;-&gt; B (incremental)</u> is bi-directional (two-ways). Only new and modified files from both dirs are copied to each other. Both directories are exactly the same after the \nsync. <u>Backup A -&gt; B</u> and <u>Restore B -&gt; A</u> will copy all files from A to B (or vice versa). <u>Contribute A -&gt; B</u> and <u>Contribute B -&gt; A</u> will \ncopy only the new files from A to B (or vice versa). Choose <u>Synchronize A -&gt; B (custom)</u>, <u>Synchronize B -&gt; A (custom)</u> or <u>Synchronize A &lt;-&gt; B (custom)</u> to \nsetup the sync behavior as you wish (advanced). <span style=\"color: blue;\">Some tabs get available only in a 'custom' mode.</span>\n    </p>\n  </body>\n</html>\n");
        jTextPane.setFocusCycleRoot(false);
        jTextPane.setMinimumSize(new Dimension(101, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        infoPanel.add(jTextPane, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(infoPanel, gridBagConstraints);

        syncModeJPanel.setBorder(BorderFactory.createTitledBorder("Sync using this mode"));
        syncModeJPanel.setLayout(new GridBagLayout());

        label.setIcon(new ImageIcon(getClass().getResource("/icons/DirSyncPro.png"))); // NOI18N
        label.setText("Sync Mode:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(0, 5, 0, 0);
        syncModeJPanel.add(label, gridBagConstraints);

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
        add(syncModeJPanel, gridBagConstraints);

        syncModeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(Const.SyncMode.values()));
        SyncModeComboboxCellRenderer smcbr = new SyncModeComboboxCellRenderer();
        syncModeComboBox.setRenderer(smcbr);
    }

    private void dirDstChangeButtonbrowseDstActionPerformed(ActionEvent evt) {
        GuiTools.browseFolder(this.jobDialog, dirDstField);
    }

    private void syncModeComboBoxItemStateChanged(ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            this.jobDialog.syncModeComboBoxClicked();
        }
    }

    private void swapButtonActionPerformed(ActionEvent evt) {
        String s = dirSrcField.getText();
        dirSrcField.setText(dirDstField.getText());
        dirDstField.setText(s);
    }

    private void dirSrcChangeButtonbrowseSrcActionPerformed(ActionEvent evt) {
        GuiTools.browseFolder(this.jobDialog, dirSrcField);
    }
}
