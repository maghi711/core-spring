package com.maghi711.spring.springdeveloper.ioc.impl;

import org.springframework.stereotype.Component;

@Component
public class BaseGreeting implements Greeting {
    @Override
    public String greet(String name) {
        String message = "Welcome ";
        return message + (name != null ? name : "User");
    }
}
