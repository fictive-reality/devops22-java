package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("my-secret-pw"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        jdbcUtils.createDatabase(conn, "example"); // This will create the database with no tables
    }
}