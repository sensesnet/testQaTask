package task2;

import java.sql.*;

public class DBConnection {

    private String dbName;
    private Connection connection;

    public DBConnection(String dbName, String dbUrl, String dbUser, String dbPassword, String dbDriverClassName) {
        this.setDbName(dbName);
        try {
            Class.forName(dbDriverClassName);
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ResultSet select(String sqlQuery, String id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sqlQuery);
            ps.setString(1, id);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet select(String sqlQuery) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sqlQuery);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void closeConnection() {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
