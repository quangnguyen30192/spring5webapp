package com.practice.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class Spring5webappApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5webappApplication.class, args);
    }
}
