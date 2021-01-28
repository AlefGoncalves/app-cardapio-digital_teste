package model.services;

import java.util.List;
import model.entities.Menu;
import model.controllers.enums.DishType;
import model.repositories.dao.impl.MenuDAO;

public class MenuService {
    
    public List<Menu> findMenu(DishType type){
        return new MenuDAO().findByType(type);
    }    
    
    
}
