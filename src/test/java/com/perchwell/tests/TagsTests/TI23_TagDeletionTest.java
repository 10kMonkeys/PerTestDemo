package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI23_TagDeletionTest extends SampleTest {

    @Test
    public void tagDeletion() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atPerchwellPage.getFirstBuildingAddress();
        user.atPerchwellPage.getItemsValue();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.removeAllTags();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.checkListingIsRemovedFromTaggedItemsPage();
        user.atPerchwellPage.checkItemsCountIsChanged(-1);
        user.atPerchwellPage.getFirstBuildingAddress();
        user.atPerchwellPage.getItemsValue();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.removeAllTags();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.checkListingIsRemovedFromTaggedItemsPage();
        user.atPerchwellPage.checkItemsCountIsChanged(-1);
        user.atTagsPage.closeTagsPage();
        user.atPerchwellPage.closeAccountMenu();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
    }
}
