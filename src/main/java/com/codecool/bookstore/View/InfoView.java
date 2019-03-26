package com.codecool.bookstore.View;

import com.codecool.bookstore.Model.Item;

public class InfoView {

    public void showInfo(Item item){
        System.out.println("Title: " + item.getTitle());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Stock: " + item.getStock());
        System.out.println("Price: " + item.getPrice());
    }
}
