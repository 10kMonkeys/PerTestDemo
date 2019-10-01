package com.perchwell.steps.analytics;

import com.perchwell.crossPlatform.Config;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.analytics.AnalyticsPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AnalyticsSteps extends ScenarioSteps {
	AnalyticsPage onPage;
	PerchwellPage perchwellPage;

	@Step
	public void clickMyEmailOption() {
		onPage.clickMyEmailOption();
	}

	@Step("Create report with name {0}")
	public void createReportWithNameAndSave(String report_name) {
		this.setReportName(report_name);
		this.clickSaveButton();
	}

	@Step
	public void clickReportSentOkButton() {
		onPage.clickReportSentOkButton();
	}

	private void clickSaveButton() {
		onPage.clickSaveButton();
	}

	private void setReportName(String reportName) {
		//onPage.addValueInSessionVariable("Report name",reportName);
		onPage.setAndSaveReportName(reportName);
	}

	@Step
	public void shouldFindSentEmail() {
		Boolean result = onPage.shouldFindSentEmail(SessionVariables.getValueFromSessionVariable("Report_name"));
		if (!result) {
			result = onPage.shouldFindSentEmail(SessionVariables.getValueFromSessionVariable("Report_name"));
		}
		Assert.assertTrue(result);
	}

	@Step
	public void shareButtonClick() {
		onPage.shareButtonClick();
	}

	@Step
	public void holdCharts() {
		onPage.holdCharts();
	}

	@Step
	public void deleteChart() {
		onPage.deleteChart();
	}

	@Step
	public void isAddIconDisplayed() {
		Assert.assertTrue(onPage.isAddIconDisplayed());
	}

	@Step
	public void addButtonClick() {
		onPage.addButtonClick();
	}

	@Step
	public void skipHints() {
		onPage.skipHints();
	}

	@Step
	public void isMessageMaximumSixChartsDisplayed() {
		Assert.assertTrue(onPage.isMessageMaximumSixChartsDisplayed());
	}

	@Step
	public void isDomByPriceCartAdd() {
		Assert.assertTrue(onPage.isDomByPriceCartAdd());
	}

	@Step
	public void okButtonClick() {
		onPage.okButtonClick();
	}

	@Step
	public void doneMovingCharts() {
		onPage.doneMovingChartsButtonClick();
	}

	@Step
	public void isThisIsAProOnlyFeatureMessageShow() {
		onPage.isThisIsAProOnlyFeatureMessageShow();
	}

	@Step
	public void rebnyListingsButtonClick(){
		onPage.rebnyListingsButtonClick();
	}

	@Step
	public void upToOneMillionButtonClick() {
		onPage.upToOneMillionButtonClick();
	}

	@Step
	public void selectFirstBuildingInList() {
		onPage.selectFirstBuildingInList();
	}

	@Step
	public void selectSecondBuildingInList() {
		onPage.selectSecondBuildingInList();
	}

	@Step
	public void clickMyNewSearch() {
		if(Config.isAndroid()) {
			onPage.clickMyNewSearch();
		}
	}

	@Step
	public void shouldSeeDomByPrice2ChartWithSwipe() {
		Assert.assertTrue(onPage.isDomByPrice2DisplayedWithSwipe());
		this.isChartDisplayed();
	}

	@Step
	public void getBedroomsChartValue(){
		SessionVariables.addValueInSessionVariable("BedroomsChartValue",onPage.getValueBedroomsChart());
	}

	@Step
	public void getAskingPriceChartValue(){
		SessionVariables.addValueInSessionVariable("AskingPriceChartValue",onPage.getValueAskingPriceChart());
	}

	@Step
	public void isBedroomsChartChange(){
		Assert.assertFalse(onPage.getValueBedroomsChart()
				.contains(SessionVariables.getValueFromSessionVariable("BedroomsChartValue")));
	}

	@Step
	public void isAskingPriceChartChange() {
		Assert.assertFalse(onPage.getValueAskingPriceChart()
				.contains(SessionVariables.getValueFromSessionVariable("AskingPriceChartValue")));
	}

	public void clickSendButton() {
		onPage.clickSendButton();
	}

	@Step
	public void shouldFindPDFSummaryEmail() {
		Assert.assertTrue(onPage.shouldFindPDFSummaryEmail());
	}

	@Step
	public void upTo12MillionButtonClick() {
		onPage.upTo12MillionButtonClick();
	}

	@Step
	public void locationButtonClick(){
		onPage.locationButtonClick();
	}

	@Step
	public void medianButtonClick(){
		onPage.medianButtonClick();
	}

	@Step
	public void mktShareButtonClick(){
		onPage.mktShareButtonClick();
	}

	@Step
	public void selectNYCTownhousesSection(){
		onPage.nycTownhousesButtonClick();
	}

	@Step
	public void featureButtonClick(){
		onPage.featuresButtonClick();
	}

	@Step
	public void selectManagementSection(){
		onPage.managementButtonClick();
	}

	@Step
	public void distributionButtonClick(){
		onPage.distributionButtonClick();
	}

	@Step
	public void trendsButtonClick(){
		onPage.trendsButtonClick();
	}

	@Step
	public void selectACRISClosingSection(){
		onPage.acrisClosingsButtonClick();
	}

	@Step
	public void setMinRangeYearDefaultMinusOne(){
		if (Config.isAndroid()) {
			onPage.setMinValueYear(SessionVariables.getValueFromSessionVariable("MinRangeYear"));
		} else {
			SessionVariables.addValueInSessionVariable("MinRangeYear",String.valueOf(Integer.parseInt(onPage.getDefaultMinValueYear()) - 1));
			onPage.setMinValueYear(SessionVariables.getValueFromSessionVariable("MinRangeYear"));
		}
	}

	@Step
	public void setMaxRangeYearDefaultMinusOne(){
		onPage.getDefaultMaxValueYear();
		onPage.setMaxValueYears(SessionVariables.getValueFromSessionVariable("MaxRangeYear"));
	}

	@Step
	public void yearsRangeButtonClick(){
		onPage.yearsRangeButtonClick();
	}

	@Step
	public void setYearsRangeButtonClick(){
		onPage.setRangeButtonClick();
	}

	@Step
	public void isColumnForPreviousMinDefaultYearAdd() {
		onPage.isColumnForPreviousMinDefaultYearAdd(SessionVariables.getValueFromSessionVariable("MinRangeYear"));
	}

	@Step
	public void isColumnForNextMaxDefaultYearRemove() {
		onPage.isColumnForNextMaxDefaultYearRemove();
	}

	@Step
	public void isOnlyThreeYearsInChartDisplayed(){
		Assert.assertTrue(onPage.isOnlyThreeYearsDisplayed());
	}

	@Step
	public void getValueYearsRangeButton() {
		SessionVariables.addValueInSessionVariable("RangeButton",onPage.yearsRangeButtonValue());
	}

	@Step
	public void isYearsRangeChange() {
		Assert.assertTrue(onPage.isYearsRangeChange(SessionVariables.getValueFromSessionVariable("RangeButton"), SessionVariables.getValueFromSessionVariable("MaxRangeYear")));
	}

	@Step
	public void isOnChartUpdateYearsFromTop(){
		Assert.assertTrue(onPage.isOnChartUpdateYearsFromTop());
	}

	@Step
	public void getPresentYearsInFromTopList(){
		onPage.getPresentYearsInFromTopList();
	}

	@Step
	public void getPreviousYearsInFromTopList(){
		onPage.getPreviousYearsInFromTopList();
	}

	@Step
	public void clickClientEmailOption() {
		onPage.clickClientEmailOption();
	}

	@Step
	public void setClientAddress() {
		onPage.setClientAddress(AppProperties.INSTANCE.getProperty("client_email"));
		this.clickSaveButton();
	}

	@Step
	public void selectREBNYListingsWithMKTShare() {
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.mktShareButtonClick();
	}

	@Step
	public void selectREBNYListingsWithDistribution() {
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.distributionButtonClick();
	}

	private void isChartDisplayed(){
		onPage.isChartDisplayed();
	}

	@Step
	public void clickOnMagnifierIconWithPreviouslySavedSearch() {
		if(Config.isAndroid()) {
			onPage.clickOnMagnifierIconWithPreviouslySavedSearch();
		}
	}

	@Step
	public void selectREBNYListingsWithMedian() {
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.medianButtonClick();
	}

    @Step
    public void selectREBNYListingsWithFeatures() {
        onPage.addButtonClick();
        onPage.rebnyListingsButtonClick();
        onPage.featuresButtonClick();
    }

	@Step
	public void selectACRISClosingWithDistribution() {
		onPage.addButtonClick();
		onPage.acrisClosingsButtonClick();
		onPage.distributionButtonClick();
	}

	@Step
	public void selectACRISClosingWithLocation() {
		onPage.addButtonClick();
		onPage.acrisClosingsButtonClick();
		onPage.locationButtonClick();
	}

	@Step
	public void selectACRISClosingWithMedian() {
		onPage.addButtonClick();
		onPage.acrisClosingsButtonClick();
		onPage.medianButtonClick();
	}

	@Step
	public void selectACRISClosingWithTrends() {
		onPage.addButtonClick();
		onPage.acrisClosingsButtonClick();
		onPage.trendsButtonClick();
	}

	@Step
	public void selectREBNYListingsSection() {
		onPage.REBNYListingsButtonClick();
	}

	@Step
	public void selectREBNYListingsWithLocation() {
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.locationButtonClick();
	}

	@Step
	public void selectNYTownhousesWithFeatures() {
		onPage.addButtonClick();
		onPage.nycTownhousesButtonClick();
		onPage.featuresButtonClick();
	}

	@Step
	public void selectManagementWithDistribution() {
		onPage.addButtonClick();
		onPage.managementButtonClick();
		onPage.distributionButtonClick();
	}

	@Step
    public void selectNYTownhousesWithLocation() {
		onPage.addButtonClick();
		onPage.nycTownhousesButtonClick();
		onPage.locationButtonClick();
    }

    @Step
	public void checkDefaultChartYearsRange() {
		onPage.checkDefaultChartYearsRange();
	}

	@Step
	public void clickOnResetButton() {
		onPage.clickOnResetButton();
	}

	@Step
	public void checkResetBeginningAndEndingYears() {
		onPage.checkResetBeginningYear();
		onPage.checkResetEndingYear();
	}

	@Step
	public void selectNYTownhousesWithDistribution() {
		onPage.addButtonClick();
		onPage.nycTownhousesButtonClick();
		onPage.distributionButtonClick();
	}

	@Step
	public void selectNYTownhousesWithMKTShare() {
		onPage.addButtonClick();
		onPage.nycTownhousesButtonClick();
		onPage.mktShareButtonClick();
	}

	@Step
	public void selectNYTownhousesWithMedian() {
		onPage.addButtonClick();
		onPage.nycTownhousesButtonClick();
		onPage.medianButtonClick();
	}

	@Step
	public void selectManagementWithMKTShare(){
		onPage.addButtonClick();
		onPage.managementButtonClick();
		onPage.mktShareButtonClick();
	}

	@Step
	public void clickOnLegend12PlusMillionButton() {
		onPage.clickOnLegend12PlusMillionButton();
	}

	@Step
	public void getMessageIdOfLastReportDetailEmail() {
		onPage.getMessageIdOfLastReportDetailEmail();
	}

	@Step
	public void selectACRISClosingSectionWithMKTShare() {
		onPage.addButtonClick();
		onPage.acrisClosingsButtonClick();
	}

	@Step
	public void shareButtonInChartClick() {
		onPage.shareButtonInChartClick();
	}

	@Step
	public void checkPriceChartIsSameListView() {
		onPage.checkPriceChartIsSameListView();
	}

	@Step
	public void checkOnlyOnlyOneValueInDonutIsShown() {
//		onPage.checkOnlyOnlyOneValueInDonutIsShown();
	}
}
