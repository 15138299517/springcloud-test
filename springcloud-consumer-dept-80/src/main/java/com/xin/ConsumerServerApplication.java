package com.xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KX
 * @date 2022/4/8 10:28
 */
//Ribbon和 Eureka整合以后，客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
//@EnableEurekaClient  //在服务启动后自动注册到Eureka中
public class ConsumerServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerApplication.class, args);
    }
}
