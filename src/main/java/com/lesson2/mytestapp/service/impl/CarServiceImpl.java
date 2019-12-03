package com.lesson2.mytestapp.service.impl;

import com.lesson2.mytestapp.dto.CarDto;
import com.lesson2.mytestapp.maper.CarMapper;
import com.lesson2.mytestapp.repository.CarRepo;
import com.lesson2.mytestapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Override
    public CarDto getCarById(Long id) {
        CarDto carDto=CarMapper.INSTANCE.carToCarDto(carRepo.findCarById(id));
        return carDto;
    }
}
