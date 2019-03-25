package com.codecool.bookstore.Controller;

import com.codecool.bookstore.Model.ItemCategory;
import com.codecool.bookstore.View.BrowseView;
import com.codecool.bookstore.View.MainMenuView;


public class MainController {

    MainMenuView mainMenuView = new MainMenuView();
    BrowseView browseView = new BrowseView();


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
                browseView.dejtext();
        }
    }

}
