package com.codecool.bookstore.Controller;

import com.codecool.bookstore.Model.Item;
import com.codecool.bookstore.Model.ItemCategory;
import com.codecool.bookstore.Model.Warehouse;
import com.codecool.bookstore.View.BrowseView;
import com.codecool.bookstore.View.InfoView;
import com.codecool.bookstore.View.MainMenuView;

import java.util.ArrayList;


public class MainController {

    private MainMenuView mainMenuView = new MainMenuView();
    private BrowseView browseView = new BrowseView();
    private InfoView infoView = new InfoView();
    private Warehouse warehouse = new Warehouse();


    public void showMainView() {
        mainMenuView.showMainMenuText(ItemCategory.values());
        int option = mainMenuView.getChosenOption();
        chooseOptioninMainMenu(option);
    }

    private void chooseOptioninMainMenu(int option) {
        switch (option) {
            case 0:
                System.exit(0);
            case 1:
                createBrowseViewByCategory(ItemCategory.BOOK, warehouse.getBooks());
                break;
            case 2:
                createBrowseViewByCategory(ItemCategory.GAME, warehouse.getGames());
                break;
            case 3:
                createBrowseViewByCategory(ItemCategory.MOVIE, warehouse.getMovies());
                break;
        }
    }

    private void createBrowseViewByCategory(ItemCategory category, ArrayList<Item> itemCollection ) {
        browseView.showBrowseText(category);
        browseView.showItems(itemCollection);
        browseView.showOptions();
        int option = browseView.getChosenOption();
        chooseOptionInBrowseMenu(option, itemCollection);
    }

    private void chooseOptionInBrowseMenu(int option, ArrayList<Item> itemCollection) {
        switch (option) {
            case 0:
                System.exit(0);
            case 1:
                browseView.displaySecondOption();
                int itemNo = browseView.getChosenOption();
                Item item = itemCollection.get(itemNo);
                infoView.showInfo(item);
                break;
            case 2:
                showMainView();
                break;
        }
    }

    public void createItems() {
        Item item = new Item("Harry Potter and Philosopher Stone", "Fantasy novel written by British author J. K. Rowling.", 35.00f, 55, ItemCategory.BOOK);
        Item item2 = new Item("Harry Potter and Chamber of Secrets", "Fantasy novel written by British author J. K. Rowling.", 35.00f, 45, ItemCategory.BOOK);
        Item item3 = new Item("Harry Potter and Prisoner of Azkaban", "Fantasy novel written by British author J. K. Rowling.", 39.99f, 95, ItemCategory.BOOK);
        Item item4 = new Item("Diablo II", "Action role-playing hack-and-slash computer video game developed by Blizzard North and published by Blizzard Entertainment in 2000 ", 129.90f, 195, ItemCategory.GAME);
        Item item5 = new Item("Monkey Island", "1990 point-and-click graphic adventure game developed and published by Lucasfilm Games. It takes place in a fantastic version of the Caribbean during the age of piracy.",24.99f, 65, ItemCategory.GAME);
        Item item6 = new Item("The Lost Vikings", "Puzzle-platform video game", 3.99f, 15, ItemCategory.GAME);
        Item item7 = new Item("Shrek", "2001 American computer-animated, comedy film loosely based on the 1990 fairytale picture book", 29.00f, 70, ItemCategory.MOVIE);
        Item item8 = new Item("Shawshank Redemption", "1994 American drama film written and directed by Frank Darabont, based on the 1982 Stephen King novella Rita Hayworth and Shawshank Redemption.", 39.99f, 16, ItemCategory.MOVIE);
        Item item9 = new Item("Wreck it Ralph", "2012 American 3D computer-animated comedy film[4] produced by Walt Disney Animation Studios",65.00f, 35, ItemCategory.MOVIE);
        warehouse.saveItem(item);
        warehouse.saveItem(item2);
        warehouse.saveItem(item3);
        warehouse.saveItem(item4);
        warehouse.saveItem(item5);
        warehouse.saveItem(item6);
        warehouse.saveItem(item7);
        warehouse.saveItem(item8);
        warehouse.saveItem(item9);
    }

}
