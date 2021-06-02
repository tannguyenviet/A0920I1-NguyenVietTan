package com.codegym.demo.service;

import com.codegym.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    User findUserById(int id);
    void saveUser(User user);
    void deleteUserById(int id);
}
