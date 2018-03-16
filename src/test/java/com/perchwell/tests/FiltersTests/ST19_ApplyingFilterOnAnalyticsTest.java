package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST19_ApplyingFilterOnAnalyticsTest extends SampleTest {

    @Test
    public void applyingFilterOnAnalyticsTest() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.addChartFromREBNYSection();
        analyticsSteps.skipHints();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartBedroomsFromManagementSection();
        analyticsSteps.getBedroomsChartValue();
        analyticsSteps.getAskingPriceChartValue();
        analyticsSteps.clickMyNewSearch();
        searchSteps.setMinimumPriceFilter("600000");
        searchSteps.setFilterForStudioBeds();
        searchSteps.clickApplyButton();
        analyticsSteps.isBedroomsChartChange();
        analyticsSteps.isAskingPriceChartChange();
    }
}
