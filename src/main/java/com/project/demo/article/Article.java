package com.project.demo.article;

import com.mongodb.annotations.Immutable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Immutable
@EntityScan
@Document(collection = "articledatabase")
public class Article {

    @Transient
    public static final String SEQUENCE_NAME = "article_sequence";

    @Id
    private String id;
    private String articleName;
    private String author;
    private String description;
    private String hashtags;
    private String newsKeywords;
    private String channelSection;
    private String source;
    private String date;
    private String publishDate;

    public Article(String id, String articleName, String author, String description, String hashtags, String newsKeywords, String channelSection, String source, String date, String publishDate) {

        super();
        this.id = id;
        this.articleName = articleName;
        this.author = author;
        this.description = description;
        this.hashtags = hashtags;
        this.newsKeywords = newsKeywords;
        this.channelSection = channelSection;
        this.source = source;
        this.date = date;
        this.publishDate = publishDate;
    }

    public Article(String articleName, String author, String description, String hashtags, String newsKeywords, String channelSection, String source, String date, String publishDate) {
        this.articleName = articleName;
        this.author = author;
        this.description = description;
        this.hashtags = hashtags;
        this.newsKeywords = newsKeywords;
        this.channelSection = channelSection;
        this.source = source;
        this.date = date;
        this.publishDate = publishDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public String getNewsKeywords() {
        return newsKeywords;
    }

    public void setNewsKeywords(String newsKeywords) {
        this.newsKeywords = newsKeywords;
    }

    public String getChannelSection() {
        return channelSection;
    }

    public void setChannelSection(String channelSection) {
        this.channelSection = channelSection;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "article{" +
                "id=" + id +
                ", articleName='" + articleName + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", hashtags='" + hashtags + '\'' +
                ", newsKeywords='" + newsKeywords + '\'' +
                ", channelSection='" + channelSection + '\'' +
                ", source='" + source + '\'' +
                ", date='" + date + '\'' +
                ", publishDate='" + publishDate + '\'' +
                '}';
    }
}