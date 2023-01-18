package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("password"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        jdbcUtils.createDatabase(conn, "test"); // This will create the database with no tables
        jdbcUtils.createTable(conn); // This creates an empty table
        jdbcUtils.insertIntoTable(conn); // This creates a table with values
        JDBCUtils.selectAllFromTable(conn); // This shows the table information in the output
        jdbcUtils.updateRow(conn); // This updates a specific value in a row.
        jdbcUtils.deleteRow(conn); // This deletes a speciefic row in a table

    }
}