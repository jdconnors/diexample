package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by cpvedevj1 on 5/31/16.
 */
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
