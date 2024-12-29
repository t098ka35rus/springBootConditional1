package com.example.springbootconditional.config;

import com.example.springbootconditional.profiles.DevProfile;
import com.example.springbootconditional.profiles.ProductionProfile;
import com.example.springbootconditional.profiles.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }


    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }


}
