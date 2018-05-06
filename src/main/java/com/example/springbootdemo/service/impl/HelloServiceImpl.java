package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
