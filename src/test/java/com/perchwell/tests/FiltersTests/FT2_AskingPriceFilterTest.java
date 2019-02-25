package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class FT2_AskingPriceFilterTest extends SampleTest {

    @Test
    public void resultAfterAskingPriceFilter() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinimumPriceFilter("400000"); //100 000 / 1 000 000 old
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.shouldSeeListingsEqualOrMoreMinPrice();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter(); //temp solution instead clear
//        user.atSearchPage.eraseMinValueOfPriceFilter(); //temp comment
        user.atSearchPage.setMaximumPriceFilter("600000"); //1 100 000
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.shouldSeeListingsEqualOrLessMaxPrice();
        user.inSearchMenu.openSearchPage();
//        user.atSearchPage.eraseMaxValueOfPriceFilter(); //temp comment
        user.atSearchPage.clickOnResetFilter(); //temp solution instead clear
        user.atSearchPage.setMinimumPriceFilter("900000");
        user.atSearchPage.setMaximumPriceFilter("1200000");
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.shouldSeeListingsBetweenMinAndMaxPrices();
        user.atSearchPage.saveCurrentSearch();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkNoOnePriceFilterSelected();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.shouldSeeListingsBetweenMinAndMaxPrices();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOnePriceFilterSelected();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
