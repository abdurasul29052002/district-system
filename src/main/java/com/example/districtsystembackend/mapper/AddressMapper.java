package com.example.districtsystembackend.mapper;

import com.example.districtsystembackend.entity.Address;
import com.example.districtsystembackend.model.AddressModel;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper(componentModel = "spring")
public interface AddressMapper extends GenericMapper<Address, AddressModel> {
}
