package aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    public String getUser(){
        return "{\"user\":{\"id\":1,\"name\":张三}}";
    }
}
