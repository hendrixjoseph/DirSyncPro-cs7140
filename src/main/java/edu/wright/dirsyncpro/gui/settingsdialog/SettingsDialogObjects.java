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
package edu.wright.dirsyncpro.gui.settingsdialog;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.tools.GuiTools;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class SettingsDialogObjects extends javax.swing.JDialog {

    protected javax.swing.JTabbedPane applicationSettingtabbedPane;

    protected javax.swing.JButton configPathBrowseButton;
    protected javax.swing.JTextField configPathField;
    protected javax.swing.JCheckBox configPathInlineCheckBox;
    protected javax.swing.JLabel configPathLabel;
    protected javax.swing.JCheckBox enableGlobalLogCheckBox;
    protected javax.swing.JCheckBox enableJobsetLogCheckBox;
    protected javax.swing.JRadioButton excessiveLogRadioButton;
    protected javax.swing.JRadioButton javaMetalRadioButton;
    protected javax.swing.JCheckBox leaveSyncQueueCheckBox;
    protected javax.swing.JCheckBox loadLastConfigCheckBox;
    protected javax.swing.JButton logsPathBrowseButton;
    protected javax.swing.JTextField logsPathField;
    protected javax.swing.JCheckBox logsPathInlineCheckBox;
    protected javax.swing.JLabel logsPathLabel;
    protected javax.swing.JRadioButton minimalLogRadioButton;
    protected javax.swing.JCheckBox minimizeToSystemTrayCheckBox;
    protected javax.swing.JRadioButton moderateLogRadioButton;
    protected javax.swing.JRadioButton nativeWindowRadioButton;
    protected javax.swing.JCheckBox programUpdateCheckBox;
    protected javax.swing.JLabel programeUpdateCheckBoxLabel;
    protected javax.swing.JTextField shutDownCommandField;
    protected javax.swing.JCheckBox singleClickSystemTrayCheckBox;
    protected javax.swing.JCheckBox startScheduleEngineCheckBox;
    public SettingsDialogObjects(JFrame frame) {
        super(frame);
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());
    }

    abstract protected void applyApplicationSettings();

    abstract protected void browseConfigPath();

    abstract protected void iconifyForm();

    abstract protected void exitForm();

    abstract protected void browseSettingsLogPath();

    abstract protected void checkForUpdate(boolean b);

    abstract protected void configPathCheckboxClicked();

    abstract protected void logsPathCheckboxClicked();

    abstract protected void setDefaultShutDownCommandField();
}
