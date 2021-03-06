package com.tionkior.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @ClassName : UrlController
 * @Author : TionKior
 * @Date : 2021/6/25 18:24
 * @Version : V1.0
 * @Description : Thymeleaf Test
 */

@Controller
public class UrlController {

    @GetMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("Thymeleaf", "Hello Thymeleaf");
        return "index";
    }

}