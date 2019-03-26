package com.codecool.bookstore.Model;

import java.util.ArrayList;

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
}
