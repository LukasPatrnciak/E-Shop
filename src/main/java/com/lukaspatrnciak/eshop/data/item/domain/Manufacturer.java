package com.lukaspatrnciak.eshop.data.item.domain;

public class Manufacturer implements WithName {
    private String name;

    public Manufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
