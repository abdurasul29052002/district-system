package com.example.districtsystembackend.controller;

import com.example.districtsystembackend.model.NewsModel;
import com.example.districtsystembackend.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @PostMapping
    public NewsModel add(@RequestBody NewsModel newsModel){
        return newsService.add(newsModel);
    }

    @GetMapping
    public List<NewsModel> getAll(){
        return newsService.getAllNews();
    }

    @GetMapping("/{id}")
    public NewsModel getById(@PathVariable Long id){
        return newsService.getNew(id);
    }
}
