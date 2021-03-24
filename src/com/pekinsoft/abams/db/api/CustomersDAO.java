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
 *  Class      :   CustomersDAO.java
 *  Author     :   Sean Carrick
 *  Created    :   Feb 15, 2021 @ 8:24:25 AM
 *  Modified   :   Feb 15, 2021
 * 
 *  Purpose:     See class JavaDoc comment.
 * 
 *  Revision History:
 * 
 *  WHEN          BY                   REASON
 *  ------------  -------------------  -----------------------------------------
 *  Feb 15, 2021  Sean Carrick         Initial creation.
 * *****************************************************************************
 */
package com.pekinsoft.abams.db.api;

import com.pekinsoft.abams.db.Customers;
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
public class CustomersDAO extends AbstractDAO<Customers> {

    public CustomersDAO (boolean batchProcessing, Application app) {
        super(batchProcessing, app);
    }

    @Override
    public int processBatch() throws SQLException {
        // TODO: Implement functionality in CustomersDAO.processBatch.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insert(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.insert.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.update.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int save(ArrayList<Customers> records) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(ArrayList<Customers> records) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selectAll() throws SQLException {
        // TODO: Implement functionality in CustomersDAO.selectAll.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(String field, String value) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(String field, Integer value) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(String field, Short value) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(String field, Long value) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(String field, Float value) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(String field, Double value) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(String field, Boolean value) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
