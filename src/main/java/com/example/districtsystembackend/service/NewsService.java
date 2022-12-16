package com.example.districtsystembackend.service;

import com.example.districtsystembackend.entity.News;
import com.example.districtsystembackend.mapper.NewsMapper;
import com.example.districtsystembackend.model.NewsModel;
import com.example.districtsystembackend.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService{

    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    public NewsModel add(NewsModel newsModel){
        News savedNews = newsRepository.save(newsMapper.modelToEntity(newsModel));
        return newsMapper.entityToModel(savedNews);
    }

    public NewsModel getNew(Long id){
        return newsMapper.entityToModel(newsRepository.findById(id).orElseThrow());
    }

    public List<NewsModel> getAllNews(){
        return newsMapper.entitiesToModels(newsRepository.findAll());
    }
}
