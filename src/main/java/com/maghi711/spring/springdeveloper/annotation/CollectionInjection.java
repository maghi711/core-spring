package com.maghi711.spring.springdeveloper.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service("injectCollection")
public class CollectionInjection {

    @Resource(name = "map")
    private Map<String, Object> map;

    @Resource(name = "props")
    private Properties props;

    @Resource(name = "set")
    private Set set;

    @Resource(name = "list")
    private List list;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/collection-context-annotation.xml");
        context.refresh();

        CollectionInjection injection = context.getBean("injectCollection", CollectionInjection.class);
        injection.displayInfo();
    }

    private void displayInfo() {
        System.out.println("Map contents:\n");
        for (Map.Entry<String, Object> entry: map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " - value: " + entry.getValue());
        }

        System.out.println("\nProperties contents:\n");
        for (Map.Entry<Object, Object> entry: props.entrySet()) {
            System.out.println("key: " + entry.getKey() + " - value: " + entry.getValue());
        }

        System.out.println("\nSet contents:\n");
        for(Object obj: set) {
            System.out.println("set value = " + obj);
        }

        System.out.println("\nList contents:\n");
        for(Object obj: list) {
            System.out.println("list value = " + obj);
        }
    }

}
