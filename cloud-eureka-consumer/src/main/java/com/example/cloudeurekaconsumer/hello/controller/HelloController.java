package com.example.cloudeurekaconsumer.hello.controller;

import com.example.cloudeurekaconsumer.feign.HelloFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    HelloFeign helloFeign;

    @RequestMapping("/hello_proxy")
    public String hello(String name) {
        log.info("get the hello: {}", name);
        return helloFeign.hello(name);
    }
}
