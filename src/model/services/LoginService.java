package model.services;

import model.entities.Login;
import model.repositories.dao.impl.LoginDAO;
import model.repositories.dao.impl.MacAdressDAO;

public class LoginService {

    Login login;

    public void testLogin(String username, String pass) {
        this.login = new Login(username, pass);
        String msg, title;  
        int icon;             
        if(new LoginDAO().findByNameAndPass(this.login)){
            new MacAdressDAO().insert(this.login, new MacAdressService().getMac());
            msg = "Bem-vindo " + this.login.getUsername();
            title = "LOGIN BEM SUCEDIDO!";
            icon = 1;
        }else{
            msg = "Usuário e/ou senha inválido!";
            title = "ERRO LOGIN";
            icon = 0;
        }
        new MsgService().pupupMsg(msg, title, icon);
    }    
    

}
