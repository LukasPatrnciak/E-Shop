package com.lukaspatrnciak.eshop.data.item.service;

import com.lukaspatrnciak.eshop.data.item.domain.Category;
import com.lukaspatrnciak.eshop.data.item.domain.Item;
import com.lukaspatrnciak.eshop.data.item.domain.Manufacturer;
import com.lukaspatrnciak.eshop.data.item.service.comparator.NameComparator;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class BasicService implements ItemService, ManufacturerService, CategoryService {
    private Set<Item> items;
    private Set<Manufacturer> manufacturers;

    private Set<Category> subcategories;
    private Category rootCategory;

    public BasicService(String rootCategoryName) {
        items = new TreeSet<>(NameComparator.getInstance());
        manufacturers = new TreeSet<>(NameComparator.getInstance());
        rootCategory = new Category(rootCategoryName);
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public Set<Item> findAllItems() {
        return items;
    }

    @Override
    public Optional<Item> findItemByName(String name) {
        return items.stream().filter(item -> item.getName().equals(name)).findFirst();
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        manufacturers.add(manufacturer);
    }

    @Override
    public Set<Manufacturer> findAllManufacturers() {
        return manufacturers;
    }

    /*
     * Optional - wrapper na objekty, ktore mozu byt nulove
     *          - manufacturer tam moze alebo nemusi byt
     */
    @Override
    public Optional<Manufacturer> findManufacturerByName(String name) {
        return manufacturers.stream().filter(manufacturer -> manufacturer.getName().equals(name)).findFirst();
    }

    public Set<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Set<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    @Override
    public void addSubcategory(Category subcategory) {
        subcategories.add(subcategory);
    }

    @Override
    public Category getRootCategory() {
        return rootCategory;
    }

    public void setRootCategory(Category rootCategory) {
        this.rootCategory = rootCategory;
    }

    @Override
    public String toString() {
        return "ItemService{" +
                "items=" + items +
                ", manufacturers=" + manufacturers +
                ", rootCategory=" + rootCategory +
                '}';
    }
}
