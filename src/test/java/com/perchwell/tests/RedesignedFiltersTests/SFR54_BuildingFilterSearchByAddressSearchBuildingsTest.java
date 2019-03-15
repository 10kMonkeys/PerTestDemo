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
        user.atSearchPage.checkIfAddressBuildingIsReturned("DAKOTA, 1 WEST 72ND STREET");
        user.atSearchPage.checkIfAddressBuildingIsReturned("15 DAKOTA PLACE");
        user.atSearchPage.checkIfAddressBuildingIsReturned("2657 EAST 66TH STREET");
        user.atSearchPage.closeAddressSearch();
        user.atPerchwellPage.checkIfListingsWereNotChanged();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.hideKeyboard();
        user.atSearchPage.checkIfAddressBuildingIsReturned("DAKOTA, 1 WEST 72ND STREET");
        user.atSearchPage.checkIfAddressBuildingIsReturned("15 DAKOTA PLACE");
        user.atSearchPage.checkIfAddressBuildingIsReturned("2657 EAST 66TH STREET");
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.closeSearch();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField("1 WEST 72ND STREET");
        user.atSearchPage.hideKeyboard();
        user.atSearchPage.checkIfAddressBuildingIsReturned("DAKOTA, 1 WEST 72ND STREET");
        user.atSearchPage.closeAddressSearch();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField("1 WEST 72ND STREET");
        user.atSearchPage.hideKeyboard();
        user.atSearchPage.checkIfAddressBuildingIsReturned("DAKOTA, 1 WEST 72ND STREET");
    }
}
