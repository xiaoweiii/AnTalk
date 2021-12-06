package com.antalk.controller;

import com.antalk.common.lang.Result;
import com.antalk.entity.Talk;
import com.antalk.service.NormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TalkController
 * @Description talk控制器
 * @Date 2021/12/6 10:33
 * @Created by luowenwei
 */
@RestController
@RequestMapping("/normal")
public class NormalController {

    @Autowired
    NormalService normalService;

    @PostMapping("/createTalk")
    public Result createTalk(@Validated @RequestBody Talk talk){
        return normalService.createTalk(talk.getContent(), talk.getUid(), talk.getCreate_time());
    }
}
