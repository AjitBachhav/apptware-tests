package com.apptware.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The @SpringBootApplication annotation is a convenience annotation that adds:
// - @Configuration: Tags the class as a source of bean definitions for the application context.
// - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
// - @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/apptware/interview package, allowing it to find the controllers.
@SpringBootApplication
public class InterviewApplication {

    public static void main(String[] args) {
        // SpringApplication.run() is a static method that launches the Spring Boot application.
        SpringApplication.run(InterviewApplication.class, args);
    }
}
