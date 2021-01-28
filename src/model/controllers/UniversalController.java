package model.controllers;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;

public class UniversalController { //Controle criado para ser utilizado em todas as views do projeto
     
    public void onOffFrame(JFrame openFrame, JFrame closeFrame){
        openFrame.setVisible(true);
        closeFrame.dispose();
    }
    
    public void btMouseMoved(JButton button){
        button.setBackground(Color.GREEN);
    }
    
    public void btMouseExited(JButton button){
        button.setBackground(Color.lightGray);
    }
    
    public void mnMouseMoved(JMenu jmenu){
        jmenu.setBackground(Color.GREEN);
    }
    
    public void mnMouseExited(JMenu jmenu){
        jmenu.setBackground(Color.lightGray);
    }
    
    public void btNoFunction(JButton button){
        button.setBackground(Color.RED);
    }
    
    public void btColorPattern(JButton button){
        button.setBackground(Color.lightGray);
    }    

}