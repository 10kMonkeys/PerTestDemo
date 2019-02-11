package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI25_TagRenamingClientTagTest extends SampleTest {

    @Test
    public void tagRenamingClientTag() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.getFirstBuildingAddress();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstCustomClientTagAndGetValue();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.swipeUpToMyTagsLabel();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.swipeCustomClientTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.shouldSeeCustomClient();
        user.atTagsPage.checkCustomTagsItemsValue();
        user.atEditTagPage.checkIfSaveButtonIsNotDisplayed();
        user.atEditTagPage.changeClientTagName();
        user.atEditTagPage.checkIfSaveButtonIsDisplayed();
        user.atEditTagPage.clickOnSaveButton();
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.checkIfCustomClientTagIsNotVisible();
        user.atTagsPage.checkIfTagsPillIsRenamed();
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeCustomClientTag();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.shouldNotSeeCustomClientTag();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchCustomClientTag();
        user.atTagsPage.checkIfCustomClientTagIsNotVisible();
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.searchCustomClient();
        user.atClientPage.shouldSeeCustomClient();
    }
}
