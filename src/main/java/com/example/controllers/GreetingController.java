package com.example.controllers;

import com.example.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by cpvedevj1 on 5/31/16.
 */
@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}
