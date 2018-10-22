package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "AdditionalFiltersTest"})
public class NFT8_ResetBathroomsFiltersTest extends SampleTest {

    @Test
    public void resetBathroomsFilters() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectTwoBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.check2BathsMinFilterSelected();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOneBathsMinimumFilterSelected();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.check2BathsRangeFilterSelected();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.selectFilter4PlusBaths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkMultiBathroomsFiltersSelected();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.checkNoOneBathsRangeFilterSelected();
    }
}
