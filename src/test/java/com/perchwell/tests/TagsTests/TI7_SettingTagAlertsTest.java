package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI7_SettingTagAlertsTest extends SampleTest {

    @Test
    public void settingTagAlertsTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.shouldSeeJustCreatedTag(1);
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.grayBellButtonIsShown();
        user.atTagsPage.editIconIsShown();
        user.atTagsPage.clickOnGrayBellButton();
        user.atTagsPage.checkNoOneActiveBellDisplayed();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnGreenBellButton();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.grayBellButtonIsShown();
    }
}
