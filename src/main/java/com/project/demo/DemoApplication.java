package com.project.demo;

import com.project.demo.article.Article;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ArticleRepository repository) {
        return args -> {
          Article article = new Article(
                  "A guide on re-creating your resume",
                  "Clark Sky",
                  "This articles gives the reader an in-depth look on how to build upon one's resume",
                  "resume",
                  "career",
                  "Professional",
                  "current employees",
                  "Feb. 11, 2022",
                  "June 12, 2022"

          );

          repository.insert(article);

        };

    }

}