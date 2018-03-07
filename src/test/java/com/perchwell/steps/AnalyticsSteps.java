package com.perchwell.steps;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.perchwell.AnalyticsPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AnalyticsSteps extends ScenarioSteps {
	AnalyticsPage onPage;

	public void clickMyEmailOption() {
		onPage.clickMyEmailOption();
	}

	@Step("Create report with name {0}")
	public void createReportWithNameAndSave(String report_name) {

		this.setReportName(report_name);
		this.clickSaveButton();
		this.clickReportSentOkButton();

	}

	public void clickReportSentOkButton() {
		onPage.clickReportSentOkButton();
	}

	private void clickSaveButton() {
		onPage.clickSaveButton();
	}

	private void setReportName(String reportName) {
		onPage.addValueInSessionVariable("Report name", RandomGenerator.getRandomString(reportName));
		onPage.setReportName(onPage.getValueFromSessionVariable("Report name"));
	}

	@Step
	public void shouldFindSentEmail() {
		Boolean result = onPage.shouldFindSentEmail(onPage.getValueFromSessionVariable("Report name"));
		if (!result) {
			result = onPage.shouldFindSentEmail(onPage.getValueFromSessionVariable("Report name"));
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
	public void addChartFromREBNYSection() {
		onPage.rebnyListingsButtonClick();
		onPage.askingPriceChartClick();
	}

	@Step
	public void addButtonClick() {
		onPage.addButtonClick();
	}

	@Step
	public void addChartFromACRISSection() {
		onPage.acrisClosingsButtonClick();
		onPage.dealCountByHeightButtonClick();
	}

	@Step
	public void addChartFromNYCSection() {
		onPage.nycTownHousesButtonClick();
		onPage.hasGardenButtonClick();
	}

	@Step
	public void addChartBedroomsFromManagementSection(){
		onPage.managementButtonClick();
		onPage.bedroomsButtonClick();
	}

	@Step
	public void addChartFromManagementSection() {
		onPage.managementButtonClick();
		onPage.daysOnMarketButtonClick();
	}

	@Step("Set up the filters: BEDROOMS and BUILDING TYPE (BY DEAL COUNT)")
	public void addTwoCharts() {
		onPage.rebnyListingsButtonClick();
		onPage.bedroomsButtonClick();
		onPage.addButtonClick();
		onPage.acrisClosingsButtonClick();
		onPage.buildingTypeButtonClick();
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
	public void isAskingPriseChartAdd() {
		Assert.assertTrue(onPage.isAskingPriseChartAdd());
	}

	@Step
	public void isBuildingHeightCartAdd() {
		Assert.assertTrue(onPage.isBuildingHeightCartAdd());
	}

	@Step
	public void isDomByPriceCartAdd() {
		Assert.assertTrue(onPage.isDomByPriceCartAdd());
	}

	@Step
	public void isDaysOnMarketAdd() {
		Assert.assertTrue(onPage.isDaysOnMarketAdd());
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
	public void isDealCountByTypeDeleted() {
		Assert.assertFalse(onPage.isDealCountByTypeDisplayed());
	}

	@Step
	public void addAskingPriceChartWithMKTShare() {
		onPage.rebnyListingsButtonClick();
		onPage.mktShareButtonClick();
		onPage.askingPriceChartClick();
	}

	@Step
	public void isThisIsAProOnlyFeatureMessageShow() {
		onPage.isThisIsAProOnlyFeatureMessageShow();
	}

	@Step
	public void addBuildingHeightChartWithMKTShare() {
		onPage.rebnyListingsButtonClick();
		onPage.mktShareButtonClick();
		onPage.buildingHeightButton();
	}

	@Step
	public void rebnyListingsButtonClick(){
		onPage.rebnyListingsButtonClick();
	}

	@Step
	public void askingPriceChartClick() {
		onPage.askingPriceChartClick();
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
	}

	@Step
	public void shouldSeeBuildingHeightCartWithSwipe() {
		Assert.assertTrue(onPage.isBuildingHeightCartDisplayedWithSwipe());
	}

	@Step
	public void shouldSeeDomByPriceCartChart() {
		Assert.assertTrue(onPage.isDomByPriceCartDisplayed());
	}

	@Step
	public void shouldSeeDaysOnMarketChartWithSwipe() throws Exception {
		Assert.assertTrue(onPage.isDaysOnMarketDisplayedWithSwipe());
	}

	@Step
	public void isBuildingTypeChartDisplayed() {
		Assert.assertTrue(onPage.isBuildingTypeDisplayed());
	}

	@Step
	public void shouldSeeAscingPriceChartWithSwipe() throws Exception {
		Assert.assertTrue(onPage.shouldSeeAscingPriceChartWithSwipe());
	}

	@Step
	public void getBedroomsChartValue(){
		onPage.setValueSessionVariable("BedroomsChartValue",onPage.getValueBedroomsChart());
	}

	@Step
	public void getAskingPriceChartValue(){
		onPage.setValueSessionVariable("AskingPriceChartValue",onPage.getValueAskingPriceChart());
	}

	@Step
	public void isBedroomsChartChange(){
		Assert.assertFalse(onPage.getValueBedroomsChart()
				.contains(onPage.getValueFromSessionVariable("BedroomsChartValue")));
	}

	@Step
	public void isAskingPriceChartChange() {
		Assert.assertFalse(onPage.getValueAskingPriceChart()
				.contains(onPage.getValueFromSessionVariable("AskingPriceChartValue")));
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
	public void isGardenChartDisplayed() {
		Assert.assertTrue(onPage.isGardenChartDisplayed());
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
	public void isMedianAskingPriceChartDisplayed(){
		Assert.assertTrue(onPage.isMedianAskingPriceChartDisplayed());
	}
}
