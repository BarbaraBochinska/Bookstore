package com.codecool.bookstore.Model;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private ArrayList<Item> books = new ArrayList<>();
    private ArrayList<Item> games = new ArrayList<>();
    private ArrayList<Item> movies = new ArrayList<>();

    public void saveItem(Item item) {
        switch (item.getCategory()) {
            case BOOK:
                books.add(item);
                break;
            case GAME:
                games.add(item);
                break;
            case MOVIE:
                movies.add(item);
                break;
        }
    }
    public List<Item> getItemsByCategory(ItemCategory category) {
        switch (category) {
            case BOOK:
                return books;
            case GAME:
                return games;
            case MOVIE:
                return movies;
            default:
                throw new IllegalArgumentException("No such category.");
        }
    }

    public Item getItem(ItemCategory category, int itemId) {
        List<Item> searchedItems = getItemsByCategory(category);
        Item result = null;
        for (Item i : searchedItems) {
            if (i.getId() == itemId) {
                result = i;
            }
        }
        return result;
    }
}
