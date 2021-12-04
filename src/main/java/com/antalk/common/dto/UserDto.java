package com.antalk.common.dto;

import lombok.Data;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

/**
 * @Classname registerDto
 * @Description TODO
 * @Date 2021/12/4 10:09
 * @Created by luowenwei
 */
@Data
public class UserDto implements Serializable {
    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
