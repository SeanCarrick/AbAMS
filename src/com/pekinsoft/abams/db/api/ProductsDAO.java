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
 *  Class      :   ProductsDAO.java
 *  Author     :   Sean Carrick
 *  Created    :   Mar 20, 2021 @ 6:46:02 PM
 *  Modified   :   Mar 23, 2021
 * 
 *  Purpose:     See class JavaDoc comment.
 * 
 *  Revision History:
 * 
 *  WHEN          BY                   REASON
 *  ------------  -------------------  -----------------------------------------
 *  Mar 20, 2021  Sean Carrick         Initial creation.
 *  Mar 23, 2021  Sean Carrick         Modified class to implement the interface
 *                                     SupportDAO and class AbstractDAO abstract
 *                                     methods.
 * *****************************************************************************
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.Products;
import com.pekinsoft.abams.utils.MessageBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.jdesktop.application.Application;
import org.jdesktop.application.Task;

/**
 * The {@code ProductsDAO} class is a concrete implementation of the {@code 
 * AbstractDAO} class, and the {@code SupportDAO} interface. This class implements
 * these methods in a manner that makes sense for the {@code products} table in
 * the underlying database.
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class ProductsDAO extends AbstractDAO<Products> {
    
    private static final String TABLE = "products";
    private static final String CLASS_NAME = ProductsDAO.class.getSimpleName();
    
    public ProductsDAO (boolean batchProcessing, Application app) {
        super(batchProcessing, app);
    }

    @Override
    public int processBatch() throws SQLException {
        // TODO: Implement functionality in ProductsDAO.processBatch.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insert(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.insert.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.update.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int save(ArrayList<Products> records) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(ArrayList<Products> records) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selectAll() throws SQLException {
        log.enter(CLASS_NAME, "selectAllAsList");
        
        log.debug("Executing SelectAllAsListTask to retrieve the table records.");
        Task selectAll = new SelectAllAsListTask();
        
        log.exit(CLASS_NAME, "selectAllAsList", records);
    }

    @Override
    public Products find(String field, String value) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(String field, Integer value) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(String field, Short value) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(String field, Long value) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(String field, Float value) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(String field, Double value) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(String field, Boolean value) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private class SelectAllAsListTask extends Task<ArrayList<Products>, Void> {
        
        private String className;
        
        public SelectAllAsListTask() {
            super(app);
            
            className = this.getClass().getSimpleName();
        }

        @Override
        protected ArrayList<Products> doInBackground() throws Exception {
            log.enter(className, "doInBackground");
            
            log.config("Creating a java.sql.Statement object for executing SQL "
                    + "statements against the server.");
            Statement s = getConnection().createStatement();
            
            log.config("Creating our local ArrayList object for the records.");
            ArrayList<Products> list = new ArrayList<>();
            
            log.debug("Getting the count of existing records for the progressbar.");
            ResultSet r = s.executeQuery("SELECT COUNT(*) FROM Products");
            int count = 0;
            if (r != null) {   // Which it shouldn't, even if no records.
                count = r.getInt(1);    // Get the record count from the 1st col.
            }
            log.debug("Total records in Products: " + count);
            
            log.config("Performing select of all records.");
            r = s.executeQuery("SELECT * FROM Products");
            if (r != null) {
                r.beforeFirst();
                
                setMessage("Retrieving all records from the Products table...");
                int current = 0;
                setProgress(current, 0, count);
                
                log.debug("Looping through all records...");
                while (r.next()) {
                    Products p = new Products();
                    p.setProductID(r.getLong("ProductID"));
                    p.setProductName(r.getString("ProductName"));
                    p.setDescription(r.getString("Description"));
                    p.setUnitPrice(r.getBigDecimal("UnitPrice"));
                    p.setDimensions(r.getString("Dimensions"));
                    p.setPicture(r.getBytes("Picture"));
                    
                    log.debug("Adding product #" + current + " to list: " 
                            + p.toString());
                    list.add(p);
                    current++;
                }
                
                setMessage("Closing connections...");
                r.close();
                if (s != null) s.close();
            }
            
            log.exit(className, "doInBackground", list);
            return (list.isEmpty()) ? null : list;
        }
        
        @Override
        protected void succeeded(ArrayList<Products> list) {
            log.enter(className, "succeeded", list);
            setMessage("All Products retrieved.");
            
            log.config("Setting the freshly created list to the records field.");
            records = list;
            
            log.exit(className, "succeeded");
        }
        
        @Override
        protected void failed(Throwable thrown) {
            log.enter(className, "failed", thrown);
            
            setMessage("Error: " + thrown.getLocalizedMessage());
            
            log.debug("Creating an exception from the provided throwable.");
            Exception e = new Exception(thrown);
            e.setStackTrace(thrown.getStackTrace());
            
            log.error(e, "Attempting to retrieve all records from the Products "
                    + "table, using the SQL statement:\n\n\tSELECT * FROM "
                    + "Products");
            MessageBox.showError(e, "Database Error");
        }
        
    }

}
