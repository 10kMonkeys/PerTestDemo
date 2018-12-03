package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.pages.perchwell.SearchMenu;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchMenuSteps extends ScenarioSteps {

    SearchMenu inMenu;

    @Step
    public void openSearchPage() {
        if(!Config.isAndroid()) {
            waitABit(1000);
            inMenu.clickOnSearchMenuIcon();
            inMenu.clickOnEditSearchButton();
        }
    }

    @Step
    public void openSavedSearches() {
        if(!Config.isAndroid()) {
            waitABit(1000);
            inMenu.clickOnSearchMenuIcon();
            inMenu.clickOnMySavedSearches();
        }
    }

    @Step
    public void openSavedSearchesWithPause() {
        if(!Config.isAndroid()) {
            inMenu.clickOnSearchMenuIconWithPause();
            inMenu.clickOnMySavedSearches();
        }
    }
}
