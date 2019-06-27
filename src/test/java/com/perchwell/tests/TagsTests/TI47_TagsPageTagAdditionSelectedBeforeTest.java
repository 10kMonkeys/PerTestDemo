package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsSecond", "Android_MultipleTagsSecond", "MultipleTagsSecond"})
public class TI47_TagsPageTagAdditionSelectedBeforeTest extends SampleTest {

    @Test
    public void tagsPageTagAdditionSelectedBeforeTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_second_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnFirstCustomClientTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.fillInTagSearchField("TAGNAME");
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.selectSecondListingAfterFirst();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.singleDownSwipeTagsPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.singleUpSwipeTagsPill();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(-1);
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfCustomClientTagsItemsListIsChanged(2);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.checkTagsIconCountForFirstListing("1");
        user.atMyTagsPage.checkTagsIconCountForSecondListing("2");
        user.atMyTagsPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.shouldSeeCustomClientTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.onlyAndroid.singleDownSwipeAndroidAtMyTagsPage(); //
        user.atMyTagsPage.clickOnTagIconOnSecondListing();
        user.atTagsPage.singleDownSwipeTagsPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.onlyAndroid.singleUpShortSwipeAndroidAtMyTagsPage(); //
        user.atMyTagsPage.openSecondBuilding();
        user.atOpenedBuildingPage.shouldSeeCustomClientTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.singleDownSwipeTagsPill();
        user.atTagsPage.shouldSeeCustomClientTagsPill();
    }
}
