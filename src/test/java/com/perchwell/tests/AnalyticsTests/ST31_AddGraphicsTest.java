package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST31_AddGraphicsTest extends SampleTest {

    @Test
    public void addGraphics() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atRebnyListingsPage.addChartFromREBNYSection();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.isAskingPriseChartAdd();
        user.atAnalyticsPage.addButtonClick();
        user.atAcrisClosingPage.addChartFromACRISSection();
        user.atAcrisClosingPage.isDealCountByHeightAdd();
        user.atAnalyticsPage.addButtonClick();
        user.atNycTownhousesPage.addChartFromNYCSection();
        user.atNycTownhousesPage.isGardenChartDisplayed();
        user.atAnalyticsPage.addButtonClick();
        user.atManagementPage.addChartFromManagementSection();
        user.atManagementPage.isDaysOnMarketChartAdd();
        user.atAnalyticsPage.addButtonClick();
        user.atRebnyListingsPage.addBedroomsChartFromREBNYListings();
        user.atAnalyticsPage.addButtonClick();
        user.atAcrisClosingPage.addBuildingTypeByDealCountChartFromACRISCloasing();
        user.atAnalyticsPage.addButtonClick();
        user.atAnalyticsPage.isMessageMaximumSixChartsDisplayed();
    }
}
