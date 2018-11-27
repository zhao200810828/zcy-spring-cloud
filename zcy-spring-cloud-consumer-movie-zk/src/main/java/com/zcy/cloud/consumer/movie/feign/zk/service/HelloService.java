package com.zcy.cloud.consumer.movie.feign.zk.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sue on 2018/9/18.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHelloFallback")
    public String sayHello(String name) {
        return restTemplate.getForEntity("http://zcy-spring-cloud-provide-user-zk/hello?name=" + name, String.class).getBody();
    }

    private String sayHelloFallback(String name) {
        return "service error";
    }
}
