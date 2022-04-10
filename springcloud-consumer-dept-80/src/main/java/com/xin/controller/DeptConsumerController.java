package com.xin.controller;

import com.xin.pojo.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author KX
 * @date 2022/4/8 10:16
 */
@RestController
public class DeptConsumerController {

    //消费者 : 不应该有service层
    //RestTemplate  有很多方法给我们直接调用  !  它的类中没有Bean所以要我们自己把它注册到Bean中
    //(url, 实体：Map, Class<T> responseType)

    @Resource
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    //用Ribbon做负载均衡的时候不应该写它，不应该写死,地址应该是一个变量,通过服务名来访问
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getById(@PathVariable(value = "id") Integer id) {
        //service不在本项目中，所以要去远程项目获取
        //远程只能用  get 方式请求，那么这里也只能通过 get 方式获取
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/selectById?id=" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept) {
        //远程只能用  post 方式请求，那么这里也只能通过 post 方式获取
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/addDept", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/getAll")
    public List<Dept> getAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/selectAll", List.class);
    }
}
