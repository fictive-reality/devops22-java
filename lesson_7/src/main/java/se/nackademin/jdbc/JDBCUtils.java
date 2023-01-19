package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSet;

class JDBCUtils {
    String hostname;
    String userName;
    String password; // Never add hardcoded passwords to your code
    String port;

    JDBCUtils(String hostname, String port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createDatabase(Connection conn, String name) throws SQLException {
        String createString = "create database IF NOT EXISTS mydb";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void createTable(Connection conn) {
        String sql = """
            CREATE TABLE IF NOT EXISTS drinks (
            id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
            title TEXT,
            price DECIMAL(5,2)
            ) 
            """;
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public void insertIntoTable(Connection conn) throws SQLException {
            String insertCappuccino = "INSERT INTO drinks(title, price)" +
                                        "VALUES('Cappuccino', 55)";
            String insertCoffee = "INSERT INTO drinks(title, price)" +
                                    "VALUES('Coffee', 35)";

            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(insertCappuccino);
                stmt.executeUpdate(insertCoffee);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public void readTable(Connection conn, String tableName) throws SQLException {
            String select = "SELECT * FROM " + tableName;

            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(select);
                while (rs.next()) {
                    String title = rs.getString(2);
                    String price = rs.getString(3);
                    System.out.println(title + " " + price);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public void updateValue(Connection conn) throws SQLException {
            String update = "UPDATE drinks SET price = 65 WHERE title = 'Cappuccino'";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(update);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    
        public void deleteRow(Connection conn) throws SQLException {
            String update = "DELETE FROM drinks WHERE price = 55";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(update);
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
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/mydb", connectionProps);

        System.out.println("Connected to db");
        return conn;
    }
}
