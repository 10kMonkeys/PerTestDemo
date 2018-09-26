package com.perchwell.tests.BuildingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Buildings"})
public class BT5_CurrentListingsMostExpensiveSortingTest extends SampleTest {

    @Test
    public void currentListingsMostExpensiveSorting() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.fixListingsSearchField();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.checkIfMostExpensiveSortingButtonIsEnabled();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnLeastExpensiveButton();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnMostExpensiveButton();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.checkIfMostExpensiveSortingButtonIsEnabled();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnCurrentListingsSection();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
    }
}
