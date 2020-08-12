package com.rzdp.cicdhelloworldbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdHelloWorldBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdHelloWorldBasicsApplication.class, args);
    }

    @GetMapping("/hello-world")
    public String sayHello() {
        return "Hello World";
    }
}
