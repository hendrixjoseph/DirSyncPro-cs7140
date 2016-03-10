/*
 * InclompleteConfigurationException.java
 *
 * Copyright (C) 2003 F. Gerbig (fgerbig@users.sourceforge.net)
 * Copyright (C) 2002 E. Gerber
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
package edu.wright.dirsyncpro.exceptions;

/**
 * This exception is thrown if a directory has an incomplete configuration.
 *
 * @author F. Gerbig (fgerbig@users.sourceforge.net)
 */
public class IncompleteConfigurationException extends Exception {

    /**
     * Initializes a new {@code InclompleteConfigurationException}.
     */
    public IncompleteConfigurationException() {
        super();
    }

    /**
     * Initializes a new {@code InclompleteConfigurationException}.
     *
     * @param message
     */
    public IncompleteConfigurationException(String message) {
        super(message);
    }

    /**
     * Initializes a new {@code InclompleteConfigurationException}.
     *
     * @param cause
     */
    public IncompleteConfigurationException(Throwable cause) {
        super(cause);
    }

    /**
     * Initializes a new {@code InclompleteConfigurationException}.
     *
     * @param message
     * @param cause
     */
    public IncompleteConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
