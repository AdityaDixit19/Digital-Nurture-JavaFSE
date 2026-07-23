package com.example.Account_ws.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class Hellocontroller {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}