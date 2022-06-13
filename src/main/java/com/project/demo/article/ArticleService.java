package com.project.demo.article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
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
