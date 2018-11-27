package com.zcy.cloud.user.zk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sue on 2018/9/18.
 */
@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(name = "name") String name) {
        log.info("param:name->{}", name);
        return "hello: " + name;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
        return "hello: ";
    }
}
