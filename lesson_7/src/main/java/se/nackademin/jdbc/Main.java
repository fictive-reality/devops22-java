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

        jdbcUtils.createTable();
        jdbcUtils.create(new String[] { "peter forsberg", "10.0", "Hockey" });
        jdbcUtils.create(new String[] { "tommy salo", "8.0", "Hockey" });
        jdbcUtils.create(new String[] { "brolin", "10.0", "Hockey" });
        printString(jdbcUtils.read());
        jdbcUtils.update(1, "Mats Sundin");
        jdbcUtils.delete(2);
        printString(jdbcUtils.read());
    }

    private static void printString(String[][] res) {
        for (String[] row : res) {
            System.out.println(String.join(",", row));
        }
        System.out.println("-----------");
    }
}