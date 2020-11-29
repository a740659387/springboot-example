package com.zbyz.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.zbyz.example")
@EnableDiscoveryClient
@EnableSwagger2
public class NacosConsumerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }
}
