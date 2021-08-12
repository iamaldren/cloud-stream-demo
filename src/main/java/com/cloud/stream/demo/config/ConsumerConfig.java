package com.cloud.stream.demo.config;

import com.cloud.stream.demo.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class ConsumerConfig {

    @Bean
    public Consumer<Person> log() {
        return person -> {
          System.out.println("Received: " + person);
        };
    }

}
