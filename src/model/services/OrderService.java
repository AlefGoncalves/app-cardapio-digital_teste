package model.services;

import model.entities.Menu;
import model.repositories.dao.impl.OrderListDAO;

public class OrderService {
    
    public void addCarrinhoService(Menu menu, String name){
        String msg, title;
        new OrderListDAO().insert(menu, name);
        msg = String.format("%s adicionado ao carrinho com sucesso!", menu.getNome());
        title = "ADD SUCCESS";
        new MsgService().pupupMsg(msg, title, 1);
    }
}
