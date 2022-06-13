package com.project.demo.article;

import com.project.demo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
public class ArticleController {

    private Logger logger = LoggerFactory.getLogger(ArticleController.class);
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping(value ="/")
    public List<Article> getAllArticles() {
        logger.info("Getting all articles.");
        return articleRepository.findAll();
    }

    @GetMapping(value = "/{Id}")
    public Article
    getArticleById(@PathVariable String Id) {
        logger.info("Getting article with ID: {}", Id);
    articleRepository.findArticleById(Id);
        return null;
    }

    @PostMapping(value = "/create")
    public Article addArticle(@RequestBody Article article) {
        logger.info("Saving article.");
    articleRepository.save(article);
    return article;
    }

    @PutMapping(value = "/update/{Id}")
    public Article
    updateArticle(@PathVariable String Id, @RequestBody Article article) {
        logger.info("Updating article with Id: {}", Id);
        return
    articleRepository.save(article);
    }

    @DeleteMapping(value = "/delete/{Id}")
    public void
    deleteArticle(@PathVariable String Id) {
        logger.info("Deleting article with Id: {}", Id);
    articleRepository.deleteById(Id);

    }

}


