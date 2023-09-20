package com.lukaspatrnciak.eshop.data.item.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Category {
    private String name;
    private Set<String> subcategories;

    public Category(String name) {
        this.name = name;
        this.subcategories = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(Set<String> subcategories) {
        this.subcategories = subcategories;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", subcategories='" + subcategories + '\'' +
                '}';
    }
}
