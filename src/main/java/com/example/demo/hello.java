package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/hello")
    public String getData() {return  "Welcome to DevOps Arun Patil" ; }
}