/*
 * FilterByPath.java
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

import edu.wright.dirsyncpro.job.Job;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilterByPath extends Filter {

    private String pathStr = "";

    public FilterByPath(Job j, Action a) {
        super(j, a);
        type = Filter.Type.ByPath;
    }

    public FilterByPath(Job j, Action a, String path) {
        this(j, a);
        pathStr = path;
    }

    @Override
    public boolean matches(Path path) {
        return (path.compareTo(Paths.get(pathStr)) == 0);
    }

    public String getPathStr() {
        return pathStr;
    }

    public void setPathStr(String pathStr) {
        this.pathStr = pathStr;
    }

    @Override
    public String toString() {
        String s = "";
        s += " Path: '" + this.pathStr + "'";
        return s;
    }

    @Override
    public int compareTo(Filter s) {
        if (s instanceof FilterByPath) {
            return pathStr.compareTo(((FilterByPath) s).getPathStr());
        } else {
            return super.compareTo(s);
        }
    }
}
