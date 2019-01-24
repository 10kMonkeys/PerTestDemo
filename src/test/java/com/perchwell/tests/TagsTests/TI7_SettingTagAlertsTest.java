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
//        user.atTagsPage.setSpecificTagAndSave("0TagName1");

        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();

        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
//        user.atTagsPage.searchJustCreatedTag("0TagName1");
//        user.atTagsPage.checkJustCreatedTagHasGreenBellIcon();
//        user.atTagsPage.swipeSpecificTag("0TagName1");
//        user.atTagsPage.editAndGrayBellIconIsShown();
//        user.atTagsPage.editAndEditIconIsShown();
//        user.atTagsPage.clickOnGrayBellIcon();
//        user.atTagsPage.checkJustCreatedTagNOTHasGreenBellIcon();
//        user.atTagsPage.swipeSpecificTag("0TagName1");
//        user.atTagsPage.clickOnGreenBellIcon();
//        user.atTagsPage.checkJustCreatedTagHasGreenBellIcon();
//        user.atTagsPage.swipeSpecificTag("0TagName1");
//        user.atTagsPage.checkJustCreatedTagHasGreenBellIcon();
//        user.atTagsPage.clickOnEditTagIcon();
//        user.atEditTagPage.removeTag();

    }
}
