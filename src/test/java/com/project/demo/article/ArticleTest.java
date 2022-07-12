package com.project.demo.article;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class ArticleTest {

    Article article = new Article();

    @Test
    public void getIdWorking() {
        String expectedID = "1";
        assertEquals(expectedID, Article.getId());
    }

    @Test
   public void setId() {

    }

    @Test
    void getArticleName() {
        String expectedArticle = "Article about Harry";
        assertEquals(expectedArticle, Article.getArticleName());
    }

    @Test
    void setArticleName() {
    }

    @Test
    void getAuthor() {

    }

    @Test
    void setAuthor() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void setDescription() {
    }

    @Test
    void getHashtags() {
    }

    @Test
    void setHashtags() {
    }

    @Test
    void getNewsKeywords() {
    }

    @Test
    void setNewsKeywords() {
    }

    @Test
    void getChannelSection() {
    }

    @Test
    void setChannelSection() {
    }

    @Test
    void getSource() {
    }

    @Test
    void setSource() {
    }

    @Test
    void getDate() {
    }

    @Test
    void setDate() {
    }

    @Test
    void getPublishDate() {
    }

    @Test
    void setPublishDate() {
    }
}