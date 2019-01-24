package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class NFT16_SaveSearchAndReopenClosedRangeTest extends SampleTest {

    @Test
    public void saveSearchAndReopenClosedRange() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter1Bed();
        user.atSearchPage.selectFilter3Beds();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.selectFilter3Baths();
        user.atSearchPage.saveCurrentSearch();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkMultiBedroomsFiltersSelectedFrom1To3();
        user.atSearchPage.checkMultiBathroomsFiltersSelected1To3();
    }
}
