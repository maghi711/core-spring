package com.maghi711.spring.springdeveloper.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {

    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/xml-app-context.xml");
        context.refresh();

        System.out.println("Context Loaded");

        InjectSimple simple = context.getBean("injectSimple", InjectSimple.class);

        System.out.println("simple.toString() = " + simple.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
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
