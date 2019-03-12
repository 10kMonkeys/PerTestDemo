package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI52_TagsPageNewTagCreationTest extends SampleTest {

    @Test
    public void tagsPageNewTagCreationTest() {
        user.atLoginPage.loginAsBroker("test-android+mgmt-core@perchwell.com",
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.selectSecondListingAfterFirst();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkIfFirstTagsItemsListIsEqual(2);
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.checkTagsIconCountForFirstAndSecondListings("2");
        user.atMyTagsPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atMyTagsPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
    }
}
