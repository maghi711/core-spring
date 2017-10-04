package com.maghi711.spring.springdeveloper.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {

    public static void main(String[] args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:spring/parent.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:spring/child.xml");
        child.setParent(parent);
        child.refresh();

        SimpleTarget target1 = child.getBean("target1", SimpleTarget.class);
        SimpleTarget target2 = child.getBean("target2", SimpleTarget.class);
        SimpleTarget target3 = child.getBean("target3", SimpleTarget.class);

        System.out.println("target3 = " + target3.getVal());
        System.out.println("target2 = " + target2.getVal());
        System.out.println("target1 = " + target1.getVal());
    }
}
