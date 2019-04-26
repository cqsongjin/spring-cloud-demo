package com.example.cloudeurekaconsumerrest.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello_proxy")
    public String hello(String name) {
        String result = restTemplate.getForObject("http://cloud-eureka-provider/hello?name=" + name, String.class);
        return result;
    }
}
