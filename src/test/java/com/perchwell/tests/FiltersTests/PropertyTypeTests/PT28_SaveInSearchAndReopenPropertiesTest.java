package com.perchwell.tests.FiltersTests.PropertyTypeTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesThird", "iOS_FiltersSearchesThird", "Android_FiltersSearchesThird"})
public class PT28_SaveInSearchAndReopenPropertiesTest extends SampleTest {

    @Test
    public void saveInSearchAndReopenProperties(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();  //search new
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.saveCurrentFirstSearch();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.saveCurrentSecondSearch();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.clickOnPreviouslyCreatedFirstSearch();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkCondoFilterIsSelectedInSalesProperty();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.clickOnPreviouslyCreatedSecondSearch();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkCondoFilterIsSelectedInRentalsProperty();
    }
}
