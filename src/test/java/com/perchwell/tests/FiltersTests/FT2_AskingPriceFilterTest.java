package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests"})
public class FT2_AskingPriceFilterTest extends SampleTest {

    @Test
    public void resultAfterAskingPriceFilter() {
        loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_test_email"),
                AppProperties.INSTANCE.getProperty("client_test_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.isListingsQuantity();
        perchwellSteps.clickMyNewSearch();
        searchSteps.setMinimumPriceFilter("100000");
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListingsEqualOrMoreMinPrice();
        perchwellSteps.clickMyNewSearch();
        searchSteps.eraseMinValueOfPriceFilter();
        searchSteps.setMaximumPriceFilter("1100000");
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListingsEqualOrLessMaxPrice();
        perchwellSteps.clickMyNewSearch();
        searchSteps.setMinimumPriceFilter("900000");
        searchSteps.setMaximumPriceFilter("1200000");
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListingsBetweenMinAndMaxPrices();
        perchwellSteps.clickMyNewSearch();
        searchSteps.saveCurrentSearch();
        perchwellSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        perchwellSteps.checkListingsQuantity();
        perchwellSteps.clickMyNewSearch();
        searchSteps.checkNoOnePriceFilterSelected();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.clickPreviouslyCreatedSearch();
        perchwellSteps.shouldSeeListingsBetweenMinAndMaxPrices();
        perchwellSteps.clickMyNewSearch();
        searchSteps.clickResetFilter();
        searchSteps.checkNoOnePriceFilterSelected();
        searchSteps.clickApplyButton();
        perchwellSteps.checkListingsQuantity();
    }
}
