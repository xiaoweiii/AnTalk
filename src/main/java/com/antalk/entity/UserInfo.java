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
    private int uInfo_id;
    private int uid;
    private int follow_uid;
    private int fans_uid;
    private Date register_time;
}
