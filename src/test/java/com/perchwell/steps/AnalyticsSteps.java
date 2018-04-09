package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import com.perchwell.pages.perchwell.AnalyticsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

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
		Assert.assertTrue(onPage.isThisIsAProOnlyFeatureMessageShow());
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

	@Step
	public void selectNYCTownhousesSection(){
		onPage.nycTownHousesButtonClick();
	}

	@Step
	public void inHistoryDistClick(){
		onPage.inDHistoryDistButtonClick();
	}

	@Step
	public void featureButtonClick(){
		onPage.featuresButtonClick();
	}

	@Step
	public void selectGardenChart(){
		onPage.selectGardenChart();
	}

	@Step
	public void isHistoryDistChartDisplayed(){
		Assert.assertTrue(onPage.isHistoryDistChartAdd());
	}

	@Step
	public void isGardenPremiumChartDisplayed(){
		Assert.assertTrue(onPage.isGardenPremiumChartDisplayed());
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
	public void selectFirmListingCountChart(){
		onPage.firmListingCountButtonClick();
	}

	@Step
	public void isFirmListingCountChartDisplayed(){
		Assert.assertTrue(onPage.isFirmListingCountChartDisplayed());
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
	public void dealVolumeAnnualButtonClick(){
		onPage.dealVolumeAnnualButtonClick();
	}

	@Step
	public void dealVolumeQuarterlyButtonClick(){
		onPage.dealVolumeQuarterlyButtonClick();
	}

	@Step
	public void setMinRangeYearDefaultMinusOne(){
		onPage.addValueInSessionVariable("MinRangeYear",String.valueOf(Integer.parseInt(onPage.getDefaultMinValueYear()) - 1));
		onPage.setMinValueYear(onPage.getValueFromSessionVariable("MinRangeYear"));
	}

	@Step
	public void setMaxRangeYearDefaultMinusOne(){
		onPage.getDefaultMaxValueYear();
		onPage.setMaxValueYears(onPage.getValueFromSessionVariable("MaxRangeYear"));
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
		Assert.assertTrue(onPage.isColumnForPreviousMinDefaultYearAdd(onPage.getValueFromSessionVariable("MinRangeYear")));
	}

	@Step
	public void isColumnForNextMaxDefaultYearRemove(){
		Assert.assertTrue(onPage.isColumnForNextMaxDefaultYearRemove(onPage.getValueFromSessionVariable("MaxDefaultRangeYear")));
	}

	@Step
	public void isOnlyThreeYearsInChartDisplayed(){
		Assert.assertTrue(onPage.isOnlyThreeYearsDisplayed());
	}

	@Step
	public void getValueYearsRangeButton(){
		onPage.addValueInSessionVariable("RangeButton",onPage.yearsRangeButtonValue());
	}

	@Step
	public void isYearsRangeChange(){
		Assert.assertTrue(onPage.isYearsRangeChange(onPage.getValueFromSessionVariable("RangeButton"),onPage.getValueFromSessionVariable("MaxRangeYear")));
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
	public void addAskingPricePerBedChart(){
		onPage.askingPricePerBedButtonClick();
	}

	@Step
	public void addAskingPricePerFTChart(){
		onPage.askingPricePerFTButtonClick();
	}

	@Step
	public void addListingCountChart(){
		onPage.listingCountButtonClick();
	}

	@Step
	public void addMonthliesChart(){
		onPage.monthliesButtonClick();
	}

	@Step
	public void addPropertyTaxesChart(){
		onPage.propertyTaxesButtonClick();
	}

	@Step
	public void shouldSeeAskingPricePerBedChart(){
		onPage.shouldSeeAskingPricePerBedChart();
	}
}
