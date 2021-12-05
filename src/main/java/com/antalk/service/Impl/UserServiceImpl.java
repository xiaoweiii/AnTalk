package com.antalk.service.Impl;

import com.antalk.common.lang.Result;
import com.antalk.dao.UserInfoDao;
import com.antalk.service.UserService;
import com.antalk.dao.UserDao;
import com.antalk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

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

    @Autowired
    private UserInfoDao userInfoDao;

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

    @Override
    @Transactional
    public Result register(String username, String password) {
        User u = userDao.findUserByName(username);
        if(u != null){
            return Result.fail(200, "用户已存在", null);
        }
        userDao.insertUser(username, password);
        u = userDao.findUserByName(username);
        Date date = new Date();
//        Timestamp timestamp = new Timestamp(date.getTime());
        userInfoDao.setRegisterTime(u.getUid(), date);
        return Result.succ(null);
    }
}
