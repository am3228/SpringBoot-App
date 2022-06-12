package com.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public List<article> hello() {
        return List.of(
                new article(
                        1L,
                        "How to build a startup",
                        "Jane Austen",
                        "In-depth look on how to build your own startup",
                        "Forbes",
                        "startup",
                        "business",
                        "website",
                        "January 21st, 2022",
                        "June 11th, 2022"

                )

        );

    }
}





