package com.fmi.covid19.news;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class RemoteNews implements Serializable {
    Long id;

    private String title;
    private String author;

    private String[] paragraphs;

    private String[] keywords;
    private Date creationDate = new Date();


    public RemoteNews(News newNews) {
        this.id = newNews.getId();
        this.title = newNews.getTitle();
        this.author = newNews.getAuthor();
        this.paragraphs = Arrays.copyOf(newNews.getParagraphs(), newNews.getParagraphs().length);
        this.keywords =
                newNews.getKeywords() != null ? Arrays.copyOf(newNews.getKeywords(), newNews.getKeywords().length) : null;
        this.creationDate = newNews.getCreationDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String[] getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(String[] paragraphs) {
        this.paragraphs = paragraphs;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "RemoteNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", paragraphs=" + Arrays.toString(paragraphs) +
                ", keywords=" + Arrays.toString(keywords) +
                ", creationDate=" + creationDate +
                '}';
    }
}
