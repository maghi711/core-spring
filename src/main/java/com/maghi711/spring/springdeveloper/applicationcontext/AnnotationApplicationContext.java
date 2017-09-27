package com.maghi711.spring.springdeveloper.applicationcontext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnotationApplicationContext {

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:applicationcontext/annotation-app-context.xml");
        context.refresh();

        System.out.println("-----------------------------");

        plainObject(context);
        setterInject(context);

        System.out.println("-----------------------------");
    }

    private static void setterInject(GenericXmlApplicationContext context) {
        MessageRenderer messageRenderer = context.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();
    }

    private static void plainObject(GenericXmlApplicationContext context) {
        MessageProvider messageProvider = context.getBean("messageProvider", MessageProvider.class);
        System.out.println("messageProvider.getMessage() = " + messageProvider.getMessage());
    }


}
