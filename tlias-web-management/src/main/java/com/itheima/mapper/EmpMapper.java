package com.itheima.mapper;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//操作员工信息
@Mapper
public interface EmpMapper {

    //--------------------------------------原始分页查询实现----------------------------------------
    /**
     * 查询总记录数
     */
    //@Select("select count(*) from emp e left join dept d on e.dept_id = d.id ")
    //public Long count();

    /**
     * 查询所有的员工及其对应的部门名称
     */
    //@Select("select e.*, d.name deptName from emp as e left join dept as d on e.dept_id = d.id limit #{start}, #{pageSize}")
    //public List<Emp> list(Integer start , Integer pageSize);

    /**
     * 查询所有的员工及其对应的部门名称
     */
    /*@Select("select e.*, d.name deptName from emp as e left join dept as d on e.dept_id = d.id")
    public List<Emp> list();*/
    List<Emp> list(EmpQueryParam empQueryParam);

}
