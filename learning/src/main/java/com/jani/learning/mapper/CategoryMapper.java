package com.jani.learning.mapper;

import com.jani.learning.dto.CategoryDTO;
import com.jani.learning.entity.Category;

public class CategoryMapper {

        // Method to map Entity to DTO
        public static CategoryDTO entityToDto(Category category) {
            if (category == null) {
                return null;
            }
            CategoryDTO dto = new CategoryDTO();
            dto.setId(category.getId());
            dto.setName(category.getName());
            dto.setProducts(category.getProducts().stream().map(ProductMapper::entityToDto).toList());
            return dto;
        }

        // Method to map DTO to Entity
        public static Category dtoToEntity(CategoryDTO dto) {
            if (dto == null) {
                return null;
            }
            Category category = new Category();
            category.setName(dto.getName());
            return category;
        }
    }
