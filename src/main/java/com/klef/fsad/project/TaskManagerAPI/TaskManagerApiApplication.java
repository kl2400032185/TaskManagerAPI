package com.klef.fsad.project.TaskManagerAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.fsad.project")
@EntityScan(basePackages = "com.klef.fsad.project")
@EnableJpaRepositories(basePackages = "com.klef.fsad.project")
public class TaskManagerApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApiApplication.class, args);
    }
}