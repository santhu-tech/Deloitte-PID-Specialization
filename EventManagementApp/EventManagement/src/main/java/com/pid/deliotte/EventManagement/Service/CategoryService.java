package com.pid.deliotte.EventManagement.Service;

import com.pid.deliotte.EventManagement.Model.CategoryRequest;
import com.pid.deliotte.EventManagement.Model.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse createCategory(CategoryRequest categoryRequest);

    CategoryResponse getCategoryById(Long categoryId);

    List<CategoryResponse> getAllCategories();
}
