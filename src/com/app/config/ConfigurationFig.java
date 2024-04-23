package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Students;

// Configuration class for Spring
@Configuration
public class ConfigurationFig {

    // Bean definition for the Students class
    @Bean("student")
    public Students getData() {
        return new Students();
    }
}
