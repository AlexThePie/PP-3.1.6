package com.example.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestTemplateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RestTemplateApplication.class, args);
        Connection connection = context.getBean("connection", Connection.class);
        System.out.println("Answer: " + connection.getAnswer());
    }

}
