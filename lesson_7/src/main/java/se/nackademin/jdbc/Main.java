package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("example"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        jdbcUtils.createDatabase(conn, "test"); // This will create the database with no tables
        // jdbcUtils.createTable();
        // jdbcUtils.insertInto();
        // jdbcUtils.dropTable();
        jdbcUtils.selectFromDatabase();
        // jdbcUtils.deleteFromDatabase();
    }
}