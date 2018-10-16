package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

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
        user.atPerchwellPage.checkIfListingsWereChanged();
        user.atPerchwellPage.verifyThatThereIsNoListingsWithoutBeds();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkIfStudioBedsFilterIsDeselected();
        user.atSearchPage.selectOneBedMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBeds(Filters.ONE_BED_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectTwoBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBeds(Filters.TWO_BEDS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectThreeBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBeds(Filters.THREE_BEDS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectFourBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBeds(Filters.FOUR_BEDS_MINIMUM_FILTER);
    }
}
