package com.perchwell.tests.BuildingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "iOS_BuildingsTests", "Android_BuildingsTests", "BuildingsTests"})
public class LB20_CurrentListingsLeastExpensiveSortingTest extends SampleTest {

    @Test
    public void currentListingsLeastExpensiveSorting() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch(); //search new
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.fixListingsSearchField();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnLeastExpensiveButton();
        user.atPerchwellPage.shouldListingBeSortedByLeastExpensive();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.checkIfLeastExpensiveSortingButtonIsEnabled();
        user.atOpenedBuildingPage.closeSortWindow();
        user.atPerchwellPage.shouldListingBeSortedByLeastExpensive();
        user.atOpenedBuildingPage.clickOnCurrentListingsSection();
        user.atPerchwellPage.shouldListingBeSortedByLeastExpensive();
    }
}
