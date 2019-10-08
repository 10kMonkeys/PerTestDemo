package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "iOS_ListingsTests", "Android_ListingsTests", "ListingsTests"})
public class LB7_SimilarListingsBedroomsSortingTest extends SampleTest {

    @Test
    public void similarListingsBedroomsSortingTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
//        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openAddressSearch(); //search new
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnTestListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.fixSearchField();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnSortByBedroomsButton();
        user.atPerchwellPage.shouldListingBeSortedByBedroomsInBuilding();
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.bedroomsSortButtonShouldBeEnabled();
        user.atOpenedBuildingPage.closeSortWindow();
        user.atPerchwellPage.shouldListingBeSortedByBedroomsInBuilding();
        user.atOpenedBuildingPage.clickOnSimilarListingsSection();
        user.atPerchwellPage.shouldListingBeSortedByBedroomsInBuilding();
    }
}
