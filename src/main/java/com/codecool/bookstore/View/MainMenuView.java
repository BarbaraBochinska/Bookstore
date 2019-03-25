package com.codecool.bookstore.View;

import com.codecool.bookstore.Model.ItemCategory;

import java.util.Scanner;

public class MainMenuView {

    public void showMainMenuText(ItemCategory[] categories) {
        System.out.println("Welcome to bookstore!");
        System.out.println("Choose category to browse:");
        for (ItemCategory category : categories) {
            System.out.println(category.ordinal() + 1 + "." + category);
        }
        System.out.println("\n0.Quit");
    }

    public int getChosenOption(){
        Scanner scan = new Scanner(System.in);
        String chosenOption = scan.nextLine();
        return Integer.parseInt(chosenOption);
    }

}
