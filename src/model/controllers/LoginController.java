package model.controllers;

import javax.swing.JTextField;
import model.services.LoginService;

public class LoginController {
    
    public void bt_entrarController(JTextField tf_nomeUsuario, JTextField tf_senha){
        new LoginService().testLogin(tf_nomeUsuario.getText().trim(), tf_senha.getText().trim());        
    }    
    
}
