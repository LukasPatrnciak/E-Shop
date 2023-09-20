package com.lukaspatrnciak.eshop.data.item.service;

import com.lukaspatrnciak.eshop.data.item.domain.Manufacturer;

import java.util.Optional;
import java.util.Set;

public interface ManufacturerService {
    void addManufacturer(Manufacturer manufacturer);
    Set<Manufacturer> findAllManufacturers();
    Optional<Manufacturer> findManufacturerByName(String name);
}
