package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.protocol.a.SqlDateValueEncoder;

class JDBCUtils {
    String hostname = "localhost";
    String userName = "username";
    String password = "password"; // Never add hardcoded passwords to your code
    String port = "3306";

    JDBCUtils(String hostname) {
        this.hostname = hostname;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createDatabase(Connection conn, String name) throws SQLException {
        String createString = "create database IF NOT EXISTS " + name;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }


    public void insertData(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("INSERT INTO test1234 VALUES('fabian')");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void readData(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            String query = ("Select * from test1234");
            ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
        }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void updateRow(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            String query = ("UPDATE test1234 SET firstname = 'fabian_ny' where firstname = 'fabian'");
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void deleteRow(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            String query = ("DELETE FROM test1234 where firstname = 'fabian_ny'");
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

        public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);
        String database = "fabian_2";

        // Modify the "/" after this.port to set a specific database
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/" + database, connectionProps);

        System.out.println("Connected to db");
        return conn;
        }
    }