package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI22_TagDeletionTest extends SampleTest {

    @Test
    public void tagDeletion() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.checkIfTagsItemsListIsChanged(-1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.clickOnTagPillInSearchField();
        user.atTagsPage.checkIfTagsCheckMarIsNotSelected();
        user.atTagsPage.checkIfTagPillIsRemoved();
        user.atTagsPage.checkIfTagsItemsListIsChanged(-1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
    }
}
