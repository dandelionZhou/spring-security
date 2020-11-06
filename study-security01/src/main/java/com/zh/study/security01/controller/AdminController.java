package com.zh.study.security01.controller;

import com.zh.study.security01.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @RequestMapping("/login")
    public String login() {
        return "success";
    }

    @RequestMapping("/getToken")
    @ResponseBody
    public String getJwtToken() {
        return jwtTokenUtil.generateJwtToken();
    }
}
