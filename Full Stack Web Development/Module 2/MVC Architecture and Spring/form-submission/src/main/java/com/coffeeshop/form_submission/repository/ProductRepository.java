package com.coffeeshop.form_submission.repository;

import com.coffeeshop.form_submission.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
