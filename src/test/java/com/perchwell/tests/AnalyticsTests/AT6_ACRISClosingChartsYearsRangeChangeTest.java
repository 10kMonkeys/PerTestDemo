package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AT6_ACRISClosingChartsYearsRangeChangeTest extends SampleTest {

    @Test
    public void acrisClosingChartsYearsRangeChangeTest() throws Exception{
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.trendsButtonClick();
        user.atAcrisClosingPage.dealVolumeAnnualButtonClick();
        user.atAnalyticsPage.skipHints();
        user.atAnalyticsPage.yearsRangeButtonClick();
        user.atAnalyticsPage.setMinRangeYearDefaultMinusOne();
        user.atAnalyticsPage.setYearsRangeButtonClick();
        user.atAnalyticsPage.isColumnForPreviousMinDefaultYearAdd();
        user.atAnalyticsPage.yearsRangeButtonClick();
        user.atAnalyticsPage.setMaxRangeYearDefaultMinusOne();
        user.atAnalyticsPage.setYearsRangeButtonClick();
        user.atAnalyticsPage.isColumnForNextMaxDefaultYearRemove();
        user.atAnalyticsPage.addButtonClick();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.trendsButtonClick();
        user.atAcrisClosingPage.dealVolumeQuarterlyButtonClick();
        user.atAnalyticsPage.getPreviousYearsInFromTopList();
        user.atAnalyticsPage.isOnlyThreeYearsInChartDisplayed();
        user.atAnalyticsPage.yearsRangeButtonClick();
        user.atAnalyticsPage.setMaxRangeYearDefaultMinusOne();
        user.atAnalyticsPage.setYearsRangeButtonClick();
        user.atAnalyticsPage.getValueYearsRangeButton();
        user.atAnalyticsPage.isYearsRangeChange();
        user.atAnalyticsPage.getPresentYearsInFromTopList();
        user.atAnalyticsPage.isOnChartUpdateYearsFromTop();
    }
}
