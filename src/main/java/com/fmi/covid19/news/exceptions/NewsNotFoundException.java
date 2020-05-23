package com.fmi.covid19.news.exceptions;

public class NewsNotFoundException extends RuntimeException {

  public NewsNotFoundException(Long id) {
    super("Cannot find news with id:" + id);
  }
}
