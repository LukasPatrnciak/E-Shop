package com.lukaspatrnciak.eshop.data.item.service;

import com.lukaspatrnciak.eshop.data.item.domain.Category;

public interface CategoryService {
    void addCategory(Category category);
    Category getRootCategory();
}
