/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.Orders;
import java.sql.SQLException;
import java.util.ArrayList;
import org.jdesktop.application.Application;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class OrdersDAO extends AbstractDAO<Orders> {

    public OrdersDAO (boolean batchProcessing, Application app) {
        super(batchProcessing, app);
    }

    @Override
    public int processBatch() throws SQLException {
        // TODO: Implement functionality in OrdersDAO.processBatch.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insert(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.insert.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.update.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int save(ArrayList<Orders> records) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(ArrayList<Orders> records) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selectAll() throws SQLException {
        // TODO: Implement functionality in OrdersDAO.selectAll.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(String field, String value) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(String field, Integer value) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(String field, Short value) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(String field, Long value) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(String field, Float value) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(String field, Double value) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(String field, Boolean value) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
