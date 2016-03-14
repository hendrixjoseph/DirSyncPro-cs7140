/*
 * Filters.java
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

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FilterSet implements Cloneable {

    protected List<Filter> includeFilters = new ArrayList<>();
    protected List<Filter> excludeFilters = new ArrayList<>();

    /**
     * Adds the filter in the filter array list.
     *
     * @param filt
     */
    public void addFilter(Filter filt) {
        if (filt.getAction() == Filter.Action.Include) {
            includeFilters.add(filt);
        } else {
            excludeFilters.add(filt);
        }
    }

    @Override
    public Object clone() {
        FilterSet fs = null;
        try {
            fs = (FilterSet) super.clone();
        } catch (CloneNotSupportedException e) {
            // dummy, will not happen
        }

        fs.includeFilters = new ArrayList<>(this.includeFilters);
        fs.excludeFilters = new ArrayList<>(this.excludeFilters);
        return fs;
    }

    /**
     * Returns whether this job has filters
     *
     * @return boolean, whether this job has filters
     */
    public boolean hasFilters() {
        return (includeFilters.size() + excludeFilters.size() > 0);
    }

    /**
     * @return the filters array list
     */
    public List<Filter> getFilters() {
        List<Filter> allFilters = new ArrayList<>();
        for (Filter filt : includeFilters) {
            allFilters.add((Filter) filt.clone());
        }
        for (Filter filt : excludeFilters) {
            allFilters.add((Filter) filt.clone());
        }
        return allFilters;
    }

    /**
     * @param filters the filters to set
     */
    public void setFilters(List<Filter> filters) {
        includeFilters = new ArrayList<>();
        excludeFilters = new ArrayList<>();

        for (Filter filt : filters) {
            this.addFilter(filt);
        }
    }

    /**
     *
     * @return whether this job has exclude file pattern filters
     */
    public boolean hasExcludeFilters() {
        return !excludeFilters.isEmpty();
    }

    public boolean matchesAnyIncludeFilter(Path path) {
        boolean matches = false;
        for (Filter filt : includeFilters) {
            if (filt.matches(path)) {
                matches = true;
                break;
            }
        }
        return matches;
    }

    public boolean matchesAnyExcludeFilter(Path path) {
        boolean matches = false;
        for (Filter filt : excludeFilters) {
            if (filt.matches(path)) {
                matches = true;
                break;
            }
        }
        return matches;
    }
}
