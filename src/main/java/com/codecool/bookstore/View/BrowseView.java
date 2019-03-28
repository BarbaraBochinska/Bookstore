package com.codecool.bookstore.View;

import com.codecool.bookstore.Model.Item;
import com.codecool.bookstore.Model.ItemCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrowseView {

    public void showBrowseText(ItemCategory category) {
        System.out.println("Available " + category + "S:");
    }

    public void showItems(List<Item> items) {
        System.out.println("No. | Title | Price | Stock");
        for (int i = 0 ; i < items.size(); i++) {
            System.out.println(Integer.toString(i) + items.get(i));
        }
    }

    public void showOptions() {
        System.out.println("Choose action:");
        System.out.println("1. Display info about product");
        System.out.println("2. Back to main menu");
        System.out.println("0. Quit");
    }

    public void displaySecondOption() {
        System.out.println("Enter product No.");
    }

    public int getChosenOption(){
        Scanner scan = new Scanner(System.in);
        String chosenOption = scan.nextLine();
        return Integer.parseInt(chosenOption);
    }
}
