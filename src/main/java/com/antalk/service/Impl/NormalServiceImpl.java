package com.antalk.service.Impl;

import com.antalk.common.lang.Result;
import com.antalk.dao.TalkDao;
import com.antalk.service.NormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Classname TalkServiceImpl
 * @Description TODO
 * @Date 2021/12/6 10:32
 * @Created by luowenwei
 */
@Service
public class NormalServiceImpl implements NormalService {
    @Autowired
    TalkDao talkDao;


    @Override
    public Result createTalk(String content, Integer uid, Date create_time) {
        Date date = new Date();
        talkDao.createTalk(content, uid, date);
        return Result.succ(null);
    }
}
