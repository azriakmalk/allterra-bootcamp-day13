package com.example.configureswagger.repository;

import com.example.configureswagger.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
