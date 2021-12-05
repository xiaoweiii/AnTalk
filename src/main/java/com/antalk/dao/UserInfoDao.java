package com.antalk.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @InterfaceName UserInfoDao
 * @Description 用户信息Dao层
 * @Date 2021/12/5 21:21
 * @Created by luowenwei
 */
@Mapper
@Repository
public interface UserInfoDao {
    //用户注册时，将注册时间保存到数据库中
    @Insert("INSERT INTO userinfo(uid, register_time) values (#{uid}, #{register_time})")
    void setRegisterTime(@Param("uid") int uid, @Param("register_time") Date register_time);
}
