package com.coffeeshop.form_submission.service;

import com.coffeeshop.form_submission.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct(Product product);
}
