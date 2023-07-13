package com.visual_graph.visual_graph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.visual_graph")
@EnableJpaRepositories("com.visual_graph.repository")
@EntityScan("com.visual_graph.model")
public class VisualGraphApplication {
    public static void main(String[] args) {
        SpringApplication.run(VisualGraphApplication.class, args);
    }
}
