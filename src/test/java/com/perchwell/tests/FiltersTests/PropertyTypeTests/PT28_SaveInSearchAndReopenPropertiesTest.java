package com.perchwell.tests.FiltersTests.PropertyTypeTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class PT28_SaveInSearchAndReopenPropertiesTest extends SampleTest {

    @Test
    public void saveInSearchAndReopenProperties(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.saveCurrentFirstSearch();
        user.inSearchMenu.openSavedSearchesWithCrossButton();
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSearchPageWithCrossButton();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.saveCurrentSecondSearch();
        user.inSearchMenu.openSavedSearchesWithCrossButton();
        user.atSearchPage.clickOnPreviouslyCreatedFirstSearch();
        user.inSearchMenu.openSearchPageWithCrossButton();
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkCondoFilterIsSelectedInSalesProperty();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.clickOnPreviouslyCreatedSecondSearch();
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkCondoFilterIsSelectedInRentalsProperty();
    }
}
