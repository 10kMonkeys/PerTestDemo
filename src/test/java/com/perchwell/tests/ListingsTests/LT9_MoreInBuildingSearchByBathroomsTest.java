package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Listings"})
public class LT9_MoreInBuildingSearchByBathroomsTest extends SampleTest {

    @Test
    public void moreInBuildingSearchByBathroomsTest() {
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
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atOpenedBuildingPage.getBedsAndBathsListingsAmount();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.TWO_BATHS_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByBaths();
        user.atOpenedBuildingPage.clickOnSimilarListingsSection();
        user.atOpenedBuildingPage.checkIfSearchFieldIsFilledByFilter(Filters.TWO_BATHS_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByBaths();
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.checkIfListingReturnedToInitialState();
    }
}
