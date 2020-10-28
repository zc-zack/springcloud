package com.zack.springcloud.controller;

import com.zack.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * com.zack.springcloud.controller
 *
 * @author zhangc
 * @version 1.0
 * @create 2020/10/27 16:45
 */
@RestController
public class DeptConsumerController {

    //消费者不应该有service层
    // RestTemplate供我们直接调用 注册到spring中

    /**
     * 提供多种便捷访问远程http服务的方法，简单的Restful服务模板
     */
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_UTL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(REST_UTL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_UTL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_UTL_PREFIX + "/dept/list", List.class);
    }

}
