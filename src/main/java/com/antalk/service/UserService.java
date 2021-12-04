package com.antalk.service;

import com.antalk.entity.User;

/**
 * @InterfaceName UserService
 * @Description TODO
 * @Date 2021/11/30 13:54
 * @Created by luowenwei
 */


public interface UserService {
    void addUser(String username, String password);

    User findUserById(long id);

    User findUserByName(String username);

}
