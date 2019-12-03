package com.lesson2.mytestapp.repository;

import com.lesson2.mytestapp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {
    Car findCarById(Long id);
}
