package com.cloud.stream.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.function.Consumer;

@SpringBootApplication
public class CloudStreamDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamDemoApplication.class, args);
	}

}
