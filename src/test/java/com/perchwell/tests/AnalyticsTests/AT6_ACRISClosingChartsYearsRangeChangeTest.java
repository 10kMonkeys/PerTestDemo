package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AT6_ACRISClosingChartsYearsRangeChangeTest extends SampleTest {

    @Test
    public void acrisClosingChartsYearsRangeChangeTest() throws Exception{
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOnAnalytics();
        analyticsSteps.selectACRISClosingSection();
        analyticsSteps.trendsButtonClick();
        acrisClosingSteps.dealVolumeAnnualButtonClick();
        analyticsSteps.skipHints();
        analyticsSteps.yearsRangeButtonClick();
        analyticsSteps.setMinRangeYearDefaultMinusOne();
        analyticsSteps.setYearsRangeButtonClick();
        analyticsSteps.isColumnForPreviousMinDefaultYearAdd();
        analyticsSteps.yearsRangeButtonClick();
        analyticsSteps.setMaxRangeYearDefaultMinusOne();
        analyticsSteps.setYearsRangeButtonClick();
        analyticsSteps.isColumnForNextMaxDefaultYearRemove();
        analyticsSteps.addButtonClick();
        analyticsSteps.selectACRISClosingSection();
        analyticsSteps.trendsButtonClick();
        acrisClosingSteps.dealVolumeQuarterlyButtonClick();
        analyticsSteps.getPreviousYearsInFromTopList();
        analyticsSteps.isOnlyThreeYearsInChartDisplayed();
        analyticsSteps.yearsRangeButtonClick();
        analyticsSteps.setMaxRangeYearDefaultMinusOne();
        analyticsSteps.setYearsRangeButtonClick();
        analyticsSteps.getValueYearsRangeButton();
        analyticsSteps.isYearsRangeChange();
        analyticsSteps.getPresentYearsInFromTopList();
        analyticsSteps.isOnChartUpdateYearsFromTop();
    }
}
