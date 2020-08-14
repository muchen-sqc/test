package com.aaa.dao;

import com.aaa.Course;
import com.aaa.dao.impl.PorductUserServiceImpl;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 获取SPRINGCLOUD-PORDUCT服务下得
//fallback的前提条件是服务报错，而不是客户端报错，客户端报错比如路径写错是不会触发的
@FeignClient(value = "SPRINGCLOUD-PORDUCT",fallback = PorductUserServiceImpl.class)
public interface PorductUserService {

    // 映射生产者对应得方法请求路径
    @RequestMapping("/user/getUser")
    String getUser();
    @RequestMapping("/findAll")
    String findAll();
    @RequestMapping("/update")
    String update(@RequestParam("cid")int cid,@RequestParam("cname")String cname);
    @RequestMapping("/del")
    String del(@RequestParam("cid")int cid);
    @RequestMapping("/add")
    String add(@RequestParam("cid")int cid,@RequestParam("cname")String cname);
}
