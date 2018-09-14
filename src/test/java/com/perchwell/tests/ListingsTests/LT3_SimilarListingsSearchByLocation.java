package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class LT3_SimilarListingsSearchByLocation extends SampleTest {

    @Test
    public void similarListingsSearchByLocation() {

        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atPerchwellPage.swipeToTheSimilarListings();
        user.atPerchwellPage.clickOnTestListing();
        user.atPerchwellPage.skipDiscussWithClientHint();
        user.atPerchwellPage.getNeighborhoodValue();
        user.atPerchwellPage.swipeToTheSimilarListings();
        user.atPerchwellPage.getBedsAndBathsListingsAmount();
        user.atPerchwellPage.fillInSearchFieldByNeighborhood();
        user.atPerchwellPage.checkIfListingsAreFilteredByNeighborhood();
        user.atPerchwellPage.clickOnMoreInBuildingSection();
        user.atPerchwellPage.checkIfSearchFieldIsFilledByNeighborhood();
        user.atPerchwellPage.checkIfListingsAreFilteredByNeighborhood();
        user.atPerchwellPage.clickOnSimilarListingsSection();
        user.atPerchwellPage.clickOnClearFieldButton();
        user.atPerchwellPage.checkIfListingReturnedToInitialState();
    }
}
