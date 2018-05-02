package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST31_AddGraphicsTest extends SampleTest {

    @Test
    public void addGraphics() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOnAnalytics();
        rebnyListingsSteps.addChartFromREBNYSection();
        analyticsSteps.skipHints();
        rebnyListingsSteps.isAskingPriseChartAdd();
        analyticsSteps.addButtonClick();
        acrisClosingSteps.addChartFromACRISSection();
        acrisClosingSteps.isDealCountByHeightAdd();
        analyticsSteps.addButtonClick();
        nycTownhousesSteps.addChartFromNYCSection();
        nycTownhousesSteps.isGardenChartDisplayed();
        analyticsSteps.addButtonClick();
        managementSteps.addChartFromManagementSection();
        managementSteps.isDaysOnMarketChartAdd();
        analyticsSteps.addButtonClick();
        rebnyListingsSteps.addBedroomsChartFromREBNYListings();
        analyticsSteps.addButtonClick();
        acrisClosingSteps.addBuildingTypeByDealCountChartFromACRISCloasing();
        analyticsSteps.addButtonClick();
        analyticsSteps.isMessageMaximumSixChartsDisplayed();
    }
}
