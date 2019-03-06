package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI38_ListViewTagRemovalSelectedBeforeTest extends SampleTest {

    @Test
    public void listViewTagRemovalSelectedBeforeTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(2);
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.fillInTagSearchField("11CLIENTNAME");
        user.atTagsPage.clickOnFirstCustomClientTagAndGetValue();
        user.atTagsPage.fillInTagSearchField("TAGNAME");
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(1);
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(-2);
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(1);
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(-2);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkTagsIconCountForFirstAndSecondListings("tag");
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldNotSeeCustomClientTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldNotSeeCustomClientTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.searchCustomClientTag();
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkIfTwoListingsAreNotDisplayed();
        user.atMyTagsPage.removeAllTagPills();
        user.atMyTagsPage.searchFirstExistingTag();
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkIfTwoListingsAreNotDisplayed();
    }
}
