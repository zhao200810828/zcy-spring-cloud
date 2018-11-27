package com.zcy.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sue on 2018/11/26.
 */
@RestController
public class LisiController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${version}")
    private String version="开发环境";


    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return "name="+name;
    }

    @RequestMapping("/test")
    public String test(){
        return "你好，我是"+name+",年龄："+age+"岁。当前环境："+version;
    }
}
