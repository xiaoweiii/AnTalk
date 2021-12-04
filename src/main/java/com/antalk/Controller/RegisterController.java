package com.antalk.Controller;

import com.antalk.common.lang.Result;
import com.antalk.common.dto.UserDto;
import com.antalk.entity.User;
import com.antalk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname RegisterController
 * @Description TODO
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
        User u = userService.findUserByName(userDto.getUsername());
        if(u != null){
            return Result.fail(200, "用户已存在", null);
        }
        userService.addUser(userDto.getUsername(), userDto.getPassword());
        return Result.succ(null);
    }

    @PostMapping("/login")
    public Result login(@Validated @RequestBody UserDto userDto){
        User u = userService.findUserByName(userDto.getUsername());
        if(u == null){
            return Result.fail(200, "用户不存在", null);
        }
        if(!userDto.getPassword().equals(u.getPassword())){
            return Result.fail("密码错误");
        }
        return Result.succ(200, "登录成功", null);
    }
}
