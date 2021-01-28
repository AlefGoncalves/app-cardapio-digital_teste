package model.services;

import model.entities.Login;
import model.entities.User;
import model.repositories.dao.impl.LoginDAO;
import model.repositories.dao.impl.UserDAO;

public class UserService {

    public void register(String name, String username, String cpf, String email, String pass, int birthdate, String gender) {

        String msg = " ", title;
        int icon;

        User user = new User(name, cpf, email, birthdate, gender);
        Login login = new Login(username, pass);

        UserDAO userDAO = new UserDAO();
        LoginDAO loginDAO = new LoginDAO();

        title = "ERRO DADO DUPLICADO";
        icon = 0;
        if (!userDAO.isCPFNew(user)) {
            msg += "CPF " + "'" + user.getCpf() + "'" + " Já existe!";
        }

        if (!userDAO.isEmailNew(user)) {
            msg += "\nEmail " + "'" + user.getEmail() + "'" + " Já existe!";
        }

        if (!loginDAO.isUsernameNew(login)) {
            msg += "\nNome de Usuário " + "'" + login.getUsername() + "'" + " Já existe!";
        }
        if (userDAO.isCPFNew(user) && userDAO.isEmailNew(user) && loginDAO.isUsernameNew(login)) {
            userDAO.insert(user);
            userDAO.findIdUserByCpf(user, login);
            loginDAO.insert(user, login);
            msg = "Usuário " + login.getUsername() + " registrado com sucesso\nJá pode efetuar seu login";
            title = "SUCCESS REGISTER";
            icon = 1;
        }

        new MsgService().pupupMsg(msg, title, icon);
    }

}
