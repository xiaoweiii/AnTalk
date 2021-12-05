package com.antalk.service;

import com.antalk.common.lang.Result;
import com.antalk.entity.User;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @InterfaceName UserService
 * @Description TODO
 * @Date 2021/11/30 13:54
 * @Created by luowenwei
 */


public interface UserService {

    User findUserById(long id);

    User findUserByName(String username);

    Result register(String username, String password);

}
