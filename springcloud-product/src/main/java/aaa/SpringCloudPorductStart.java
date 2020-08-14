package aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 注册成eureka得客户端
// @EnableEurekaClient
// EnableEurekaClient只支持Eureka注册中心，EnableDiscoveryClient支持所有得注册中心
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudPorductStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPorductStart.class,args);
    }
}
