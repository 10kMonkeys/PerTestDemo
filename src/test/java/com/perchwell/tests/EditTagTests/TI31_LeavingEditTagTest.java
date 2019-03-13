package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsThird"})
public class TI31_LeavingEditTagTest extends SampleTest {

    @Test
    public void leavingEditTag() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnArrowBackFromEditTagPage();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.changeTagName();
        user.atEditTagPage.clickOnArrowBackFromEditTagPage();
        user.atEditTagPage.clickOnDiscardButton();
        user.atTagsPage.checkIfFirstExistingTagIsVisible();
        user.atTagsPage.closeTagsPage();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.changeTagName();
        user.atEditTagPage.clickOnArrowBackFromEditTagPage();
        user.atEditTagPage.clickOnPopUpSaveButton(); //updated locator on xpath (need to update locator)
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.swipeRenamedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.switchAlertsToOff();
        user.atEditTagPage.clickOnArrowBackFromEditTagPage();
        user.atEditTagPage.clickOnDiscardButton();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.swipeRenamedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.switchAlertsToOff();
        user.atEditTagPage.clickOnArrowBackFromEditTagPage();
        user.atEditTagPage.clickOnPopUpSaveButton(); //updated locator on xpath (need to update locator)
        user.atTagsPage.checkNoOneActiveBellDisplayed();
    }
}
