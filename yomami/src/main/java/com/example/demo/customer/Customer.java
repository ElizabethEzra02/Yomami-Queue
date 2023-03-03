package com.example.demo.customer;

import jakarta.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(
            name = "id_sequence",
            sequenceName = "id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_sequence"
    )
    private Long id;
    private Integer orderNumber;

    public Customer() {
    }

    public Customer(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer(Long id, Integer orderNumber) {
        this.id = id;
        this.orderNumber = orderNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
