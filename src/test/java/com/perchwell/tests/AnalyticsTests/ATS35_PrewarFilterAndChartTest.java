package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

public class ATS35_PrewarFilterAndChartTest extends SampleTest {

    @Ignore
    @Test
    public void prewarFilterAndChartTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectPrewarFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();

        user.atAnalyticsPage.selectREBNYListingsSection();
        user.atRebnyListingsPage.addMKTSharePrewarSpaceChart();
        user.atAnalyticsPage.skipHints();
        //        checkOnlyOnlyOneValueInDonutIsShown(); //TODO

        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addFeaturesPrewarChart();
        //        checkOnlyOnlyOneColumnPrewarIsShown(); //TODO
    }
}
