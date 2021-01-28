package model.controllers;

import javax.swing.JFrame;
import model.controllers.enums.DishType;
import model.services.FavoritesService;
import model.views.MenuView;

public class FavoritesController {
    
    public void removeFavorites(int id, JFrame frame){
        new FavoritesService().removeDishes(id);
        new UniversalController().onOffFrame(new MenuView(DishType.FAVORITOS), frame);        
    }
}
