package com.example.admin.adminweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "asdfasdfadsfa";
    }
}
