package com.jani.learning.controller;

import com.jani.learning.dto.CategoryDTO;
import com.jani.learning.entity.Category;
import com.jani.learning.repository.CategoryRepository;
import com.jani.learning.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories") // Base URL for Category API
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/create")
    public CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.createCategory(categoryDTO);
    }

}