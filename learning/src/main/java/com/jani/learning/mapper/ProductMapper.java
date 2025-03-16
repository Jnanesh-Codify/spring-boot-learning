package com.jani.learning.mapper;

import com.jani.learning.dto.ProductDTO;
import com.jani.learning.entity.Category;
import com.jani.learning.entity.Product;

public class ProductMapper {

    // Method to map Entity to DTO
    public static ProductDTO entityToDto(Product product) {
        if (product == null) {
            return null;
        }
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setDescription(product.getDescription());
        dto.setCategoryId(product.getCategory().getId());
        return dto;
    }

    // Method to map DTO to Entity
    public static Product dtoToEntity(ProductDTO dto, Category category) {
        if (dto == null) {
            return null;
        }
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setCategory(category);
        return product;
    }
}
