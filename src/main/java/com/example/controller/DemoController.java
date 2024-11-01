package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class DemoController {



    @GetMapping("/welcome")
    public String welcome(){
        return "This is my First Deployment in Azure ... !!! Congratulations...!!!! Ajay Varma Javvaji";
    }



}
