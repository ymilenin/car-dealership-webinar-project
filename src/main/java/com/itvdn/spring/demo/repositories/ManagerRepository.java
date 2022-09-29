package com.itvdn.spring.demo.repositories;

import com.itvdn.spring.demo.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    Optional<Manager> getManagerByPassportId(String passportId);
}
