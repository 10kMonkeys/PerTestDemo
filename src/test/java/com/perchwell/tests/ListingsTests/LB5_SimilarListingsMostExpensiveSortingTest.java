package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Listings"})
public class LB5_SimilarListingsMostExpensiveSortingTest extends SampleTest {

    @Test
    public void similarListingsMostExpensiveSortingTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnTestListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.fixSearchField();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.checkIfMostExpensiveSortingButtonIsEnabled();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnLeastExpensiveButton();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnMostExpensiveButton();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.checkIfMostExpensiveSortingButtonIsEnabled();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnSimilarListingsSection();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
    }
}
