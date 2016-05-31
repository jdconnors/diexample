package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by cpvedevj1 on 5/31/16.
 */
@Component
@Profile("spanish")
/*This implementation will be used when spring.profiles.active=spanish in application properties.*/
public class HelloWorldServiceSpanishImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hola mundo";
    }
}
