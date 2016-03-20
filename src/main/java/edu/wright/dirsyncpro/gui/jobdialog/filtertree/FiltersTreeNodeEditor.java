/*
 * FiltersTreeNodeEditor.java
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
package edu.wright.dirsyncpro.gui.jobdialog.filtertree;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.Filter;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByDate;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFileAttribute;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFileOwnership;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFilePermissions;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFileSize;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByPath;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByPattern;

import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.util.EventObject;

public class FiltersTreeNodeEditor extends AbstractCellEditor implements TreeCellEditor {

    FiltersTreeCellRenderer filtersTreeCellrenderer = new FiltersTreeCellRenderer();

    JTree tree;

    public FiltersTreeNodeEditor(JTree t) {
        tree = t;
    }

    @Override
    public Object getCellEditorValue() {
        //dummy
        return null;
    }

    @Override
    public boolean isCellEditable(EventObject event) {
        boolean editable = false;
        if (event instanceof MouseEvent) {
            MouseEvent mouseEvent = (MouseEvent) event;
            TreePath selectedPath = tree.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
            if (selectedPath != null) {
                Object node = selectedPath.getLastPathComponent();
                if ((node != null) && (node instanceof DefaultMutableTreeNode)) {
                    DefaultMutableTreeNode mutableNode = (DefaultMutableTreeNode) node;
                    Filter filter = ((FiltersTree) mutableNode).filter;
                    boolean enabled = (filter instanceof FilterByPattern) || (filter instanceof FilterByPath) || (filter instanceof FilterByFileSize) || (filter instanceof FilterByFilePermissions) || (filter instanceof FilterByFileOwnership) || (filter instanceof FilterByFileAttribute) || (filter instanceof FilterByDate);
                    DirSyncPro.getGui().getJobDialog().enableEditRemoveFilterButtons(enabled);
                    if (enabled && mouseEvent.getClickCount() == 2) {
                        DirSyncPro.getGui().getJobDialog().openEditFilterDialog();
                    }
                    editable |= (mutableNode.isRoot());
                }
            }
        }
        return editable;
    }

    @Override
    public Component getTreeCellEditorComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row) {

        Component editorComponent = filtersTreeCellrenderer.getTreeCellRendererComponent(tree, value, true, expanded, leaf, row, true);

        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (stopCellEditing()) {
                    fireEditingStopped();
                }
            }
        };

        if (editorComponent instanceof JCheckBox) {
            ((JCheckBox) editorComponent).addItemListener(itemListener);
        }

        return editorComponent;
    }
}
