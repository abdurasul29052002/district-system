package com.example.districtsystembackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressModel {
    private Long id;

    private String region;

    private String district;

    private String street;

    private Integer homeNumber;
}
