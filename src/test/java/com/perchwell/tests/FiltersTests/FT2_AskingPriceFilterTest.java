package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesMapView"})
public class FT2_AskingPriceFilterTest extends SampleTest {

    @Test
    public void resultAfterAskingPriceFilter() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
       user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.setMinimumPriceFilter("400000"); //100 000 / 1 000 000 old
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.shouldSeeListingsEqualOrMoreMinPrice();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.eraseMinValueOfPriceFilter();
        user.atSearchPage.setMaximumPriceFilter("600000"); //1 100 000
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.shouldSeeListingsEqualOrLessMaxPrice();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.eraseMaxValueOfPriceFilter();
        user.atSearchPage.setMinimumPriceFilter("900000");
        user.atSearchPage.setMaximumPriceFilter("1200000");
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.shouldSeeListingsBetweenMinAndMaxPrices();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkNoOnePriceFilterSelected();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.shouldSeeListingsBetweenMinAndMaxPrices();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOnePriceFilterSelected();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
