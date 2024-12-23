package com.pid.deliotte.EventManagement.Service;

import com.pid.deliotte.EventManagement.Entity.Category;
import com.pid.deliotte.EventManagement.Model.CategoryRequest;
import com.pid.deliotte.EventManagement.Model.CategoryResponse;
import com.pid.deliotte.EventManagement.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryResponse createCategory(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setName(categoryRequest.getName());
        category = categoryRepository.save(category);
        return new CategoryResponse(category.getId(), category.getName());
    }

    @Override
    public CategoryResponse getCategoryById(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow();
        return new CategoryResponse(category.getId(), category.getName());
    }

    @Override
    public List<CategoryResponse> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(category -> new CategoryResponse(category.getId(), category.getName()))
                .collect(Collectors.toList());
    }
}

