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
 *  Class      :   DAOFactory.java
 *  Author     :   Sean Carrick
 *  Created    :   Feb 15, 2021 @ 7:46:19 AM
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

import com.pekinsoft.abams.AbAMSApp;
import com.pekinsoft.abams.utils.Logger;
import java.sql.SQLException;
import org.jdesktop.application.Application;

/**
 * {@code DAOFactory} is a factory class for getting DAO factories for specific
 * database systems. The {@code DAOFactory} is not used directly by any project,
 * other than to retrieve the database-specific DAO factory needed by the 
 * project:
 * <pre>
 * // If a connection to an embedded Apache Derby database is needed:
 * DAOFactory myFactory = DAOFactory.getDAOFactory(DAOFactory.DERBY_EMBEDDED);
 * </pre>
 * <p>
 * At this time, we have support integrated for the following database drivers:
 * </p><ul>
 * <li>Apache Derby: local server and embedded</li>
 * <!-- Uncomment these list items as we get the DAOFactory for them written.
 * <!-- TODO: Implement the various database type DAOFactory classes -->
 * <!-- li>MySQL Server</li -->
 * <!-- li>MariaDB Server</li -->
 * <!-- li>OracleDB Server</li -->
 * <!-- li>Microsoft SQL Server</li -->
 * <!-- li>PostGreSQL</li -->
 * <!-- li>SQLite</li -->
 * </ul>
 * <p>
 * We may include support for other database servers in the future, if customer
 * demand for them is great enough. However, at this time we believe that the
 * databases and servers that we support should be sufficient for the vast 
 * majority of our customers.</p>
 * 
 * @see AccountTypesDAO
 * @see AccountTypes
 * @see AccountTypes
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class DAOFactory {

    public static final int ADDRESSES_DAO = 1;
    public static final int CUSTOMERS_DAO = 2;
    public static final int ORDER_DETAILS_DAO = 3;
    public static final int ORDERS_DAO = 4;
    public static final int PRODUCTS_DAO = 5;
    
    private static final String CLASS_NAME = DAOFactory.class.getSimpleName();
    
    private static final Application app = AbAMSApp.getInstance(AbAMSApp.class);
    private static final Logger log = Logger.getLogger(
            DAOFactory.class.getSimpleName(), app);

    private DAOFactory() throws SQLException {
        // Preventing initialization.
    }
    
    public static AbstractDAO getDAO(int whichDAO, boolean batchProcessing) {
        log.enter(CLASS_NAME, "getDAO", whichDAO);
        
        AbstractDAO dao = null;
        
        log.debug("Executing switch block to see which DAO to return");
        switch (whichDAO) {
            case ADDRESSES_DAO:
                log.debug("ADDRESSES_DAO requested. Returning a new AddressesDAO.");
                dao = new AddressesDAO(batchProcessing, app);
                log.exit(CLASS_NAME, "getDAO", dao);
                return dao;
            case CUSTOMERS_DAO:
                log.debug("CUSTOMERS_DAO requested. Returning a new CustomersDAO.");
                dao = new CustomersDAO(batchProcessing, app);
                log.exit(CLASS_NAME, "getDAO", dao);
                return new CustomersDAO(batchProcessing, app);
            case ORDER_DETAILS_DAO:
                log.debug("ORDER_DETAILS_DAO requested. Returning a new OrderDetailsDAO.");
                dao = new OrderDetailsDAO(batchProcessing, app);
                log.exit(CLASS_NAME, "getDAO", dao);
                return new OrderDetailsDAO(batchProcessing, app);
            case ORDERS_DAO:
                log.debug("ORDERS_DAO requested. Returning a new OrdersDAO.");
                dao = new OrdersDAO(batchProcessing, app);
                log.exit(CLASS_NAME, "getDAO", dao);
                return new OrdersDAO(batchProcessing, app);
            case PRODUCTS_DAO:
                log.debug("PRODUCTS_DAO requested. Returning a new ProductsDAO.");
                dao = new ProductsDAO(batchProcessing, app);
                log.exit(CLASS_NAME, "getDAO", dao);
                return new ProductsDAO(batchProcessing, app);
            default:
                log.debug("Invalid DAO requested: whichDAO == " + whichDAO + ".\n\n"
                        + "Returning a null DAO object.");
                log.exit(CLASS_NAME, "getDAO", dao);
                return dao;
        }
    }

}
