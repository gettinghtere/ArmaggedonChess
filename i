package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ChessSiteApplication {
    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot on Render!";
    }
    public static void main(String[] args) {
        SpringApplication.run(ChessSiteApplication.class, args);
    }
}
