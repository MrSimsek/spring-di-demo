package com.makercodes.configuration;

import com.makercodes.service.EmailServiceImpl;
import com.makercodes.service.MessageService;
import com.makercodes.service.TwitterServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(value = {"com.makercodes.consumer"})
public class DIConfiguration {

    @Bean
    public MessageService getEmailService() {
        return new EmailServiceImpl();
    }

    @Bean
    @Primary
    public MessageService getTwitterService() {
        return new TwitterServiceImpl();
    }
}
