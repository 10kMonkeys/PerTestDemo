package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR55_SearchByAddressTest extends SampleTest {

    @Test
    public void searchByAddressTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField("105 Duane street");
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.checkIfDiscussBuildingButtonIsDisplayed(); //
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clearAddressSearchField();
        user.atSearchPage.checkIfResultsAreCleared(); //
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.getCountActiveSalesAndRentals(); //empty method
        user.atSearchPage.getNeighborhoodAndBuildingType(); //empty method
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.checkIfNeighborhoodAndBuildingType(); //empty method
        user.atOpenedBuildingPage.checkIfCountActiveSalesAndRentals(); //empty method
    }
}
