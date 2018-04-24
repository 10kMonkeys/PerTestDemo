package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.ACRISClosingPage;
import com.perchwell.pages.analytics.AnalyticsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ACRISClosingSteps extends ScenarioSteps {

    ACRISClosingPage acrisClosingPage;
    AnalyticsPage analyticsPage;

    @Step
    public void addBuildingTypeByDealCountChartFromACRISCloasing(){
        analyticsPage.acrisClosingsButtonClick();
        acrisClosingPage.buildingTypeByDealCountButtonClick();
    }

    @Step
    public void dealVolumeAnnualButtonClick(){
        acrisClosingPage.dealVolumeAnnualButtonClick();
    }

    @Step
    public void dealVolumeQuarterlyButtonClick(){
        acrisClosingPage.dealVolumeQuarterlyButtonClick();
    }

    @Step
    public void addChartFromACRISSection() {
        analyticsPage.acrisClosingsButtonClick();
        acrisClosingPage.dealCountByHeightButtonClick();
    }

    @Step
    public void addBuildingTypeByDealCountChart(){
        acrisClosingPage.buildingTypeByDealCountButtonClick();
    }

    @Step
    public void isDealCountByHeightAdd() {
        acrisClosingPage.isDealCountByHeightChartAdd();
        this.isChartDisplayed();
    }

    public void isChartDisplayed(){
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void isDealCountByTypeDeleted() {
        Assert.assertFalse(acrisClosingPage.isDealCountByTypeDisplayed());
    }

    @Step
    public void shouldSeeBuildingHeightChartWithSwipe() {
        acrisClosingPage.shouldBuildingHeightChartDisplayedWithSwipe();
        this.isChartDisplayed();
    }

    @Step
    public void shouldBuildingTypeChartDisplayed() {
        acrisClosingPage.shouldBuildingTypeByDealCountDisplayed();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceByDealCountChart(){
        acrisClosingPage.addAndVerifyPriceByDealCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addDollarPerFTPercentilesChart(){
        acrisClosingPage.addDollarPerFTPercentilesChart();
    }

    @Step
    public void shouldSeeDollarPerFTPercentiles(){
        acrisClosingPage.shouldSeeDollarPerFTPercentiles();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPricePercentilesChart(){
        acrisClosingPage.addAndVerifyPricePercentilesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceByPriceSegmentChart(){
        acrisClosingPage.addAndVerifyPriceByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifySquareFeetPercentiles(){
        acrisClosingPage.addAndVerifySquareFeetPercentiles();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceByTypeChart(){
        acrisClosingPage.addAndVerifyPriceByTypeChart();
        this.isChartDisplayed();
    }

}
