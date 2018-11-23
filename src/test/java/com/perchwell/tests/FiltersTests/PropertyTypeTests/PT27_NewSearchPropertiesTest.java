package com.perchwell.tests.FiltersTests.PropertyTypeTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;
import org.junit.jupiter.api.Tags;

public class PT27_NewSearchPropertiesTest extends SampleTest {

    @Test
    public void newSearchProperties() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();  //search new
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.checkNoOnePropertyIsSelectedInRentals();
    }
}
