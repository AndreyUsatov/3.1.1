package com.andreiusatov.spring.mvc_hibernate_app.dao;

import com.andreiusatov.spring.mvc_hibernate_app.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }


}
// Комментарии