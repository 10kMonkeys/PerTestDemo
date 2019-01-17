package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class NFT12_ResetBathroomsFiltersTest extends SampleTest {

    @Test
    public void resetBathroomsFilters() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectTwoBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.check2BathsMinFilterSelected();
        user.atSearchPage.singleUpSwipeForAndroid();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOneBathsMinimumFilterSelected();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.check2BathsRangeFilterSelected();
        user.atSearchPage.singleUpSwipeForAndroid();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.selectFilter3Baths();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkMultiBathroomsFiltersSelected1To3();
        user.atSearchPage.singleUpSwipeForAndroid();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.checkNoOneBathsRangeFilterSelected();
    }
}
