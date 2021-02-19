/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.Orders;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class OrdersDAO extends ModelDAO<Orders> implements Editable {

    public OrdersDAO () {

    }

    @Override
    boolean insertRecord(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.insertRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    boolean updateRecord(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.updateRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete() throws SQLException {
        // TODO: Implement functionality in OrdersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(List<Orders> records) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(Orders record) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.exists.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders find(int searchColumn, int searchValue) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders findIgnoreCase(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.findIgnoreCase.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Orders> findLike(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.findLike.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders get() {
        // TODO: Implement functionality in OrdersDAO.get.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Orders get(int id) throws SQLException {
        // TODO: Implement functionality in OrdersDAO.get.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Orders> getAll() throws SQLException {
        // TODO: Implement functionality in OrdersDAO.getAll.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRecordCount() {
        // TODO: Implement functionality in OrdersDAO.getRecordCount.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
