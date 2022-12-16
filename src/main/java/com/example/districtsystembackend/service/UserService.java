package com.example.districtsystembackend.service;

import com.example.districtsystembackend.entity.User;
import com.example.districtsystembackend.mapper.UserMapper;
import com.example.districtsystembackend.model.ApiResponse;
import com.example.districtsystembackend.model.UserModel;
import com.example.districtsystembackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserModel add(UserModel userModel) {
        User user = userMapper.modelToEntity(userModel);
        User savedUser = userRepository.save(user);
        return userMapper.entityToModel(savedUser);
    }

    public List<UserModel> getAll() {
        return userMapper.entitiesToModels(userRepository.findAll());
    }

    public UserModel getById(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        return userMapper.entityToModel(user);
    }

    public UserModel updateById(Long id, UserModel userModel) {
        User user = userRepository.findById(id).orElseThrow();
        userMapper.updateEntityFromModel(user, userModel);
        User savedUser = userRepository.save(user);
        return userMapper.entityToModel(savedUser);
    }

    public ApiResponse deleteById(Long id) {
        try {
            userRepository.deleteById(id);
            return new ApiResponse("Deleted", true);
        }catch (Exception e){
            return new ApiResponse("Error",false);
        }
    }

    public Set<UserModel> search(String name) {
        List<User> users = new ArrayList<>();
        users.addAll(userRepository.searchAllByName(name.toLowerCase()));
        users.addAll(userRepository.searchAllByName(name.toLowerCase()));
        return new HashSet<>(userMapper.entitiesToModels(users));
    }
}
