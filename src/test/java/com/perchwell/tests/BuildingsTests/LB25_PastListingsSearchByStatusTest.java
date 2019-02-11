package com.perchwell.tests.BuildingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "BuildingsTests"})
public class LB25_PastListingsSearchByStatusTest extends SampleTest {

    @Test
    public void pastListingsSearchByStatus() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openAddressSearch(); //search new
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.fixListingsSearchField();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.PERM_OFF_MARKET_FILTER);
        user.atOpenedBuildingPage.checkListingsStatus(Filters.PERM_OFF_MARKET_STATUS);
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.SOLD_FILTER);
        user.atOpenedBuildingPage.checkListingsStatus(Filters.SOLD_STATUS);
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.RENTED_FILTER);
        user.atOpenedBuildingPage.checkListingsStatus(Filters.RENTED_STATUS);
        user.atOpenedBuildingPage.clickOnCurrentListingsSection();
        user.atOpenedBuildingPage.shouldSeeNoMatchLabel();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atOpenedBuildingPage.checkListingsStatus(Filters.RENTED_STATUS);
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.TEMP_OFF_MARKET_FILTER);
        user.atOpenedBuildingPage.checkListingsStatusNormal(Filters.TEMP_OFF_MARKET_STATUS);
    }
}
