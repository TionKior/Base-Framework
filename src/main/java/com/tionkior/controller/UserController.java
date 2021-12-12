package com.tionkior.controller;

import com.tionkior.domain.User;
import com.tionkior.service.UserService;
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

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/save")
    public String baseController(User user) {
        userService.save(user);

        return "success";
    }

}
