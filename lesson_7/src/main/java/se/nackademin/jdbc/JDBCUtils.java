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

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        // Modify the "/" after this.port to set a specific database
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/Lesson7",
                connectionProps);
        System.out.println("Connected to db");
        return conn;

    }

    // CRUD methods

    public void createTable(String tablename) throws SQLException {
        Connection conn = getConnection();
        String createString = "CREATE TABLE IF NOT EXISTS `Lesson7`.`" + tablename
                + "` (`id` INT NOT NULL AUTO_INCREMENT, `name` VARCHAR(45) NOT NULL, `email` VARCHAR(45) NOT NULL, `password` VARCHAR(45) NOT NULL, PRIMARY KEY (`id`));";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        System.out.println("Table created");
        conn.close();
    }

    public void readTable(String table) throws SQLException {
        Connection conn = getConnection();
        String readString = "SELECT * FROM `Lesson7`.`" + table + "`;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(readString);
        while (rs.next()) {
            System.out.println(rs.getString("name") + " " + rs.getString("email") + " " + rs.getString("password"));
        }
        conn.close();
    }

    public void updateTable(String table, String name, String email, String password) throws SQLException {
        Connection conn = getConnection();
        String updateString = "UPDATE `Lesson7`.`" + table + "` SET `name` = '" + name + "', `email` = '" + email
                + "', `password` = '" + password + "' WHERE (`id` = '1');";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(updateString);
        System.out.println("Data updated");
        conn.close();
    }

    public void deleteFromTable(String table) throws SQLException {
        Connection conn = getConnection();
        String deleteString = "DELETE FROM `Lesson7`.`" + table + "` WHERE (`id` = '1');";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(deleteString);
        System.out.println("Data deleted");
        conn.close();
    }

    public void insertIntoTable(String table, String name, String email, String password) throws SQLException {
        Connection conn = getConnection();
        String insertString = "INSERT INTO `Lesson7`.`" + table + "` (`name`, `email`, `password`) VALUES ('" + name
                + "', '" + email + "', '" + password + "');";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(insertString);
        System.out.println("Data inserted");
        conn.close();
    }

    public void dropTable(String table) throws SQLException {
        Connection conn = getConnection();
        String dropString = "DROP TABLE `Lesson7`.`" + table + "`;";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(dropString);
        System.out.println("Table dropped");
        conn.close();
    }

    public void dropDatabase(String database) throws SQLException {
        Connection conn = getConnection();
        String dropString = "DROP DATABASE `" + database + "`;";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(dropString);
        System.out.println("Database dropped");
        conn.close();
    }

}
