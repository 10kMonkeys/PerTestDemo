package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class NFT5_BathroomsMinimumFiltersTest extends SampleTest {

    @Test
    public void bathroomsMinimumFilters() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectOneBathMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereChanged();
        user.atPerchwellPage.checkIfThereIsNoListingsWithoutBaths(); //deprecated
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkIfOneBathMinimumFilterIsDeselected();
        user.atSearchPage.selectOneAndHalfBathroomsFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBaths(Filters.ONE_AND_HALF_BATHS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectTwoBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBaths(Filters.TWO_BATHS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectThreeBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBaths(Filters.THREE_BATHS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectFourBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBaths(Filters.FOUR_BATHS_MINIMUM_FILTER);
    }
}
