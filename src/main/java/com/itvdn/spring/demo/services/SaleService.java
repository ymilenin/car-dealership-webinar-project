package com.itvdn.spring.demo.services;

import com.itvdn.spring.demo.models.Sale;

import java.util.List;

public interface SaleService {

    Sale getSaleById(Long id);

    List<Sale> getAllSales();

    Sale addSale(Long carId, Long managerId, int quantity);

    Sale updateSale(Long id, Long carId, Long managerId, int quantity);

    void deleteSaleById(Long id);
}
