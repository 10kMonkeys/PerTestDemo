package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI26_AlertsSetUpTest extends SampleTest {

    @Test
    public void alertsSetUpTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.checkIfSaveButtonIsNotDisplayed();
        user.atEditTagPage.checkIfAlertsAreTurnedOn();
        user.atEditTagPage.switchAlertsToOff();
        user.atEditTagPage.checkIfAlertsAreTurnedOff();
        user.atEditTagPage.checkIfSaveButtonIsDisplayed();
        user.atEditTagPage.clickOnSaveButton();
        user.atTagsPage.checkNoOneActiveBellDisplayed();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.checkIfAlertsAreTurnedOff();
        user.atEditTagPage.switchAlertsToOn();
        user.atEditTagPage.checkIfAlertsAreTurnedOn();
        user.atEditTagPage.clickOnSaveButton();
        user.atTagsPage.greenBellIconIsShown();
    }
}
