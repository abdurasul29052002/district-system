package com.example.districtsystembackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeclareModel {
    private Long id;

    private String title;

    private String content;

    private Date date;
}
