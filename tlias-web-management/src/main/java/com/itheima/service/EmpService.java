package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;

public interface EmpService {
    /**
     * 分页查询
     */
    // PageResult page(Integer page, Integer pageSize);
    PageResult page(EmpQueryParam empQueryParam);
}

