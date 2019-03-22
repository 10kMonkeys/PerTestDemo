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
        user.atSearchPage.fillInAddressSearchField(Addresses.DUANE_STREET);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.checkIfShareButtonIsDisplayed();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clearAddressSearchField();
        user.atSearchPage.checkIfResultsAreCleared();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.getCountActiveSalesAndRentals();
        user.atSearchPage.getNeighborhoodAndBuildingType();
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.checkIfNeighborhoodAndBuildingType();
        user.atOpenedBuildingPage.checkIfCountActiveSalesAndRentalsIsSame();
    }
}
