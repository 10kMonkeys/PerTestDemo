package com.perchwell.steps.analytics;

import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.analytics.AnalyticsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AnalyticsSteps extends ScenarioSteps {
	AnalyticsPage onPage;

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
		Boolean result = onPage.shouldFindSentEmail(SessionVariables.getValueFromSessionVariable("Report name"));
		if (!result) {
			result = onPage.shouldFindSentEmail(SessionVariables.getValueFromSessionVariable("Report name"));
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
		Assert.assertTrue(onPage.isThisIsAProOnlyFeatureMessageShow());
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
		onPage.clickMyNewSearch();
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
		onPage.nycTownHousesButtonClick();
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
		SessionVariables.addValueInSessionVariable("MinRangeYear",String.valueOf(Integer.parseInt(onPage.getDefaultMinValueYear()) - 1));
		onPage.setMinValueYear(SessionVariables.getValueFromSessionVariable("MinRangeYear"));
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
	public void isColumnForPreviousMinDefaultYearAdd(){
		Assert.assertTrue(onPage.isColumnForPreviousMinDefaultYearAdd(SessionVariables.getValueFromSessionVariable("MinRangeYear")));
	}

	@Step
	public void isColumnForNextMaxDefaultYearRemove(){
		Assert.assertTrue(onPage.isColumnForNextMaxDefaultYearRemove(SessionVariables.getValueFromSessionVariable("MaxDefaultRangeYear")));
	}

	@Step
	public void isOnlyThreeYearsInChartDisplayed(){
		Assert.assertTrue(onPage.isOnlyThreeYearsDisplayed());
	}

	@Step
	public void getValueYearsRangeButton(){
		SessionVariables.addValueInSessionVariable("RangeButton",onPage.yearsRangeButtonValue());
	}

	@Step
	public void isYearsRangeChange(){
		Assert.assertTrue(onPage.isYearsRangeChange(SessionVariables.getValueFromSessionVariable("RangeButton"),SessionVariables.getValueFromSessionVariable("MaxRangeYear")));
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
	public void selectREBNYListingsWithMKTShare(){
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.mktShareButtonClick();
	}

	@Step
	public void selectREBNYListingsWithDistribution(){
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.distributionButtonClick();
	}

	private void isChartDisplayed(){
		onPage.isChartDisplayed();
	}

	@Step
	public void clickOnMagnifierIconWithPreviouslySavedSearch() {
		onPage.clickOnMagnifierIconWithPreviouslySavedSearch();
	}

	@Step
	public void selectREBNYListingsWithMedian(){
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.medianButtonClick();
	}

    @Step
    public void selectREBNYListingsWithFeatures(){
        onPage.addButtonClick();
        onPage.rebnyListingsButtonClick();
        onPage.featuresButtonClick();
    }

	@Step
	public void selectACRISClosingWithDistribution(){
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
}
