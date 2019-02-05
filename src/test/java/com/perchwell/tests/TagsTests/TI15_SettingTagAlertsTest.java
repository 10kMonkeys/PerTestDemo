package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsSecond"})
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
        user.atTagsPage.shouldSeeJustCreatedTag(1);
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.editIconIsShown();
        user.atTagsPage.grayBellButtonIsShown();
        user.atTagsPage.clickOnGrayBellButton();
        user.atTagsPage.checkNoOneActiveBellDisplayed();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnGreenBellButton();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.grayBellButtonIsShown();
    }
}
