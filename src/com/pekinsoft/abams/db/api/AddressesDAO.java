/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.Addresses;
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
public class AddressesDAO extends AbstractDAO<Addresses> {

    public AddressesDAO (boolean batchProcessing, Application app) {
        super(batchProcessing, app);
    }

    @Override
    public int processBatch() throws SQLException {
        // TODO: Implement functionality in AddressesDAO.processBatch.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insert(Addresses record) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.insert.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Addresses record) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.update.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(Addresses record) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int save(ArrayList<Addresses> records) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Addresses record) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(ArrayList<Addresses> records) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selectAll() throws SQLException {
        // TODO: Implement functionality in AddressesDAO.selectAll.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Addresses find(String field, String value) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Addresses find(String field, Integer value) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Addresses find(String field, Short value) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Addresses find(String field, Long value) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Addresses find(String field, Float value) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Addresses find(String field, Double value) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Addresses find(String field, Boolean value) throws SQLException {
        // TODO: Implement functionality in AddressesDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
