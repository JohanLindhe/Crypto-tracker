package com.example.crypto_price_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CryptoPriceTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CryptoPriceTrackerApplication.class, args);
        System.out.println("Applikationen är igång!");
    }
    


    @Configuration
    public class WebConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/**")
                    .allowedOrigins("http://localhost:3000") // Din frontend-URL
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
        }
    }

}

