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
        user.atTagsPage.fillInTagSearchField("11CLIENTNAME");
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstCustomClientTagAndGetValue();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(2); //
        user.atTagsPage.clearSearchField();
        user.atTagsPage.fillInTagSearchField("TAGNAME");
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(2); //update
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkTagsIconCountForFirstAndSecondListings(2); //
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.swipeDownFirstExistingTagPill(); //
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill(); //
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.shouldSeeCustomClientTag();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.swipeDownFirstExistingTagPill(); //
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill(); //
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.swipeDownFirstExistingTagPill(); //
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill(); //
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeCustomClientTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.swipeDownFirstExistingTagPill(); //
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill(); //
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.searchCustomClientTag(); //
        user.atMyTagsPage.clickOnFirstTag(); //
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkIfTwoListingsAreDisplayed(); //
        user.atMyTagsPage.removeAllTagPills();
        user.atMyTagsPage.searchFirstExistingTag(); //
        user.atMyTagsPage.clickOnFirstTag(); //
        user.atMyTagsPage.clickOnSearchButton(); //
        user.atMyTagsPage.checkIfTwoListingsAreDisplayed(); //
    }
}
