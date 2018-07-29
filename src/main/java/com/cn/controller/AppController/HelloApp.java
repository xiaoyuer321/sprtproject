package com.cn.controller.AppController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.cn.controller"})
public class HelloApp {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(HelloApp.class).web(true).run(args);
        SpringApplication.run(HelloApp.class,args);
    }
}
