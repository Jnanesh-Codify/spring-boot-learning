package com.jani.learning.configuration;

import com.jani.learning.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean //Explicitly declaring bean which will be managed by container later
    public Student student() {
        return new Student();
    }
}
