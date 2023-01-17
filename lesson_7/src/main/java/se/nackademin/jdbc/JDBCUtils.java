package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

class JDBCUtils {
    String hostname = "localhost";
    String userName = "username";
    String password = "admin"; // Never add hardcoded passwords to your code
    String port = "3306";

    JDBCUtils(String hostname) {
        this.hostname = hostname;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Creates database EXAMPLE and table INVENTORY
    public void createDatabase(Connection conn, String name) throws SQLException {
        String createDatabase = "create database IF NOT EXISTS " + name;

        String createTable = "create table IF NOT EXISTS INVENTORY" + "(INV_ID integer NOT NULL AUTO_INCREMENT, " +
                "INV_NAME varchar(40) NOT NULL, " + "PRICE integer NOT NULL, " +
                "QUANTITY integer CHECK (QUANTITY >= 0), " + "PRIMARY KEY (INV_ID))";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createDatabase);
            stmt.executeUpdate(createTable);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Populates table INVENTORY with new fruits
    public void populateTable(Connection conn, String name) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("insert into INVENTORY " +
                    "(INV_NAME, PRICE, QUANTITY) " +
                    "values('Banana', 2, " +
                    "250)");
            stmt.executeUpdate("insert into INVENTORY " +
                    "(INV_NAME, PRICE, QUANTITY) " +
                    "values('Papaya', 4, " +
                    "100)");
            stmt.executeUpdate("insert into INVENTORY " +
                    "(INV_NAME, PRICE, QUANTITY) " +
                    "values('Mango', 6, " +
                    "25)");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Prints sum(QUANTITY) of all fruits with the same INV_NAME and PRICE
    public static void viewTable(Connection conn, String name) throws SQLException {
        String query = "select INV_NAME, PRICE, sum(QUANTITY) as TOTAL_QUANTITY " +
                "from INVENTORY group by PRICE, INV_NAME order by INV_NAME";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String inventoryName = rs.getString("INV_NAME");
                int price = rs.getInt("PRICE");
                int quantity = rs.getInt("TOTAL_QUANTITY");
                System.out.println(inventoryName + ", " + price + ", " + quantity);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Updates price on all fruits with INV_NAME
    public static void updateTable(Connection conn, String name, String invName, int price) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("update INVENTORY set PRICE = " + price + " WHERE INV_NAME = "+ "'" + invName + "'");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Deletes from table where INV_NAME = name and PRICE = price
    public static void deleteFromTable(Connection conn, String name, String invName, int price) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("delete from INVENTORY where INV_NAME = " + "'" + invName + "'" + "AND price = " + price);
        }
    }

    public static void deleteRowId() throws SQLException {

    }

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        // Modify the "/" after this.port to set a specific database
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/example",
                connectionProps);

        System.out.println("Connected to db");
        return conn;
    }
}
