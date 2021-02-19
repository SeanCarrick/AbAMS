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
 *  Class      :   ModelDAO.java
 *  Author     :   Sean Carrick
 *  Created    :   Feb 16, 2021 @ 12:39:48 AM
 *  Modified   :   Feb 16, 2021
 * 
 *  Purpose:     See class JavaDoc comment.
 * 
 *  Revision History:
 * 
 *  WHEN          BY                   REASON
 *  ------------  -------------------  -----------------------------------------
 *  Feb 16, 2021  Sean Carrick         Initial creation.
 * *****************************************************************************
 */
package com.pekinsoft.abams.db.api;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class ModelDAO<T> implements Editable {
    
    private final PropertyChangeSupport pcs;
    private boolean value;
    
    protected Connection conn;
    protected Statement stmt;
    protected ResultSet rs;
    
    protected List<T> records;
    protected int idx;
    
    public ModelDAO() {
        this.pcs = new PropertyChangeSupport(this);
        this.idx = 0;
    }

    /**
     * Used internally within the class to save a new record into the table.
     *
     * @param record the new record to save
     * @return {@code true} if the record was saved; {@code false} otherwise
     * @throws SQLException in the event an error occurs while saving the record
     *
     * @see #updateRecord(java.lang.Object)
     * @see #save(java.lang.Object)
     */
    abstract boolean insertRecord(T record) throws SQLException;

    /**
     * Used internally within the class to save changes to an existing record in
     * the table.
     *
     * @param record the updated record to save
     * @return {@code true} if the updates are saved; {@code false} otherwise
     * @throws SQLException in the event an error occurs while saving the record
     *
     * @see #insertRecord(java.lang.Object)
     * @see #save(java.lang.Object)
     */
    abstract boolean updateRecord(T record) throws SQLException;

    /**
     * Saves changes to the database. After adding a new record, or editing an
     * existing one, this method needs to be called to persist the changes to
     * the database.
     *
     * @param record the new or modified record to save
     * @return {@code true} if the modifications were saved; {@code false}
     * otherwise
     * @throws SQLException in the event an error occurs while saving the record
     *
     * @see #insertRecord(java.lang.Object)
     * @see #updateRecord(java.lang.Object)
     */
    abstract public boolean save(T record) throws SQLException;

    /**
     * Deletes the currently selected record from the table. This action is
     * final, meaning that it <em><strong>cannot be undone</strong></em>, so the
     * user needs to be made aware of the implications and given a proper chance
     * to back out of taking this action.
     *
     * @return {@code true} if the record was deleted; {@code false} otherwise
     * @throws SQLException in the event an error occurs while deleting the
     * record
     *
     * @see #delete(java.lang.Object)
     * @see #delete(java.util.List)
     */
    abstract public boolean delete() throws SQLException;

    /**
     * Deletes the specified record from the table. This action is final,
     * meaning that it <em><strong>cannot be undone</strong></em>, so the user
     * needs to be made aware of the implications and given a proper chance to
     * back out of taking this action.
     *
     * @param record the record to delete from the table
     * @return {@code true} if the record was deleted; {@code false} otherwise
     * @throws SQLException in the event an error occurs while deleting the
     * record
     *
     * @see #delete()
     * @see #delete(java.util.List)
     */
    abstract public boolean delete(T record) throws SQLException;

    /**
     * Deletes all of the records specified in the {@code java.util.List} of
     * records. This action is final, meaning that it <em><strong>cannot be
     * undone</strong></em>, so the user needs to be made aware of the
     * implications and given a proper chance to back out of taking this action.
     *
     * @param records a list of records to be deleted from the table
     * @return the number of records actually deleted
     * @throws SQLException in the event an error occurs while deleting the
     * records
     *
     * @see #delete()
     * @see #delete(java.lang.Object)
     */
    abstract public int delete(List<T> records) throws SQLException;

    /**
     * Checks to see if the specified record exists in the table. It is a good
     * practice to call this method before an attempt is made to add a record to
     * the table. By calling this method first, many frustrations can be
     * avoided.
     *
     * @param record the record to check for existence
     * @return {@code true} if the record exists; {@code false} otherwise
     * @throws SQLException in the event an error occurs while searching for the
     * existence of the specified record
     *
     * @see #find(int, java.lang.String)
     * @see #find(int, int)
     * @see #findIgnoreCase(int, java.lang.String)
     */
    abstract public boolean exists(T record) throws SQLException;

    /**
     * Find a specific record matching the specified column to the exact value
     * provided. This method is guaranteed to return exactly one record, or a
     * {@code null} value if no match is found.
     *
     * @param searchColumn the column (or field) to search
     * @param searchValue the value to find in the specified field by exact
     * match
     * @return exactly one record, or {@code null} if no match is found
     * @throws SQLException in the event an error occurs while searching for the
     * record
     *
     * @see #exists(java.lang.Object)
     * @see #find(int, int)
     * @see #findIgnoreCase(int, java.lang.String)
     */
    abstract public T find(int searchColumn, String searchValue) throws SQLException;

    /**
     * Find a specific record matching the specified column to the exact value
     * provided. This method is guaranteed to return exactly one record, or a
     * {@code null} value if no match is found.
     *
     * @param searchColumn the column (or field) to search
     * @param searchValue the value to find in the specified field by exact
     * match
     * @return exactly one record, or {@code null} if no match is found
     * @throws SQLException in the event an error occurs while searching for the
     * record
     *
     * @see #exists(java.lang.Object)
     * @see #find(int, int)
     * @see #findIgnoreCase(int, java.lang.String)
     */
    abstract public T find(int searchColumn, int searchValue) throws SQLException;

    /**
     * Find a specific record matching the specified column to the exact value
     * provided, while ignoring the case of the strings. This method returns
     * either the first record to match the criteria, or {@code null} if no
     * match is found.
     * <p>
     * No guarantee that a returned record does not mean that there are other
     * records that match the criteria specified.</p>
     *
     * @param searchColumn the column (or field) to search
     * @param searchValue the value to find in the specified field by exact
     * match, ignoring case.
     * @return the first matching record
     * @throws SQLException in the event an error occurs while searching for the
     * record
     *
     * @see #exists(java.lang.Object)
     * @see #find(int, java.lang.String)
     * @see #find(int, int)
     * @see #findLike(int, java.lang.String)
     */
    abstract public T findIgnoreCase(int searchColumn, String searchValue) throws SQLException;

    /**
     * Find a specific record, or multiple records, matching the column to the
     * fuzzy value provided. The fuzzy matching used is SQL dependent.
     *
     * @param searchColumn the column (or field) to search
     * @param searchValue the value to base the result matches on
     * @return one or more records that match the search value, or {@code null}
     * if there were no matches
     * @throws SQLException in the event an error occurs while searching the
     * records
     *
     * @see #findIgnoreCase(int, java.lang.String)
     */
    abstract public List<T> findLike(int searchColumn, String searchValue) throws SQLException;

    /**
     * Retrieves the record at the current row of the table.
     *
     * @return the current record
     *
     * @see #find(int, java.lang.String)
     * @see #find(int, int)
     * @see #findIgnoreCase(int, java.lang.String)
     * @see #findLike(int, java.lang.String)
     */
    abstract public T get();

    /**
     * Retrieves the record with the specified identification value.
     *
     * @param id the ID value of the record of interest
     * @return the specified record or {@code null}
     * @throws SQLException in the event an error occurs while retrieving the
     * record
     *
     * @see #find(int, int)
     */
    abstract public T get(int id) throws SQLException;

    /**
     * Retrieves a list of all of the records in the table.
     *
     * @return a list of all records or {@code null} if the table is empty
     * @throws SQLException in the event an error occurs while retrieving the
     * records
     */
    abstract public List<T> getAll() throws SQLException;

    /**
     * Retrieves the count of all records in the table.
     *
     * @return the total number of records in the table
     */
    abstract public int getRecordCount();
    
    /**
     * Moves the pointer to the first record in the table and returns the record
     * at that position.
     * 
     * @return the first record
     * 
     * @see #previous() 
     * @see #next() 
     * @see #last() 
     */
    public T first() {
        idx = 0;
        return records.get(idx);
    }
    
    /**
     * Moves the pointer to the previous record in the table, if another record
     * is available, and returns that record.
     * 
     * @return the record at the position where the pointer was moved {@code 
     * null} if no move was made due to already being on the first record.
     * 
     * @see #first() 
     * @see #next() 
     * @see #last() 
     */
    public T previous() {
        if (idx != 0) {
            idx--;
        } else {
            return null;
        }
        
        return records.get(idx);
    }
    
    /**
     * Moves the pointer to the next record in the table, if another record is
     * available, and returns that record.
     * 
     * @return the record at the position the pointer was moved
     * 
     * @see #first() 
     * @see #previous() 
     * @see #last() 
     */
    public T next() {
        if (!(idx > records.size() - 1)) {
            idx++;
        } else {
            return null;
        }
        
        return records.get(idx);
    }
    
    /**
     * Moves the pointer to the last record in the table, if another record is
     * available, and returns the record at that spot.
     * 
     * @return the record last record in the table, or {@code null} if the 
     *          pointer was not moved
     */
    public T last() {
        if (idx != (records.size() - 1) && idx < records.size()) {
            idx++;
        } else {
            return null;
        }
        
        return records.get(idx);
    }

    /**
     * {@inheritDoc }
     * @param listener {@inheritDoc }
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    /**
     * {@inheritDoc }
     * @param listener {@inheritDoc }
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    /**
     * {@inheritDoc }
     * @return {@inheritDoc }
     */
    @Override
    public boolean isEdited() {
        return this.value;
    }

    /**
     * {@inheritDoc }
     * @param value {@inheritDoc }
     */
    @Override
    public void setEdited(boolean value) {
        boolean oldValue = this.value;
        this.value = value;
        this.pcs.firePropertyChange("saveNeeded", oldValue, value);
    }

}
