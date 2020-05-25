package com.fmi.covid19;

import com.fmi.covid19.news.NewsService;
import com.fmi.covid19.news.NewsServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
@SpringBootApplication
public class Covid19NewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19NewsApplication.class, args);
	}

	@Bean(name = "/remote-news")
	HttpInvokerServiceExporter accountService() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService( new NewsServiceImpl() );
		exporter.setServiceInterface( NewsService.class );
		return exporter;
	}

}

