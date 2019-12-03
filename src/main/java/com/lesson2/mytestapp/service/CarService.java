package com.lesson2.mytestapp.service;

import com.lesson2.mytestapp.dto.CarDto;
import com.lesson2.mytestapp.model.Car;

public interface CarService {
    CarDto getCarById(Long id);
}
