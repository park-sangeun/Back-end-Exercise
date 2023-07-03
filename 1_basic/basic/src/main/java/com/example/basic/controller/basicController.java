package main.java.com.example.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController{
    @GetMapping(value = "/")
    public String hello() {
        return "<h1>Hello Spring Boot!!</h1>";
    }
}
