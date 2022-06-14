package com.project.demo;

import com.project.demo.article.Article;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public List<Article> findAll() {
        return List.of(
                new Article(
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





