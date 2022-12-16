package com.example.districtsystembackend.repository;

import com.example.districtsystembackend.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
