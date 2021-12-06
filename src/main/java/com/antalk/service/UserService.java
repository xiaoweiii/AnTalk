package com.antalk.service;

import com.antalk.common.lang.Result;
import com.antalk.entity.User;

/**
 * @InterfaceName UserService
 * @Description 用户业务接口
 * @Date 2021/11/30 13:54
 * @Created by luowenwei
 */


public interface UserService {

    User findUserById(Integer id);

    User findUserByName(String username);

    Result register(String username, String password);

}
