package com.maghi711.spring.springdeveloper.ioc.impl;

import com.maghi711.spring.springdeveloper.ioc.Greeting;

import java.util.Random;

public class HelloWorldGreeting implements Greeting {

    @Override
    public String greet(String name) {
        Random random = null;
        try {
            random = new Random();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Hello World!";
    }
}
