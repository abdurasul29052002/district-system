package com.example.districtsystembackend.mapper;

import com.example.districtsystembackend.entity.News;
import com.example.districtsystembackend.model.NewsModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsMapper extends GenericMapper<News, NewsModel> {
}
