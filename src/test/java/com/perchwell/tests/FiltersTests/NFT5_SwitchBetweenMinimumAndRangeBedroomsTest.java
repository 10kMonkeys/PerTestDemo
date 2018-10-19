package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "AdditionalFiltersTest"})
public class NFT5_SwitchBetweenMinimumAndRangeBedroomsTest extends SampleTest {

    @Test
    public void switchBetweenMinimumAndRange() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectOneBedMinimumFilter();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectBedroomsMinimumOption();
        user.atSearchPage.checkNoOneBedsMinimumFilterSelected();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter1Bed();
        user.atSearchPage.selectBedroomsMinimumOption();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.checkNoOneBedsRangeFilterSelected();
        user.atSearchPage.clickOnFilter1Bed();
        user.atSearchPage.selectFilter3Beds();
        user.atSearchPage.selectBedroomsMinimumOption();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.checkNoOneBedsRangeFilterSelected();
    }
}
