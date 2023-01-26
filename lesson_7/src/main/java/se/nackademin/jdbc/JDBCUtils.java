package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

class JDBCUtils {
    String hostname = "localhost";
    String userName = "username";
    String password = "password"; // Never add hardcoded passwords to your code
    String port = "3306";
    Connection conn;

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
            e.printStackTrace();
        }

    }

    public void createTable() {
        String sql = " CREATE TABLE IF NOT EXISTS legends (id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY, name TEXT, status INTEGER, sport TEXT)";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean create(String[] row) {
        String sql = "INSERT INTO legends (name, status, sport) VALUES (?, ?, ?)";
        try (Statement stmt = conn.createStatement()) {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, row[0]);
            st.setString(2, row[1]);
            st.setString(3, row[2]);
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String[][] read() {
        String sql = "SELECT * FROM legends";
        List<String[]> results = new ArrayList<String[]>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("id");
                String title = rs.getString("name");
                String price = rs.getString("status");
                String creator = rs.getString("sport");

                results.add(new String[] { id, title, price, creator });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results.toArray(new String[0][]);
    }

    public void update(int id, String newName) {
        String sql = "SELECT * FROM legends WHERE id = ?";

        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            st.setInt(1, id);
            ResultSet uprs = st.executeQuery();
            while (uprs.next()) {
                uprs.updateString("name", newName);
                uprs.updateRow();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM legends WHERE id = ?";
        try (Statement stmt = conn.createStatement()) {
            PreparedStatement st = conn.prepareStatement(sql, id);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public Connection getConnection() throws SQLException {

        //Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        // Modify the "/" after this.port to set a specific database
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/example",
                connectionProps);

        System.out.println("Connected to db");
        return conn;
    }
}

