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
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.clickOnFirstBuilding();
        user.atSearchPage.checkFirstBuildingIsSelected();
        user.atSearchPage.checkBuildingPillIsDisplayedAtBuildingSearchPage("1 WEST 72ND STREET");

        user.atSearchPage.clickOnBackFromNeighborhoodsPage();

        user.atSearchPage.checkBuildingPillIsDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.checkFirstBuildingPillIsBelowBuildingTitleAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.noOneNeighborPillIsShown();



        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.clickOnFirstBuilding();
        user.atSearchPage.checkFirstBuildingIsNotSelectedAtBuildingSearchPage();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtBuildingSearchPage("1 WEST 72ND STREET");

        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereNotChanged();


        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.clickOnFirstBuilding();

        user.atSearchPage.checkBuildingPillIsDisplayedAtBuildingSearchPage("1 WEST 72ND STREET");

        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.removeBuildingPill("1 WEST 72ND STREET");
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtBuildingSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);

        user.atSearchPage.checkFirstBuildingIsNotSelectedAtBuildingSearchPage();
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.clickOnFirstBuilding();
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.checkBuildingPillIsNotDisplayedAtBuildingSearchPage("1 WEST 72ND STREET");
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.checkFirstBuildingIsNotSelectedAtBuildingSearchPage();
    }
}
