package com.itheima.service.impl;


import com.itheima.mapper.DeptMapper;
import com.itheima.pojo.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptMapper deptMapper;


    @Override
    public List<Dept> findall() {
        return deptMapper.findALL();
    }

    @Override  //ctrl+i可以自动idea生成要实现的方法名
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }
    @Override
    public void save(Dept dept) {
        //补全基础属性
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        //保存部门
        deptMapper.insert(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public void update(Dept dept) {

        //补全基础属性
        dept.setUpdateTime(LocalDateTime.now());
        //修改部门
        deptMapper.update(dept);
    }

}
