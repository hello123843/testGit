package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j   //这个注解就相当于private static final Logger log = LoggerFactory.getLogger(LogTest.class);
@RequestMapping("/depts")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //指定了请求方式为get
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)
    //但是一般按照下面的方式写，更简洁
    @GetMapping
    //这个是根据接口文档里写的请求路径来写的，不能随意写
    public Result list(){
//        System.out.println("查询全部部门数据");
        log.info("查询部门列表");
        List<Dept> deptList = deptService.findall();//list的元素是一个一个的对象
        return Result.success(deptList);
    }

    @DeleteMapping
    public Result delete(Integer id){
//        System.out.println("根据id删除部门, id=" + id);
        log.info("根据id删除部门, id: {}" , id);
        //{ }是占位符
        deptService.deleteById(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
//        System.out.println("新增部门, dept=" + dept);
        log.info("新增部门, dept: {}" , dept);
        deptService.save(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
//        System.out.println("根据ID查询, id=" + id);
        log.info("根据ID查询, id: {}" , id);
        Dept dept=deptService.getById(id);
        return Result.success(dept);
    }

    @PutMapping
    public Result update(@RequestBody Dept dept){
//        System.out.println("修改部门, dept=" + dept);
        log.info("修改部门, dept: {}" , dept);
        deptService.update(dept);
        return Result.success();
    }

}
