package com.iscblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    private String index(HashMap<String,Object> map){
        map.put("hello","欢迎进入springboot的世界");
        return "/test.html";
    }
}
