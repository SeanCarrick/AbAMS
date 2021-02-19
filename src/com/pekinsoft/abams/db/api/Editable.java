/*
 * Copyright (C) 2021 PekinSOFT Systems
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
 * 
 * *****************************************************************************
 *  Project    :   NorthwindTraders
 *  Class      :   Editable.java
 *  Author     :   Sean Carrick
 *  Created    :   Feb 15, 2021 @ 5:17:13 PM
 *  Modified   :   Feb 15, 2021
 * 
 *  Purpose:     See class JavaDoc comment.
 * 
 *  Revision History:
 * 
 *  WHEN          BY                   REASON
 *  ------------  -------------------  -----------------------------------------
 *  Feb 15, 2021  Sean Carrick         Initial creation.
 * *****************************************************************************
 */
package com.pekinsoft.abams.db.api;

import java.beans.PropertyChangeListener;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public interface Editable {
    
    /**
     * Allows a {@code PropertyChangeListener} to be added for handling property
     * change events.
     * 
     * @param listener the property change listener to use
     */
    public void addPropertyChangeListener(PropertyChangeListener listener);
    
    /**
     * Allows a {@code PropertyChangeListener} to be removed from this object.
     * 
     * @param listener the property change listener to remove
     */
    public void removePropertyChangeListener(PropertyChangeListener listener);
        
    /**
     * Determines whether the changes to the record are a modification or a new
     * record entirely.
     * 
     * @return {@code true} if a modified record; {@code false} if new
     */
    public boolean isEdited();
    
    /**
     * Sets whether this record is modified or new.
     * 
     * @param value send {@code true} if a modified record; {@code false} for
     *          a new one
     */
    public void setEdited(boolean value);

}
