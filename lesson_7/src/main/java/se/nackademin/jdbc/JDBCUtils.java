package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
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

    public void createTable(Connection con) throws SQLException {
        String createString = "create table IF NOT EXISTS Lulmane " +
                "(USER_NAME varchar(40) NOT NULL, " +
                "DKP int NOT NULL DEFAULT 0, " +
                "PRIMARY KEY (USER_NAME))";

        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteTable(Connection con) throws SQLException {
        String createString = "DROP TABLE Lulmane";

        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(createString);
            System.out.println("Dwleted the table");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void addUser(Connection conn, String name) throws SQLException {
        String updateString = "INSERT INTO Lulmane(USER_NAME, DKP) " +
                "VALUES (?, 0)";

        try (PreparedStatement updateDkp = conn.prepareStatement(updateString);) {
            updateDkp.setString(1, name);
            updateDkp.executeUpdate();
            System.out.println("Added " + name + " to the Guild");
        } catch (SQLIntegrityConstraintViolationException i) {
            System.out.println("User named " + name + " already exists");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void getAllUsers(Connection con) throws SQLException {
        String createString = "SELECT USER_NAME, DKP FROM Lulmane";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(createString);
            while (rs.next()) {
                String userName = rs.getString("USER_NAME");
                int dkp = rs.getInt("DKP");
                System.out.println(userName + " has " + dkp + " DKP");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void giveDKP(Connection conn, String name, int dkp) throws SQLException {
        String updateString = "update Lulmane " + "set DKP = DKP+? where USER_NAME = ?";

        try (PreparedStatement updateDkp = conn.prepareStatement(updateString);) {
            updateDkp.setInt(1, dkp);
            updateDkp.setString(2, name);
            updateDkp.executeUpdate();
            System.out.println("Gave " + name + " " + dkp + " DKP");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void kickUser(Connection conn, String name) throws SQLException {
        String updateString = "DELETE FROM Lulmane " + "where USER_NAME =?";

        try (PreparedStatement updateDkp = conn.prepareStatement(updateString);) {
            updateDkp.setString(1, name);
            updateDkp.executeUpdate();
            System.out.println("Kicked " + name + " from the Guild");
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
