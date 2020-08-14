package com.aaa.controller;

import com.aaa.Course;
import com.aaa.dao.PorductUserService;
import org.apache.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class TestController {

    @Resource
    PorductUserService porductUserService;

    @RequestMapping("test")
    public String test(){
        return porductUserService.getUser();
    }
    @RequestMapping("findAll")
    public String findAll(){
        return porductUserService.findAll();
    }
    @RequestMapping("update")
    public String update(Course c){
        System.out.println(c);return porductUserService.update(c.getCid(),c.getCname());
    }
    @RequestMapping("del")
    public String del(int cid){
        return porductUserService.del(cid);
    }
    @RequestMapping("add")
    public String add(Course c){
        System.out.println(c);;return porductUserService.add(c.getCid(),c.getCname());
    }
}
