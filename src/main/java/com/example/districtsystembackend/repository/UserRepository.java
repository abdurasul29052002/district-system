package com.example.districtsystembackend.repository;

import com.example.districtsystembackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select u from users u where u.firstName like concat('%',:name,'%') or u.lastName like concat('%',:name,'%') or u.fathersName like concat('%',:name,'%')")
    List<User> searchAllByName(String name);
}
