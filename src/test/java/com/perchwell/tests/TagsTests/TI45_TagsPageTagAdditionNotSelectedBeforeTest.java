package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsSecond", "Android_MultipleTagsSecond", "MultipleTagsSecond"})
public class TI45_TagsPageTagAdditionNotSelectedBeforeTest extends SampleTest {

    @Test
    public void tagsPageTagAdditionNotSelectedBeforeTest() {
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
        user.atTagsPage.fillInTagSearchField("TAGNAME");
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(2);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.checkTagsIconCountForFirstAndSecondListings("2");
        user.atMyTagsPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeDownFirstExistingTagPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeCustomClientTag();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeDownFirstExistingTagPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atMyTagsPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeDownFirstExistingTagPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldSeeCustomClientTag();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeDownFirstExistingTagPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.swipeUpFirstExistingTagPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
    }
}
