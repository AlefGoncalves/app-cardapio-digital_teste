package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Db {

    private static Connection conn = null;

    public static Connection getConnection() {

        if (conn == null) {
            try {
                String dburl = "jdbc:mysql://localhost:3306/cardapiodigitaldb?autoReconnect=true&useSSL=false"; //banco de dados ficticio
                String user = "admin";//nome de usuário ficticio
                String password = "12345";//senha ficticia
                conn = DriverManager.getConnection(dburl, user, password);

            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
