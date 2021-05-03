package dao;

import model.TypeUserName;

import java.util.List;

public interface LoginDAO {
    List<TypeUserName> selectAllTypeUserName();
    TypeUserName selectTypeUserNameById(String id);
    void deleteTypeUserName(String id);
    void updateTypeUserName(TypeUserName typeUserName);
    void insertTypeUserName(TypeUserName typeUserName);
}
