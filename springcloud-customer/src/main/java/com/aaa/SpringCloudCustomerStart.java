package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 将当前应用程序注册为feign得客户端程序
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudCustomerStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCustomerStart.class,args);
    }
}
