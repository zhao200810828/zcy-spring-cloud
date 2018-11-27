package com.zcy.cloud.consumer.movie.feign.zk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sue on 2018/9/18.
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "hello")
    public String hello(@RequestParam String name) {
        return this.restTemplate.getForObject("http://zcy-spring-cloud-provide-user-zk/hello?name=" + name, String.class);
    }

}
