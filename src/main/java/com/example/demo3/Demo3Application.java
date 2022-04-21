package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo3Application.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        System.out.println(">> message = " + greetingClient.getMessage("jnpark").block());
    }

}
