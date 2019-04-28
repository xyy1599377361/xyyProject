package com.cloud.ribbon.ribbon.controller;

import com.cloud.ribbon.ribbon.servicee.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return helloService.sayHello()+" "+name;
    }

}
