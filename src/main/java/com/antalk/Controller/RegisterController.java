package com.antalk.Controller;

import com.antalk.common.lang.Result;
import com.antalk.common.dto.UserDto;
import com.antalk.entity.User;
import com.antalk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Classname RegisterController
 * @Description 注册控制器
 * @Date 2021/11/30 14:30
 * @Created by luowenwei
 */
@RestController
@RequestMapping("/admin")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@Validated @RequestBody UserDto userDto){
        return userService.register(userDto.getUsername(), userDto.getPassword());
    }

    public static void main(String[] args) {
        Date date=new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        System.out.println(timeStamp);
    }
}
