package com.contapaga.controllers;

import com.contapaga.entities.Category;
import com.contapaga.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController extends BaseController<Category, Long> {

    @Autowired
    private CategoryService categoryService; // Corrigido o nome da variável

    @Override
    protected List<Category> findAll() {
        return categoryService.findAll(); // Corrigido o uso da variável
    }

    @Override
    protected Category findById(Long id) {
        return categoryService.findById(id); // Corrigido o uso da variável
    }

    @Override
    protected Category save(Category category) {
        return categoryService.save(category); // Corrigido o uso da variável
    }

    @Override
    protected Category update(Long id, Category category) {
        return categoryService.update(id, category); // Corrigido o uso da variável
    }

    @Override
    protected void delete(Long id) {
        categoryService.delete(id); // Corrigido o uso da variável
    }
}
