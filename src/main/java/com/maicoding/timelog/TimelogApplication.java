package com.maicoding.timelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TimelogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimelogApplication.class, args);
    }

}
