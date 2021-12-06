package com.antalk.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Classname Talk
 * @Description 讨论实体类
 * @Date 2021/12/6 10:09
 * @Created by luowenwei
 */

@Data
public class Talk {
    Integer talk_id;
    String content;
    Integer uid;
    String tag_name;
    Date create_time;
    Integer like_count;
    Integer comment_count;
}
