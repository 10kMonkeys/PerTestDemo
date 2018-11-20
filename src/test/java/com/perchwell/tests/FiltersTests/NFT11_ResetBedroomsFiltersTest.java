package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond"})
public class NFT11_ResetBedroomsFiltersTest extends SampleTest {

    @Test
    public void resetBedroomsFilters() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectTwoBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.check2BedsMinFilterSelected();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOneBedsMinimumFilterSelected();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.check2BedsRangeFilterSelected();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter1Bed();
        user.atSearchPage.selectFilter3Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkMultiBedroomsFiltersSelectedFrom1To3();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.checkNoOneBedsRangeFilterSelected();
    }
}