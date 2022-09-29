package com.itvdn.spring.demo.controllers;

import com.itvdn.spring.demo.models.Manager;
import com.itvdn.spring.demo.services.ManagerService;
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
@RequestMapping("/manager")
public class ManagerController {

    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("/all")
    public List<Manager> getAllCars() {
        return managerService.getAllManagers();
    }

    @GetMapping("/{id}")
    public Manager getCarById(@PathVariable("id") Long id) {
        return managerService.getManagerById(id);
    }

    @PutMapping("/create")
    public Manager createCar(@RequestBody Manager manager) {
        return managerService.addNewManager(manager);
    }

    @PostMapping("/update")
    public Manager updateCar(@RequestBody Manager manager) {
        return managerService.updateManager(manager);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        managerService.deleteManagerById(id);
    }
}
