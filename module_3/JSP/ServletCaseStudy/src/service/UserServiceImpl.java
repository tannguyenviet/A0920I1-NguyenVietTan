package service;

import dao.LoginDAO;
import dao.LoginDAOImpl;
import model.TypeUserName;

import java.util.List;

public class UserServiceImpl implements UserService {
    LoginDAO loginDAO = new LoginDAOImpl();
    @Override
    public TypeUserName findTypeUserNameById(String username) {
        return loginDAO.selectTypeUserNameById(username);
    }

    @Override
    public List<TypeUserName> findAll() {
        return loginDAO.selectAllTypeUserName();
    }

    @Override
    public void CreateNewTypeUserName(TypeUserName typeUserName) {
        loginDAO.insertTypeUserName(typeUserName);
    }

    @Override
    public void DeleteTypeUserName(String username) {
        loginDAO.deleteTypeUserName(username);
    }

    @Override
    public void UpdateTypeUserName(TypeUserName typeUserName) {
        loginDAO.updateTypeUserName(typeUserName);
    }
}
