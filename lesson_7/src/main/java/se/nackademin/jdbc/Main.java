package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("example"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();

        jdbcUtils.createDatabase(conn, "Lesson7");

        String myTable = "TestTable";
        // String myName = "TestName";
        // String myEmail = "TestEmail";
        // String myPass = "TestPass";
        String anotherTable = "users";

        // Create a table
        jdbcUtils.createTable(myTable);

        // Insert some data
        jdbcUtils.insertIntoTable(anotherTable, "John Doe", "john@doe.com", "password");

        // Read the data
        jdbcUtils.readTable(anotherTable);

    }
}
