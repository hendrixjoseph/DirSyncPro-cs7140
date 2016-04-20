/*
 * WildcardTools.java
 *
 * Copyright (C) 2005, 2007, 2008 F. Gerbig (fgerbig@users.sourceforge.net)
 * Copyright (C) 2005 T. Groetzner
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

import edu.wright.dirsyncpro.job.Job;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Tools for handling the time and date wildcards.
 *
 * @author T. Groetzner, F. Gerbig (fgerbig@users.sourceforge.net)
 */
public class WildcardTools {
    // the wildcards to be replaced by the current date and time

    private static final String WILDCARD_DATE = "<date>";
    private static final String WILDCARD_TIME = "<time>";
    private static final String WILDCARD_DATE_DAY = "<DD>";
    private static final String WILDCARD_DATE_MONTH = "<MM>";
    private static final String WILDCARD_DATE_YEAR = "<YYYY>";
    private static final String WILDCARD_TIME_HOUR = "<hh>";
    private static final String WILDCARD_TIME_MINUTE = "<mm>";
    private static final String WILDCARD_TIME_SECOND = "<ss>";

    private static final String WILDCARD_NAME = "<jobname>";

    private static final String WILDCARD_USERNAME = "<username>";
    private static final String WILDCARD_USERHOME = "<userhome>";

    // Don't let anyone instantiate this class.
    private WildcardTools() {
    }

    /**
     * Replaces the date wildcards in the given String with the given Date.
     *
     * @param s The String containing wildcards.
     * @param d The date to replace the wildcards with.
     *
     * @return The string with the wildcards replaced.
     */
    public static String replaceDateWildcards(String s, Date d) {
        String date;
        String year;
        String month;
        String day;

        // format date
        SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateInstance();
        df.applyPattern("yyyy-MM-dd");
        date = df.format(d);

        // format single date parts
        df.applyPattern("yyyy"); // year
        year = df.format(d);
        df.applyPattern("MM"); // month
        month = df.format(d);
        df.applyPattern("dd"); // day
        day = df.format(d);

        s = replaceAll(s, WILDCARD_DATE, date);

        s = replaceAll(s, WILDCARD_DATE_YEAR, year);
        s = replaceAll(s, WILDCARD_DATE_MONTH, month);
        s = replaceAll(s, WILDCARD_DATE_DAY, day);

        return s;
    }

    /**
     * Replaces the time wildcards in the given String with the given Date.
     *
     * @param s The String containing wildcards.
     * @param d The date to replace the wildcards with.
     *
     * @return The string with the wildcards replaced.
     */
    public static String replaceTimeWildcards(String s, Date d) {
        String time;
        String hour;
        String minute;
        String second;

        // format time
        SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateInstance();
        df.applyPattern("HH_mm_ss");
        time = df.format(d);

        // format single time parts
        df.applyPattern("HH"); // hour
        hour = df.format(d);
        df.applyPattern("mm"); // minute
        minute = df.format(d);
        df.applyPattern("ss"); // second
        second = df.format(d);

        s = replaceAll(s, WILDCARD_TIME, time);

        s = replaceAll(s, WILDCARD_TIME_HOUR, hour);
        s = replaceAll(s, WILDCARD_TIME_MINUTE, minute);
        s = replaceAll(s, WILDCARD_TIME_SECOND, second);

        return s;
    }

    /**
     * Replaces the jobname wildcards in the given String with the corresponding
     * system properties.
     *
     * @param s The String containing wildcards.
     * @param job The directory to replace the wildcards with.
     *
     * @return The string with the wildcards replaced.
     */
    public static String replaceDirectoryWildcards(String s, Job job) {
        return replaceAll(s, WildcardTools.WILDCARD_NAME, job.getName());
    }

    /**
     * Replaces the user wildcards in the given String with the corresponding
     * system properties.
     *
     * @param s The String containing wildcards.
     *
     * @return The string with the wildcards replaced.
     */
    public static String replaceUserWildcards(String s) {
        s = replaceAll(s, WILDCARD_USERNAME, System.getProperty("user.name", ""));
        s = replaceAll(s, WILDCARD_USERHOME, System.getProperty("user.home", ""));
        return s;
    }

    /**
     * Generic "replace all" method replacing all occurences of &lt;what&gt; in
     * &lt;where&gt; with &lt;withWhat&gt;.
     *
     * @param where The {@code String} to change.
     * @param what The {@code String} to replace.
     * @param withWhat The {@code String} to replace with.
     *
     * @return The string with all occurences of &lt;what&gt; replaced by
     * &lt;withWhat&gt;.
     */
    public static String replaceAll(String where, String what, String withWhat) {
        while (where.contains(what)) {
            where = where.replace(what, withWhat);
        }
        return where;
    }
}
