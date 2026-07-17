package com.example.ecomProject.repo;

import com.example.ecomProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
