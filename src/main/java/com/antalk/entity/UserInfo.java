package com.antalk.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Classname UserInfo
 * @Description 用户信息类
 * @Date 2021/12/5 21:12
 * @Created by luowenwei
 */
@Data
public class UserInfo {
    private Integer uInfo_id;
    private Integer uid;
    private Integer follow_uid;
    private Integer fans_uid;
    private Date register_time;
}
