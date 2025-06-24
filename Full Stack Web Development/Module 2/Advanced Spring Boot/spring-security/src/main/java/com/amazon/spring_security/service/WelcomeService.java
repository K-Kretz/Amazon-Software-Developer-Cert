package com.amazon.rest_example.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String getWelcomeMessage(){
        return "Welcome to Spring boot REST API responded by Service";
    }
}
