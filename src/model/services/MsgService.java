package model.services;

import javax.swing.JOptionPane;

public class MsgService {
    
    public void pupupMsg(String msg, String title, int icon){
        JOptionPane.showMessageDialog(null, msg, title, icon);
    }
    
}
