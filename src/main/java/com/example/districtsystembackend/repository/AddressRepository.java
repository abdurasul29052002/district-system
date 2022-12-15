package com.example.districtsystembackend.repository;

import com.example.districtsystembackend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
