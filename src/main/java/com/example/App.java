package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to my AWS EC2 Cloud Server!</h1><p>The CI/CD pipeline works perfectly.</p>";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}