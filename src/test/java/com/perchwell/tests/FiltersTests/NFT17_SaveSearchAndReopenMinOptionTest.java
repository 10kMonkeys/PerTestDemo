package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond", "Local_Android_Run"})
public class NFT17_SaveSearchAndReopenMinOptionTest extends SampleTest {

    @Test
    public void saveSearchAndReopenMinOption() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectTwoBedsMinimumFilter();
        user.atSearchPage.selectTwoBathsMinimumFilter();
        user.atSearchPage.saveCurrentSearch();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.check2BedsMinFilterSelected();
        user.atSearchPage.check2BathsMinFilterSelected();
    }
}
