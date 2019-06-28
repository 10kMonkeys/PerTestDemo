package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsSecond", "Android_MultipleTagsSecond", "MultipleTagsSecond"})
public class TI49_TagsPageChangeNameTest extends SampleTest {

    @Ignore
    @Test
    public void tagsPageChangeNameTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_second_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstCustomClientTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.selectSecondListingAfterFirst();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.swipeCustomClientTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.changeClientTagName();
        user.atEditTagPage.clickOnSaveButton();
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.checkIfCustomClientTagIsNotVisible();
        user.atTagsPage.checkIfTagsPillIsRenamed();
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.checkTagsIconCountForFirstAndSecondListings("1");
        user.atMyTagsPage.swipeDownForAndroidAtTaggedItemsPage(); //
        user.atMyTagsPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.resetSwipeOnlyForAndroid(1); //
        user.atMyTagsPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldNotSeeCustomClientTag();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.checkIfCustomClientTagIsNotVisible();
        user.atTagsPage.checkIfTagsPillIsRenamed();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atMyTagsPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldNotSeeCustomClientTag();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.checkIfCustomClientTagIsNotVisible();
        user.atTagsPage.checkIfTagsPillIsRenamed();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
    }
}
