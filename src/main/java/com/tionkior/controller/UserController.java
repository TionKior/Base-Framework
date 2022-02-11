package com.tionkior.controller;

import com.tionkior.pojo.User;
import com.tionkior.service.UserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : Controller
 * @Author : TionKior
 * @Date : 2021/6/23 14:57
 * @Version : V1.0
 * @Description : Controller Class
 */

@Api(tags = "User控制类")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    /**
     * 注解@ApiImplicitParam用在方法体上
     *
     * @param user 前台传入的User对象
     * @return 返回前台传入的User对象
     */
    @ApiOperation("获取单个用户,用户由前台传入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "前台传入的id", dataTypeClass = User.class),
            @ApiImplicitParam(name = "username", value = "前台传入的username", dataTypeClass = User.class),
            @ApiImplicitParam(name = "password", value = "前台传入的password", dataTypeClass = User.class)
    })
    @GetMapping("/getUser")
    public User getUser(User user) {
        return user;
    }

    /**
     * 注解@ApiParam参数用在参数列表上
     *
     * @param username 前台传入的username
     * @param password 前台传入的password
     * @return 前台传入的username
     */
    @GetMapping("/getString")
    public String getString(
            @ApiParam(name = "username", value = "前台传入String", type = "String") String username,
            @ApiParam(name = "password", value = "前台传入password", type = "String") String password) {
        return username + password;
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "success";
    }


}