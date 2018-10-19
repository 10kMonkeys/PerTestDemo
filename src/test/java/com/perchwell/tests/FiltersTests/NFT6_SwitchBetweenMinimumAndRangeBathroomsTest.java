package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "AdditionalFiltersTest"})
public class NFT6_SwitchBetweenMinimumAndRangeBathroomsTest extends SampleTest {

    @Test
    public void switchBetweenMinimumAndRangeBathrooms() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectOneBathMinimumFilter();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectBathroomsMinimumOption();
        user.atSearchPage.checkNoOneBathsMinimumFilterSelected();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.selectBathroomsMinimumOption();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.checkNoOneBathsRangeFilterSelected();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.selectFilter3Baths();
        user.atSearchPage.selectBathroomsMinimumOption();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.checkNoOneBathsRangeFilterSelected();
    }
}
