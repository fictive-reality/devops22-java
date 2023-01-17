package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("admin"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();

        // Creates databbase EXAMPLE and table INVENTORY
        jdbcUtils.createDatabase(conn, "example");

        // All bananas and papayas with price 1 and 2 are deleted
        JDBCUtils.deleteFromTable(conn, "example", "banana", 1);
        JDBCUtils.deleteFromTable(conn, "example", "papaya", 2);

        // All bananas and papayas from previous time app ran have their price set to 1 and 2
        JDBCUtils.updateTable(conn, "example", "banana", 1);
        JDBCUtils.updateTable(conn, "example", "papaya", 2);

        // Adds new fruits to the table
        jdbcUtils.populateTable(conn, "example");

        // Prints table INVENTORY
        JDBCUtils.viewTable(conn, "example");
    }
}