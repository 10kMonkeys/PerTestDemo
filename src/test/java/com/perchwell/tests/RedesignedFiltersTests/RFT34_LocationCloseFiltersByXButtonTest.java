package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RFT34_LocationCloseFiltersByXButtonTest extends SampleTest {

    @Test
    public void locationCloseFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteManhattan();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteManhattan();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereChanged();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkManhattanIsNotVisible();
        user.atSearchPage.deleteBrooklyn();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteBrooklyn();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
