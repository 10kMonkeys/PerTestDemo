package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR58_BuildingFilterResetAndNewSearchTest extends SampleTest {

    @Test
    public void buildingFilterResetAndNewSearchTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.clickOnFirstBuilding();
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkBuildingPillIsDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.defaultNeighborPillsAreShown();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.checkNoOnePillIsShown();
        user.atBuildingSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atBuildingSearchPage.clickOnFirstBuilding();
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.atPerchwellPage.checkIfListingsWereNotChanged();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.defaultNeighborPillsAreShown();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.checkNoOnePillIsShown();
    }

}
