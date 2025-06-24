package com.coffeeshop.form_submission.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @NotNull(message = "Product name is required")
    @Size(min=2, max = 50, message = "Product name must be between 2 and 50 characters")
    @Column(name = "product_name")
    private String name;

    @NotNull(message = "Product price is required")
    @Min(value = 1, message = "Product price must be a positive value")
    @Column(name = "product_price")
    private double price;


    public Product() {
    }

    public Product(int id,String name,double price) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
