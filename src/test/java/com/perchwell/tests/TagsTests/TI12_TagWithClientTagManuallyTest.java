package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SearchRequests;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI12_TagWithClientTagManuallyTest extends SampleTest {

    @Test
    public void tagWithClientTagManually() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.getFirstBuildingAddress();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atOpenedBuildingPage.clearTagsList();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.getTestClientsItemsValue();
        user.atTagsPage.clickOnFirstClientTag();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.checkIfClientTagsItemsListIsChanged(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldSeeAddedExistingTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.clickOnFirstClientTag();
        user.atTagsPage.clickOnSearchButton();
        user.atTagsPage.shouldSeeTaggedListing();
    }
}
