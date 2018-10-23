package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST19_ApplyingFilterOnAnalyticsTest extends SampleTest {

    @Test
    public void applyingFilterOnAnalyticsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atRebnyListingsPage.addChartFromREBNYSection();
        user.atAnalyticsPage.skipHints();
        user.atAnalyticsPage.addButtonClick();
        user.atManagementPage.addChartBedroomsFromManagementSection();
        user.atAnalyticsPage.getBedroomsChartValue(); //// No such element in DOM
        user.atAnalyticsPage.getAskingPriceChartValue(); //// No such element in DOM
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilterStudioBeds();
        user.atSearchPage.setMinimumPriceFilter("600000");
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atAnalyticsPage.isBedroomsChartChange(); //// No such element in DOM
        user.atAnalyticsPage.isAskingPriceChartChange(); //// No such element in DOM
    }
}
