package com.project.demo.article;
import com.project.demo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public List<Article> findAll() {
        return List.of(
                new Article(
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

                )

        );

    }

}
