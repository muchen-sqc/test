package com.aaa.dao.impl;

import com.aaa.dao.PorductUserService;
import org.springframework.stereotype.Component;

@Component
public class PorductUserServiceImpl implements PorductUserService {
    @Override
    public String getUser() {
        return "没有查到用户信息";
    }

    @Override
    public String findAll() {
        return "<h2 style='text-align:center'>服务报错查你🐎</h2>";
    }

    @Override
    public String update(int cid, String cname) {
        return "<h2 style='text-align:center'>服务报错改你🐎</h2>";
    }

    @Override
    public String del(int cid) {
        return "<h2 style='text-align:center'>服务报错删你🐎</h2>";
    }

    @Override
    public String add(int cid, String cname) {
        return "<h2 style='text-align:center'>服务报错添你🐎</h2>";
    }
}
