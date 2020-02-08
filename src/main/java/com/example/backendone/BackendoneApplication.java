package com.example.backendone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class BackendoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendoneApplication.class, args);
    }

    @GetMapping("hello")
    String getMessage() {
        return "Hello from backend-one";
    }

}
