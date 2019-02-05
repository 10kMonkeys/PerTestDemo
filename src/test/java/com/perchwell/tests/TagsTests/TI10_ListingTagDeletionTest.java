package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI10_ListingTagDeletionTest extends SampleTest {

    @Test
    public void listingTagDeletion() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atOpenedBuildingPage.clearTagsList();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.checkIfTagsItemsListIsChanged(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfTagsItemsListIsChanged(0);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnTagPillInSearchField();
        user.atTagsPage.checkIfTagsCheckMarIsNotSelected();
        user.atTagsPage.checkIfTagPillIsRemoved();
        user.atTagsPage.checkIfTagsItemsListIsChanged(0);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
    }
}
