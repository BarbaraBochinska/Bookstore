package com.codecool.bookstore.Model;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private static int idCounter = 0;
    private int id;
    private String title;
    private String description;
    private float price;
    private int stock;
    private ItemCategory category;
    private Map<ItemCategory, Integer> infoByCategory = new HashMap<>();

    public Item(String title, String description, float price, int stock, ItemCategory category) {
        id = idCounter++;
        this.title = title;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public String toString() {
        return " | " + title + " | " + price + "$ | " + stock;
    }

    public int getId() {
        return id;
    }
}
