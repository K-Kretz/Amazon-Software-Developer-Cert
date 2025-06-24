package com.amazon.rest_example.controller;

import com.amazon.rest_example.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

//    @GetMapping("/welcome")
////    public String getWelcomeMessage(){
////        return "Welcome to Spring Boot REST API! by Controller";
////    }

    private final WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService=welcomeService;
    }

    @GetMapping("/welcome")
    public String getWelcomeMessage(){
        return welcomeService.getWelcomeMessage();
    }
}
