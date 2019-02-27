package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SearchRequests;
import com.perchwell.data.SortingTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI34_MultiSelectDismissalTest extends SampleTest {

    @Test
    public void multiSelectDismissalTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.clickOnFirstClientTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.getFirstBuildingAddress();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.checkNoOneListingIsSelected();
        user.atMyTagsPage.multiSelectMenuIsHidden();
        user.atMyTagsPage.checkSortLabel(SortingTypes.DATE_ADDED);
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.checkNoOneListingIsSelected();
        user.atMyTagsPage.multiSelectMenuIsHidden();
        user.atMyTagsPage.checkSortLabel(SortingTypes.DATE_ADDED);
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atMyTagsPage.checkNoOneListingIsSelected();
        user.atMyTagsPage.multiSelectMenuIsHidden();
        user.atMyTagsPage.checkSortLabel(SortingTypes.DATE_ADDED);
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.swipeUpListViewToRefresh();
        user.atMyTagsPage.checkNoOneListingIsSelected();
        user.atMyTagsPage.multiSelectMenuIsHidden();
        user.atMyTagsPage.checkSortLabel(SortingTypes.DATE_ADDED);
    }
}
