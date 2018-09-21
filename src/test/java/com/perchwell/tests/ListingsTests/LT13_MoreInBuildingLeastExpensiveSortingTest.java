package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Listings"})
public class LT13_MoreInBuildingLeastExpensiveSortingTest extends SampleTest {

    @Test
    public void moreInBuildingLeastExpensiveSortingTest() {
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
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnLeastExpensiveButton();
        user.atPerchwellPage.shouldListingBeSortedByLeastExpensive();
        user.atOpenedBuildingPage.clickOnSimilarListingsSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.checkIfLeastExpensiveSortingButtonIsEnabled();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atPerchwellPage.shouldListingBeSortedByLeastExpensive();
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atPerchwellPage.shouldListingBeSortedByLeastExpensive();
    }
}
