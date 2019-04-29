package com.example.cloudeurekaconsumer.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignHystrix implements HelloFeign{

    @Override
    public String hello(String name) {
        return "this service has wrong";
    }
}
