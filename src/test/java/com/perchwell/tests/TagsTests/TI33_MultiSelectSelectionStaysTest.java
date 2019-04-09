package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SearchRequests;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsThird", "Android_TagsThird", "TagsThird"})
public class TI33_MultiSelectSelectionStaysTest extends SampleTest {

    @Test
    public void multiSelectSelectionStaysTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.clickOnFirstTagWithItems();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.getFirstBuildingAddress();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clickOnBackButton();
        user.atMyTagsPage.checkFirstListingsIsSelected();
        user.atMyTagsPage.multiSelectMenuIsShown();
        user.atMyTagsPage.clickOnDiscussionIconOnFirstListing();
        user.atDiscussionPage.clickOnArrowBackFromDiscussionToListViewButton();
        user.atMyTagsPage.checkFirstListingsIsSelected();
        user.atMyTagsPage.multiSelectMenuIsShown();
    }
}
