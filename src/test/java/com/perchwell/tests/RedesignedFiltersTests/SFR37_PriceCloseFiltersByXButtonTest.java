package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR37_PriceCloseFiltersByXButtonTest extends SampleTest {

    @Test
    public void priceCloseFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinimumPriceFilter("1000");
        user.atSearchPage.setMaximumPriceFilter("2000");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinimumPriceFilter("1000");
        user.atSearchPage.setMaximumPriceFilter("2000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereChanged();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkPriceChangesShown();
        user.atSearchPage.clearMinimumAndMaximumPriceFilters();
        user.atSearchPage.setMinimumPriceFilter("100000");
        user.atSearchPage.setMaximumPriceFilter("500000");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clearMinimumAndMaximumPriceFilters();
        user.atSearchPage.setMinimumPriceFilter("100000");
        user.atSearchPage.setMaximumPriceFilter("500000");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
