package com.codecool.bookstore.Model;

import java.util.LinkedList;
import java.util.List;

public class Cart {

    private List<Item> items = new LinkedList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int size() {
        return items.size();
    }

    public float getTotalPrice() {
        float result = 0;
        for (Item i : items) {
            result += i.getPrice();
        }
        return result;
    }

    public List<Item> getItems() {
        return items;
    }
}
