package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("password"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        jdbcUtils.createDatabase(conn, "example"); // This will create the database with no tables
        jdbcUtils.createTable(conn,
                "example.cookie(id integer not null auto_increment, name varchar (20) not null, crumbs boolean not null, constraint PK_cookie primary key (id))");
        jdbcUtils.addcookie(conn,  "Hallongrottor", true);
        jdbcUtils.selectCookies(conn);
    }
}