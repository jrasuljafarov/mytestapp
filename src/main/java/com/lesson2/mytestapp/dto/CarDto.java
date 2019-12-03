package com.lesson2.mytestapp.dto;

import lombok.Data;

@Data
public class CarDto {

    private Long id;
    private String make;
    private int seatCount;
    private String type;
}