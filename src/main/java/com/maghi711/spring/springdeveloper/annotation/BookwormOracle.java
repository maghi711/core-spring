package com.maghi711.spring.springdeveloper.annotation;

import com.maghi711.spring.springdeveloper.beanfactory.Oracle;
import org.springframework.stereotype.Service;

@Service("oracle")
public class BookwormOracle implements Oracle {

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedia are a waste of money - use the internet(wikipedia)";
    }

    @Override
    public String toString() {
        return defineMeaningOfLife();
    }
}
