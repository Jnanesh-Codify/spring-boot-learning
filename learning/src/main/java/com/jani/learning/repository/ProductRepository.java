package com.jani.learning.repository;

import com.jani.learning.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Repository for managing Product entities
public interface ProductRepository extends JpaRepository<Product, Integer> {
}