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
 *  Class      :   AbstractDAO.java
 *  Author     :   Sean Carrick
 *  Created    :   Mar 23, 2021 @ 6:46:02 PM
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

import com.pekinsoft.abams.utils.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import org.jdesktop.application.Application;

/**
 * An {@code AbstractDAO} class is returned by a call to 
 * {@code DAOFactory.getDAO(whichDAO}.
 * 
 * The {@code AbstractDAO} class implements the {@code SupportDAO} interface,
 * but leaves implementing the interface methods up to the extending classes.
 * 
 * @see com.pekinsoft.abams.db.api.SupportDAO
 *
 * @author Sean Carrick &lt;sean at gs-unitedlabs dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class AbstractDAO<T> implements SupportDAO<T> {
    
    private final String URL = "jdbc:mariadb://50.77.187.14:3306/abams";
    private final String UNAME = "sean";
    private final char[] PWORD = {'5', '9', '2', '*', '-', ':', '1', '5', '3', '4', 'n'};
    protected final Logger log;
    protected final Application app;
    protected ArrayList<T> records;
    protected final ArrayList<T> editedRecords;
    protected final ArrayList<T> deletedRecords;
    protected boolean batchProcessing;
    protected int recordPtr;
    
    private final String CLASS_NAME = AbstractDAO.class.getSimpleName();

    public AbstractDAO (boolean batchProcessing, Application app) {
        log = Logger.getLogger(CLASS_NAME, app);
        log.enter(CLASS_NAME, CLASS_NAME + " (Constructor)", 
                new Object[]{batchProcessing, app});
        
        log.config("Storing parameters to local fields.");
        this.batchProcessing = batchProcessing;
        this.app = app;
        
        log.config("Initializing the ArrayList fields.");
        this.records = new ArrayList<>();
        this.editedRecords = new ArrayList<>();
        this.deletedRecords = new ArrayList<>();
        
        log.exit(CLASS_NAME, CLASS_NAME + " (Constructor)");
    }
    
    /**
     * Provides a way of determining if batch processing is enabled for this
     * data access object.
     * 
     * If batch processing is enabled, then all new and edited records are stored
     * in a list to be processed at a later time. If the application is exited
     * prior to the batch of entries being processed, then the list is stored to
     * the disk upon exit. Upon startup of the next run of the application, any
     * unprocessed batched entries are loaded and the user will be prompted to
     * process the batch of entries. If the user chooses not to process those 
     * entries, they will, again, be written to disk upon application exit, until
     * such time as {@code processBatch()} is called to process the batch of 
     * entries.
     * 
     * @see #setBatchProcessing(boolean) 
     * 
     * @return {@code true} if entries are to be processed as a batch;
     *          {@code false} otherwise
     */
    public boolean isBatchProcessing() {
        log.enter(CLASS_NAME, "isBatchProcessing");
        log.exit(CLASS_NAME, "isBatchProcessing", batchProcessing);
        return batchProcessing;
    }
    
    /**
     * Passing the boolean value {@code true} to this method will turn on the
     * batch processing for this data access object.
     * 
     * @see #isBatchProcessing() 
     * 
     * @param batchProcessing 
     */
    public void setBatchProcessing(boolean batchProcessing) {
        log.enter(CLASS_NAME, "setBatchProcessing", batchProcessing);
        
        log.debug("Setting the batch processing flag to " + batchProcessing);
        this.batchProcessing = batchProcessing;
        
        log.exit(CLASS_NAME, "setBatchProcessing");
    }
    
    /**
     * Retrieves a count of the total number of entries in the batch list.
     * 
     * @return the number of batched entries
     */
    public int getBatchedEntryCount() {
        log.enter(CLASS_NAME, "getBatchedEntryCount");
        
        log.exit(CLASS_NAME, "getBatchedEntryCount", editedRecords.size());
        return editedRecords.size();
    }
    
    /**
     * Calling this method will process the batch of new and edited entries that
     * are contained in the list. Once completed, the number of entries processed
     * will be returned. This number may be less than than the total number of
     * entries in the batch, as only successfully processed entries are counted.
     * Therefore, it would be wise to get the batch count prior to running this
     * method, so that action may be taken for failed entries.
     * 
     * @see #isBatchProcessing() 
     * @see #setBatchProcessing(boolean) 
     * @see #getBatchedEntryCount() 
     * 
     * @return the number of batched entries <em>successfully</em> processed
     * @throws SQLException in the event a database error occurs
     */
    public abstract int processBatch() throws SQLException;

    /**
     * Retrieves a {@code java.sql.Connection} to the underlying database, which
     * is located on a MariaDB server.
     * 
     * @return a connection to the database
     * @throws SQLException in the event a database error occurs
     */
    protected Connection getConnection() throws SQLException {
        log.enter(CLASS_NAME, "getConnection");
        
        log.config("Creating a connection object to return.");
        Connection conn = DriverManager.getConnection(URL, UNAME, 
                String.copyValueOf(PWORD));
        
        log.exit(CLASS_NAME, "getConnection", conn);
        return conn;
    }
    
    /**
     * Places the record pointer before the first record.
     * <p>
     * When the record pointer is before the first record, if an attempt is made
     * to access a record, an {@code IndexOutOfBoundsException} will occur. 
     * Therefore, take care when attempting to access a record after making a
     * call to this method.</p>
     * 
     * @see #isBeforeFirst() 
     */
    public void beforeFirst() {
        log.enter(CLASS_NAME, "beforeFirst");
        
        log.debug("Setting curRecNum to -1.");
        recordPtr = -1;
        
        log.exit(CLASS_NAME, "beforeFirst");
    }
    
    /**
     * Determines whether the record pointer is before the first record.
     * <p>
     * If a call to {@code beforeFirst} has been made, a call to this method
     * <strong>prior</strong> to attempting to access a record is advised. If a
     * call to {@code isBeforeFirst} is not made first, an
     * {@code IndexOutOfBoundsException} could be thrown.</p>
     * 
     * @see #beforeFirst() 
     * 
     * @return {@code true} if the record pointer is before the first record;
     *          {@code false} otherwise
     */
    public boolean isBeforeFirst() {
        log.enter(CLASS_NAME, "isBeforeFirst");
        
        boolean beforeFirst = recordPtr < 0;
        
        log.debug("\trecordPtr == " + recordPtr + "\n\t" 
                + "\trecords.size == " + records.size() + "\n\t" 
                +"isBeforeFirst == " + beforeFirst);
        
        log.exit(CLASS_NAME, "isBeforeFirst", beforeFirst);
        return beforeFirst;
    }
    
    /**
     * Places the record pointer after the last record.
     * <p>
     * When the record pointer is after the last record, if an attempt is made
     * to access a record, an {@code IndexOutOfBoundsException} will occur. 
     * Therefore, take care when attempting to access a record after making a
     * call to this method.</p>
     * 
     * @see #isAfterLast() 
     */
    public void afterLast() {
        log.enter(CLASS_NAME, "afterLast");
        
        log.debug("Setting curRecNum to records.size() (" + records.size() + ").");
        recordPtr = records.size();
        
        log.exit(CLASS_NAME, "afterLast");
    }
    
    /**
     * Determines whether the record pointer is after the last record.
     * <p>
     * If a call to {@code afterLast} has been made, a call to this method
     * <strong>prior</strong> to attempting to access a record is advised. If a
     * call to {@code isAfterLast} is not made first, an
     * {@code IndexOutOfBoundsException} could be thrown.</p>
     * 
     * @see #afterLast() 
     * 
     * @return {@code true} if the record pointer is before the first record;
     *          {@code false} otherwise
     */
    public boolean isAfterLast() {
        log.enter(CLASS_NAME, "isAfterLast");
        
        boolean afterLast = recordPtr >= records.size();
        
        log.debug("\trecordPtr == " + recordPtr + "\n\t" 
                + "\trecords.size == " + records.size() + "\n\t" 
                +"isAfterLast == " + afterLast);
        
        log.exit(CLASS_NAME, "isAfterLast", afterLast);
        return afterLast;
    }
    
    /**
     * Moves the record pointer to the first record in the table.
     * 
     * @return {@code true} if move was successful; {@code false} otherwise
     */
    public boolean first() {
        log.enter(CLASS_NAME, "first");
        
        log.debug("Moving to the first record (setting recordPtr = 0).");
        recordPtr = 0;
        
        log.exit(CLASS_NAME, "first", true);
        return true;
    }
    
    /**
     * Moves to the previous record in the table.
     * 
     * @return {@code true} if move was successful; {@code false} otherwise
     */
    public boolean previous() {
        log.enter(CLASS_NAME, "previous");
        
        boolean success;
        
        log.debug("Checking to see if we can move to the previous record.");
        if (recordPtr > 0) {
            log.debug("Moving to the previous record (recordPtr--).");
            recordPtr--;
            success = true;
        } else {
            log.debug("Already at first record: Cannot move (recordPtr == " 
                    + recordPtr + ").");
            success = false;
        }
        
        log.exit(CLASS_NAME, "previous", success);
        return success;
    }
    
    /**
     * Moves to the next record in the table.
     * 
     * @return {@code true} if move was successful; {@code false} otherwise
     */
    public boolean next() {
        log.enter(CLASS_NAME, "next");
        
        boolean success;
        
        log.debug("Checking to see if we can move to the next record.");
        if (recordPtr < (getRecordCount() - 1)) {
            log.debug("Moving to the next record (recordPtr++).");
            recordPtr++;
            success = true;
        } else {
            log.debug("Already at last record: Cannot move (recordPtr == "
                    + recordPtr + ").");
            success = false;
        }
        
        log.exit(CLASS_NAME, "next", success);
        return success;
    }
    
    /**
     * Moves the record pointer to the last record in the table.
     * 
     * @return {@code true} if move was successful; {@code false} otherwise
     */
    public boolean last() {
        log.enter(CLASS_NAME, "last");
        
        log.debug("Moving to the last record (setting recordPtr = 0).");
        recordPtr = getRecordCount() - 1;
        
        log.exit(CLASS_NAME, "last", true);
        return true;
    }
    
    public int getRecordCount() {
        log.enter(CLASS_NAME, "getRecordCount");
        
        log.exit(CLASS_NAME, "getRecordCount", records.size());
        return records.size();
    }
    
}
