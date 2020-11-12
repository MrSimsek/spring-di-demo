package com.makercodes.consumer;

import com.makercodes.service.MessageService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.*;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
@ComponentScan(value = "com.makercodes.consumer")
class MyApplicationTest {

    private AnnotationConfigApplicationContext context = null;

    @Bean
    public MessageService getMessageService() {
        return (msg, rec) -> {
            System.out.println("Mock Service");
            return true;
        };
    }

    @Bean
    @Primary
    public MessageService getSecondMessageService() {
        return (msg, rec) -> {
            System.out.println("Mock Second Service");
            return true;
        };
    }

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
    }

    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void processMessage() {
        MyApplication application = context.getBean(MyApplication.class);
        assertTrue(application.processMessage("Hello Deniz", "deniz@makercode.com"));
    }
}