package com.codecool.bookstore;

import com.codecool.bookstore.Controller.MainController;

public class Bookstore {


    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.createItems();
        controller.showMainView();
    }
}
