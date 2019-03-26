package com.codecool.bookstore.Model;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String title;
    private float price;
    private int stock;
    private ItemCategory category;
    private Map<ItemCategory, Integer> infoByCategory = new HashMap<>();

    public Item(String title, float price, int stock, ItemCategory category) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public ItemCategory getCategory() {
        return category;
    }
}
