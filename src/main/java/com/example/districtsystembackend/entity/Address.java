package com.example.districtsystembackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String region;

    private String district;

    private String street;

    private Integer homeNumber;

    @OneToOne(mappedBy = "address")
    private User user;
}
