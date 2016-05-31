package com.example.config;

import com.example.services.HelloWorldService;
import com.example.services.HelloWorldServiceEnglishImpl;
import com.example.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jconnors on 5/31/16.
 */
@Configuration
public class HelloConfig {

    @Bean
    @Profile({"default","english"})
    public HelloWorldService HelloWorldServiceEnglishImpl() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService HelloWorldServiceSpanishImpl() {
        return new HelloWorldServiceSpanishImpl();
    }
}
