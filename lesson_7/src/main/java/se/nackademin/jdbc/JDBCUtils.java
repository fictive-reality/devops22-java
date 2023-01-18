package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

class JDBCUtils {
    String hostname; // = "localhost";
    String userName; // = "username";
    String password; // = "password"; // Never add hardcoded passwords to your code
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

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        // Modify the "/" after this.port to set a specific database
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/test",
                connectionProps);

        System.out.println("Connected to db");
        return conn;
    }

    public void createTable(Connection conn) throws SQLException {

        String create = "CREATE TABLE IF NOT EXISTS cars" + "(name VARCHAR(10)," + "model VARCHAR(10),"
                + "year INTEGER)";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(create);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertIntoTable(Connection conn) throws SQLException {
        String insert = "INSERT INTO cars(name, model, year)" + "VALUES('Audi', 'A6', 2020)";
        String insert2 = "INSERT INTO cars(name, model, year)" + "VALUES('Volvo', 'V60', 2022)";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(insert);
            stmt.executeUpdate(insert2);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void selectAll(Connection conn) throws SQLException {
        String select = "SELECT * FROM cars";

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(select);
            while (rs.next()) {
                String name = rs.getString("name");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                System.out.println(name + " " + model + " " + year);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateValue(Connection conn) throws SQLException {
        String update = "UPDATE cars SET year = 2023 WHERE name = 'Audi'";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(update);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteRow(Connection conn) throws SQLException {
        String update = "DELETE FROM cars WHERE model = 'V60'";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(update);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
