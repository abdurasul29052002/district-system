package com.example.districtsystembackend.repository;

import com.example.districtsystembackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select u from users u where upper(u.firstName) like upper(concat('%',:name,'%')) or upper(u.lastName) like upper(concat('%',:name,'%')) or upper(u.fathersName) like upper(concat('%',:name,'%'))")
    List<User> searchAllByName(String name);
}
