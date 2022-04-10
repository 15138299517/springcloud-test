package com.xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author KX
 * @date 2022/4/8 15:37
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaServerApplication_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EureKaServerApplication_7003.class, args);
    }
}
