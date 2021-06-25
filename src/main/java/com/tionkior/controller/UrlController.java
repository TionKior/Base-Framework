package com.tionkior.controller;

import com.tionkior.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ClassName : UrlController
 * @Author : TionKior
 * @Date : 2021/6/25 18:24
 * @Version : V1.0
 * @Description : Thymeleaf Test
 */

@Controller
public class UrlController {

    @RequestMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("Thymeleaf", "Hello Thymeleaf");
        return "index";
    }

}
