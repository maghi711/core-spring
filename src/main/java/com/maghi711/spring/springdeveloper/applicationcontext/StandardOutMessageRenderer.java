package com.maghi711.spring.springdeveloper.applicationcontext;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider == null) {
            throw new RuntimeException("message provider not set, please set");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Resource(name = "messageProvider")
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
