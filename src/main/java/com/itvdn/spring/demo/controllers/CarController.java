package com.itvdn.spring.demo.controllers;

import com.itvdn.spring.demo.models.Car;
import com.itvdn.spring.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable("id") Long id) {
        return carService.getCarById(id);
    }

    @PutMapping("/create")
    public Car createCar(@RequestBody Car car) {
        return carService.addNewCar(car);
    }

    @PostMapping("/update")
    public Car updateCar(@RequestBody Car car) {
        return carService.updateCar(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        carService.deleteCarById(id);
    }
}
