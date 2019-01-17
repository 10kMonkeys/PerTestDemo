package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class NFT5_BedroomsMinimumFiltersTest extends SampleTest {

    @Test
    public void bedroomsMinimum() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectStudioBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereNotChanged();
//        user.atPerchwellPage.checkIfThereIsNoListingsWithoutBeds(); //deprecated
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.checkIfStudioBedsFilterIsDeselected();
        user.atSearchPage.selectOneBedMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.ONE_BED_MINIMUM_FILTER);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectTwoBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.TWO_BEDS_MINIMUM_FILTER);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectThreeBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.THREE_BEDS_MINIMUM_FILTER);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectFourBedsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinBeds(Filters.FOUR_BEDS_MINIMUM_FILTER);
    }
}
