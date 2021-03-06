package com.maghi711.spring.springdeveloper.applicationcontext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlApplicationContext {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:applicationcontext/xml-app-context.xml");
        context.refresh();

        System.out.println("------------------------");
        plainObject(context);
        setterInjection(context);
        System.out.println("------------------------");
    }

    private static void setterInjection(GenericXmlApplicationContext context) {
        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }

    private static void plainObject(GenericXmlApplicationContext context) {
        MessageProvider messageProvider = context.getBean("messageProvider", MessageProvider.class);
        System.out.println("messageProvider.getMessage() = " + messageProvider.getMessage());
    }
}
