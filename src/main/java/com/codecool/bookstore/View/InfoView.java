package com.codecool.bookstore.View;

import com.codecool.bookstore.Model.Item;

import java.util.Scanner;

public class InfoView {

    private int itemId;

    public void showInfo(Item item){
        itemId = item.getId();
        System.out.println("Title: " + item.getTitle());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Stock: " + item.getStock());
        System.out.println("Price: " + item.getPrice());
    }

    public void printOptions() {
        System.out.println("1. Add to cart");
        System.out.println("2. Show cart");
        System.out.println("\n0. Back to browse");
    }

    public int askForInput() {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        boolean correct = false;
        String input = s.nextLine();
        while (!correct) {
            try {
                choice = Integer.parseInt(input);
                correct = true;
            } catch (NumberFormatException e) {
                System.out.println("Please provide valid number.");
                input = s.nextLine();
            }
        }

        return choice;
    }

    public int getItemId() {
        return itemId;
    }
}
