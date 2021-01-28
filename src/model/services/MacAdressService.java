package model.services;

import model.entities.MacAdress;
import model.repositories.dao.impl.MacAdressDAO;

public class MacAdressService {

    MacAdress mac;    
    
    public MacAdressService() {        
        
    }
    
    public String getLoginUser(){
        mac = new MacAdress();
        mac.setMacAdress();        
        return new MacAdressDAO().findByUsername(mac);
    }
    
    public void logout(){
        new MacAdressDAO().updateNullLogin(getMac());
    }
    
    public MacAdress getMac(){
        mac = new MacAdress();
        mac.setMacAdress();
        return mac;
    }
    
    
}
