package com.example.districtsystembackend.controller;

import com.example.districtsystembackend.model.ApiResponse;
import com.example.districtsystembackend.model.UserModel;
import com.example.districtsystembackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserModel add(@RequestBody UserModel userModel){
        return userService.add(userModel);
    }

    @GetMapping
    public List<UserModel> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserModel getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PutMapping("/{id}")
    public UserModel updateById(@PathVariable Long id, @RequestBody UserModel userModel){
        return userService.updateById(id, userModel);
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteById(@PathVariable Long id){
        return userService.deleteById(id);
    }

    @GetMapping("/search")
    public List<UserModel> search(@RequestParam String name){
        return userService.search(name);
    }
}
