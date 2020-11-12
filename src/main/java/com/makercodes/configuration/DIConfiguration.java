package com.makercodes.configuration;

import com.makercodes.service.EmailServiceImpl;
import com.makercodes.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.makercodes.consumer"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService() {
        return new EmailServiceImpl();
    }
}
