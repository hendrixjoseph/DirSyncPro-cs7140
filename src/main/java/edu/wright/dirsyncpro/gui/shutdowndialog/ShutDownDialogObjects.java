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
package edu.wright.dirsyncpro.gui.shutdowndialog;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.tools.GuiTools;

import javax.swing.JFrame;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class ShutDownDialogObjects extends javax.swing.JDialog {

    protected javax.swing.JLabel secondsJLabel;

    public ShutDownDialogObjects(JFrame frame) {
        super(frame);
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());
    }

}
