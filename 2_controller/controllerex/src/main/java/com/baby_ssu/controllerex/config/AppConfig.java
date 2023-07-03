package com.baby_ssu.controllerex.config;

import com.baby_ssu.controllerex.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PostService postService(){
        return new PostService();
    }
}
