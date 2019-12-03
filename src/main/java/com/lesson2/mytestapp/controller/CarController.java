package com.lesson2.mytestapp.controller;

import com.lesson2.mytestapp.dto.CarDto;
import com.lesson2.mytestapp.model.Car;
import com.lesson2.mytestapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("car")
    public CarDto getCarById(Long id){
        return carService.getCarById(id);
    }
}
