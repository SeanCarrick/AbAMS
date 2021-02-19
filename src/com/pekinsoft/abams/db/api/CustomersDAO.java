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
import java.util.List;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public class CustomersDAO extends ModelDAO<Customers> implements Editable {

    public CustomersDAO () {

    }

    @Override
    boolean insertRecord(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.insertRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    boolean updateRecord(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.updateRecord.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean save(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.save.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete() throws SQLException {
        // TODO: Implement functionality in CustomersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(List<Customers> records) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.delete.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(Customers record) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.exists.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers find(int searchColumn, int searchValue) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.find.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers findIgnoreCase(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.findIgnoreCase.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Customers> findLike(int searchColumn, String searchValue) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.findLike.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers get() {
        // TODO: Implement functionality in CustomersDAO.get.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customers get(int id) throws SQLException {
        // TODO: Implement functionality in CustomersDAO.get.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Customers> getAll() throws SQLException {
        // TODO: Implement functionality in CustomersDAO.getAll.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRecordCount() {
        // TODO: Implement functionality in CustomersDAO.getRecordCount.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
