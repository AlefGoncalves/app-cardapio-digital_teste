package model.repositories.dao.impl;

import db.Db;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.Login;
import model.entities.User;

public class UserDAO {

    private Connection conn;

    public UserDAO(Connection conn) {
        this.conn = conn;
    }
    
    public UserDAO(){
    
    }

    public void findIdUserByCpf(User user, Login login) {

        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT IDUSUARIO FROM USUARIO WHERE CPF = ?");
            st.setString(1, user.getCpf());
            rs = st.executeQuery();
            if (rs.next()) {
                login.setId(rs.getInt("IDUSUARIO"));
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

    public void insert(User user) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = Db.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO USUARIO "
                    + "(CPF,NOME,EMAIL,ANONASCIMENTO,GENERO) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)");

            st.setString(1, user.getCpf());
            st.setString(2, user.getName());
            st.setString(3, user.getEmail());
            st.setInt(4, user.getBirthdate());
            st.setString(5, user.getGender());

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
    
    public boolean isCPFNew(User user){
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT * FROM USUARIO WHERE CPF = ?");
            st.setString(1, user.getCpf());
            rs = st.executeQuery();
            if (rs.next()) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            return true;
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }
   
    public boolean isEmailNew(User user){
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT * FROM USUARIO WHERE EMAIL = ?");
            st.setString(1, user.getEmail());
            rs = st.executeQuery();
            return !rs.next();
        } catch (SQLException e) {
            return true;
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

}
