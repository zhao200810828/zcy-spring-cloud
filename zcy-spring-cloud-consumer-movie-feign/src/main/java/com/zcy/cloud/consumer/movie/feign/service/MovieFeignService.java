package com.zcy.cloud.consumer.movie.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sue on 2018/9/20.
 */
@FeignClient(name="zcy-spring-cloud-provide-user",fallback=MovieFeignFallback.class)
public interface MovieFeignService {
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    String helloService();
}
