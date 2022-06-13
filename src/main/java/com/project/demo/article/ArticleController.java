package com.project.demo.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/article")

public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/")
    public List<ArticleDTO> getAllArticles() {

        return ObjectMapperUtils.mapAll(ArticleService.findAll(), ArticleDTO.class);

    }

    @GetMapping
    public ArticleDTO getStudentById(@PathVariable("Id") Long Id) {
        return ObjectMapperUtils.map(ArticleService.findById(Id), ArticleDTO.class);

    }

}


