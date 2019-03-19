package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR54_BuildingFilterSearchByAddressSearchBuildingsTest extends SampleTest {

    @Test
    public void buildingFilterSearchByAddressSearchBuildingsTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atSearchPage.hideKeyboard();
        user.atSearchPage.getListOfBuildingsAddresses(5); //
        user.atSearchPage.checkIfAddressBuildingIsReturned(Addresses.DAKOTA_WEST72ND);
        user.atSearchPage.checkIfAddressBuildingIsReturned(Addresses.DAKOTA_15PLACE);
        user.atSearchPage.checkIfAddressBuildingIsReturned(Addresses.EAST_66TH);
        user.atSearchPage.closeAddressSearch();
        user.atPerchwellPage.checkIfListingsWereNotChanged();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.hideKeyboard();
        user.atSearchPage.checkIfListOfBuildingsAddressesIsReturned(5); //
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.closeSearch();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.WEST_72ND);
        user.atSearchPage.hideKeyboard();
        user.atSearchPage.getListOfBuildingsAddresses(5); //
        user.atSearchPage.checkIfAddressBuildingIsReturnedFirst(Addresses.DAKOTA_WEST72ND); //
        user.atSearchPage.closeAddressSearch();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.WEST_72ND);
        user.atSearchPage.hideKeyboard();
        user.atSearchPage.checkIfListOfBuildingsAddressesIsReturned(5); //
    }
}
