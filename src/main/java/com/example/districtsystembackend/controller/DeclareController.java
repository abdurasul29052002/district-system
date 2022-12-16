package com.example.districtsystembackend.controller;

import com.example.districtsystembackend.model.DeclareModel;
import com.example.districtsystembackend.service.DeclareService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/declare")
public class DeclareController {

    private final DeclareService declareService;

    @PostMapping
    public DeclareModel add(@RequestBody DeclareModel declareModel){
        return declareService.add(declareModel);
    }

    @GetMapping
    public List<DeclareModel> getAll(){
        return declareService.getAll();
    }

    @GetMapping("/{id}")
    public DeclareModel getById(@PathVariable Long id){
        return declareService.getById(id);
    }
}
