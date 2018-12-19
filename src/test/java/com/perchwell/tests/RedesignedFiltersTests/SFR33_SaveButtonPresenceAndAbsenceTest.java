package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR33_SaveButtonPresenceAndAbsenceTest extends SampleTest {

    @Test
    public void saveButtonPresenceAndAbsence() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.shouldSeeSaveButton();
        user.inSearchMenu.openSearchPage();
        user.inSearchMenu.shouldSeeSaveButton();
        user.atSearchPage.clickOnResetFilter();
        user.inSearchMenu.shouldSeeSaveButton();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.shouldSeeSaveButton();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.shouldSeeSaveButton();
        user.inSearchMenu.openSearchPage();
        user.inSearchMenu.shouldSeeSaveButton();
        user.atSearchPage.clickOnSaveSearchButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.shouldNotSeeSaveButton();
        user.inSearchMenu.openSearchPage();
        user.inSearchMenu.shouldNotSeeSaveButton();
        user.atSearchPage.selectOneBedMinimumFilter();
        user.inSearchMenu.shouldSeeSaveButton();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.shouldSeeSaveButton();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.saveAsOptionSelect();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.shouldNotSeeSaveButton();
        user.atPerchwellPage.clickOnListingsByButton();
        user.atPerchwellPage.clickOnTotalRoomsSortButton();
        user.inSearchMenu.shouldSeeSaveButton();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.saveAsOptionSelect();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAcrisClosingPage.addChartFromACRISSection();
        user.atAnalyticsPage.skipHints();
        user.inSearchMenu.shouldSeeSaveButton();
    }
}
