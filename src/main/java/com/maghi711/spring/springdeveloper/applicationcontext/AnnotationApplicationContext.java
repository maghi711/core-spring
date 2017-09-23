package com.maghi711.spring.springdeveloper.applicationcontext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnotationApplicationContext {

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:applicationcontext/annotation-app-context.xml");
        context.refresh();

        MessageProvider messageProvider = context.getBean("messageProvider", MessageProvider.class);
        System.out.println("messageProvider.getMessage() = " + messageProvider.getMessage());
    }
}
