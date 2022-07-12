package com.project.demo.article;

import com.project.demo.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(ArticleRepository repository) {
        return args -> {
            Article startUp = new Article(
                    "One",
                    "How to build a startup",
                    "Jane Austen",
                    "In-depth look on how to build your own startup",
                    "Forbes",
                    "startup",
                    "business",
                    "website",
                    "January 21st, 2022",
                    "June 11th, 2022"

            );

            Article billionaire = new Article(
                    "two",
                    "How to become a billionaire",
                    "Harry Potter",
                    "How Harry became rich, and you can too",
                    "Rich Wizard",
                    "Money",
                    "business",
                    "harrys mom",
                    "June 1st, 2022",
                    "September 12th, 1999"

            );

            repository.saveAll(
                    List.of(startUp, billionaire)
            );

        };

    }

}
