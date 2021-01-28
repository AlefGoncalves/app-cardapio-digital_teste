package model.repositories.dao.impl;

import db.Db;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entities.Menu;
import model.controllers.enums.DishType;

public class MenuDAO {
    
    public Connection conn;
    
    public List<Menu> findByType(DishType type) { //a função findByUsername(MacAdress mac)de model.dao.impl.MacAdressDAOJDBC é passada como argumento

        List<Menu> list = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT ID, NOME, DESCRICAO, PRECO, TEMPO_PREPARO, ENDERECO_IMG FROM MENU WHERE TIPO_REFEICAO = ?");
            st.setInt(1, type.getId());
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    Menu menu = new Menu();
                    menu.setId(rs.getInt("ID"));
                    menu.setNome(rs.getString("NOME"));
                    menu.setDescricao(rs.getString("DESCRICAO"));
                    menu.setPreco(rs.getDouble("PRECO"));
                    menu.setTempoPreparo(rs.getDouble("TEMPO_PREPARO"));
                    menu.setEnderecoImg(rs.getString("ENDERECO_IMG"));
                    menu.setTipoRefeicao(type);
                    list.add(menu);
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
    public void insert(Menu menu,int tipo) {
        Connection conn = null;
        PreparedStatement st = null;
        
        try {
            conn = Db.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO MENU"
                    + "(ID,TIPO_REFEICAO,NOME,DESCRICAO,PRECO,TEMPO_PREPARO,ENDERECO_IMG) "
                    + "VALUES"
                    + "(?, ?, ?, ?, ?,?,?)");

            st.setInt(1, menu.getId());
            st.setInt(2, tipo);
            st.setString(3, menu.getNome());
            st.setString(4, menu.getDescricao());
            st.setDouble(5, menu.getPreco());
            st.setDouble(6, menu.getTempoPreparo());
            st.setString(7, menu.getEnderecoImg());
            

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
    
    public Menu ConsultaPrato (int codigo,int tipo) throws Exception{
        PreparedStatement st = null;
       String sql = "SELECT NOME, DESCRICAO, PRECO,TEMPO_PREPARO, ENDERECO_IMG FROM MENU Where ID ="+codigo+" AND TIPO_REFEICAO = "+tipo+"";
	
	Menu Registro_Prato = new Menu();
	conn = Db.getConnection();
        st = conn.prepareStatement(sql);
	ResultSet rs = st.executeQuery();
	while (rs.next()) {
	
	Registro_Prato.setNome(rs.getString("NOME"));
	Registro_Prato.setDescricao(rs.getString("DESCRICAO"));
        Registro_Prato.setPreco(rs.getDouble("PRECO"));
        Registro_Prato.setEnderecoImg(rs.getString("ENDERECO_IMG"));
        Registro_Prato.setTempoPreparo(rs.getDouble("TEMPO_PREPARO"));
       
	}

	return Registro_Prato;
        
}
    
    public void updatePrato(Menu menu,int codigo,int tipo) {
        Connection conn = null;
        PreparedStatement st = null;
        
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement(
                    "UPDATE MENU "
                    + "SET NOME =?, DESCRICAO =?, PRECO=?, TEMPO_PREPARO =?, ENDERECO_IMG =? "
                    + "WHERE TIPO_REFEICAO = "+tipo+" AND ID = "+codigo+"");

            
            st.setString(1, menu.getNome());
            st.setString(2, menu.getDescricao());
            st.setDouble(3, menu.getPreco());
            st.setDouble(4, menu.getTempoPreparo());
            st.setString(5, menu.getEnderecoImg());
            

            int affectedRows = st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
    
    public Menu deleteByPrato(int ID,int tipo) {
            Menu Registro_Prato = new Menu();
            PreparedStatement st = null;
            
        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("DELETE FROM MENU WHERE TIPO_REFEICAO = "+tipo+" AND ID = "+ID+"");             
            int rowsAffected = st.executeUpdate();            

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    return Registro_Prato;}
}
