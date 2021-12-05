package com.antalk.Controller;

import com.antalk.common.dto.UserDto;
import com.antalk.common.lang.Result;
import com.antalk.entity.User;
import com.antalk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname LoginController
 * @Description 登录控制器
 * @Date 2021/12/4 16:09
 * @Created by luowenwei
 */
@RestController
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private UserService userService;

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
