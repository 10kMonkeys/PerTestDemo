package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SearchTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch"})
public class SET1_DeleteSearchTest extends SampleTest {

    @Test
    public void deleteSearch() throws Exception {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch();  //search old
        user.atSearchPage.clickOnMySavedSearches();  //search old
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.swipeCreatedSearch();
        user.atSearchPage.clickOnDeleteSearchButton();
        user.atSearchPage.shouldDeleteSearch();
    }
}
