package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsFirst_IGNORED", "Android_MultipleTagsFirst", "MultipleTagsFirst", "Local_Android_Run"})
public class TI36_ListViewTagRemovalNotSelectedBeforeTest extends SampleTest {

    @Test
    public void listViewTagRemovalNotSelectedBeforeTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_first_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(2);
        user.onlyAndroid.resetListViewBySearch();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstCustomClientTagAndGetValue();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(2);
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(0);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.fillInTagSearchField("TAGNAME");
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(2);
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(0);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkTagsIconCountForFirstAndSecondListings("tag");
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.checkNoOneTagPillIsShown();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.singleSwipeDownForAndroid(); //
        user.atPerchwellPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.onlyAndroid.resetListViewBySwipe(); //
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.checkNoOneTagPillIsShown();
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
