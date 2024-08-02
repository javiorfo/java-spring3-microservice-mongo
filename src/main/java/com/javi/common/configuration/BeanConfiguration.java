package com.javi.common.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import com.javi.auditory.ApplicationAuditorAware;
import com.javi.auditory.AuditoryConfiguration;

@Configuration
@ComponentScan(basePackages = "com.javi", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = AuditoryConfiguration.class))
@EnableMongoAuditing(auditorAwareRef = "auditorAware")
public class BeanConfiguration {
    
     @Bean
     public AuditorAware<String> auditorAware() {
         return new ApplicationAuditorAware();
     }
}
