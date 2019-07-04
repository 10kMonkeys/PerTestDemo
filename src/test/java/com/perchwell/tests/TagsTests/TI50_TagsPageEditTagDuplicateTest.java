package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsSecond", "Android_MultipleTagsSecond", "MultipleTagsSecond", "Local_Android_Run"})
public class TI50_TagsPageEditTagDuplicateTest extends SampleTest {

    @Ignore
    @Test
    public void tagsPageEditTagDuplicateTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_second_email"),
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
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnDuplicateButton();
        user.atEditTagPage.fillInDuplicateTagName();
        user.atEditTagPage.clickOnPopUpSaveButton();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeDuplicatedTagsPill();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.checkDuplicatedAndExistingTagsItemsAreSame();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.checkTagsIconCountForFirstAndSecondListings("2");
        user.atMyTagsPage.swipeDownForAndroidAtTaggedItemsPage(); //
        user.atMyTagsPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeDuplicatedTagsPill();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.resetSwipeOnlyForAndroid(1); //
        user.atMyTagsPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeDuplicatedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeDuplicatedTagsPill();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atMyTagsPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeDuplicatedTagsPill();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeDuplicatedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeDuplicatedTagsPill();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.allTagsAreSelected(1);
    }
}
