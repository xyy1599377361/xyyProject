package com.cloud.ribbon.ribbon.servicee;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "helloWorld";
    }
}
