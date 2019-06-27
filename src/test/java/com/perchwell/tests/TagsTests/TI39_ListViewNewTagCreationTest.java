package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsFirst", "Android_MultipleTagsFirst", "MultipleTagsFirst"})
public class TI39_ListViewNewTagCreationTest extends SampleTest {

    @Test
    public void listViewNewTagCreationTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_first_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(2);
        user.onlyAndroid.resetListView();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkTagBelowOtherTagsLabel();
        user.atTagsPage.checkIfFirstTagsItemsListIsEqual(2);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkTagsIconCountForFirstAndSecondListings("1");
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.onlyAndroid.singleDownSwipeAndroidAtMyTagsPage(); //
        user.atPerchwellPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.onlyAndroid.singleUpShortSwipeAndroidAtMyTagsPage(); //
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkIfTwoListingsAreDisplayed();
    }
}
