package model.controllers.consistence;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DataConsistenceUserTest {

    public DataConsistenceUserTest() {

    }    
    public String setGenderText(JRadioButton masc, JRadioButton fem){
         if (masc.isSelected() && !fem.isSelected()) {
            return Character.toString(masc.getText().toLowerCase().charAt(0));
        } else{
            return Character.toString(masc.getText().toLowerCase().charAt(0));
        }  
    }

    public void rbAct(JRadioButton masc, JRadioButton fem, JLabel name, JLabel username, JLabel cpf, JLabel email, JLabel pass, JLabel birthdate, JLabel gender, JButton confirm) {
        if (masc.isSelected() && !fem.isSelected()) {
            successAction(gender);
        } else if(!masc.isSelected() && fem.isSelected()){
            successAction(gender);
        }        
        else {
            gender.setText("Selecione 1 opção");
            gender.setForeground(new java.awt.Color(255, 153, 0));
        }
        enableButton(name, username, cpf, email, pass, birthdate, gender, confirm);
    }

    public void enableButton(JLabel name, JLabel username, JLabel cpf, JLabel email, JLabel pass, JLabel birthdate, JLabel gender, JButton confirm) {
        if (name.getText().equals("OK!") && username.getText().equals("OK!") && cpf.getText().equals("OK!")
                && email.getText().equals("OK!") && pass.getText().equals("OK!") && birthdate.getText().equals("OK!")
                && gender.getText().equals("OK!")) {
            confirm.setEnabled(true);
        } else {
            confirm.setEnabled(false);
        }
    }

    public void successAction(JLabel msg) {
        msg.setText("OK!");
        msg.setForeground(new java.awt.Color(0, 255, 0));
    }

    public boolean isValidBirthdateNumber(JTextField birthdate, JLabel msg) {

        try {
            Integer.parseInt(birthdate.getText());
            return true;

        } catch (NumberFormatException e) {
            msg.setText("Digite apenas números!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }

    }

    public boolean isValidNameLength(JTextField name, JLabel msg) {

        //Verifica tamanho(12 a 30)
        if (name.getText().length() < 8 || name.getText().length() > 30) {
            msg.setText("Digite 8 a 30 caracteres!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidNameFormat(JTextField name, JLabel msg) {

        int value = 0;

        //Verifica se existe somente letras no nome
        for (int i = 0; i < name.getText().length(); i++) {
            if (!(Character.isLetter(name.getText().charAt(i)) || Character.isWhitespace(name.getText().charAt(i)))) {
                value += 1;
            }
        }
        if (value != 0) {
            msg.setText("Digite apenas letras!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidUsernameLength(JTextField username, JLabel msg) {

        if ((username.getText().length() < 4) || (username.getText().length() > 16)) {
            msg.setText("Digite 4 a 16 caracteres!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidCPFLength(JTextField cpf, JLabel msg) {

        if (cpf.getText().length() != 11) {
            msg.setText("Digite 11 números!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidCPFFormat(JTextField cpf, JLabel msg) {

        int value = 0;

        for (int i = 0; i < cpf.getText().length(); i++) {
            if (!Character.isDigit(cpf.getText().charAt(i))) {
                value += 1;
            }
        }
        if (value != 0) {
            msg.setText("Digite apenas números!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidEmailAtSign(JTextField email, JLabel msg) {

        if (!(email.getText().contains("@"))) {
            msg.setText("precisa conter '@'");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidEmailLength(JTextField email, JLabel msg) {

        if ((email.getText().length() < 15) || (email.getText().length() > 50)) {
            msg.setText("Digite 15 a 50 caracteres!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidPasswordLength(JTextField password, JLabel msg) {

        if (!((password.getText().length() >= 5) && (password.getText().length() < 20))) {
            msg.setText("Digite 5 a 20 caracteres!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidBirthdateOfAge(JTextField birthdate, JLabel msg) {

        if (Integer.parseInt(birthdate.getText()) > 2004) {
            msg.setText("Idade mínima de 16 anos!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

    public boolean isValidBirthdateLength(JTextField birthdate, JLabel msg) {

        if (birthdate.getText().length() != 4) {
            msg.setText("Digite no formato 'AAAA'!");
            msg.setForeground(new java.awt.Color(255, 153, 0));
            return false;
        }
        return true;

    }

}
