package com.example.cloudeurekaconsumerraw.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
//    注入一个工具类，用于获取当前被发现的所有服务
    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
//        获取所有指定服务ID的实例，因为可注册多个相同ID的服务用于负载均衡，所以可能有多个相同的服务，多个服务的instanceID并不相同
//        instanceID的生成规则默认为${spring.cloud.client.hostname}:${spring.application.name}:${spring.application.instance_id:${server.port}}}
//        也可以修改eureka.instance.instanceId的值来改变instanceID的生成方式
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-eureka-provider");
        StringBuilder builder = new StringBuilder();
        builder.append("the server provider:\n");
        for (ServiceInstance instance : instances) {
            builder.append("instance id -> ").append(instance.getInstanceId());
            builder.append("home url -> ").append(instance.getUri());
            builder.append("port -> ").append(instance.getPort());
        }
        return builder.toString();
    }
}
