package com.lukaspatrnciak.eshop.data;

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

    @Override
    public String toString() {
        return "Eshop{" +
                "userService=" + userService +
                ", authorisationService=" + authorisationService +
                '}';
    }
}
