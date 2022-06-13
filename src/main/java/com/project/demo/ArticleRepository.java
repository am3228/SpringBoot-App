package com.project.demo;

import com.project.demo.article.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {

    @Query("{name:'?0'}")
    Article findArticle(String name);

    @Query(value="{category: '?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Article> findAll(String category);

    public long count();

}
