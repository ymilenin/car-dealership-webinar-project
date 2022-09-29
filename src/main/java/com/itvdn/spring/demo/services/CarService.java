package com.itvdn.spring.demo.services;

import com.itvdn.spring.demo.models.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    Car getCarById(Long id);

    Car addNewCar(Car car);

    Car updateCar(Car car);

    void deleteCarById(Long id);
}
