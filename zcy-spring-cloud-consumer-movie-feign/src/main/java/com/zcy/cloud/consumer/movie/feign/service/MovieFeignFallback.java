package com.zcy.cloud.consumer.movie.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by sue on 2018/9/20.
 */
@Component
public class MovieFeignFallback implements MovieFeignService {
    @Override
    public String helloService() {
        return "hello error";
    }
}
