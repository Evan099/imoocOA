package com.imooc.oa.controller;

import com.imooc.oa.biz.DepartmentBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("DepartmentController")
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentBiz departmentBiz;

    @Autowired
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",departmentBiz.getAll());
        return "department_list";
    }

}
