/*
 * TextFromatTool.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
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
package edu.wright.dirsyncpro.tools;

import edu.wright.dirsyncpro.Const;

import java.io.File;
import java.text.SimpleDateFormat;

public class TextFormatTool {

    // Don't let anyone instantiate this class.
    private TextFormatTool() {
    }

    /**
     * Returns a date string for the last modification of the time.
     *
     * @return Time of last modification of the file as a date string.
     */
    public static String getLastModifiedShort(long time) {
        return (new SimpleDateFormat(Const.DefaultDateShortFormat)).format(time);
    }

    /**
     * Returns a date string for the last modification of the file.
     *
     * @return Time of last modification of the file as a date string.
     */
    public static String getLastModifiedLong(File f) {
        return (new SimpleDateFormat(Const.DefaultDateLongFormat)).format(f.lastModified());
    }

    /**
     * Returns a date string for the last modification of the time.
     *
     * @return Time of last modification of the file as a date string.
     */
    public static String getLastModifiedLong(long time) {
        return (new SimpleDateFormat(Const.DefaultDateLongFormat)).format(time);
    }

    /**
     * Returns the human readable formatted number.
     *
     * @param number The number to format
     *
     * @return Formatted number.
     */
    public static String getHumanReadable(long number) {
        int base = 1024;
        if (number < base) {
            return number + " B";
        } else {
            int exponent = (int) (Math.log(number) / Math.log(base));
            char unit = "KMGTPE".charAt(exponent - 1);
            return String.format("%.1f %sB", number / Math.pow(base, exponent), unit);
        }

    }

}
