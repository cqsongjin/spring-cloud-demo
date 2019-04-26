package com.example.cloudeurekaconsumerraw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
//或者使用如下注解
//@EnableEurekaClient
public class CloudEurekaConsumerRawApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaConsumerRawApplication.class, args);
    }

}
