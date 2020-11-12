package com.makercodes;

import com.makercodes.configuration.DIConfiguration;
import com.makercodes.consumer.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringDIApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication application = context.getBean(MyApplication.class);

        application.processMessage("Hello Deniz", "deniz@maker.com");

        context.close();
    }
}
