package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI2_BuildingSortingTest extends SampleTest {

    @Test
    public void listingSortingTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch(); //search new
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();

        user.atSearchPage.clearAddressSearchField();
        user.atSearchPage.fillInAddressSearchField(Addresses.WALKER_TOWER);

        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();

        user.atSearchPage.clearAddressSearchField();
        user.atSearchPage.fillInAddressSearchField(Addresses.UNITED_NAT_PLAZA);

        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();

        user.atSearchPage.closeAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkListingAmount(3);
        user.atMyTagsPage.clickOnSortedByButton();
        user.atMyTagsPage.clickOnMostExpensiveButton();
        user.atMyTagsPage.shouldTaggedBuildingBeSortedByMostExpensive();
        user.atMyTagsPage.clickOnSortedByButton();
        user.atMyTagsPage.clickOnLeastExpensiveButton();
        user.atMyTagsPage.shouldTaggedBuildingBeSortedByLeastExpensive();
    }
}