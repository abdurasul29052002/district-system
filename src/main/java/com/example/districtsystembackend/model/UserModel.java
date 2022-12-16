package com.example.districtsystembackend.model;

import com.example.districtsystembackend.entity.Address;
import com.example.districtsystembackend.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;

    private String firstName;

    private String lastName;

    private String fathersName;

    private Date birthDate;

    private Gender gender;

    private AddressModel address;

    private String serialNumber;

    private String JSHSHIR;

    private AttachmentModel photo;
}
