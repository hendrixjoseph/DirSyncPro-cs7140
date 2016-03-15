/*
 * DSPReadByteChannel.java
 *
 * Copyright (C) 2012 O. Givi (info@dirsyncpro.org)
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
package edu.wright.dirsyncpro.tools.copy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

import edu.wright.dirsyncpro.DirSyncPro;

public class DSPReadByteChannel implements ReadableByteChannel {

    private final ActionListener progressBarUpdater = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            if (DirSyncPro.isGuiMode()) {
                DirSyncPro.getGui().registerProgressBars(-1, -1, -1, "", false, (int) (readBytes * 100.), 100, "", false);
            }
        }
    };

    ReadableByteChannel rbc;
    long readBytes = 0;

    @Override
    public boolean isOpen() {
        return rbc.isOpen();
    }

    @Override
    public void close() throws IOException {
        rbc.close();
    }

    @Override
    public int read(java.nio.ByteBuffer dst) throws IOException {
        int bytes = rbc.read(dst);
        readBytes += bytes;
        return bytes;
    }

}
