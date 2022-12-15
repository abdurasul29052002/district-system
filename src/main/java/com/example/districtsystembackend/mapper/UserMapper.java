package com.example.districtsystembackend.mapper;

import com.example.districtsystembackend.entity.User;
import com.example.districtsystembackend.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface UserMapper extends GenericMapper<User, UserModel> {
}
