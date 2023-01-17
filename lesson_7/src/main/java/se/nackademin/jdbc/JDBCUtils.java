package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

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
        String useString = "USE " + name;
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
            stmt.executeUpdate(useString);
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
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/",
                connectionProps);

        System.out.println("Connected to db");
        return conn;
    }

    public void createTable(Connection conn, String name) throws SQLException {
        String createString = "create table IF NOT EXISTS " + name
                + " (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255) NOT NULL, PRIMARY KEY (id));";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void insertData(Connection conn, String name, String name2) throws SQLException {
        String createString = "insert into " + name + " (name) values (?)";

        try (PreparedStatement stmt = conn.prepareStatement(createString)) {
            stmt.setString(1, name);
            stmt.setString(1, name2);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void readData(Connection conn, String name) throws SQLException {
        String createString = "select * from " + name;

        try (PreparedStatement stmt = conn.prepareStatement(createString)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void selectData(Connection conn, String name) throws SQLException {
        String createString = "select * from " + name;

        try (PreparedStatement stmt = conn.prepareStatement(createString)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void updateData(Connection conn, String name, int id, String name2) throws SQLException {
        String createString = "update " + name + " set name = ? where id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(createString)) {
            stmt.setString(1, name2);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void deleteData(Connection conn, String name, int id) throws SQLException {
        String createString = "delete from " + name + " where id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(createString)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void dropTable(Connection conn, String name) throws SQLException {
        String createString = "drop table " + name;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void dropDatabase(Connection conn, String name) throws SQLException {
        String createString = "drop database " + name;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
