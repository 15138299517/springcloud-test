package com.xin.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author KX
 * @date 2022/4/8 10:17
 */
@Configuration
// @Configuration 相当于Spring中的配置文件 applicationContext.xml 文件
public class ConfigBean {
    @Bean
    @LoadBalanced  //Ribbon,只要加了这个注解，这个RestTemplate就变成了负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
