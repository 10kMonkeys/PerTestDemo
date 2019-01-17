package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.pages.perchwell.SearchMenu;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchMenuSteps extends ScenarioSteps {

    SearchMenu inMenu;

    @Step
    public void openSearchPage() {
        waitABit(1000);
        inMenu.clickOnSearchMenuIcon();
        inMenu.clickOnEditSearchButton();
    }

    @Step
    public void openSavedSearches() {
        inMenu.clickOnSearchMenuIcon();
        inMenu.clickOnMySavedSearches();

    }

    @Step
    public void openSavedSearchesWithPause() {
        if(!Config.isAndroid()) {
            inMenu.clickOnSearchMenuIconWithPause();
            inMenu.clickOnMySavedSearches();
        }
    }

    @Step
    public void openAddressSearch() {
        if(!Config.isAndroid()) {
            waitABit(1000);
            inMenu.clickOnSearchMenuIcon();
            inMenu.clickOnSearchByAddressButton();
        }
    }

    public void shouldSeeSaveButton() {
        waitABit(3000);
        inMenu.shouldSeeSaveButton();
    }

    @Step
    public void shouldNotSeeSaveButton() {
        waitABit(3000);
        inMenu.shouldNotSeeSaveButton();
    }
}
