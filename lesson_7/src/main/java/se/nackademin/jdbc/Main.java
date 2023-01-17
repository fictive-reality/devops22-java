package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("example"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        jdbcUtils.createDatabase(conn, "devops22"); // This will create the database with no tables

        jdbcUtils.createTable(conn, "testTable"); // This will create the table with no data

        jdbcUtils.insertData(conn, "testTable", 1, "devops-22"); // This will insert data into the table

        jdbcUtils.readData(conn, "testTable"); // This will read data from the table

        jdbcUtils.updateData(conn, "testTable", 1, "devops-22-updated"); // This will update data in the table

        jdbcUtils.readData(conn, "testTable"); // This will read data from the table

        jdbcUtils.deleteData(conn, "testTable", 1); // This will delete data from the table

        jdbcUtils.readData(conn, "testTable"); // This will read data from the table

        // jdbcUtils.dropTable(conn, "testTable"); // This will drop the table

        // jdbcUtils.dropDatabase(conn, "devops22"); // This will drop the database

        conn.close();
    }
}