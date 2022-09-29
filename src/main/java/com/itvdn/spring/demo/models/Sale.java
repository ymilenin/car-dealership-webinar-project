package com.itvdn.spring.demo.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="car_id", nullable=false)
    private Car car;

    private int originalCarQuantity;

    @ManyToOne
    @JoinColumn(name="manager_id", nullable=false)
    private Manager manager;


    private int originalManagerSaleQuantity;

    private int quantity;

    public Sale(int originalCarQuantity, int originalManagerSaleQuantity, int quantity) {
        this.originalCarQuantity = originalCarQuantity;
        this.originalManagerSaleQuantity = originalManagerSaleQuantity;
        this.quantity = quantity;
    }
}
