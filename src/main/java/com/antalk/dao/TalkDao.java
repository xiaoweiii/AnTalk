package com.antalk.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @InterfaceName TalkDao
 * @Description 讨论的Dao
 * @Date 2021/12/6 10:12
 * @Created by luowenwei
 */
@Mapper
@Repository
public interface TalkDao {
    //新建一个talk
    @Insert("INSERT INTO talk(content, uid, create_time) values (#{content}, #{uid}, #{create_time})")
    void createTalk(@Param("content") String content,
                    @Param("uid") Integer uid,
                    @Param("create_time")Date create_time);
}
