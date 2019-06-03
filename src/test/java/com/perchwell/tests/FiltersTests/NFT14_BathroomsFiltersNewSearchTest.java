package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesSecond"})
public class NFT14_BathroomsFiltersNewSearchTest extends SampleTest {

    @Test
    public void bathroomsFiltersNewSearch() {
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
        user.atSearchPage.checkBathroomsRangeButtonIsNotSelected();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.checkNoOneBathsRangeFilterSelected();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.selectFilter3Baths();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkMultiBathroomsFiltersSelected1To3();
        user.atSearchPage.singleUpSwipeForAndroid();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkBathroomsRangeButtonIsNotSelected();
        user.atSearchPage.checkNoOneBathsMinimumFilterSelected();
    }
}
