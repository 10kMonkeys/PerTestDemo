package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond"})
public class PT26_ResetPropertiesTest extends SampleTest {

    @Test
    public void resetProperties() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.checkNoOnePropertyIsSelectedInRentals();
    }
}
