package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("example"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();

        // This will create the database with no tables
        jdbcUtils.createDatabase(conn, "devops22");

        // This will create the table with no data
        jdbcUtils.createTable(conn, "students");

        // This will insert data to the table
        jdbcUtils.insertData(conn, "students", "Fredrik Magnusson");
        jdbcUtils.insertData(conn, "students", "Johan Andersson");
        jdbcUtils.insertData(conn, "students", "Kalle Karl");

        // This will read data from the table
        jdbcUtils.readData(conn, "students");

        // This will update data in the table
        // jdbcUtils.updateData(conn, "students", 1, "Fredrik Nilsson");

        // This will read data from the table
        // jdbcUtils.readData(conn, "students");

        // This will delete data from the table
        // jdbcUtils.deleteData(conn, "students", 1);

        // This will read data from the table
        // jdbcUtils.readData(conn, "students");

        // This will drop the table
        // jdbcUtils.dropTable(conn, "students");

        // This will drop the database
        // jdbcUtils.dropDatabase(conn, "devops22");

        conn.close();
    }
}