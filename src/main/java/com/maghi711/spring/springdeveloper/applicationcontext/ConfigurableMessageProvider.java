package com.maghi711.spring.springdeveloper.applicationcontext;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    @Value("Hello Spring annotation")
    private String message;

    /*
    @Autowired
    public ConfigurableMessageProvider(@Value("Configured using annotation @Value") String message) {
        this.message = message;
    }
    */

    public ConfigurableMessageProvider() {}

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    //@Autowired
    public ConfigurableMessageProvider(int message) {
        this.message = message + "";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
