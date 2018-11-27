package com.zcy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sue on 2018/9/18.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] agrs){
        SpringApplication.run(Application.class,agrs);
    }
}
