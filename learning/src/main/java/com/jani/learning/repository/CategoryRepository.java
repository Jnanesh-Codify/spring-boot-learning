package com.jani.learning.repository;

import com.jani.learning.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Repository for managing Category entities
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}