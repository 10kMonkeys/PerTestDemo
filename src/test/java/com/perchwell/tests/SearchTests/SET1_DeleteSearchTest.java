package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SearchTests", "FiltersSearchesMapView"})
public class SET1_DeleteSearchTest extends SampleTest {

    @Test
    public void deleteSearch() throws Exception {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.swipeCreatedSearch();
        user.atSearchPage.clickOnDeleteSearchButton();
        user.atSearchPage.shouldDeleteSearch();
    }
}
