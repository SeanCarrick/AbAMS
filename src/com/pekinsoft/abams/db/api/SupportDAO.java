/*
 * Copyright (C) 2021 GS United Labs
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
 *  Project    :   AbAMS
 *  Class      :   SupportDAO.java
 *  Author     :   Sean Carrick
 *  Created    :   Mar 23, 2021 @ 6:50:20 PM
 *  Modified   :   Mar 23, 2021
 * 
 *  Purpose:     See class JavaDoc comment.
 * 
 *  Revision History:
 * 
 *  WHEN          BY                   REASON
 *  ------------  -------------------  -----------------------------------------
 *  Mar 23, 2021  Sean Carrick         Initial creation.
 * *****************************************************************************
 */
package com.pekinsoft.abams.db.api;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sean Carrick &lt;sean at gs-unitedlabs dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public interface SupportDAO<T> {
    
    /**
     * Inserts a single record into the table. This method is used for <strong>
     * new</strong> records.
     * 
     * @see #save(java.lang.Object) 
     * 
     * @param record the new record to insert
     * @return {@code true} upon successful insertion; {@code false} on failure
     * @throws SQLException in the event a database error occurs
     */
    boolean insert(T record) throws SQLException;
    
    /**
     * Stores an edited record to the table. This method is used for <strong>
     * edited, existing</strong> records.
     * 
     * @see #save(java.lang.Object) 
     * 
     * @param record the edited, existing record to store
     * @return {@code true} upon successful save; {@code false} on failure
     * @throws SQLException in the event a database error occurs
     */
    boolean update(T record) throws SQLException;
    
    /**
     * Saves the given record to the table. This method will use properties of
     * the provided record to determine if the record is a new record, or an
     * edited, existing record.
     * 
     * @param record the record to save
     * @return {@code true} upon successful save; {@code false} on failure
     * @throws SQLException in the event a database error occurs
     */
    public boolean save(T record) throws SQLException;
    
    /**
     * Saves the given list of records to the table. This method will use the
     * properties of each record to determine if the record is a new record, or
     * an edited, existing record.
     * 
     * @param records the list of records to save
     * @return a count of successful saves
     * @throws SQLException in the event a database error occurs
     */
    public int save(ArrayList<T> records) throws SQLException;
    
    /**
     * Deletes the given record from the table.
     * 
     * @param record the record to delete
     * @return {@code true} upon successful deletion; {@code false} on failure
     * @throws SQLException in the event a database error occurs
     */
    public boolean delete(T record) throws SQLException;
    
    /**
     * Deletes the given list of records from the table.
     * 
     * @param records the list of records to delete
     * @return a count of records actually deleted
     * @throws SQLException in the event a database error occurs
     */
    public int delete(ArrayList<T> records) throws SQLException;
    
    /**
     * Selects all of the records in the table.
     * 
     * @throws SQLException in the event a database error occurs
     */
    public void selectAll() throws SQLException;
    
    /**
     * Locates a record whose specified field contains the specified 
     * {@code java.lang.String} value.
     * 
     * @param field the table field to search
     * @param value the value to find
     * @return a matching record or {@code null} if no match found
     * @throws SQLException in the event a database error occurs
     */
    public T find(String field, String value) throws SQLException;
    
    /**
     * Locates a record whose specified field contains the specified 
     * {@code java.lang.Integer} value.
     * 
     * @param field the table field to search
     * @param value the value to find
     * @return a matching record or {@code null} if no match found
     * @throws SQLException in the event a database error occurs
     */
    public T find(String field, Integer value) throws SQLException;
    
    /**
     * Locates a record whose specified field contains the specified 
     * {@code java.lang.Short} value.
     * 
     * @param field the table field to search
     * @param value the value to find
     * @return a matching record or {@code null} if no match found
     * @throws SQLException in the event a database error occurs
     */
    public T find(String field, Short value) throws SQLException;
    
    /**
     * Locates a record whose specified field contains the specified 
     * {@code java.lang.Long} value.
     * 
     * @param field the table field to search
     * @param value the value to find
     * @return a matching record or {@code null} if no match found
     * @throws SQLException in the event a database error occurs
     */
    public T find(String field, Long value) throws SQLException;
    
    /**
     * Locates a record whose specified field contains the specified 
     * {@code java.lang.Float} value.
     * 
     * @param field the table field to search
     * @param value the value to find
     * @return a matching record or {@code null} if no match found
     * @throws SQLException in the event a database error occurs
     */
    public T find(String field, Float value) throws SQLException;
    
    /**
     * Locates a record whose specified field contains the specified 
     * {@code java.lang.Double} value.
     * 
     * @param field the table field to search
     * @param value the value to find
     * @return a matching record or {@code null} if no match found
     * @throws SQLException in the event a database error occurs
     */
    public T find(String field, Double value) throws SQLException;
    
    /**
     * Locates a record whose specified field contains the specified 
     * {@code java.lang.Boolean} value.
     * 
     * @param field the table field to search
     * @param value the value to find
     * @return a matching record or {@code null} if no match found
     * @throws SQLException in the event a database error occurs
     */
    public T find(String field, Boolean value) throws SQLException;
    
}
