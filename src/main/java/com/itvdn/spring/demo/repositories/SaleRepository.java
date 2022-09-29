package com.itvdn.spring.demo.repositories;

import com.itvdn.spring.demo.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
