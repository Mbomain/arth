package com.example.arth.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class add {
    @GetMapping("/add")
    public double add (@RequestParam double a, @RequestParam double b) {
        return a + b;
    }
}
