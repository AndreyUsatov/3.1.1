package com.andreiusatov.spring.mvc_hibernate_app.dao;

import com.andreiusatov.spring.mvc_hibernate_app.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);

}
// Комментарии