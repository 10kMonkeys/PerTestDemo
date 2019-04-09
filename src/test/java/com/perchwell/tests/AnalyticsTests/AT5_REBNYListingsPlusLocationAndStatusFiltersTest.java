package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "Analytics", "iOS_Analytics", "Android_Analytics"})
public class AT5_REBNYListingsPlusLocationAndStatusFiltersTest extends SampleTest {

    @Test
    public void rebnyListingsPlusLocationAndStatusFiltersTest () throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atRebnyListingsPage.addMKTShareAskingPriceChart();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeeMKTShareAskingPriseChart();
        user.atRebnyListingsPage.getMKTShareAskingPriceListingsAmount();
        user.atAnalyticsPage.selectREBNYListingsWithLocation();
        user.atRebnyListingsPage.addAndVerifyLocationAskingPriceChart();
        user.atRebnyListingsPage.getLocationAskingPriceListingsLocations();
        user.inSearchMenu.openSearchPage();
//        user.atSearchPage.removeBrooklynFromFilter(); not uncomment
        user.atSearchPage.removeManhattanFromFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atRebnyListingsPage.checkMKTShareAskingPriceListingsAmountAfterFilterChanging();
        user.atRebnyListingsPage.checkLocationAskingPriceListingsLocationsAfterFilterChanging();
        user.inSearchMenu.openSearchPage(); // new search
        user.atSearchPage.deselectActiveFilter();
        user.atSearchPage.selectContractFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atRebnyListingsPage.checkMKTShareAskingPriceListingsAmountAfterFilterChanging();
        user.atRebnyListingsPage.checkLocationAskingPriceListingsLocationsAfterFilterChanging();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atRebnyListingsPage.checkMKTShareAskingPriceListingsAmountAfterResetFilters();
        user.atRebnyListingsPage.checkLocationAskingPriceListingsLocationsAfterResetFilters();
    }
}
