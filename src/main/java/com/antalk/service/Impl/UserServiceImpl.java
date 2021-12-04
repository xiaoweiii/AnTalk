package com.antalk.service.Impl;

import com.antalk.service.UserService;
import com.antalk.dao.UserDao;
import com.antalk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2021/11/30 15:24
 * @Created by luowenwei
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(String username, String password) {
        userDao.insertUser(username, password);
    }

    @Override
    public User findUserById(long id) {
        User user = userDao.findUserById(id);
        return user;
    }

    @Override
    public User findUserByName(String username) {
        User user = userDao.findUserByName(username);
        return user;
    }
}
