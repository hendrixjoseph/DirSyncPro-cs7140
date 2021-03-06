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
package edu.wright.dirsyncpro.gui.jobdialog.scheduledialog;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.gui.swing.MyJTabbedPane;
import edu.wright.dirsyncpro.gui.verifier.DateTimeVerifier;
import edu.wright.dirsyncpro.gui.verifier.LongIntVerifier;
import edu.wright.dirsyncpro.gui.verifier.TimeVerifier;
import edu.wright.dirsyncpro.tools.GuiTools;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class ScheduleDialogObjects extends javax.swing.JDialog {

    protected javax.swing.JLabel jLabel43;

    /**
     * Creates new form GuiObjects
     */
//    public GuiObjects() {
//       initComponents();
//    }
    protected javax.swing.JLabel lookNfeelLabel5;
    protected javax.swing.JFormattedTextField scheduleDailyEveryTextField;
    protected javax.swing.JRadioButton scheduleDailyRadioButton;
    protected javax.swing.JFormattedTextField scheduleDailyTimeTextField;
    protected javax.swing.JFormattedTextField scheduleHourlyEveryTextField;
    protected javax.swing.JRadioButton scheduleHourlyRadioButton;
    protected javax.swing.JFormattedTextField scheduleMinutelyEveryTextField;
    protected javax.swing.JRadioButton scheduleMinutelyRadioButton;
    protected javax.swing.JCheckBox scheduleMonthlyAprilCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyAugustCheckBox;
    protected javax.swing.JFormattedTextField scheduleMonthlyDayNumberTextField;
    protected javax.swing.JCheckBox scheduleMonthlyDecemberCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyFebruaryCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyJanuaryCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyJulyCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyJuneCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyMarchCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyMayCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyNovemberCheckBox;
    protected javax.swing.JCheckBox scheduleMonthlyOctoberCheckBox;
    protected javax.swing.JRadioButton scheduleMonthlyRadioButton;
    protected javax.swing.JCheckBox scheduleMonthlySeptemberCheckBox;
    protected javax.swing.JFormattedTextField scheduleMonthlyTimeTextField;
    protected javax.swing.JRadioButton scheduleOnceRadioButton;
    protected javax.swing.JFormattedTextField scheduleOnceTextField;
    protected javax.swing.JCheckBox scheduleTimeFrameFromCheckBox;
    protected javax.swing.JLabel scheduleTimeFrameFromLabel1;
    protected javax.swing.JLabel scheduleTimeFrameFromLabel2;
    protected javax.swing.JFormattedTextField scheduleTimeFrameFromTextField;
    protected javax.swing.JCheckBox scheduleTimeFrameToCheckBox;
    protected javax.swing.JLabel scheduleTimeFrameToLabel1;
    protected javax.swing.JLabel scheduleTimeFrameToLabel2;
    protected javax.swing.JFormattedTextField scheduleTimeFrameToTextField;
    protected javax.swing.JFormattedTextField scheduleWeeklyEveryTextField;
    protected javax.swing.JCheckBox scheduleWeeklyFridayCheckBox;
    protected javax.swing.JCheckBox scheduleWeeklyMondayCheckBox;
    protected javax.swing.JRadioButton scheduleWeeklyRadioButton;
    protected javax.swing.JCheckBox scheduleWeeklySaturdayCheckBox;
    protected javax.swing.JCheckBox scheduleWeeklySundayCheckBox;
    protected javax.swing.JCheckBox scheduleWeeklyThursdayCheckBox;
    protected javax.swing.JFormattedTextField scheduleWeeklyTimeTextField;
    protected javax.swing.JCheckBox scheduleWeeklyTuesdayCheckBox;
    protected javax.swing.JCheckBox scheduleWeeklyWednesdayCheckBox;
    protected javax.swing.JButton schedulesCancelButton;
    protected javax.swing.JButton schedulesOKButton;
    protected javax.swing.JTabbedPane schedulesTabbedPane;

    public ScheduleDialogObjects(JDialog dialog) {
        super(dialog);
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

        javax.swing.ButtonGroup buttonGroupScheduleType = new javax.swing.ButtonGroup();
        schedulesTabbedPane = new MyJTabbedPane();
        javax.swing.JPanel filtersJPanel3 = new javax.swing.JPanel();
        javax.swing.JPanel lookNfeelPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel32 = new javax.swing.JLabel();
        javax.swing.JLabel lookNfeelLabel4 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel76 = new javax.swing.JPanel();
        scheduleOnceRadioButton = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel41 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel77 = new javax.swing.JPanel();
        scheduleDailyRadioButton = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel42 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel85 = new javax.swing.JPanel();
        scheduleWeeklyRadioButton = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel52 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel86 = new javax.swing.JPanel();
        scheduleMonthlyRadioButton = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel53 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel87 = new javax.swing.JPanel();
        scheduleHourlyRadioButton = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel54 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel89 = new javax.swing.JPanel();
        scheduleMinutelyRadioButton = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel69 = new javax.swing.JLabel();
        javax.swing.JPanel spacer18 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel15 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane16 = new javax.swing.JTextPane();
        jTextPane16.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel inExcludeJPanel3 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        lookNfeelLabel5 = new javax.swing.JLabel();
        scheduleTimeFrameToCheckBox = new javax.swing.JCheckBox();
        scheduleTimeFrameFromTextField = new javax.swing.JFormattedTextField();
        scheduleTimeFrameToTextField = new javax.swing.JFormattedTextField();
        scheduleTimeFrameFromCheckBox = new javax.swing.JCheckBox();
        scheduleTimeFrameFromLabel1 = new javax.swing.JLabel();
        scheduleTimeFrameToLabel1 = new javax.swing.JLabel();
        scheduleTimeFrameFromLabel2 = new javax.swing.JLabel();
        scheduleTimeFrameToLabel2 = new javax.swing.JLabel();
        javax.swing.JPanel filtersJPanel7 = new javax.swing.JPanel();
        javax.swing.JPanel spacer22 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel19 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane20 = new javax.swing.JTextPane();
        jTextPane20.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel dirIncludeAndExcludeFilesPanel5 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel51 = new javax.swing.JLabel();
        scheduleOnceTextField = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel62 = new javax.swing.JLabel();
        javax.swing.JPanel filtersJPanel9 = new javax.swing.JPanel();
        javax.swing.JPanel spacer24 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel21 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane22 = new javax.swing.JTextPane();
        jTextPane22.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel dirIncludeAndExcludeFilesPanel7 = new javax.swing.JPanel();
        scheduleMinutelyEveryTextField = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel67 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel68 = new javax.swing.JLabel();
        javax.swing.JPanel filtersJPanel8 = new javax.swing.JPanel();
        javax.swing.JPanel spacer23 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel20 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane21 = new javax.swing.JTextPane();
        jTextPane21.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel dirIncludeAndExcludeFilesPanel6 = new javax.swing.JPanel();
        scheduleHourlyEveryTextField = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel58 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel59 = new javax.swing.JLabel();
        javax.swing.JPanel filtersJPanel4 = new javax.swing.JPanel();
        javax.swing.JPanel spacer19 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel16 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane17 = new javax.swing.JTextPane();
        jTextPane17.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel dirIncludeAndExcludeFilesPanel2 = new javax.swing.JPanel();
        scheduleDailyEveryTextField = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel48 = new javax.swing.JLabel();
        scheduleDailyTimeTextField = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel55 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel63 = new javax.swing.JLabel();
        javax.swing.JPanel filtersJPanel5 = new javax.swing.JPanel();
        javax.swing.JPanel spacer20 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel17 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane18 = new javax.swing.JTextPane();
        jTextPane18.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel dirIncludeAndExcludeFilesPanel3 = new javax.swing.JPanel();
        scheduleWeeklyEveryTextField = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel49 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel56 = new javax.swing.JLabel();
        scheduleWeeklyMondayCheckBox = new javax.swing.JCheckBox();
        scheduleWeeklyTuesdayCheckBox = new javax.swing.JCheckBox();
        scheduleWeeklyWednesdayCheckBox = new javax.swing.JCheckBox();
        scheduleWeeklyThursdayCheckBox = new javax.swing.JCheckBox();
        scheduleWeeklyFridayCheckBox = new javax.swing.JCheckBox();
        scheduleWeeklySaturdayCheckBox = new javax.swing.JCheckBox();
        scheduleWeeklySundayCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel jLabel60 = new javax.swing.JLabel();
        scheduleWeeklyTimeTextField = new javax.swing.JFormattedTextField();
        javax.swing.JPanel filtersJPanel6 = new javax.swing.JPanel();
        javax.swing.JPanel spacer21 = new javax.swing.JPanel();
        javax.swing.JPanel informationPanel18 = new javax.swing.JPanel();
        javax.swing.JTextPane jTextPane19 = new javax.swing.JTextPane();
        jTextPane19.setEditorKit(GuiTools.getDefaultEditorKit());
        javax.swing.JPanel dirIncludeAndExcludeFilesPanel4 = new javax.swing.JPanel();
        scheduleMonthlyDayNumberTextField = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel50 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel57 = new javax.swing.JLabel();
        scheduleMonthlyJanuaryCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyFebruaryCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyMarchCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyAprilCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyMayCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyJuneCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyJulyCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyAugustCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlySeptemberCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyOctoberCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyNovemberCheckBox = new javax.swing.JCheckBox();
        scheduleMonthlyDecemberCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel jLabel61 = new javax.swing.JLabel();
        scheduleMonthlyTimeTextField = new javax.swing.JFormattedTextField();
        javax.swing.JPanel schedulesButtonsPanel = new javax.swing.JPanel();
        schedulesOKButton = new javax.swing.JButton();
        schedulesCancelButton = new javax.swing.JButton();

        setTitle("Schedule Options");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(500, 520));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        schedulesTabbedPane.setMaximumSize(null);

        filtersJPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersJPanel3.setLayout(new java.awt.GridBagLayout());

        lookNfeelPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Schedule type"));
        lookNfeelPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jLabel32.setMaximumSize(null);
        jLabel32.setMinimumSize(null);
        jLabel32.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        lookNfeelPanel2.add(jLabel32, gridBagConstraints);

        lookNfeelLabel4.setText("Schedule:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        lookNfeelPanel2.add(lookNfeelLabel4, gridBagConstraints);

        jPanel76.setMaximumSize(null);
        jPanel76.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupScheduleType.add(scheduleOnceRadioButton);
        scheduleOnceRadioButton.setMaximumSize(null);
        scheduleOnceRadioButton.setMinimumSize(null);
        scheduleOnceRadioButton.setPreferredSize(null);
        scheduleOnceRadioButton.addActionListener(this::scheduleOnceRadioButtonActionPerformed);
        jPanel76.add(scheduleOnceRadioButton);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/once.png"))); // NOI18N
        jLabel41.setText("Once");
        jPanel76.add(jLabel41);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel2.add(jPanel76, gridBagConstraints);

        jPanel77.setMaximumSize(null);
        jPanel77.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupScheduleType.add(scheduleDailyRadioButton);
        scheduleDailyRadioButton.setMaximumSize(null);
        scheduleDailyRadioButton.setMinimumSize(null);
        scheduleDailyRadioButton.setPreferredSize(null);
        scheduleDailyRadioButton.addActionListener(this::scheduleDailyRadioButtonActionPerformed);
        jPanel77.add(scheduleDailyRadioButton);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1day.png"))); // NOI18N
        jLabel42.setText("Daily");
        jPanel77.add(jLabel42);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel2.add(jPanel77, gridBagConstraints);

        jPanel85.setMaximumSize(null);
        jPanel85.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupScheduleType.add(scheduleWeeklyRadioButton);
        scheduleWeeklyRadioButton.setMaximumSize(null);
        scheduleWeeklyRadioButton.setMinimumSize(null);
        scheduleWeeklyRadioButton.setPreferredSize(null);
        scheduleWeeklyRadioButton.addActionListener(this::scheduleWeeklyRadioButtonActionPerformed);
        jPanel85.add(scheduleWeeklyRadioButton);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/7days.png"))); // NOI18N
        jLabel52.setText("Weekly");
        jPanel85.add(jLabel52);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel2.add(jPanel85, gridBagConstraints);

        jPanel86.setMaximumSize(null);
        jPanel86.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupScheduleType.add(scheduleMonthlyRadioButton);
        scheduleMonthlyRadioButton.setMaximumSize(null);
        scheduleMonthlyRadioButton.setMinimumSize(null);
        scheduleMonthlyRadioButton.setPreferredSize(null);
        scheduleMonthlyRadioButton.addActionListener(this::scheduleMonthlyRadioButtonActionPerformed);
        jPanel86.add(scheduleMonthlyRadioButton);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/30days.png"))); // NOI18N
        jLabel53.setText("Monthly");
        jPanel86.add(jLabel53);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel2.add(jPanel86, gridBagConstraints);

        jPanel87.setMaximumSize(null);
        jPanel87.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupScheduleType.add(scheduleHourlyRadioButton);
        scheduleHourlyRadioButton.setMaximumSize(null);
        scheduleHourlyRadioButton.setMinimumSize(null);
        scheduleHourlyRadioButton.setPreferredSize(null);
        scheduleHourlyRadioButton.addActionListener(this::scheduleHourlyRadioButtonActionPerformed);
        jPanel87.add(scheduleHourlyRadioButton);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hourly.png"))); // NOI18N
        jLabel54.setText("Hourly");
        jPanel87.add(jLabel54);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel2.add(jPanel87, gridBagConstraints);

        jPanel89.setMaximumSize(null);
        jPanel89.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroupScheduleType.add(scheduleMinutelyRadioButton);
        scheduleMinutelyRadioButton.setMaximumSize(null);
        scheduleMinutelyRadioButton.setMinimumSize(null);
        scheduleMinutelyRadioButton.setPreferredSize(null);
        scheduleMinutelyRadioButton.addActionListener(this::scheduleMinutelyRadioButtonActionPerformed);
        jPanel89.add(scheduleMinutelyRadioButton);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minutely.png"))); // NOI18N
        jLabel69.setText("Minutely");
        jPanel89.add(jLabel69);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        lookNfeelPanel2.add(jPanel89, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel3.add(lookNfeelPanel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        filtersJPanel3.add(spacer18, gridBagConstraints);

        informationPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel15.setPreferredSize(new java.awt.Dimension(298, 160));
        informationPanel15.setLayout(new java.awt.GridBagLayout());

        jTextPane16.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane16.setContentType("text/html"); // NOI18N
        jTextPane16.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nChoose here the schedule type: Schedule <u>Once</u> runs only once on a certain date, schedule <u>Minutely</u> runs recurrently every X minutes, schedule <u>Hourly</u> runs recurrently every X hours, schedule <u>Daily</u> \nruns recurrently on a certain time daily, schedule <u>Weekly</u> runs recurrently on a certain time and on specific weekdays every X weeks, schedule <u>Monthly</u> runs \nrecurrently every month on day number X, on a certain time and in specific months.After selecting a schedule type, the corresponding tab will get enabled in which you may set up additional options.<br />\nIf a time frame (<u>From</u>, <u>To</u>) is defined, this schedule will run only during this time frame.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel15.add(jTextPane16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel3.add(informationPanel15, gridBagConstraints);

        inExcludeJPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Time frame"));
        inExcludeJPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jLabel43.setMaximumSize(null);
        jLabel43.setMinimumSize(null);
        jLabel43.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        inExcludeJPanel3.add(jLabel43, gridBagConstraints);

        lookNfeelLabel5.setText("Run this schedule during:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        inExcludeJPanel3.add(lookNfeelLabel5, gridBagConstraints);

        scheduleTimeFrameToCheckBox.addActionListener(this::scheduleTimeFrameToCheckBoxActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel3.add(scheduleTimeFrameToCheckBox, gridBagConstraints);

        scheduleTimeFrameFromTextField.setColumns(12);
        scheduleTimeFrameFromTextField.setText("01-01-2010  00:00");
        scheduleTimeFrameFromTextField.setInputVerifier(new DateTimeVerifier(this, scheduleTimeFrameFromTextField));
        scheduleTimeFrameFromTextField.setMinimumSize(new java.awt.Dimension(96, 20));
        scheduleTimeFrameFromTextField.addActionListener(this::scheduleTimeFrameFromTextFieldActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel3.add(scheduleTimeFrameFromTextField, gridBagConstraints);

        scheduleTimeFrameToTextField.setColumns(12);
        scheduleTimeFrameToTextField.setText("01-01-2010  00:00");
        scheduleTimeFrameToTextField.setInputVerifier(new DateTimeVerifier(this, scheduleTimeFrameFromTextField));
        scheduleTimeFrameToTextField.setMinimumSize(new java.awt.Dimension(96, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel3.add(scheduleTimeFrameToTextField, gridBagConstraints);

        scheduleTimeFrameFromCheckBox.addActionListener(this::scheduleTimeFrameFromCheckBoxActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        inExcludeJPanel3.add(scheduleTimeFrameFromCheckBox, gridBagConstraints);

        scheduleTimeFrameFromLabel1.setText("From:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        inExcludeJPanel3.add(scheduleTimeFrameFromLabel1, gridBagConstraints);

        scheduleTimeFrameToLabel1.setText("To:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        inExcludeJPanel3.add(scheduleTimeFrameToLabel1, gridBagConstraints);

        scheduleTimeFrameFromLabel2.setText("(dd-MM-yyyy HH:mm)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        inExcludeJPanel3.add(scheduleTimeFrameFromLabel2, gridBagConstraints);

        scheduleTimeFrameToLabel2.setText("(dd-MM-yyyy HH:mm)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        inExcludeJPanel3.add(scheduleTimeFrameToLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel3.add(inExcludeJPanel3, gridBagConstraints);

        schedulesTabbedPane.addTab("Basics", filtersJPanel3);

        filtersJPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersJPanel7.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        filtersJPanel7.add(spacer22, gridBagConstraints);

        informationPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel19.setPreferredSize(new java.awt.Dimension(298, 160));
        informationPanel19.setLayout(new java.awt.GridBagLayout());

        jTextPane20.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane20.setContentType("text/html"); // NOI18N
        jTextPane20.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here the cerain time on which this schedule will run. A schedule of this type, will run and gets deactivitated afterwards(not deleted). If a <i>Once</i> schedule is not run, e.g. \nbecause other tasks are running all the time, it will be queued for execution and will run later on. A <i>Once</i> schedule which is older than 24 hours, will not run anymore.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel19.add(jTextPane20, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel7.add(informationPanel19, gridBagConstraints);

        dirIncludeAndExcludeFilesPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("When"));
        dirIncludeAndExcludeFilesPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel51.setText("Start this job once on:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        dirIncludeAndExcludeFilesPanel5.add(jLabel51, gridBagConstraints);

        scheduleOnceTextField.setColumns(12);
        scheduleOnceTextField.setText("01-01-2010 00:00");
        scheduleOnceTextField.setInputVerifier(new DateTimeVerifier(this, scheduleOnceTextField));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel5.add(scheduleOnceTextField, gridBagConstraints);

        jLabel62.setText("(dd-MM-yyyy HH:mm).");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel5.add(jLabel62, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        filtersJPanel7.add(dirIncludeAndExcludeFilesPanel5, gridBagConstraints);

        schedulesTabbedPane.addTab("Once", filtersJPanel7);

        filtersJPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersJPanel9.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        filtersJPanel9.add(spacer24, gridBagConstraints);

        informationPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel21.setPreferredSize(new java.awt.Dimension(298, 160));
        informationPanel21.setLayout(new java.awt.GridBagLayout());

        jTextPane22.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane22.setContentType("text/html"); // NOI18N
        jTextPane22.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here the interval (X) in hours. This schedule will run every X minutes recurrently.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel21.add(jTextPane22, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel9.add(informationPanel21, gridBagConstraints);

        dirIncludeAndExcludeFilesPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Minutely pattern"));
        dirIncludeAndExcludeFilesPanel7.setLayout(new java.awt.GridBagLayout());

        scheduleMinutelyEveryTextField.setColumns(2);
        scheduleMinutelyEveryTextField.setText("1");
        scheduleMinutelyEveryTextField.setDragEnabled(true);
        scheduleMinutelyEveryTextField.setInputVerifier(new LongIntVerifier(this, scheduleHourlyEveryTextField, 5, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel7.add(scheduleMinutelyEveryTextField, gridBagConstraints);

        jLabel67.setText("Start this job every");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        dirIncludeAndExcludeFilesPanel7.add(jLabel67, gridBagConstraints);

        jLabel68.setText("minute.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel7.add(jLabel68, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        filtersJPanel9.add(dirIncludeAndExcludeFilesPanel7, gridBagConstraints);

        schedulesTabbedPane.addTab("Minutely", filtersJPanel9);

        filtersJPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersJPanel8.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        filtersJPanel8.add(spacer23, gridBagConstraints);

        informationPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel20.setPreferredSize(new java.awt.Dimension(298, 160));
        informationPanel20.setLayout(new java.awt.GridBagLayout());

        jTextPane21.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane21.setContentType("text/html"); // NOI18N
        jTextPane21.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here the interval (X) in hours. This schedule will run every X hours recurrently.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel20.add(jTextPane21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel8.add(informationPanel20, gridBagConstraints);

        dirIncludeAndExcludeFilesPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Hourly pattern"));
        dirIncludeAndExcludeFilesPanel6.setLayout(new java.awt.GridBagLayout());

        scheduleHourlyEveryTextField.setColumns(2);
        scheduleHourlyEveryTextField.setText("1");
        scheduleHourlyEveryTextField.setDragEnabled(true);
        scheduleHourlyEveryTextField.setInputVerifier(new LongIntVerifier(this, scheduleHourlyEveryTextField, 1, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel6.add(scheduleHourlyEveryTextField, gridBagConstraints);

        jLabel58.setText("Start this job every");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        dirIncludeAndExcludeFilesPanel6.add(jLabel58, gridBagConstraints);

        jLabel59.setText("hour.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel6.add(jLabel59, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        filtersJPanel8.add(dirIncludeAndExcludeFilesPanel6, gridBagConstraints);

        schedulesTabbedPane.addTab("Hourly", filtersJPanel8);

        filtersJPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersJPanel4.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        filtersJPanel4.add(spacer19, gridBagConstraints);

        informationPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel16.setPreferredSize(new java.awt.Dimension(298, 160));
        informationPanel16.setLayout(new java.awt.GridBagLayout());

        jTextPane17.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane17.setContentType("text/html"); // NOI18N
        jTextPane17.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here the interval (X) and the time on which this schedule will run recurrently every X day.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel16.add(jTextPane17, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel4.add(informationPanel16, gridBagConstraints);

        dirIncludeAndExcludeFilesPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Daily pattern"));
        dirIncludeAndExcludeFilesPanel2.setLayout(new java.awt.GridBagLayout());

        scheduleDailyEveryTextField.setColumns(2);
        scheduleDailyEveryTextField.setText("1");
        scheduleDailyEveryTextField.setDragEnabled(true);
        scheduleDailyEveryTextField.setInputVerifier(new LongIntVerifier(this, scheduleDailyEveryTextField, 1, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel2.add(scheduleDailyEveryTextField, gridBagConstraints);

        jLabel48.setText("Start this job every");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        dirIncludeAndExcludeFilesPanel2.add(jLabel48, gridBagConstraints);

        scheduleDailyTimeTextField.setColumns(5);
        scheduleDailyTimeTextField.setText("00:00");
        scheduleDailyTimeTextField.setDragEnabled(true);
        scheduleDailyTimeTextField.setInputVerifier(new TimeVerifier(this, scheduleDailyTimeTextField));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel2.add(scheduleDailyTimeTextField, gridBagConstraints);

        jLabel55.setText("day(s) at:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel2.add(jLabel55, gridBagConstraints);

        jLabel63.setText("(HH:mm).");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel2.add(jLabel63, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        filtersJPanel4.add(dirIncludeAndExcludeFilesPanel2, gridBagConstraints);

        schedulesTabbedPane.addTab("Daily", filtersJPanel4);

        filtersJPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersJPanel5.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        filtersJPanel5.add(spacer20, gridBagConstraints);

        informationPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel17.setPreferredSize(new java.awt.Dimension(298, 160));
        informationPanel17.setLayout(new java.awt.GridBagLayout());

        jTextPane18.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane18.setContentType("text/html"); // NOI18N
        jTextPane18.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here the interval (X), the time and the weekday on which this schedule will run every X weeks recurrently.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel17.add(jTextPane18, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel5.add(informationPanel17, gridBagConstraints);

        dirIncludeAndExcludeFilesPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Weekly pattern"));
        dirIncludeAndExcludeFilesPanel3.setLayout(new java.awt.GridBagLayout());

        scheduleWeeklyEveryTextField.setColumns(2);
        scheduleWeeklyEveryTextField.setText("1");
        scheduleWeeklyEveryTextField.setDragEnabled(true);
        scheduleWeeklyEveryTextField.setInputVerifier(new LongIntVerifier(this, scheduleWeeklyEveryTextField, 1, 52));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklyEveryTextField, gridBagConstraints);

        jLabel49.setText("Start this job every");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        dirIncludeAndExcludeFilesPanel3.add(jLabel49, gridBagConstraints);

        jLabel56.setText("(HH:mm) on these days:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(jLabel56, gridBagConstraints);

        scheduleWeeklyMondayCheckBox.setText("Monday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklyMondayCheckBox, gridBagConstraints);

        scheduleWeeklyTuesdayCheckBox.setText("Tuesday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklyTuesdayCheckBox, gridBagConstraints);

        scheduleWeeklyWednesdayCheckBox.setText("Wednesday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklyWednesdayCheckBox, gridBagConstraints);

        scheduleWeeklyThursdayCheckBox.setText("Thursday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklyThursdayCheckBox, gridBagConstraints);

        scheduleWeeklyFridayCheckBox.setText("Friday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklyFridayCheckBox, gridBagConstraints);

        scheduleWeeklySaturdayCheckBox.setText("Saturday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklySaturdayCheckBox, gridBagConstraints);

        scheduleWeeklySundayCheckBox.setText("Sunday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklySundayCheckBox, gridBagConstraints);

        jLabel60.setText("week(s) at");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(jLabel60, gridBagConstraints);

        scheduleWeeklyTimeTextField.setColumns(5);
        scheduleWeeklyTimeTextField.setText("00:00");
        scheduleWeeklyTimeTextField.setDragEnabled(true);
        scheduleWeeklyTimeTextField.setInputVerifier(new TimeVerifier(this, scheduleDailyTimeTextField));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel3.add(scheduleWeeklyTimeTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        filtersJPanel5.add(dirIncludeAndExcludeFilesPanel3, gridBagConstraints);

        schedulesTabbedPane.addTab("Weekly", filtersJPanel5);

        filtersJPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        filtersJPanel6.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        filtersJPanel6.add(spacer21, gridBagConstraints);

        informationPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        informationPanel18.setPreferredSize(new java.awt.Dimension(298, 160));
        informationPanel18.setLayout(new java.awt.GridBagLayout());

        jTextPane19.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextPane19.setContentType("text/html"); // NOI18N
        jTextPane19.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nYou may define here the day of the month (X), the time and the months on which this schedule will run recurrently.\n    </p>\r\n  </body>\r\n</html>\r\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        informationPanel18.add(jTextPane19, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        filtersJPanel6.add(informationPanel18, gridBagConstraints);

        dirIncludeAndExcludeFilesPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Monthy pattern"));
        dirIncludeAndExcludeFilesPanel4.setLayout(new java.awt.GridBagLayout());

        scheduleMonthlyDayNumberTextField.setColumns(2);
        scheduleMonthlyDayNumberTextField.setText("1");
        scheduleMonthlyDayNumberTextField.setDragEnabled(true);
        scheduleMonthlyDayNumberTextField.setInputVerifier(new LongIntVerifier(this, scheduleMonthlyDayNumberTextField, 1, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyDayNumberTextField, gridBagConstraints);

        jLabel50.setText("Start this job on day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        dirIncludeAndExcludeFilesPanel4.add(jLabel50, gridBagConstraints);

        jLabel57.setText("(HH:mm) of these months:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(jLabel57, gridBagConstraints);

        scheduleMonthlyJanuaryCheckBox.setText("January");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyJanuaryCheckBox, gridBagConstraints);

        scheduleMonthlyFebruaryCheckBox.setText("February");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyFebruaryCheckBox, gridBagConstraints);

        scheduleMonthlyMarchCheckBox.setText("March");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyMarchCheckBox, gridBagConstraints);

        scheduleMonthlyAprilCheckBox.setText("April");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyAprilCheckBox, gridBagConstraints);

        scheduleMonthlyMayCheckBox.setText("May");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyMayCheckBox, gridBagConstraints);

        scheduleMonthlyJuneCheckBox.setText("June");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 0);
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyJuneCheckBox, gridBagConstraints);

        scheduleMonthlyJulyCheckBox.setText("July");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyJulyCheckBox, gridBagConstraints);

        scheduleMonthlyAugustCheckBox.setText("August");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyAugustCheckBox, gridBagConstraints);

        scheduleMonthlySeptemberCheckBox.setText("September");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlySeptemberCheckBox, gridBagConstraints);

        scheduleMonthlyOctoberCheckBox.setText("October");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyOctoberCheckBox, gridBagConstraints);

        scheduleMonthlyNovemberCheckBox.setText("November");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyNovemberCheckBox, gridBagConstraints);

        scheduleMonthlyDecemberCheckBox.setText("December");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyDecemberCheckBox, gridBagConstraints);

        jLabel61.setText("at");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        dirIncludeAndExcludeFilesPanel4.add(jLabel61, gridBagConstraints);

        scheduleMonthlyTimeTextField.setColumns(5);
        scheduleMonthlyTimeTextField.setText("00:00");
        scheduleMonthlyTimeTextField.setDragEnabled(true);
        scheduleMonthlyTimeTextField.setInputVerifier(new TimeVerifier(this, scheduleDailyTimeTextField));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        dirIncludeAndExcludeFilesPanel4.add(scheduleMonthlyTimeTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.01;
        filtersJPanel6.add(dirIncludeAndExcludeFilesPanel4, gridBagConstraints);

        schedulesTabbedPane.addTab("Monthly", filtersJPanel6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(schedulesTabbedPane, gridBagConstraints);

        schedulesButtonsPanel.setLayout(new javax.swing.BoxLayout(schedulesButtonsPanel, javax.swing.BoxLayout.LINE_AXIS));

        schedulesOKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        schedulesOKButton.setText("OK");
        schedulesOKButton.setAlignmentX(0.5F);
        schedulesOKButton.setMaximumSize(null);
        schedulesOKButton.setMinimumSize(null);
        schedulesOKButton.setPreferredSize(null);
        schedulesOKButton.addActionListener(this::schedulesOKButtonActionPerformed);
        schedulesButtonsPanel.add(schedulesOKButton);

        schedulesCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        schedulesCancelButton.setText("Cancel");
        schedulesCancelButton.setAlignmentX(0.5F);
        schedulesCancelButton.setMaximumSize(null);
        schedulesCancelButton.setMinimumSize(null);
        schedulesCancelButton.setPreferredSize(null);
        schedulesCancelButton.addActionListener(this::schedulesCancelButtoncancelActionPerformed);
        schedulesButtonsPanel.add(schedulesCancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(schedulesButtonsPanel, gridBagConstraints);

        pack();
    }// </editor-fold>

    private void schedulesOKButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // If no focus -> a fields has blocked applying settings
        if (schedulesOKButton.hasFocus()) {
            applySchedule();
            this.setVisible(false);
        }
    }

    private void schedulesCancelButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void scheduleHourlyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleMonthlyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleWeeklyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleDailyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleOnceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleTimeFrameFromTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleTimeFrameFromCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleTimeFrameToCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    private void scheduleMinutelyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        schedulesEvent();
    }

    abstract protected void applySchedule();

    abstract protected void schedulesEvent();
}
