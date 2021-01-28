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
import model.entities.OrderList;

public class OrderListDAO {

    private Connection conn;

    public OrderListDAO(Connection conn) {
        this.conn = conn;
    }

    public OrderListDAO() {

    }
    
    public void insert(Menu menu, String name){
        
        PreparedStatement st = null;

        try {
            conn = Db.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO LISTA_PEDIDO "
                    + "(USUARIO,PEDIDO,PRECO,SITUACAO,DATA_PEDIDO) "
                    + "VALUES "
                    + "(?, ?, ?, 0, now())");

            st.setString(1, name);
            st.setString(2, menu.getNome());
            st.setDouble(3, menu.getPreco());
           

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public List<OrderList> findByUsername_historico(String name) { //a função findByUsername(MacAdress mac)de model.dao.impl.MacAdressDAOJDBC é passada como argumento

        List<OrderList> list = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT ID, PEDIDO, PRECO, DATA_PEDIDO FROM LISTA_PEDIDO WHERE USUARIO = ? AND SITUACAO = TRUE");
            st.setString(1, name);
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    OrderList requestList = new OrderList();
                    requestList.setId(rs.getInt("ID"));
                    requestList.setName(rs.getString("PEDIDO"));
                    requestList.setPrice(rs.getDouble("PRECO"));
                    requestList.setDate(rs.getString("DATA_PEDIDO"));
                    list.add(requestList);
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
    
    public List<OrderList> findByDate_historico(int day, String name){
        
        List<OrderList> list = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT ID, PEDIDO, PRECO, DATA_PEDIDO FROM LISTA_PEDIDO WHERE USUARIO = ? AND SITUACAO = TRUE" 
                    + " AND DAYOFYEAR(DATA_PEDIDO) <= DAYOFYEAR(now()) AND DAYOFYEAR(DATA_PEDIDO) >= DAYOFYEAR(now()) - ?");
            st.setString(1, name);
            st.setInt(2, day);
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    OrderList requestList = new OrderList();
                    requestList.setId(rs.getInt("ID"));
                    requestList.setName(rs.getString("PEDIDO"));
                    requestList.setPrice(rs.getDouble("PRECO"));
                    requestList.setDate(rs.getString("DATA_PEDIDO"));
                    list.add(requestList);
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

    public List<OrderList> findByUsername_carrinho(String name) { //a função findByUsername(MacAdress mac)de model.dao.impl.MacAdressDAOJDBC é passada como argumento

        List<OrderList> list = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("SELECT ID, PEDIDO, PRECO FROM LISTA_PEDIDO WHERE USUARIO = ? AND SITUACAO = FALSE");
            st.setString(1, name);
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    OrderList requestList = new OrderList();
                    requestList.setId(rs.getInt("ID"));
                    requestList.setName(rs.getString("PEDIDO"));
                    requestList.setPrice(rs.getDouble("PRECO"));
                    list.add(requestList);
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

    public String deleteByUsername_carrinho(String iten) {

        if (iten.equals("Lista vazia!")) {
            return "Sua lista de compras está vazia!";
        }

        PreparedStatement st = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("DELETE FROM LISTA_PEDIDO WHERE PEDIDO = ?");
            st.setString(1, iten);

            int rowsAffected = st.executeUpdate();

            return "Item " + iten + " removido do carrinho de compras!";

        } catch (SQLException e) {
            return "Nenhum item foi selecionado!";
        } finally {
            Db.closeStatement(st);
        }

    }
    
    public String updateByUsername_carrinho(String iten, String username){ //verificar se o carrinho está vazio pela String iten
                                                                            //findByUsername(MacAdress mac)de model.dao.impl.MacAdressDAOJDBC é passada como 2º argumento
        if (iten.equals("Lista vazia!")) {
            return "Sua lista de compras está vazia!";
        }

        PreparedStatement st = null;

        try {
            conn = Db.getConnection();
            st = conn.prepareStatement("UPDATE LISTA_PEDIDO SET SITUACAO = TRUE WHERE USUARIO = ? AND SITUACAO = FALSE");
            st.setString(1, username);

            int rowsAffected = st.executeUpdate();

            return "Compra finalizada com sucesso!";

        } catch (SQLException e) {
            return "Nenhum item foi selecionado!";
        } finally {
            Db.closeStatement(st);
        }
    }

}
