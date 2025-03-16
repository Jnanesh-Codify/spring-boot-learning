package com.jani.learning.service;

import com.jani.learning.dto.CategoryDTO;
import com.jani.learning.entity.Category;
import com.jani.learning.mapper.CategoryMapper;
import com.jani.learning.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return CategoryMapper.entityToDto(categoryRepository.save(CategoryMapper.dtoToEntity(categoryDTO)));
    }

}