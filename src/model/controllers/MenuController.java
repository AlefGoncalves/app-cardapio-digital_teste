package model.controllers;

import javax.swing.JButton;
import model.entities.Menu;
import model.services.FavoritesService;
import model.services.MacAdressService;
import model.services.MsgService;
import model.services.OrderService;

public class MenuController {

    public void globalAddbtController(Menu menu) {
        if (new MacAdressService().getLoginUser().equals("Login")) {
            new MsgService().pupupMsg("Para adicionar ao carrinho, precisa estar logado em sua conta!", "ERRO LOGIN NULO", 0);
        } else {
            new OrderService().addCarrinhoService(menu, new MacAdressService().getLoginUser());
        }
    }

    public void globalAddFavoritesController(int id) {
        if (new MacAdressService().getLoginUser().equals("Login")) {
            new MsgService().pupupMsg("Para adicionar aos favoritos, precisa estar logado em sua conta!", "ERRO LOGIN NULO", 0);
        } else {
            new FavoritesService().insertFavorites(id);
        }
    }

    public void globalMouseExited(JButton button) {
        new UniversalController().btMouseExited(button);
    }

    public void globalMouseMoved(JButton button) {
        new UniversalController().btMouseMoved(button);

    }

    public String globalTimePrepareSetText(double tempo) {
        if (tempo == 0) {
            return "PRONTO PARA O CONSUMO!";
        }
        return "TEMPO DE PREPARO: " + String.format("%.0f", tempo) + " MINUTOS";
    }

}
