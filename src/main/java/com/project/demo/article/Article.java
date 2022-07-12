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
    private static String id;
    private static String articleName;
    private static String author;
    private static String description;
    private static String hashtags;
    private static String newsKeywords;
    private static String channelSection;
    private static String source;
    private static String date;
    private static String publishDate;

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

    public Article() {

    }

    public static String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public static String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public static String getNewsKeywords() {
        return newsKeywords;
    }

    public void setNewsKeywords(String newsKeywords) {
        this.newsKeywords = newsKeywords;
    }

    public static String getChannelSection() {
        return channelSection;
    }

    public void setChannelSection(String channelSection) {
        this.channelSection = channelSection;
    }

    public static String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public static String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
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