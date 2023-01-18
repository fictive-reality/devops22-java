package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

class JDBCUtils {
    String hostname;
    String userName;
    String password; // Never add hardcoded passwords to your code
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

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        // Modify the "/" after this.port to set a specific database
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/test",
                connectionProps);

        System.out.println("Connected to db");
        return conn;
    }

    // The following method, CountriesTable.createTable, creates the COUNTRIES
    // table:

    public void createTable(Connection con) throws SQLException {
        String createString = "create table if not exists COUNTRIES" + "(COU_NAME varchar(40) NOT NULL,"
                + "CITY varchar(20) NOT NULL," + "POPULATION int)";
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertIntoTable(Connection con) throws SQLException {
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate("insert into COUNTRIES " +
                    "values( 'Japan', 'Tokyo', '37274000')");
            stmt.executeUpdate("insert into COUNTRIES " +
                    "values( 'Sweden', 'Stockholm', '2434398')");
            stmt.executeUpdate("insert into COUNTRIES " +
                    "values( 'Mexico', 'Mexico City', '22085000')");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void selectAllFromTable(Connection con) throws SQLException {
        String query = "select * from COUNTRIES";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String countriesName = rs.getString("COU_NAME");
                String city = rs.getString("CITY");
                int population = rs.getInt("POPULATION");
                System.out.println(countriesName + ", " + city + ", " +
                        population);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateRow(Connection con) throws SQLException {
        String update = "update COUNTRIES set POPULATION = 38205050 where COU_NAME = 'Japan' ";
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(update);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteRow(Connection conn) throws SQLException {
        String delete = "delete from COUNTRIES where CITY = 'Stockholm'";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(delete);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
