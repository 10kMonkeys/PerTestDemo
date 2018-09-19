package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Listings"})
public class LT5_SimilarListingsMostExpensiveSortingTest extends SampleTest {

    @Test
    public void similarListingsMostExpensiveSorting() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.swipeToTheSimilarListings();
        user.atOpenedBuildingPage.clickOnTestListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.swipeToTheSimilarListings();
        user.atOpenedBuildingPage.fixSearchField();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnLeastExpensiveButton();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnMostExpensiveButton();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
//        user.atOpenedBuildingPage.checkIfMostExpensiveSortingButtonIsEnabled();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
        user.atOpenedBuildingPage.clickOnSimilarListingsSection();
        user.atPerchwellPage.shouldListingBeSortedByMostExpensive();
    }
}
