package com.example.studyjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/admin")
    public String adminP() {
        return "Admin Controller";
    }
}
