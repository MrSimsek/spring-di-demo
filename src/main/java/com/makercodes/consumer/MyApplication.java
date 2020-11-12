package com.makercodes.consumer;

import com.makercodes.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {

    private final MessageService messageService;

    @Autowired
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean processMessage(String msg, String rec) {
        return messageService.sendMessage(msg, rec);
    }
}
