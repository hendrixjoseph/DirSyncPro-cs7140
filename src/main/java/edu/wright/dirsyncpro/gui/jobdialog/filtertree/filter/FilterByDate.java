/*
 * FilterByDate.java
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
package edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.job.Job;
import edu.wright.dirsyncpro.tools.FileTools;

import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FilterByDate extends Filter {

    private FilterDateMode filterDateMode;
    private Date date;
    private FilterDateType filterDateType;
    private int timeUnitValue;
    private FilterTimeUnitType unitType;
    public FilterByDate(Job j, Action a) {
        super(j, a);
        type = Filter.Type.ByDate;
    }
    public FilterByDate(Job j, Action a, Date d, FilterDateType fdt) {
        this(j, a);
        date = d;
        filterDateType = fdt;
        this.filterDateMode = FilterDateMode.SpecificTime;
        this.timeUnitValue = 0;
        this.unitType = FilterTimeUnitType.Hours; //dummy
    }
    public FilterByDate(Job j, Action a, Integer unitValue, FilterTimeUnitType unitType, FilterDateType dateType) {
        this(j, a);
        this.timeUnitValue = unitValue;
        this.unitType = unitType;
        this.filterDateMode = FilterDateMode.TimeUnit;
        this.filterDateType = dateType;
        this.date = new Date();
    }

    @Override
    public boolean matches(Path path) {
        if (filterDateMode == FilterDateMode.TimeUnit) {
            Calendar c = new GregorianCalendar();
            c.add(unitType.getValue(), -1 * timeUnitValue);
            date = c.getTime();
        }

        int fileComp = FileTools.cmpFileDatesInMinutes(path.toFile(), date);
        return ((filterDateType == FilterDateType.EarlierThan && fileComp == -1)
                || (filterDateType == FilterDateType.ExactlyOn && fileComp == 0)
                || (filterDateType == FilterDateType.LaterThan && fileComp == 1));
    }

    public FilterDateMode getDateMode() {
        return filterDateMode;
    }

    public void setDateMode(FilterDateMode mode) {
        this.filterDateMode = mode;
    }

    public boolean isFilterByTimeUnit() {
        return filterDateMode == FilterDateMode.TimeUnit;
    }

    public boolean isFilterByModificationTime() {
        return filterDateMode == FilterDateMode.SpecificTime;
    }

    public Integer getTimeUnitValue() {
        return timeUnitValue;
    }

    public void setTimeUnitValue(int unit) {
        this.timeUnitValue = unit;
    }

    public FilterTimeUnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(FilterTimeUnitType unitType) {
        this.unitType = unitType;
    }

    public FilterDateType getDateType() {
        return filterDateType;
    }

    public void setDateType(FilterDateType type) {
        this.filterDateType = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String s = "";
        s += " Files/Directories modified";
        if (null != this.filterDateType) {
            switch (this.filterDateType) {
                case EarlierThan:
                    s += " earlier than";
                    break;
                case ExactlyOn:
                    s += " exactly on";
                    break;
                default:
                    s += " later than";
                    break;
            }
        }
        if (filterDateMode == FilterDateMode.SpecificTime) {
            s += " " + (new SimpleDateFormat(Const.DefaultDateFormat)).format(this.date);
        } else {
            s += " " + timeUnitValue;
            switch (unitType) {
                case Hours:
                    s += " hours";
                    break;
                case Days:
                    s += " days";
                    break;
                case Weeks:
                    s += " weeks";
                    break;
                case Months:
                    s += " months";
                    break;
            }
            s += " ago";
        }
        return s;
    }

    @Override
    public int compareTo(Filter s) {
        if (s instanceof FilterByDate) {
            return date.compareTo(((FilterByDate) s).getDate());
        } else {
            return super.compareTo(s);
        }
    }

    public enum FilterDateType {
        EarlierThan, ExactlyOn, LaterThan
    }

    public enum FilterDateMode {
        SpecificTime, TimeUnit
    }

    public enum FilterTimeUnitType {
        Hours(Calendar.HOUR),
        Days(Calendar.DAY_OF_YEAR),
        Weeks(Calendar.WEEK_OF_YEAR),
        Months(Calendar.MONTH);

        private int value;

        FilterTimeUnitType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
