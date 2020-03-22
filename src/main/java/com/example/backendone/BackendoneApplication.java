package com.example.backendone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class BackendoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendoneApplication.class, args);
    }

    Map<String, List<String>> map = new HashMap<>();

    @GetMapping("hello")
    String getMessage() {
        return "Hello from backend-one";
    }

}
