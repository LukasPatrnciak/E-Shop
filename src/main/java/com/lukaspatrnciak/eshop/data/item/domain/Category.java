package com.lukaspatrnciak.eshop.data.item.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Category {
    private String name;
    private Set<Category> subcategories;

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

    public Set<Category> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(Set<Category> subcategories) {
        this.subcategories = subcategories;
    }

    public void addSubcategory(Category subcategory) {
        subcategories.add(subcategory);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", subcategories='" + subcategories + '\'' +
                '}';
    }

    public String toStringTree(String tabs) {
        StringBuilder builder = new StringBuilder();

        builder.append(tabs).append(name).append("\n");
        for(Category subcategory: subcategories) {
            builder.append(subcategory.toStringTree(tabs + " "));
        }

        return builder.toString();
    }
}
