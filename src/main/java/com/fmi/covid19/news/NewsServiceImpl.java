package com.fmi.covid19.news;

import com.fmi.covid19.config.ApplicationContextProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Override
    public List<News> getAllNews() {
        NewsRepository newsRepository = ApplicationContextProvider.bean(NewsRepository.class);
        return newsRepository.findAll();
    }
}
