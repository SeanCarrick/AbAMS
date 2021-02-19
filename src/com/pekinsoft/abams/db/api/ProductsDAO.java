/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.Products;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class ProductsDAO extends ModelDAO<Products> implements Editable {
    
    private final List<Products> records;
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    
    public ProductsDAO () throws SQLException {
        this.records = new ArrayList<>();
        this.conn = null;
        this.stmt = null;
        this.rs = null;
        
        getAll();
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
        // TODO: Implement functionality in ProductsDAO.get.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Products get(int id) throws SQLException {
        if (id < 0) {
            throw new IllegalArgumentException("id must be positive");
        }
        
        String sql = "SELECT * FROM Products WHERE ProductID=" + id;
        
    }

    @Override
    public List<Products> getAll() throws SQLException {
        char[] pwd = {'5', '9', '2', '*', '-', ':', '1', '5', '3', '4', 'n'};
        conn = DAOFactory.MariaDBServerDAOFactory.getConnection("50.77.187.10", "sean", pwd, "abams");
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Products");
        rs.beforeFirst();
        
        List<Products> list = new ArrayList<>();
        
        if (rs != null) {
            while (rs.next()) {
                Products p = new Products();
                p.setProductID(rs.getLong("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setDescription(rs.getString("Description"));
                p.setUnitPrice(rs.getBigDecimal("UnitPrice"));
                p.setDimensions(rs.getString("Dimensions"));
                p.setPicture(rs.getBytes("Picture"));
                
                list.add(p);
            }
        }
        
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
        
        return (list.isEmpty()) ? null : list;
    }

    @Override
    public int getRecordCount() {
        return this.records.size();
    }

}
