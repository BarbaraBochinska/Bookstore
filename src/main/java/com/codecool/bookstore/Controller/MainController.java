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
    }

    private void createItems() {
        Item item = new Item("Harry Potter and Philosopher Stone", 35.00f, 55, ItemCategory.BOOK);
        Item item2 = new Item("Harry Potter and Chamber of Secrets", 35.00f, 45, ItemCategory.BOOK);
        Item item3 = new Item("Harry Potter and Prisoner of Azkaban", 39.99f, 95, ItemCategory.BOOK);
        Item item4 = new Item("Diablo II", 129.90f, 195, ItemCategory.GAME);
        Item item5 = new Item("Monkey Island", 24.99f, 65, ItemCategory.GAME);
        Item item6 = new Item("The Lost Vikings", 3.99f, 15, ItemCategory.GAME);
        Item item7 = new Item("Shrek", 29.00f, 70, ItemCategory.MOVIE);
        Item item8 = new Item("Shawshank Redemption", 39.99f, 16, ItemCategory.MOVIE);
        Item item9 = new Item("Wreck it Ralph", 65.00f, 35, ItemCategory.MOVIE);
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
