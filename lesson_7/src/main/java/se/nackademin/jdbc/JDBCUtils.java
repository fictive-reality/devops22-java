package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.sql.ResultSet;

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

    public void createTable(Connection conn, String name) throws SQLException {
        String createString = "create table IF NOT EXISTS " + name;
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void addcookie(Connection conn, String name, boolean crumbs) throws SQLException {
        String createString = "INSERT INTO example.cookie (name,crumbs) VALUE(?,?);";
        PreparedStatement updateCookie = conn.prepareStatement(createString);
        updateCookie.setString(1, name);
        updateCookie.setBoolean(2, crumbs);
        updateCookie.execute();
    }

    public void selectCookies(Connection conn) throws SQLException {
        String createString = "SELECT * FROM example.cookie;";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(createString);
        while (rs.next()) {
            String name = rs.getString("name");
            Boolean crumbs = rs.getBoolean("crumbs");
            System.out.println("Name" + name);
            System.out.println("Crumbs " + crumbs);
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

}
