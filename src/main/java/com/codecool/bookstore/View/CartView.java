package com.codecool.bookstore.View;

import com.codecool.bookstore.Model.Cart;
import com.codecool.bookstore.Model.Item;

import java.util.Scanner;

public class CartView {

    private static String[] options = {"Purchase all items", "See item description", "Remove Item"};

    public void printMenu(Cart cart) {
        System.out.printf("You have currently %d items in your cart.\n", cart.size());
        int i = 0;
        for (Item item : cart.getItems()) {
            System.out.printf("\t%d. %s || %s\n", i++, item.getTitle(), item.getPrice());
        }
        System.out.printf("Total price is: %.2f$\n", cart.getTotalPrice());
        System.out.println("\nChoose an option:");
        for (int j = 0; j < options.length; j++) {
            System.out.printf("\t%d. %s\n", j + 1, options[j]);
        }
        System.out.println("\n0. Go back");
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
}
