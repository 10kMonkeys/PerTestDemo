package com.perchwell.steps;

import com.perchwell.pages.perchwell.BuildingSearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BuildingSearchSteps extends ScenarioSteps {

    BuildingSearchPage onPage;

    @Step
    public void checkIfListOfBuildingsAddressesIsReturned(int amount) {
        onPage.checkIfListOfBuildingsReturned(amount);
    }

    @Step
    public void hideKeyboard() {
        onPage.hideKeyboard();
    }

    @Step
    public void fillInSearchField(String value) {
        onPage.fillInSearchField(value);
    }

    @Step
    public void clickOnBackFromBuildingSearchPage() {
        onPage.clickOnBackFromBuildingSearchPage();
    }

    @Step
    public void clickOnFirstBuilding() {
        onPage.clickOnFirstBuilding();
    }

    @Step
    public void checkFirstBuildingIsSelected() {
        onPage.checkFirstBuildingIsSelected();
    }

    @Step
    public void checkBuildingPillIsDisplayed(String address) {
        onPage.checkBuildingPillIsDisplayed(address);
    }

    @Step
    public void checkFirstBuildingIsNotSelected() {
        onPage.checkFirstBuildingIsNotSelected();
    }

    @Step
    public void checkBuildingPillIsNotDisplayed(String address) {
        onPage.checkBuildingPillIsNotDisplayed(address);
    }

    @Step
    public void removeBuildingPill(String address) {
        onPage.removeBuildingPill(address);
    }

    @Step
    public void checkNoOnePillIsShown() {
        onPage.checkNoOnePillIsShown();
    }
}
