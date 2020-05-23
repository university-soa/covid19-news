package com.fmi.covid19.news;

import com.fmi.covid19.news.exceptions.NewsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {

  private final NewsRepository newsRepository;

  @Autowired
  public NewsController(NewsRepository newsRepository) {
    this.newsRepository = newsRepository;
  }

  @GetMapping("/news")
  public List<News> getAllNews() {
    return this.newsRepository.findAll();
  }

  @GetMapping("/news/{id}")
  public News getNews(@PathVariable Long id) {
    return this.newsRepository.findById(id).orElseThrow(() -> new NewsNotFoundException(id));
  }

  @PostMapping("/news")
  public News addNews(@RequestBody News newNews) {
    return newsRepository.save(newNews);
  }

  @DeleteMapping("/news/{id}")
  public void deleteNews(@PathVariable Long id) {
    this.newsRepository.deleteById(id);
  }

  @PutMapping("/news/{id}")
  public News putNews(@PathVariable Long id, @RequestBody News newNews){
    if (newNews.id == null){
      newNews.setId(id);
    }
    return this.newsRepository.save(newNews);
  }
}
