package com.fmi.covid19.news;

import com.fmi.covid19.config.ApplicationContextProvider;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Override
    public List<RemoteNews> getAllNews() {
        NewsRepository newsRepository = ApplicationContextProvider.bean(NewsRepository.class);
        List<News> news =  newsRepository.findAll();
       List<RemoteNews> remoteNews = new ArrayList<>();
        for (News news1 : news) {
            remoteNews.add(new RemoteNews(news1));
        }
       return remoteNews;
    }
}
