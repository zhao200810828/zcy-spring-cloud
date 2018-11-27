package com.zcy.cloud.consumer.movie.feign.controller;

import com.zcy.cloud.consumer.movie.feign.service.MovieFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sue on 2018/9/20.
 */
@RestController
public class MovieFeignController {
    @Autowired
    MovieFeignService movieFeignService;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String test() {
        StringBuffer sb = new StringBuffer();
        sb.append(movieFeignService.helloService());
        return sb.toString();
    }

}
