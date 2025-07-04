package com.andreiusatov.spring.mvc_hibernate_app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.andreiusatov.spring.mvc_hibernate_app")
@EntityScan(basePackages = "com.andreiusatov.spring.mvc_hibernate_app.model")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
//