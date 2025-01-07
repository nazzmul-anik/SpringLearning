package org.anik.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.anik.javaconfig")
public class JavaConfig {
    @Bean
    public Student getStudent() {
        return new Student();
    }
}
