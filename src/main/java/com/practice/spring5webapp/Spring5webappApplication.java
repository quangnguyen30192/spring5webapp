package com.practice.spring5webapp;

import com.practice.spring5webapp.model.DatabaseProp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class Spring5webappApplication {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(Spring5webappApplication.class, args);

        final DatabaseProp databaseProp = applicationContext.getBean(DatabaseProp.class);
        System.out.println(databaseProp);
    }
}
