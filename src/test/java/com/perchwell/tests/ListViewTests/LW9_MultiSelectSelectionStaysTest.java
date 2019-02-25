package com.perchwell.tests.ListViewTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class LW9_MultiSelectSelectionStaysTest extends SampleTest {

    @Test
    public void listView() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();

        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(); //add 1

        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(); //add 1

        user.atPerchwellPage.clickOnDiscussionIconOnFirstListing();
        user.atDiscussionPage.clickOnArrowBackFromDiscussionToListViewButton();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(); //add 1

        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clickOnBackButton();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(); //add 1

        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();


    }
}
