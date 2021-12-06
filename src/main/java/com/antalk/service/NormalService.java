package com.antalk.service;

import com.antalk.common.lang.Result;

import java.util.Date;

/**
 * @InterfaceName TalkService
 * @Description TODO
 * @Date 2021/12/6 10:29
 * @Created by luowenwei
 */
public interface NormalService {
    Result createTalk(String content, Integer uid, Date create_time);
}
