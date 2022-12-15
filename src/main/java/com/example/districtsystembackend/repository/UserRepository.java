package com.example.districtsystembackend.repository;

import com.example.districtsystembackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstNameLike(String firstName);

    List<User> findAllByLastNameLike(String lastName);

    List<User> findAllByFathersNameLike(String fathersName);
}
