/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.Products;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.application.Application;
import org.jdesktop.application.Task;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class ProductsDAO extends ModelDAO<Products> {
    
    private final Application app;
    private final String ip = "50.77.187.10";
    private final String db = "abams";
    private final String uname = "sean";
    private final char[] pwd = {'5', '9', '2', '*', '-', ':', '1', '5', '3', '4', 'n'};
    
    public ProductsDAO (Application app) {
        super();
        this.app = app;
        this.records = new ArrayList<>();
    }

    @Override
    boolean insertRecord(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.insertRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    boolean updateRecord(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.updateRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete() throws SQLException {
        // TODO: Implement functionality in ProductsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(List<Products> records) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(Products record) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.exists.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products find(int searchColumn, int searchValue) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products findIgnoreCase(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.findIgnoreCase.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Products> findLike(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in ProductsDAO.findLike.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products get() {
        return records.get(idx);
    }

    @Override
    public Products get(int id) throws SQLException {
        if (id < 0) {
            throw new IllegalArgumentException("id must be positive");
        }
        
        String sql = "SELECT * FROM Products WHERE ProductID=" + id;
        conn = DAOFactory.MariaDBServerDAOFactory.getConnection(ip, uname, pwd, db);
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        
        Products p = null;
        
        if (rs != null) {
            p = new Products();
            p.setDescription(rs.getString("Description"));
            p.setDimensions(rs.getString("Dimensions"));
            p.setPicture(rs.getBytes("Picture"));
            p.setProductID(rs.getLong("ProductID"));
            p.setProductName(rs.getString("ProductName"));
            p.setUnitPrice(rs.getBigDecimal("UnitPrice"));
        }
        
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
        
        return p;
    }

    @Override
    public List<Products> getAll() throws SQLException {
        Task getAllTask = new GetAllTask(app);
        
        return records;
    }
    
    private class GetAllTask extends Task<List<Products>, Void> {
        
        public GetAllTask(Application app) {
            super(app);
        }

        @Override
        protected List<Products> doInBackground() throws Exception {
            conn = DAOFactory.MariaDBServerDAOFactory.getConnection(ip, uname, pwd, db);
            stmt = conn.createStatement();
            
            // First, get the count of the products in the table.
            rs = stmt.executeQuery("SELECT COUNT(*) FROM Products");
            int count = 0;
            if (rs != null) { // Which it shouldn't even if no records.
                count = rs.getInt(1);   // Get the count from the first column.
            }
            
            // Now we can do our actual select.
            rs = stmt.executeQuery("SELECT * FROM Products");
            rs.beforeFirst();

            List<Products> list = new ArrayList<>();

            if (rs != null) {
                setMessage("Retrieving all records from the Products table...");
                int current = 0;
                setProgress(current, 0, count);
                while (rs.next()) {
                    Products p = new Products();
                    p.setProductID(rs.getLong("ProductID"));
                    p.setProductName(rs.getString("ProductName"));
                    p.setDescription(rs.getString("Description"));
                    p.setUnitPrice(rs.getBigDecimal("UnitPrice"));
                    p.setDimensions(rs.getString("Dimensions"));
                    p.setPicture(rs.getBytes("Picture"));

                    list.add(p);
                    current++;
                }
            }
            
            setMessage("Closing connections...");

            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            
            return (list.isEmpty()) ? null : list;
        }
        
        @Override
        protected void succeeded(List<Products> list) {
            setMessage("All Products retrieved.");
            records = list;
        }
        
        @Override
        protected void failed(Throwable thrown) {
            setMessage("Error: " + thrown.getLocalizedMessage());
        }
        
    }

    @Override
    public int getRecordCount() {
        return this.records.size();
    }

}
