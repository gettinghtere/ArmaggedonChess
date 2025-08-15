package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ChessSiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChessSiteApplication.class, args);
    }
}

/* Optional quick health check at "/" */
@RestController
class RootController {
    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot! (Render)";
    }
}
