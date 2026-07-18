package com.example.ecomProject.repo;

import com.example.ecomProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
     // Searches for products by matching the given keyword against the
     // product's name, description, brand, or category.
    // The search is case-insensitive and returns all products containing
     // the keyword in any of the specified fields.

    @Query("SELECT p FROM Product p WHERE " +
            "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    //@param keyword the search text entered by the user
    //@return a list of products matching the search keyword
    List<Product> searchProducts(@Param("keyword") String keyword);
}
