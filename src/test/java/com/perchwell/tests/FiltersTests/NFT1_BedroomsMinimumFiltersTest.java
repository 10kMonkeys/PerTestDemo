package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "AdditionalFiltersTest"})
public class NFT1_BedroomsMinimumFiltersTest extends SampleTest {

    @Test
    public void bedroomsMinimum() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectStudioBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereNotChanged();
//        user.atPerchwellPage.checkIfThereIsNoListingsWithoutBeds(); //deprecated
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkIfStudioBedsFilterIsDeselected();
        user.atSearchPage.selectOneBedMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.ONE_BED_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectTwoBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.TWO_BEDS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectThreeBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.THREE_BEDS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectFourBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.FOUR_BEDS_MINIMUM_FILTER);
    }
}
