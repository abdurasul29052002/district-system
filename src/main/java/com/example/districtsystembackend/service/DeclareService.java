package com.example.districtsystembackend.service;

import com.example.districtsystembackend.entity.Declare;
import com.example.districtsystembackend.mapper.DeclareMapper;
import com.example.districtsystembackend.model.DeclareModel;
import com.example.districtsystembackend.repository.DeclareRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeclareService {

    private final DeclareRepository declareRepository;
    private final DeclareMapper declareMapper;

    public DeclareModel add(DeclareModel declareModel){
        Declare savedDeclare = declareRepository.save(declareMapper.modelToEntity(declareModel));
        return declareMapper.entityToModel(savedDeclare);
    }

    public List<DeclareModel> getAll(){
        return declareMapper.entitiesToModels(declareRepository.findAll());
    }

    public DeclareModel getById(Long id){
        return declareMapper.entityToModel(declareRepository.findById(id).orElseThrow());
    }
}
