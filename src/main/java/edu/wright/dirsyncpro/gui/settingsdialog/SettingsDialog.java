/* GuiHandler.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2005 T. Groetzner
 * Copyright (C) 2003-2006, 2008 F. Gerbig
 * Copyright (C) 2002 E. Gerber
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
package edu.wright.dirsyncpro.gui.settingsdialog;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.Const.IconKey;
import edu.wright.dirsyncpro.Const.LogLevel;
import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.job.Job;
import edu.wright.dirsyncpro.tools.GuiTools;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.io.File;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Contains the GUI methods.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
@SuppressWarnings({"serial"})
public class SettingsDialog extends SettingsDialogObjects {

    public SettingsDialog(JFrame frame) {
        super(frame);
    }

    @Override
    protected void logsPathCheckboxClicked() {
        boolean b = !logsPathInlineCheckBox.isSelected();
        logsPathField.setEnabled(b);
        logsPathBrowseButton.setEnabled(b);
        logsPathLabel.setEnabled(b);
    }

    @Override
    protected void configPathCheckboxClicked() {
        boolean b = !configPathInlineCheckBox.isSelected();
        configPathField.setEnabled(b);
        configPathBrowseButton.setEnabled(b);
        configPathLabel.setEnabled(b);
    }

    @Override
    protected void browseConfigPath() {
        GuiTools.browseFolder(this, configPathField);
        DirSyncPro.setConfigPath(configPathField.getText());
    }

    @Override
    protected void browseSettingsLogPath() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (!logsPathField.getText().isEmpty()) {
            fileChooser.setCurrentDirectory(new File(logsPathField.getText()));
        }

        if (fileChooser.showOpenDialog(null) == javax.swing.JFileChooser.APPROVE_OPTION) {
            logsPathField.setText(fileChooser.getSelectedFile().getPath());
        }
    }

    @Override
    protected void applyApplicationSettings() {
        // global log will be initialised by start()
        Runnable r = () -> {
            setGeneral();
            setView();
            setSync();
            setLog();
        };
        SwingUtilities.invokeLater(r);
    }

    protected void setView() {
        try {
            DirSyncPro.setSystemLookAndFeel(nativeWindowRadioButton.isSelected());
            if (nativeWindowRadioButton.isSelected()) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        // repaint all components
        DirSyncPro.getGui().updateAllComponentTreeUI();

        DirSyncPro.setMinimizeToSystemTray(minimizeToSystemTrayCheckBox.isSelected());
        DirSyncPro.setSingleClickSystemTray(singleClickSystemTrayCheckBox.isSelected());
    }

    protected void setSync() {
        DirSyncPro.setKeepSyncQAfterSync(leaveSyncQueueCheckBox.isSelected());
        DirSyncPro.setShutDownCommand(shutDownCommandField.getText());
    }

    private void setLog() {
        DirSyncPro.setJobsetLogEnabled(enableJobsetLogCheckBox.isSelected());
        DirSyncPro.getSync().setUpLogFile(enableJobsetLogCheckBox.isSelected());

        DirSyncPro.setGlobalLogEnabled(enableGlobalLogCheckBox.isSelected());
        DirSyncPro.setUpLogFile(enableGlobalLogCheckBox.isSelected());

        String dspOldValue = DirSyncPro.getLogsPath(false);
        String dspNewValue = logsPathField.getText();
        if (!logsPathInlineCheckBox.isSelected()) {
            DirSyncPro.setLogsInline(false);
            if (!dspOldValue.equals(dspNewValue)) {
                // the path is changed
                DirSyncPro.setLogsPath(dspNewValue);
                DirSyncPro.getSync().getLog().printExcessive("Logpath reset.", IconKey.Info);

                //dirs logs
                for (Job job : DirSyncPro.getSync().getJobs()) {
                    job.getLog().setPath(dspNewValue);
                }
            }
        } else {
            DirSyncPro.setLogsInline(true);
        }

        if (minimalLogRadioButton.isSelected()) {
            DirSyncPro.setLogLevel(LogLevel.Minimal);
        } else if (moderateLogRadioButton.isSelected()) {
            DirSyncPro.setLogLevel(LogLevel.Moderate);
        } else {
            DirSyncPro.setLogLevel(LogLevel.Excessive);
        }

    }

    private void setGeneral() {
        if (!configPathInlineCheckBox.isSelected()) {
            DirSyncPro.setConfigPath(configPathField.getText());
            DirSyncPro.getGui().setCurrentConfig(new File(configPathField.getText() + File.separator + DirSyncPro.getGui().getCurrentConfig().getName()));
        } else {
            DirSyncPro.setConfigInline(true);
        }
        DirSyncPro.setLoadLastConfig(loadLastConfigCheckBox.isSelected());
        DirSyncPro.setStartScheduleEngineOnStartup(startScheduleEngineCheckBox.isSelected());
        DirSyncPro.setCheckForUpdates(programUpdateCheckBox.isSelected());
    }

    public void initApplicationSettingDialog() {

        //General
        configPathField.setText(DirSyncPro.getConfigPath(false));
        if (DirSyncPro.isConfigInline()) {
            configPathInlineCheckBox.setSelected(true);
            configPathField.setEnabled(false);
            configPathBrowseButton.setEnabled(false);
            configPathLabel.setEnabled(false);
        }
        loadLastConfigCheckBox.setSelected(DirSyncPro.isLoadLastConfig());
        startScheduleEngineCheckBox.setSelected(DirSyncPro.isStartScheduleEngineOnStartup());
        programUpdateCheckBox.setSelected(DirSyncPro.isCheckforUpdate());

        //View
        if (DirSyncPro.isSystemLookAndFeel()) {
            nativeWindowRadioButton.setSelected(true);
        } else {
            javaMetalRadioButton.setSelected(true);
        }
        minimizeToSystemTrayCheckBox.setSelected(DirSyncPro.isMinimizeToSystemTray());
        singleClickSystemTrayCheckBox.setSelected(DirSyncPro.isSingleClickSystemTray());

        //Sync
        leaveSyncQueueCheckBox.setSelected(DirSyncPro.isKeepSyncQAfterSync());

        //Log
        enableGlobalLogCheckBox.setSelected(DirSyncPro.isGlobalLogEnabled());
        enableJobsetLogCheckBox.setSelected(DirSyncPro.isJobsetLogEnabled());
        logsPathField.setText(DirSyncPro.getLogsPath(false));
        if (DirSyncPro.isLogsInline()) {
            logsPathInlineCheckBox.setSelected(true);
            logsPathField.setEnabled(false);
            logsPathBrowseButton.setEnabled(false);
            logsPathLabel.setEnabled(false);
        }
        shutDownCommandField.setText(DirSyncPro.getShutDownCommand());
        if (DirSyncPro.getSync().getLogLevel().equals(Const.LogLevel.Minimal)) {
            minimalLogRadioButton.setSelected(true);
        } else if (DirSyncPro.getSync().getLogLevel().equals(Const.LogLevel.Moderate)) {
            moderateLogRadioButton.setSelected(true);
        } else {
            excessiveLogRadioButton.setSelected(true);
        }
        applicationSettingtabbedPane.setSelectedIndex(0);
    }

    public void enableUpdate() {
        programUpdateCheckBox.setEnabled(false);
        programeUpdateCheckBoxLabel.setEnabled(false);
        if (!programeUpdateCheckBoxLabel.getText().contains("DISABLED IN BETA")) {
            programeUpdateCheckBoxLabel.setText(programeUpdateCheckBoxLabel.getText() + " (DISABLED IN BETA)");
        }
    }

    @Override
    protected void checkForUpdate(boolean b) {
        DirSyncPro.getGui().getUpdateDialog().checkForUpdate(b, this);
    }

    @Override
    protected void exitForm() {
        DirSyncPro.getGui().exitForm();
    }

    @Override
    protected void iconifyForm() {
        DirSyncPro.getGui().iconifyForm();
    }

    @Override
    protected void setDefaultShutDownCommandField() {
        shutDownCommandField.setText(Const.Properties.ShutDownCommand.getDefault());
    }

}
