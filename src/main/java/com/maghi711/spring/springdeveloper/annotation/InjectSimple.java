package com.maghi711.spring.springdeveloper.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {

    @Value("Aadavan Mahesh")
    private String name;

    @Value("3")
    private int age;

    @Value("1.778")
    private float height;

    @Value("true")
    private boolean programmer;

    @Value("1009843200")
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/annotation-app-context.xml");
        context.refresh();

        System.out.println("Context Loaded");

        InjectSimple simple = context.getBean("injectSimple", InjectSimple.class);

        System.out.println("simple.toString() = " + simple.toString());
        System.out.println(" closing context ");
        context.close();
    }

    @Override
    public String toString() {
        return "\nInjectSimple{" +
                "\nname='" + name + '\'' +
                ", \nage=" + age +
                ", \nheight=" + height +
                ", \nprogrammer=" + programmer +
                ", \nageInSeconds=" + ageInSeconds +
                "\n}";
    }
}
