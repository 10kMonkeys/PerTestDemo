package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "AdditionalFiltersTest"})
public class NFT12_SaveSearchAndReopenClosedRangeTest extends SampleTest {

    @Test
    public void saveSearchAndReopenClosedRange() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.selectFilter4PlusBeds();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.selectFilter4PlusBaths();
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkMultiBedroomsFiltersSelected();
        user.atSearchPage.checkMultiBathroomsFiltersSelected();
    }
}
