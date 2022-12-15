package com.example.districtsystembackend.repository;

import com.example.districtsystembackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstNameIsLike(String firstName);

    List<User> findAllByLastNameIsLike(String lastName);

    List<User> findAllByFathersNameIsLike(String fathersName);
}
