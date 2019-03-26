package com.codecool.bookstore.View;

import com.codecool.bookstore.Model.ItemCategory;

import java.util.ArrayList;

public class BrowseView {

    public void showBrowseText(ItemCategory category) {
        System.out.println("Available " + category + "S:");
    }

    public void showItems(ArrayList items) {
        System.out.println("No. | Title | Price | Stock");
        for (int i = 0 ; i < items.size(); i++) {
            System.out.println(Integer.toString(i) + items.get(i));
        }
    }

    public void showOptions() {
        System.out.println("Choose action:");
        System.out.println("1. Display info about product");
        System.out.println("2. Back to main menu");
    }
}
