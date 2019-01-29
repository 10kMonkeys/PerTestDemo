package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI15_SettingTagAlertsTest extends SampleTest {

    @Test
    public void settingTagAlerts() {
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
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.editIconIsShown();
        user.atTagsPage.grayBellIconIsShown();
        user.atTagsPage.clickOnGrayBellButton();
        user.atTagsPage.greenBellIconIsNotShown();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.checkGreenBellIconIsShown();
        user.atTagsPage.clickOnGreenBellButton();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.grayBellIconIsShown();
    }
}
