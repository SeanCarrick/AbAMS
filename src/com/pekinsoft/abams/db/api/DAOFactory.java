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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    public static final int DERBY_EMBEDDED = 1;
    public static final int DERBY_SERVER = 2;
    public static final int MYSQL_SERVER = 3;
    public static final int MARIADB_SERVER = 4;
    public static final int ORACLEDB_SERVER = 5;
    public static final int MS_SQL_SERVER = 6;
    public static final int POSTGRES_SQL = 7;
    public static final int SQLITE = 8;

    private DAOFactory() throws SQLException {
        // Preventing initialization.
    }
    
//    public abstract Connection getConnection() throws SQLException;

    public abstract AddressesDAO getAddressesDAO() throws SQLException;

    public abstract CustomersDAO getCustomersDAO() throws SQLException;

    public abstract OrderDetailsDAO getOrderDetailsDAO() throws SQLException;

    public abstract OrdersDAO getOrdersDAO() throws SQLException;

    public abstract ProductsDAO getProductsDAO() throws SQLException;

    public static DAOFactory getDAOFactory(int whichFactory) throws SQLException {
        switch (whichFactory) {
            case DERBY_EMBEDDED:
                return new DerbyEmbeddedDAOFactory();
            case DERBY_SERVER:
                return new DerbyServerDAOFactory();
            case MYSQL_SERVER:
                return new MySQLServerDAOFactory();
            case MARIADB_SERVER:
                return new MariaDBServerDAOFactory();
            case ORACLEDB_SERVER:
                return new OracleDBServerDAOFactory();
            case MS_SQL_SERVER:
                return new MicrosoftSQLDAOFactory();
            case POSTGRES_SQL:
                return new PostGreSQLDAOFactory();
            case SQLITE:
                return new SQLiteDAOFactory();
            default:
                return null;
        }
    }

    public static class DerbyEmbeddedDAOFactory extends DAOFactory {

        private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
        private static final String URL = "jdbc:derby:nwinddb;create=true;";
        
        private DerbyEmbeddedDAOFactory() throws SQLException {
            
        }
        
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL + "user=app;password=app;");
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in DerbyEmbeddedDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in DerbyEmbeddedDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in DerbyEmbeddedDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in DerbyEmbeddedDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in DerbyEmbeddedDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    public static class DerbyServerDAOFactory extends DAOFactory {

        private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
        private static final String URL = "jdbc:derby://localhost:1527/nwind";

        public DerbyServerDAOFactory() throws SQLException {
        }
        
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL + "user=app;password=app"); 
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in DerbyServerDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in DerbyServerDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in DerbyServerDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in DerbyServerDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in DerbyServerDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }
 
    }

    public static class MySQLServerDAOFactory extends DAOFactory {

        private static final String DRIVER = "org.mysql.cj.jdbc.Driver";
        private static final String URL = "mysql://localhost:3306/dbName";

        public MySQLServerDAOFactory() throws SQLException {
        }
        
        public static Connection getConnection() {
            // TODO: return a Connection object.
            return null;
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in MySQLServerDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in MySQLServerDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in MySQLServerDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in MySQLServerDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in MySQLServerDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    public static class MariaDBServerDAOFactory extends DAOFactory {

        private static final String DRIVER = "org.mariadb.jdbc.Driver";
        private static final String URL = "jdbc:mariadb://50.77.187.10:3306/abams"
                + "?user=sean&password=592*-:1534n";

        public MariaDBServerDAOFactory() throws SQLException {
        }

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL);
        }
        
        public static Connection getConnection(String host, String uname, 
                char[] pword, String dbName) throws SQLException {
            if (host == null || host.isEmpty()) {
                host = "localhost";
            }
            if (dbName == null || dbName.isEmpty()) {
                throw new IllegalArgumentException("null dbName");
            }
            
            String url = "jdbc:mariadb://" + host + ":3306/";
            
            if (uname != null && !uname.isEmpty()) {
                url += "?user=" + uname;
            }
            
            if (pword != null && pword.length > 0) {
                url += "&password=";
                
                for (int x = 0; x < pword.length; x++) {
                    url += pword[x];
                }
            }
            
            return DriverManager.getConnection(url);
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in MariaDBServerDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in MariaDBServerDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in MariaDBServerDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in MariaDBServerDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in MariaDBServerDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    public static class OracleDBServerDAOFactory extends DAOFactory {

        public OracleDBServerDAOFactory() throws SQLException {
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in OracleDBServerDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in OracleDBServerDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in OracleDBServerDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in OracleDBServerDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in OracleDBServerDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    public static class MicrosoftSQLDAOFactory extends DAOFactory {

        public MicrosoftSQLDAOFactory() throws SQLException {
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in MicrosoftSQLDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in MicrosoftSQLDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in MicrosoftSQLDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in MicrosoftSQLDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in MicrosoftSQLDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    public static class PostGreSQLDAOFactory extends DAOFactory {

        public PostGreSQLDAOFactory() throws SQLException {
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in PostGreSQLDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in PostGreSQLDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in PostGreSQLDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in PostGreSQLDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in PostGreSQLDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    public static class SQLiteDAOFactory extends DAOFactory {

        public SQLiteDAOFactory() throws SQLException {
        }

        @Override
        public AddressesDAO getAddressesDAO() throws SQLException {
            // TODO: Implement functionality in SQLiteDAOFactory.getAddressesDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CustomersDAO getCustomersDAO() throws SQLException {
            // TODO: Implement functionality in SQLiteDAOFactory.getCustomersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrderDetailsDAO getOrderDetailsDAO() throws SQLException {
            // TODO: Implement functionality in SQLiteDAOFactory.getOrderDetailsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public OrdersDAO getOrdersDAO() throws SQLException {
            // TODO: Implement functionality in SQLiteDAOFactory.getOrdersDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public ProductsDAO getProductsDAO() throws SQLException {
            // TODO: Implement functionality in SQLiteDAOFactory.getProductsDAO.
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

}
