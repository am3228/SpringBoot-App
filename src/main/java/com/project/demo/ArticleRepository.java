package com.project.demo;

import com.project.demo.article.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {

    Article findArticleById(String Id);

}
