package com.fc.projectboard.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fc.projectboard.util.FormDataEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public FormDataEncoder formDataEncoder() {
        return new FormDataEncoder(new ObjectMapper());
    }

}
