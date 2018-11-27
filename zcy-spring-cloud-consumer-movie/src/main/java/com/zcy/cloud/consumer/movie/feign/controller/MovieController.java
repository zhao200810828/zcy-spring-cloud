package com.zcy.cloud.consumer.movie.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sue on 2018/9/18.
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String hi(){
        return this.restTemplate.getForObject("http://zcy-spring-cloud-provide-user/hello",String.class);
    }

}
