package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsFirst", "Android_MultipleTagsFirst", "MultipleTagsFirst", "Local_Android_Run"})
public class TI43_ListViewSetAlertsTest extends SampleTest {

    @Test
    public void listViewEditTagChangeNameTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_first_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.switchAlertsToOff();
        user.atEditTagPage.clickOnSaveButton();
        user.onlyAndroid.searchJustCreatedTag();
        user.atTagsPage.checkNoOneActiveBellDisplayed();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkNoOneActiveBellDisplayed();
        user.atTagsPage.clickOnCrossFromAccountTagsButton();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.switchAlertsToOn();
        user.atEditTagPage.clickOnArrowBackFromEditTagPage();
        user.atEditTagPage.clickOnPopUpSaveButton();
        user.onlyAndroid.searchJustCreatedTag();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.clickOnCrossFromAccountTagsButton();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnGrayBellButton();
        user.onlyAndroid.searchJustCreatedTag();
        user.atTagsPage.checkNoOneActiveBellDisplayed();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkNoOneActiveBellDisplayed();
        user.atTagsPage.clickOnCrossFromAccountTagsButton();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnGreenBellButton();
        user.onlyAndroid.searchJustCreatedTag();
        user.atTagsPage.greenBellIconIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.greenBellIconIsShown();
    }
}
