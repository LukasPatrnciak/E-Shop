package com.lukaspatrnciak.eshop.data;

import com.lukaspatrnciak.eshop.data.item.domain.Item;
import com.lukaspatrnciak.eshop.data.item.domain.Manufacturer;
import com.lukaspatrnciak.eshop.data.item.service.CategoryService;
import com.lukaspatrnciak.eshop.data.item.service.ItemService;
import com.lukaspatrnciak.eshop.data.item.service.ManufacturerService;
import com.lukaspatrnciak.eshop.data.user.service.AuthorisationService;
import com.lukaspatrnciak.eshop.data.user.service.UserService;

public class Eshop {
    private UserService userService;
    private AuthorisationService authorisationService;

    private ItemService itemService;
    private ManufacturerService manufacturerService;
    private CategoryService categoryService;

    public Eshop(UserService userService, AuthorisationService authorisationService, ItemService itemService, ManufacturerService manufacturerService, CategoryService categoryService) {
        this.userService = userService;
        this.authorisationService = authorisationService;
        this.itemService = itemService;
        this.manufacturerService = manufacturerService;
        this.categoryService = categoryService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public AuthorisationService getAuthorisationService() {
        return authorisationService;
    }

    public void setAuthorisationService(AuthorisationService authorisationService) {
        this.authorisationService = authorisationService;
    }

    public ItemService getItemService() {
        return itemService;
    }

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public ManufacturerService getManufacturerService() {
        return manufacturerService;
    }

    public void setManufacturerService(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nE - S H O P");

        builder.append("\nVyrobcovia: \n");
        for(Manufacturer manufacturer: manufacturerService.findAllManufacturers()) {
            builder.append(" ").append(manufacturer).append("\n");
        }

        builder.append("\nKategorie: \n");
        builder.append(categoryService.getRootCategory().toStringTree(" "));

        builder.append("\nPolozky: \n");
        for(Item item: getItemService().findAllItems()) {
            builder.append(" ").append(item).append("\n");
        }

        return builder.toString();
    }
}
