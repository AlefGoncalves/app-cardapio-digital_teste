package model.services;

import java.util.List;
import model.entities.Favorites;
import model.repositories.dao.impl.FavoritesDAO;

public class FavoritesService {

    private String msg;
    private String title;
    private int icon;

    public FavoritesService() {

    }

    public void insertFavorites(int id) {

        Favorites favorites = new Favorites();
        favorites.setId(id);
        favorites.setUsername(new MacAdressService().getLoginUser());

        if (!(new FavoritesDAO().findById(id))) {
            msg = new FavoritesDAO().insert(favorites);
            title = "OPERAÇÃO BEM SUCEDIDA";
            icon = 1;
        } else {
            msg = "Você ja possui esse produto em sua lista de favoritos!";
            title = "ERRO DUPLICATA";
            icon = 0;
        }
        new MsgService().pupupMsg(msg, title, icon);

    }

    public List<Favorites> findFavorites() {
        return new FavoritesDAO().findByUsername(new MacAdressService().getLoginUser());
    }

    public void removeDishes(int id) {
        new FavoritesDAO().remove(id, new MacAdressService().getLoginUser());
        new MsgService().pupupMsg("Item removido com sucesso da lista de favoritos!", "SUCCESS REMOVED", 1);        
    }

}
