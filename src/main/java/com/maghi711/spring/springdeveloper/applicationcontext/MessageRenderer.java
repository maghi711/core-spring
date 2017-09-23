package com.maghi711.spring.springdeveloper.applicationcontext;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
