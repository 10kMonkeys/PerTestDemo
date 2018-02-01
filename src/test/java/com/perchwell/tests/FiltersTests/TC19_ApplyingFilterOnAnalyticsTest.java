package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TC19_ApplyingFilterOnAnalyticsTest extends SampleTest {

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
        searchSteps.setMinimumPriceFilter();
        searchSteps.setFilterForStudioBeds();
        searchSteps.clickApplyButton();
        perchPopupSteps.clickNotNowButton();
        analyticsSteps.isBedroomsChartChange();
        analyticsSteps.isAskingPriceChartChange();

    }
}
