package com.maghi711.spring.springdeveloper.applicationcontext;

import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
