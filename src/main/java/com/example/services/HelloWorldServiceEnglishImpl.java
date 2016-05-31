package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by cpvedevj1 on 5/31/16.
 */
@Component
@Profile({"default","english"})
/*This implementation will be used when spring.profiles.active is not present in application properties
 (i.e. default) or when spring.profiles.active=english in application properties.*/
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
