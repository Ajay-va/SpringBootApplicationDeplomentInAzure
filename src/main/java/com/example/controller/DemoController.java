package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class DemoController {



    @GetMapping("/welcome")
    public String welcome(){

        return "Welcome to Spring Boot Application We are deploying in Azure portal ==> Ajay Varma Javvaji";
    }



}
