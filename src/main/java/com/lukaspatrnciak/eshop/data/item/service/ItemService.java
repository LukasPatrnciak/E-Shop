package com.lukaspatrnciak.eshop.data.item.service;

import com.lukaspatrnciak.eshop.data.item.domain.Item;

import java.util.Optional;
import java.util.Set;

public interface ItemService {
    void addItem(Item item);
    Set<Item> findAllItems();
    Optional<Item> findItemByName(String name);

}
