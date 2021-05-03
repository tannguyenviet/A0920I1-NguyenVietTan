package service;

import model.TypeUserName;

import java.util.List;

public interface UserService {
    TypeUserName findTypeUserNameById(String id);
    List<TypeUserName> findAll();
    void CreateNewTypeUserName(TypeUserName typeUserName);
    void DeleteTypeUserName(String id);
    void UpdateTypeUserName(TypeUserName typeUserName);
}
