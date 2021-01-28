package model.controllers;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.controllers.consistence.DataConsistenceUserTest;
import model.services.UserService;

public class UserController {

    public void btRegistrar(JTextField name, JTextField username, JTextField cpf,
            JTextField email, JTextField pass, JTextField birthdate, JRadioButton masc, JRadioButton fem) {
        new UserService().register(name.getText(), username.getText(), cpf.getText(), email.getText(),
                pass.getText(), Integer.parseInt(birthdate.getText()), new DataConsistenceUserTest().setGenderText(masc, fem));
    }

    public void cleanTextField(JTextField tf_name, JTextField tf_username, JTextField tf_cpf, JTextField tf_email,
            JTextField tf_password, JTextField tf_birthdate) {
        tf_name.setText(null);
        tf_birthdate.setText(null);
        tf_cpf.setText(null);
        tf_email.setText(null);
        tf_username.setText(null);
        tf_password.setText(null);
    }

    public void cleanRadioButton(JRadioButton rb_masc, JRadioButton rb_fem) {
        rb_fem.setSelected(false);
        rb_masc.setSelected(false);
    }

    public void cleanLabelDesc(JLabel lb_name, JLabel lb_username, JLabel lb_cpf, JLabel lb_email, JLabel lb_password,
            JLabel lb_birthdate, JLabel lb_gender) {
        lb_name.setText(null);
        lb_birthdate.setText(null);
        lb_cpf.setText(null);
        lb_email.setText(null);
        lb_username.setText(null);
        lb_password.setText(null);
        lb_gender.setText(null);
    }
}
