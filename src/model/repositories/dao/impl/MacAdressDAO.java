package model.repositories.dao.impl;

import db.Db;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.Login;
import model.entities.MacAdress;

public class MacAdressDAO {

    private Connection conn;

    public MacAdressDAO(Connection conn) {
        this.conn = conn;
    }

    public MacAdressDAO() {

    }

    /**
     *
     * @param login
     * @param mac
     */
    public void insert(Login login, MacAdress mac) {

        PreparedStatement st = null;        
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement(
                    "INSERT INTO MACADRESS "
                    + "(LOGIN,MACADRESS) "
                    + "VALUES "
                    + "(?, ?)");

            st.setString(1, login.getUsername());
            st.setString(2, mac.getMacAdress());

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            update(login, mac);
        } finally {
            Db.closeStatement(st);
        }
    }

    public void update(Login login, MacAdress mac){
        PreparedStatement st = null;
        
         try {
            conn = Db.getConnection();
            st = conn.prepareStatement("UPDATE MACADRESS "
                    + "SET LOGIN = ? "
                    + "WHERE MACADRESS = ?");

            st.setString(1, login.getUsername());
            st.setString(2, mac.getMacAdress());

            int rowsAffected = st.executeUpdate();

        } catch (SQLException er) {
            throw new DbException(er.getMessage());
        } 
    }
    
    public void updateNullLogin(MacAdress mac) {

        PreparedStatement st = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("UPDATE MACADRESS "
                    + "SET LOGIN = NULL "
                    + "WHERE MACADRESS = ?");

            st.setString(1, mac.getMacAdress());

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    }

    public void deleteByMacAdress(MacAdress mac) {

        PreparedStatement st = null;
        mac.setMacAdress();
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("DELETE FROM MACADRESS WHERE MACADRESS = ?");
            st.setString(1, mac.getMacAdress());
            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    }
    
    public String findByUsername(MacAdress mac) {

        PreparedStatement st = null;
        ResultSet rs = null;
        mac.setMacAdress();

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT LOGIN FROM MACADRESS WHERE MACADRESS = ?");
            st.setString(1, mac.getMacAdress());
            rs = st.executeQuery();
            if (rs.next()) {
                if (rs.getString("LOGIN") == null) {
                    return "Login";
                }
                return rs.getString("LOGIN");
            } else {
                return "Login";
            }
        } catch (SQLException e) {
            return "Login";
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

}
