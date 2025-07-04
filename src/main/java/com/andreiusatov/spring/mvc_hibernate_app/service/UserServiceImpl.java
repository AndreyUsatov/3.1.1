package com.andreiusatov.spring.mvc_hibernate_app.service;

import com.andreiusatov.spring.mvc_hibernate_app.dao.UserDao;
import com.andreiusatov.spring.mvc_hibernate_app.model.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl  implements UserService{
    private final UserDao userDao;

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Override
    public void  deleteUser(Long id) {
        userDao.deleteUser(id);
    }
    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

}
// комментарии