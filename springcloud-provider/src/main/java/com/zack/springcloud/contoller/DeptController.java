package com.zack.springcloud.contoller;

import com.zack.springcloud.pojo.Dept;
import com.zack.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * com.zack.springcloud.contoller
 *
 * @author zhangc
 * @version 1.0
 * @create 2020/10/27 16:05
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.selectById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> getList() {
        return deptService.selectAll();
    }


}
