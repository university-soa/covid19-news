package com.fmi.covid19.news;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Date;

@Entity
public class News {
  @Id @GeneratedValue Long id;
  @NonNull private String title;
  @NonNull private String author;

  @Column(name = "paragraphs", length = 5000)
  @NonNull
  private String[] paragraphs;

  @Nullable private String[] keywords;
  @Nullable private Date creationDate = new Date();

  public News() {}

  public News(News newNews) {
    this.id = newNews.id;
    this.title = newNews.title;
    this.author = newNews.author;
    this.paragraphs = Arrays.copyOf(newNews.paragraphs, newNews.paragraphs.length);
    this.keywords =
        newNews.keywords != null ? Arrays.copyOf(newNews.keywords, newNews.keywords.length) : null;
    this.creationDate = newNews.creationDate;
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
}
