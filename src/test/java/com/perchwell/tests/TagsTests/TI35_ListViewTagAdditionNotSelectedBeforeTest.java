package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI35_ListViewTagAdditionNotSelectedBeforeTest extends SampleTest {

    @Test
    public void multiSelectDismissalTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(2);
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.checkIfTagsItemsListIsChanged(2);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.checkIfJustCreatedTagsItemsListIsEqual(2); //
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkTagsIconCountForFirstAndSecondListings(2); //
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.swipeDownJustCreatedTagPill(); //
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.swipeUpJustCreatedTagPill(); //
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.swipeDownJustCreatedTagPill(); //
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.swipeUpJustCreatedTagPill(); //
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.swipeDownJustCreatedTagPill(); //
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.swipeUpJustCreatedTagPill(); //
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.swipeDownJustCreatedTagPill(); //
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.swipeUpJustCreatedTagPill(); //
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.searchFirstExistingTag(); //
        user.atMyTagsPage.clickOnFirstTag(); //
        user.atMyTagsPage.clickOnSearchButton(); //
        user.atMyTagsPage.checkIfTwoListingsAreDisplayed(); //
        user.atMyTagsPage.removeAllTagPills();
        user.atMyTagsPage.searchJustCreatedTag(); //
        user.atMyTagsPage.clickOnFirstTag(); //
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkIfTwoListingsAreDisplayed(); //
    }
}
