package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("example"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        if (conn instanceof Connection) { // Did this so Connected to db only prints once if succesful.
            System.out.println("Connected to db");
        }
        jdbcUtils.createDatabase(conn, "exampleDB"); // This will create the database with no tables
        jdbcUtils.createTable();
        jdbcUtils.insertPerson(); // Hardcoded insert into in method, cannot enter a variable yet.
        jdbcUtils.getTableContent();
    }
}