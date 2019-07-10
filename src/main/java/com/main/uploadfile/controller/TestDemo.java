package com.main.uploadfile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/29.
 */
@Controller
public class TestDemo {
    @RequestMapping("test")
    public String test(){
        return "index";
    }
}
