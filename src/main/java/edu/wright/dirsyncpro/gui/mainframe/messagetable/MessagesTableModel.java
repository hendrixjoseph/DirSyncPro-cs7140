/*
 * MessagesTableModel.java
 *
 * Copyright (C) 2010-2011 O. Givi (info@dirsyncpro.org)
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
package edu.wright.dirsyncpro.gui.mainframe.messagetable;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.message.Message;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class MessagesTableModel extends AbstractTableModel {
    //private static final long serialVersionUID = 45L;

    private static final String[] columnNames = {"Time", "Message"};

    public MessagesTableModel() {
    }

    /**
     *
     */
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    /**
     * @see TableModel#getColumnCount()
     */
    @Override
    public final int getColumnCount() {
        return 2;
    }

    /**
     * @see TableModel#getRowCount()
     */
    @Override
    public final int getRowCount() {
        if (DirSyncPro.getSync() != null && DirSyncPro.getSync().getLog().getMessages() != null) {
            return DirSyncPro.getSync().getLog().getMessages().viewSize();
        } else {
            return 0;
        }
    }

    /**
     * @see TableModel#isCellEditable(int, int)
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /**
     * @see TableModel#getValueAt(int, int)
     */
    @Override
    public final Object getValueAt(int row, int column) {
        if (row < 0 || row >= getRowCount() || column < 0 || column >= getColumnCount()) {
            return null;
        }

        String item = "";
        Message mes = DirSyncPro.getSync().getLog().getMessages().getFilteredView(row);

        switch (column) {
            case 0:
                item = mes.getDateStr();
                break;
            case 1:
                item = mes.toString();
                break;
        }
        return item;
    }

    /**
     * @see TableModel#getColumnClass(int)
     */
    @Override
    public final Class<?> getColumnClass(int column) {
        return String.class;
    }
}
