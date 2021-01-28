package model.repositories.dao.impl;

import db.Db;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.Login;
import model.entities.User;

public class LoginDAO {

    private Connection conn;
    UserDAO userDAOJDBC = new UserDAO(conn);

    public LoginDAO(Connection conn) {
        this.conn = conn;
    }

    public LoginDAO() {

    }

    /**
     *
     * @param user
     * @param login
     */
    public void insert(User user, Login login) {

        PreparedStatement ps = null;

        userDAOJDBC.findIdUserByCpf(user, login);

        try {
            conn = Db.getConnection();
            ps = conn.prepareStatement("INSERT INTO LOGIN "
                    + "(APELIDO,SENHA,ID_USUARIO) "
                    + "VALUES "
                    + "(?, ?, ?)");

            ps.setString(1, login.getUsername());
            ps.setString(2, login.getPassword());
            ps.setInt(3, login.getId());

            int rowsAffected = ps.executeUpdate();            

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(ps);
        }
    }

    
    /**
     *
     * @param login     
     * @return
     */
    public boolean findByNameAndPass(Login login) {
        conn = Db.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM LOGIN WHERE APELIDO = ? AND SENHA = ?");
            st.setString(1, login.getUsername());
            st.setString(2, login.getPassword());
            rs = st.executeQuery();
            if (rs.next()) {             
                return true;
            } else {
                return false;                
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }
    
    public boolean isUsernameNew(Login login){
         PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT * FROM LOGIN WHERE APELIDO = ?");
            st.setString(1, login.getUsername());
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

}
