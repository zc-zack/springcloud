package com.zack.springcloud.service;

import com.zack.springcloud.pojo.Dept;

import java.util.List;

/**
 * com.zack.springcloud.service
 *
 * @author zhangc
 * @version 1.0
 * @create 2020/10/27 15:57
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept selectById(Long id);

    public List<Dept> selectAll();
}
