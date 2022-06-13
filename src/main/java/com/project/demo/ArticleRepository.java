package com.project.demo;

import com.project.demo.article.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {

    @Query("{'Article': ?0}")
    Optional<Article> findByArticle(String article);

}
