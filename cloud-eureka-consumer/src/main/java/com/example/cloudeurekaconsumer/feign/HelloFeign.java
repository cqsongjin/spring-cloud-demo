package com.example.cloudeurekaconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-eureka-provider", fallback = HelloFeignHystrix.class)
public interface HelloFeign {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name")String name);
}
