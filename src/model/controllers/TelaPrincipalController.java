package model.controllers;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.services.MacAdressService;
import model.services.MsgService;
import model.views.LoginView;

public class TelaPrincipalController {

    public void bt_loginActController(JButton bt_login, JFrame frameOn, JFrame frameOff) {
        if (bt_login.getText().trim().equals("Login")) {
            new UniversalController().onOffFrame(frameOn, frameOff);
        } else {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (showConfirmDialog == 0) {
                new MacAdressService().logout();
                bt_login.setText("Login");
            }
        }
    }
    
    public String bt_loginSetTxtController(){
        return new MacAdressService().getLoginUser();
    }

    public void bt_pedidoController(JButton bt_login, JFrame frameOn, JFrame frameOff) {

        if (bt_login.getText().trim().equals("Login")) {
            String[] options = {"Continuar mesmo assim", "\nLogar"};
            int resp = JOptionPane.showOptionDialog(null, "Atenção! Você não está logado!", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (resp == 1) {
                new UniversalController().onOffFrame(new LoginView(), frameOff);
            }else{
                new UniversalController().onOffFrame(frameOn, frameOff);
            }
        } else {
            new UniversalController().onOffFrame(frameOn, frameOff);
        }

    }
    
    public void bt_sobreRestauranteController(){
        new MsgService().pupupMsg("Em Manutenção", "Warning", 2);
    }

}
