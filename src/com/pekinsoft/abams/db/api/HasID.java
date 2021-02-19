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
 *  Class      :   HasID.java
 *  Author     :   Sean Carrick
 *  Created    :   Feb 15, 2021 @ 10:13:52 AM
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

/**
 * The {@code HasID} interface should be used by any object that provides an
 * identification field. The purpose of this interface is to allow for various
 * data types for the object's identity. This interface also forces any object
 * that has an identity to provide the methods for getting and setting that
 * value.
 * 
 * @param <T> the class type for the identity field. This may include primitive
 *          type, for example:
 * <pre>
 * public class MyClassHasIdentity implements HasID&lt;int.class&gt; {
 *     
 *     private int id;
 * // ...
 *     public int getId() {
 *         return id;
 *     }
 * 
 *     public void setId(int id) {
 *         this.id = id;
 *     }
 * // ...
 * }
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public interface HasID<T> {

    /**
     * Retrieves the identification field value for the object that has an
     * identification field.
     * 
     * @return the identification field value
     * 
     * @see #setId(java.lang.Object) 
     */
    public T getId();
    
    /**
     * Sets the identification field value for the object that has an
     * identification field.
     * 
     * @param id the new value for the identification field
     */
    public void setId(T id);
    
}
