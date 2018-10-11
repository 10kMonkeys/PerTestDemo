package com.perchwell.tests.BuildingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Buildings"})
public class LB17_CurrentListingsSearchByLocationTest extends SampleTest {

    @Test
    public void currentListingsSearchByLocation() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.getNeighborhoodValue();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.getBedsAndBathsListingsAmount();
        user.atOpenedBuildingPage.fillInSearchFieldByNeighborhood();
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByNeighborhood();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atOpenedBuildingPage.checkIfSearchFieldIsFilledByNeighborhood();
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByNeighborhood();
        user.atOpenedBuildingPage.clickOnCurrentListingsSection();
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.checkIfListingReturnedToInitialState();
    }
}
