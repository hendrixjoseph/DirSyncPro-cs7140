/*
 * TimeVerifier.java
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
package edu.wright.dirsyncpro.gui.verifier;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;

public class TimeVerifier extends DSPInputVerifier implements KeyListener, MouseListener {

    public TimeVerifier(JDialog parentDialog, JComponent component) {
        super(parentDialog, component, "Time format error!");
    }

    @Override
    public boolean verify(JComponent component) {
        JFormattedTextField field = (JFormattedTextField) component;

        boolean valid = field.getText().matches("\\d{2}:\\d{2}");
        if (valid) {
            setOriginalColor(component);
            popup.setVisible(false);
        } else {
            field.setBackground(Color.YELLOW);
            popup.setSize(0, 0);
            popup.setLocationRelativeTo(component);
            Point point = popup.getLocation();
            Dimension componentSize = component.getSize();
            popup.setLocation(point.x - (int) componentSize.getWidth() / 2, point.y + (int) componentSize.getHeight() / 2);
            popup.pack();
            popup.setVisible(true);
        }

        return valid;
    }
}
