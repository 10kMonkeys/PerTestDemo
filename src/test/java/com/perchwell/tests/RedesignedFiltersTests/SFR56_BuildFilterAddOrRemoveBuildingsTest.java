package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR56_BuildFilterAddOrRemoveBuildingsTest extends SampleTest {

    @Test
    public void buildFilterAddOrRemoveBuildingsTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.clickOnFirstBuilding();
        user.atBuildingSearchPage.checkFirstBuildingIsSelected();
        user.atBuildingSearchPage.checkBuildingPillIsDisplayed("1 WEST 72ND STREET");
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.checkBuildingPillIsDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.checkFirstBuildingPillIsBelowBuildingTitleAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.noOneNeighborPillIsShown();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.clickOnFirstBuilding();
        user.atBuildingSearchPage.checkFirstBuildingIsNotSelected();
        user.atBuildingSearchPage.checkBuildingPillIsNotDisplayed("1 WEST 72ND STREET");
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereNotChanged();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.clickOnFirstBuilding();
        user.atBuildingSearchPage.checkBuildingPillIsDisplayed("1 WEST 72ND STREET");
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.removeBuildingPill("1 WEST 72ND STREET");
        user.atBuildingSearchPage.checkBuildingPillIsNotDisplayed("1 WEST 72ND STREET");
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.checkFirstBuildingIsNotSelected();
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.clickOnFirstBuilding();
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.checkBuildingPillIsNotDisplayed("1 WEST 72ND STREET");
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.checkFirstBuildingIsNotSelected();
    }
}
