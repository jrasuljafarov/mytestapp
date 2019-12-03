package com.lesson2.mytestapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Data
public class Car {

    @Id
    private Long id;

    private String make;

    private int numberOfSeats;

    @Enumerated
    private CarType type;
}