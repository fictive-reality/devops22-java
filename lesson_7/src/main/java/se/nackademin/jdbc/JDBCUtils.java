package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.QueryReturnType;
import com.mysql.cj.protocol.Resultset;

class JDBCUtils {
    String hostname;
    String userName;
    String password;// Never add hardcoded passwords to your code
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

    public void createTable() throws SQLException {
        Connection conn = getConnection();
        String createString = "CREATE TABLE if not exists ITEMS " + "(ITEM_ID integer auto_increment NOT NULL, " +
                "ITEM_NAME varchar(40) NOT NULL, " + "GROCERYSTORE varchar(40) NOT NULL, " +
                "CITY varchar(20) NOT NULL, " + "STATE char(2) NOT NULL, " +
                "ZIP char(5), " + "PRIMARY KEY (ITEM_ID))";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }
        conn.close();

    }

    public void insertInto() throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO ITEMS (ITEM_NAME,GROCERYSTORE,CITY,STATE,ZIP)"
                + "VALUES('köttbullar','City gross','Uppsala','UP','75439')");
        conn.close();

    }

    public void selectFromDatabase() throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        String query = "SELECT * FROM ITEMS";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("ITEM_ID");
            String itemName = rs.getString("ITEM_NAME");
            System.out.format("%d %s\n", id, itemName);
        }
    }

    public void deleteFromDatabase() throws SQLException {
        Connection conn = getConnection();
        String query = "delete from ITEMS where ITEM_ID = ?";
        PreparedStatement deletequery = conn.prepareStatement(query);
        deletequery.setInt(1, 2);
        deletequery.execute();

    }

    public void dropTable() throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate("DROP TABLE ITEMS");
        conn.close();
    }

}
