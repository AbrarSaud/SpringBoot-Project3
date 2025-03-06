package com.example.firstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/hello")
    public String print() {
        return "Hello from Spring Boot ";
    }
    @GetMapping("/name")
    public String getName() {
        return "Hello Spring Boot, I am Abrar";
    }


}
