package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/exampleDB", connectionProps);

        //System.out.println("Connected to db");
        return conn;
    }

    public void createTable() throws SQLException {
        Connection conn = getConnection();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS people("
                + "name           VARCHAR(10),"
                + "age            INTEGER)";

        Statement stmt = conn.createStatement();
        stmt.execute(sqlCreate);
        conn.close();
    }

    public void insertPerson() throws SQLException {
        Connection conn = getConnection();
        String SQL = "INSERT INTO people(name,age) "
                + "VALUES('Gustav',26)";

        Statement stmt = conn.createStatement();
        stmt.execute(SQL);
        conn.close();

    }

    public void getTableContent() throws SQLException {
        Connection conn = getConnection();
        String SQL = "SELECT * FROM people";

        PreparedStatement p = conn.prepareStatement(SQL);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
 
            int age = rs.getInt("Age");
            String name = rs.getString("Name");
            System.out.println(name + " " + age);
        }
    }

}
