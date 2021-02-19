/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.OrderDetails;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class OrderDetailsDAO extends ModelDAO<OrderDetails> implements Editable {

    public OrderDetailsDAO () {

    }

    @Override
    boolean insertRecord(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.insertRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    boolean updateRecord(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.updateRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete() throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(List<OrderDetails> records) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(OrderDetails record) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.exists.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails find(int searchColumn, int searchValue) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails findIgnoreCase(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.findIgnoreCase.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<OrderDetails> findLike(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.findLike.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails get() {
        // TODO: Implement functionality in OrderDetailsDAO.get.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OrderDetails get(int id) throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.get.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<OrderDetails> getAll() throws SQLException {
        // TODO: Implement functionality in OrderDetailsDAO.getAll.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRecordCount() {
        // TODO: Implement functionality in OrderDetailsDAO.getRecordCount.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
