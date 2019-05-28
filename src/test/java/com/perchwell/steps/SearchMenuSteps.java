package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.pages.perchwell.SearchMenu;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchMenuSteps extends ScenarioSteps {

    SearchMenu inMenu;

    @Step
    public void openSearchPage() {
        waitABit(1000);
        inMenu.clickOnSearchMenuIcon();
        inMenu.clickOnEditSearchButton();
    }

    @Step
    public void openSearchPageWithWait() {
        inMenu.waitSortedBy();
        inMenu.clickOnSearchMenuIcon();
        inMenu.clickOnEditSearchButton();
    }

    @Step
    public void openSavedSearches() {
            waitABit(1000);
            inMenu.clickOnSearchMenuIcon();
            inMenu.clickOnMySavedSearches();
    }

    @Step
    public void openSavedSearchesWithPause() {
        inMenu.clickOnSearchMenuIconWithPause();
        inMenu.clickOnMySavedSearches();
    }

    @Step
    public void openAddressSearch() {
        if(Config.isAndroid()) {
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

    @Step
    public void openSearchMenu() {
        inMenu.clickOnSearchMenuIcon();
    }

    @Step
    public void closeSearchMenu() {
        inMenu.clickOnSearchMenuIcon();
    }
}
