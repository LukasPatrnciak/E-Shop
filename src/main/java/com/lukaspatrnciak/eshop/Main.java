package com.lukaspatrnciak.eshop;

import com.lukaspatrnciak.eshop.data.Eshop;
import com.lukaspatrnciak.eshop.data.item.domain.Category;
import com.lukaspatrnciak.eshop.data.item.domain.Manufacturer;
import com.lukaspatrnciak.eshop.data.user.domain.User;

import com.lukaspatrnciak.eshop.data.item.service.BasicService;
import com.lukaspatrnciak.eshop.data.user.service.DataService;

import java.util.Scanner;

public class Main {
    public static final String[] manufacturers = {
            "Dell",
            "Apple",
            "HP",
            "Fujistsu",
            "Toshiba",
            "Dynabook"
    };

    public static void main(String[] args) {
        DataService dataService = new DataService();
        BasicService basicService = new BasicService("Katalog");

        Eshop eshop = new Eshop(dataService, dataService, basicService, basicService, basicService);
        Scanner input = new Scanner(System.in);

        for(String manufacturer: manufacturers) {
            eshop.getManufacturerService().addManufacturer(new Manufacturer(manufacturer));
        }

        Category notebooks = new Category("Notebooky");
        notebooks.addSubcategory(new Category("Herne"));
        notebooks.addSubcategory(new Category("Kancelarske"));
        notebooks.addSubcategory(new Category("MacBook"));

        Category root = eshop.getCategoryService().getRootCategory();
        root.addSubcategory(notebooks);

        System.out.println("UDAJE POUZIVATELA\nMeno:");
        String name = input.nextLine();
        System.out.println("Priezvisko:");
        String surname = input.nextLine();
        System.out.println("E-mail:");
        String email = input.nextLine();
        System.out.println("Heslo:");
        String password = input.nextLine();

        User user = eshop.getUserService().register(email, password, name, surname);

        assert user != null : "[ NULL ]  Chybne zadany pouzivatel";

        if (eshop.getAuthorisationService().logIn(email, password)) {
            System.out.println(eshop.getUserService().findUserByEmail(email));
        } else {
            System.out.println("[ ! ]  Prihlasenie zlyhalo");
        }

        System.out.println(eshop);

        /*
         * Optional<Item> itemByName = new ItemService("").findItemByName(""); // Vytvori premennu Optional<Item>
         * if(itemByName.isPresent()) { // To, co vraciame moze byt null -> kontrola
         *    Item item = itemByName.get();
         *}
         */
    }
}