package com.antalk.dao;

import com.antalk.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @InterfaceName UserDao
 * @Description TODO
 * @Date 2021/11/30 14:20
 * @Created by luowenwei
 */
@Mapper
@Repository
public interface UserDao {

    //根据用户名和密码增加一个用户
    @Insert("INSERT INTO user(username, password) values (#{username}, #{password})")
    void insertUser(@Param("username") String username, @Param("password") String password);

    //根据用户名搜索用户是否存在
    @Select("SELECT * FROM user WHERE username = #{username}")
    User findUserByName(@Param("username") String username);

    //根据id查询用户
    @Select("SELECT * FROM user WHERE userId = #{userId}")
    User findUserById(@Param("userId") long userId);
}
