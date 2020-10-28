package com.zack.springcloud.dao;

import com.zack.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * com.zack.springcloud.dao
 *
 * @author zhangc
 * @version 1.0
 * @create 2020/10/27 15:47
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept selectById(Long id);

    public List<Dept> selectAll();

}
