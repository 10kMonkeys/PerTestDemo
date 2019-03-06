package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI40_ListViewEditTagChangeNameTest extends SampleTest {

    @Test
    public void listViewEditTagChangeNameTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(2);
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.changeClientTagName();
        user.atEditTagPage.clickOnSaveButton();
        user.atTagsPage.checkIfFirstExistingTagIsNotVisible();
        user.atTagsPage.checkIfTagsPillIsRenamed();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkTagsIconCountForFirstListing("1"); //
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.checkIfFirstExistingTagIsNotVisible();
        user.atTagsPage.checkIfTagsPillIsRenamed();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.checkIfFirstExistingTagIsNotVisible(); //
        user.atMyTagsPage.searchRenamedTag(); //
        user.atMyTagsPage.checkIfRenamedTagIsVisible(); //
    }
}
