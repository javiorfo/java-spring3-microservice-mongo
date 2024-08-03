package com.javi.common.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import com.javi.auditory.ApplicationAuditorAware;

@Configuration
@ComponentScan(basePackages = "com.javi")
@EnableMongoAuditing(auditorAwareRef = "auditorAware")
public class BeanConfiguration {
     @Bean
     public AuditorAware<String> auditorAware() {
         return new ApplicationAuditorAware();
     }
}
