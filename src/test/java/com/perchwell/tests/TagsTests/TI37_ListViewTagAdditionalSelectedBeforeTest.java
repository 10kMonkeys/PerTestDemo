package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsFirst", "Android_MultipleTagsFirst", "MultipleTagsFirst"})
public class TI37_ListViewTagAdditionalSelectedBeforeTest extends SampleTest {

    @Test
    public void listViewTagAdditionalSelectedBeforeTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_first_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(2);
        user.onlyAndroid.resetListView();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.fillInTagSearchField("11CLIENTNAME");
        user.atTagsPage.clickOnFirstCustomClientTagAndGetValue();
        user.atTagsPage.fillInTagSearchField("TAGNAME");
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(1);
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkTagsIconCountForFirstAndSecondListings("2");
        user.atPerchwellPage.singleSwipeDownForAndroid(); //
        user.atPerchwellPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.swipeDownFirstExistingTagPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.onlyAndroid.resetListView(); //
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeCustomClientTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.swipeDownFirstExistingTagPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.searchCustomClientTag();
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkIfTwoListingsAreDisplayed();
        user.atMyTagsPage.removeAllTagPills();
        user.atMyTagsPage.searchFirstExistingTag();
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkIfTwoListingsAreDisplayed();
    }
}
