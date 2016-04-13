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
import javax.swing.DefaultComboBoxModel;
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

    private static final String destfieldTooltip = "<html>The destination directory. You can use the following wildcards:<br>\"<b>&lt;date</b>&gt;\" for the current date (or \"<b>&lt;DD</b>&gt;\" for day, \"<b>&lt;MM</b>&gt;\" for month, and \"<b>&lt;YYYY</b>&gt;\" for year) and<br>\"<b>&lt;time</b>&gt;\" for the current time (or \"<b>&lt;hh</b>&gt;\" for hour, \"<b>&lt;mm</b>&gt;\" for minute, and \"<b>&lt;ss</b>&gt;\" for second).</html>";
    private static final String sourcefieldTooltip = "<html>The source directory. You can use the following wildcards:<br />\"<b>&lt;username&gt;</b>\" for the name of the current user, and <br />\"<b>&lt;userhome&gt;</b>\" for the home directory of the current user.</html>";

    private JComboBox<Const.SyncMode> syncModeComboBox = new JComboBox<>();
    private JCheckBox dirWithSubfoldersCheckBox = new JCheckBox();
    private JTextField dirNameField = new JTextField();
    private JTextField dirDstField = new JTextField();
    private JTextField dirSrcField = new JTextField();
    private JobDialogObjects jobDialog;
    private JPanel pathsPanel = new JPanel();

    public BasicsTab(JobDialogObjects jobDialog) {
        this.jobDialog = jobDialog;
        init();
    }

    private JPanel generateTitledPanel(String title) {
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createTitledBorder(title));
        panel.setLayout(new GridBagLayout());

        return panel;
    }

    private void init() {
        JButton swapButton = new JButton();
        JPanel syncModeJPanel = generateTitledPanel("Sync using this mode");
        JPanel infoPanel = generateTitledPanel("Information");

        JPanel jPanels[] = new JPanel[3];

        for (int i = 0; i < jPanels.length; i++) {
            jPanels[i] = new JPanel();
        }

        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new GridBagLayout());

        HTMLEditorKit editorKit = new HTMLEditorKit();
        StyleSheet styles = new StyleSheet();
        Font font = UIManager.getFont("Label.font");
        String bodyRule = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        styles.addRule(bodyRule);
        editorKit.setStyleSheet(styles);

        JTextPane jTextPane = new JTextPane();
        jTextPane.setEditorKit(editorKit);

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
        add(jPanels[2], gridBagConstraints);

        pathsPanel.setBorder(BorderFactory.createTitledBorder("Label & Paths"));
        pathsPanel.setEnabled(false);
        pathsPanel.setLayout(new GridBagLayout());

        addLabel("/icons/dirGreen.png", "Dir A", 0, 1);
        addLabel("/icons/name.png", "Label", 0, 0);
        dirNameField = generateField("The label for this synchronization.", 1, 0);
        dirDstField = generateField(destfieldTooltip, 1, 2);
        addButton("/icons/browse.png", "Browse for the destination directory.", 2, 2, this::performDestinationDirectoryButtonAction);
        addButton("/icons/browse.png", "Browse for the source directory.", 2, 1, this::performSourceDirectoryButtonAction);
        addButton("/icons/GDrive.png", "Browse Google Drive", 3, 1, this::performGoogleDriveButtonAction);
        dirSrcField = generateField(sourcefieldTooltip, 1, 1);
        addLabel("/icons/dirOrange.png", "Dir B", 0, 2);

        jPanels[0].setMaximumSize(null);
        jPanels[0].setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        dirWithSubfoldersCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
        dirWithSubfoldersCheckBox.setMaximumSize(null);
        dirWithSubfoldersCheckBox.setMinimumSize(null);
        dirWithSubfoldersCheckBox.setPreferredSize(null);
        jPanels[0].add(dirWithSubfoldersCheckBox);


        jPanels[0].add(generateLabel("/icons/withSubdirs.png","Include subfolders"));

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

        infoPanel.setPreferredSize(new Dimension(298, 180));

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

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(0, 5, 0, 0);
        syncModeJPanel.add(generateLabel("/icons/DirSyncPro.png","Sync Mode:"), gridBagConstraints);

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

        syncModeComboBox.setModel(new DefaultComboBoxModel<>(Const.SyncMode.values()));
        SyncModeComboboxCellRenderer smcbr = new SyncModeComboboxCellRenderer();
        syncModeComboBox.setRenderer(smcbr);
    }

    private JLabel generateLabel(String icon, String text) {
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource(icon)));
        label.setText(text);
        return label;
    }

    private void addLabel(String icon, String text, int gridx, int gridy) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;

        pathsPanel.add(generateLabel(icon,text), gridBagConstraints);
    }

    private void addButton(String icon, String tooltip, int gridx, int gridy, ActionListener listener) {
        JButton button = new JButton();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        button.setFont(new Font("Tahoma", 0, 10)); // NOI18N
        button.setIcon(new ImageIcon(getClass().getResource(icon))); // NOI18N
        button.setToolTipText(tooltip);
        button.setIconTextGap(2);
        button.setMargin(new Insets(2, 2, 2, 2));
        button.addActionListener(listener);

        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        pathsPanel.add(button, gridBagConstraints);
    }

    private JTextField generateField(String tooltip, int gridx, int gridy) {
        JTextField field = new JTextField();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        field.setToolTipText(tooltip);
        field.setInputVerifier(new PathVerifier(jobDialog, field));
        field.setMaximumSize(null);
        field.setMinimumSize(null);
        field.setPreferredSize(null);
        jobDialog.setFileDragNDrop(field);

        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.01;
        pathsPanel.add(field, gridBagConstraints);

        return field;
    }

    public JComboBox<Const.SyncMode> getSyncModeComboBox() {
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

    private void performDestinationDirectoryButtonAction(ActionEvent evt) {
        GuiTools.browseFolder(jobDialog, dirDstField);
    }

    private void performGoogleDriveButtonAction(ActionEvent evt) {

    }

    private void syncModeComboBoxItemStateChanged(ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jobDialog.syncModeComboBoxClicked();
        }
    }

    private void swapButtonActionPerformed(ActionEvent evt) {
        String s = dirSrcField.getText();
        dirSrcField.setText(dirDstField.getText());
        dirDstField.setText(s);
    }

    private void performSourceDirectoryButtonAction(ActionEvent evt) {
        GuiTools.browseFolder(jobDialog, dirSrcField);
    }
}
