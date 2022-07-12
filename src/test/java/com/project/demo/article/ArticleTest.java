package com.project.demo.article;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {

    Article article = new Article();

    @Test
    public void getIdWorking() {
        String expectedID = "1";
        Assertions.assertEquals(expectedID, Article.getId());
    }

    @Test
   public void setId() {

    }

    @Test
    public void getArticleName() {
        String expectedArticle = "Article about Harry";
        Assertions.assertEquals(expectedArticle, Article.getArticleName());
    }

    @Test
    public void setArticleName() {
    }

    @Test
    public void getAuthor() {
        String expectedAuthor = "Jane Austen";
        Assertions.assertEquals(expectedAuthor, Article.getAuthor());

    }

    @Test
    public void setAuthor() {
    }

    @Test
    public void getDescription() {
        String expectedDescription = "Describing Forbes";
        Assertions.assertEquals(expectedDescription, Article.getDescription());
    }

    @Test
    void setDescription() {
    }

    @Test
    void getHashtags() {
        String expectedHashtags = "Rich Wizard";
        Assertions.assertEquals(expectedHashtags, Article.getHashtags());
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