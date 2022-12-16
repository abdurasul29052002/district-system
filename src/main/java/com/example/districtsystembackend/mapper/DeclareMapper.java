package com.example.districtsystembackend.mapper;

import com.example.districtsystembackend.entity.Declare;
import com.example.districtsystembackend.model.DeclareModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeclareMapper extends GenericMapper<Declare, DeclareModel> {
}
