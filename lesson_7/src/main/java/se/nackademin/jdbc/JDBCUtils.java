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
    String password = "password"; // Never add hardcoded passwords to your code
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

    public void createDatabase(Connection conn, String name) throws SQLException {
        String createString = "create database IF NOT EXISTS " + name;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void createTable(Connection conn) throws SQLException {
        String createString = "create table ORDERS [IF NOT EXISTS]" + "(ORDER_ID integer NOT NULL AUTO_INCREMENT, " +
                "ART_NAME varchar(40) NOT NULL, " + "PRIMARY KEY (ORDER_ID))";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
            System.out.println("Table created.");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void addDataToTable(Connection conn) throws SQLException {
        String createString = "INSERT INTO ORDERS (ART_NAME)" + " Values ('Skurhink')";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
            System.out.println("Table insert done!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void readDatabase(Connection conn) throws SQLException {
        String query = "SELECT ART_NAME from ORDERS";
        try (Statement stmt = conn.createStatement()) {
            ResultSet dbResult = stmt.executeQuery(query);
            while (dbResult.next()) {
                String artName = dbResult.getString("ART_NAME");
                System.out.println(artName);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateDatabase(Connection conn) throws SQLException {
        // Updates all occurences of "Tvättsvamp" in ART_Name Column
        String newValue = "Diskborste";
        String updatequery = "SELECT * from ORDERS WHERE ART_NAME = 'Tvättsvamp'";
        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet dbResult = stmt.executeQuery(updatequery);
            while (dbResult.next()) {
                dbResult.updateString("ART_NAME", newValue);
                dbResult.updateRow();
                System.out.println("Updated row");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteFromDatabase(Connection conn) throws SQLException {
        // Delete all occurences of "Skurhink" in ART_Name Column
        String deletequery = "DELETE from ORDERS WHERE ART_NAME = 'Skurhink'";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(deletequery);
            System.out.println("Record/s deleted successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
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
