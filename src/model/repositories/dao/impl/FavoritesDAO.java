package model.repositories.dao.impl;

import db.Db;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entities.Favorites;
import model.entities.Menu;

public class FavoritesDAO {

    public Connection conn;

    public String insert(Favorites favorites) {

        PreparedStatement st = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement(
                    "INSERT INTO FAVORITOS(CD_PRATO, USUARIO) VALUES(?, ?)");
            st.setInt(1, favorites.getId());
            st.setString(2, favorites.getUsername());

            int rowsAffected = st.executeUpdate();

            return "Adicionado na lista com sucesso!";

        } catch (SQLException e) {
            return "Algo está errado! Falha ao adicionar na lista";
        } finally {
            Db.closeStatement(st);
        }

    }

    public List<Favorites> findByUsername(String name) {

        List<Favorites> list = new ArrayList<>();

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT CD_PRATO, NOME, DESCRICAO, PRECO, TEMPO_PREPARO, ENDERECO_IMG "
                    + "FROM FAVORITOS "
                    + "INNER JOIN MENU "
                    + "ON CD_PRATO = ID "
                    + "WHERE USUARIO = ?");
            st.setString(1, name);
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    Favorites favorites = new Favorites();
                    Menu menu = new Menu();
                    favorites.setId(rs.getInt("CD_PRATO"));
                    menu.setNome(rs.getString("NOME"));
                    menu.setDescricao(rs.getString("DESCRICAO"));
                    menu.setPreco(rs.getDouble("PRECO"));
                    menu.setTempoPreparo(rs.getDouble("TEMPO_PREPARO"));
                    menu.setEnderecoImg(rs.getString("ENDERECO_IMG"));
                    favorites.setMenu(menu);
                    list.add(favorites);
                } while (rs.next());
                return list;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

    public boolean findById(int id) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT USUARIO "
                    + "FROM FAVORITOS "
                    + "WHERE CD_PRATO = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }
    
    public void remove(int id, String username){
        PreparedStatement st = null;
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("DELETE FROM FAVORITOS WHERE USUARIO = ? AND CD_PRATO = ?");
            st.setString(1, username);
            st.setInt(2, id);
            
            int rowsAffected = st.executeUpdate();           

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    }
}
