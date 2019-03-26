package com.codecool.bookstore.Controller;

import com.codecool.bookstore.Model.Item;
import com.codecool.bookstore.Model.ItemCategory;
import com.codecool.bookstore.Model.Warehouse;
import com.codecool.bookstore.View.BrowseView;
import com.codecool.bookstore.View.MainMenuView;


public class MainController {

    MainMenuView mainMenuView = new MainMenuView();
    BrowseView browseView = new BrowseView();
    Warehouse warehouse = new Warehouse();


    public void showMainView() {
        mainMenuView.showMainMenuText(ItemCategory.values());
        int option = mainMenuView.getChosenOption();
        chooseOption(option);
    }

    public void chooseOption(int option) {
        switch (option) {
            case 0:
                System.exit(0);
            case 1:
                createBooks();
                browseView.dejtext();
        }
    }

    public void createBooks() {
        Item item = new Item("Harry Potter and Philosopher Stone", 35.00f, 55, ItemCategory.BOOK);
        Item item2 = new Item("Harry Potter and Chamber of Secrets", 35.00f, 45, ItemCategory.BOOK);
        Item item3 = new Item("Harry Potter and Prisoner of Azkaban", 39.99f, 95, ItemCategory.BOOK);
        warehouse.saveItem(item);
        warehouse.saveItem(item2);
        warehouse.saveItem(item3);
    }

}
