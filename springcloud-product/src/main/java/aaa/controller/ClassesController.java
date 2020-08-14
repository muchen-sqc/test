package aaa.controller;

import aaa.dao.CourseDao;
import aaa.entity.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
public class ClassesController {
    @Resource
    CourseDao cd;
    @RequestMapping("findAll")
    @ResponseBody
    public List<Course> findAll(){
        System.out.println("findAll");
        return cd.findAll();
    }
    @RequestMapping("selectAll")
    @ResponseBody
    public List<Course> selectAll(){
        System.out.println("SelectALL");
        return cd.selectAll();
    }
    @RequestMapping("update")
    @ResponseBody
    public int update(Course c){
        System.out.println("update:"+c);
        return cd.update(c);
    }
    @RequestMapping("del")
    @ResponseBody
    public int del(int cid){
        System.out.println("del:"+cid);
        return cd.del(cid);
    }
    @RequestMapping("add")
    @ResponseBody
    public int add(Course c){
        System.out.println("add:"+c);
        return cd.add(c);
    }


}
