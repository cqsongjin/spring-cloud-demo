package com.example.cloudeurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//此注解用于开启服务发现功能，会在注册中心中注册此服务节点
@EnableDiscoveryClient
public class CloudEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaProviderApplication.class, args);
    }

}
