package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class NFT21_CustomBoundaryApplyingTest extends SampleTest {
    @Test
    public void customBoundaryApplyingTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.openCustomBoundariesPage();
        user.atCustomBoundaryPage.getPolygonColor();
        user.atCustomBoundaryPage.drawAndSaveLargeSquare();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addMKTShareAskingPriceChart();
        user.atAnalyticsPage.skipHints();
        user.atAnalyticsPage.checkPriceChartIsSameListView();
        user.atPerchwellPage.clickOnMap();
        user.atMapPage.clickOnNotNowButton();
        user.atMapPage.checkResultCountsIsSameAsOnListView(); //TODO no count's value in pin on Map
        user.atMapPage.checkBoundaryHasSameColorAsOnCreationScreen();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.noOneNeighborPillIsShown();
    }
}
