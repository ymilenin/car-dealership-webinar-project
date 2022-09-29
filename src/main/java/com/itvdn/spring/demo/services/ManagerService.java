package com.itvdn.spring.demo.services;

import com.itvdn.spring.demo.models.Manager;

import java.util.List;

public interface ManagerService {

    List<Manager> getAllManagers();

    Manager getManagerById(Long id);

    Manager addNewManager(Manager manager);

    Manager updateManager(Manager manager);

    void deleteManagerById(Long id);
}
