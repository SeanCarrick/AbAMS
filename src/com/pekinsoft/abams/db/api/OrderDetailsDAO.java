/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.OrderDetails;
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
public class OrderDetailsDAO extends AbstractDAO<OrderDetails> {

    public OrderDetailsDAO (boolean batchProcessing, Application app) {
        super(batchProcessing, app);
    }

    @Override
    public int processBatch() throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.processBatch.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insert(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.insert.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.update.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int save(ArrayList<OrderDetails> records) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(ArrayList<OrderDetails> records) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selectAll() throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.selectAll.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(String field, String value) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(String field, Integer value) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(String field, Short value) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(String field, Long value) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(String field, Float value) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(String field, Double value) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(String field, Boolean value) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
