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
        user.atAnalyticsPage.getBedroomsChartValue();
        user.atAnalyticsPage.getAskingPriceChartValue();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilterStudioBeds();
        user.atSearchPage.setMinimumPriceFilter("300000");
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atAnalyticsPage.isBedroomsChartChange();
        user.atAnalyticsPage.isAskingPriceChartChange();
    }
}
