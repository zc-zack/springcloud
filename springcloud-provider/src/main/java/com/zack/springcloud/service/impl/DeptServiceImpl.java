package com.zack.springcloud.service.impl;

import com.zack.springcloud.dao.DeptDao;
import com.zack.springcloud.pojo.Dept;
import com.zack.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.zack.springcloud.service.impl
 *
 * @author zhangc
 * @version 1.0
 * @create 2020/10/27 15:57
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept selectById(Long id) {
        return deptDao.selectById(id);
    }

    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }
}
