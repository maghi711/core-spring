package com.maghi711.spring.springdeveloper.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {

    private Map<String, Object> map;
    private Properties props;
    private Set set;
    private List list;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/collection-context-xml.xml");
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

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
