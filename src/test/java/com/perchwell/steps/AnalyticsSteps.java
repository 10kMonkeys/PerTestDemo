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
		onPage.buildingTypeByDealCountButtonClick();
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
		this.isChartDisplayed();
	}

	@Step
	public void isDealCountByHeightAdd() {
		Assert.assertTrue(onPage.isDealCountByHeightChartAdd());
		this.isChartDisplayed();
	}

	@Step
	public void isBuildingHeightChartAdd(){
		Assert.assertTrue(onPage.isBuildingHeightChartAdd());
		this.isChartDisplayed();
	}

	@Step
	public void isDomByPriceCartAdd() {
		Assert.assertTrue(onPage.isDomByPriceCartAdd());
	}

	@Step
	public void isDaysOnMarketAdd() {
		Assert.assertTrue(onPage.isDaysOnMarketAdd());
		this.isChartDisplayed();
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
		this.isChartDisplayed();
	}

	@Step
	public void shouldSeeBuildingHeightChartWithSwipe() {
		onPage.shouldBuildingHeightChartDisplayedWithSwipe();
		this.isChartDisplayed();
	}

	@Step
	public void shouldSeeBedroomCountChart() {
		onPage.shouldBedroomCountChartDisplayed();
		this.isChartDisplayed();
	}


	@Step
	public void shouldSeeDaysOnMarketChartWithSwipe() throws Exception {
		onPage.shouldDaysOnMarketDisplayedWithSwipe();
		this.isChartDisplayed();
	}

	@Step
	public void shouldSeeAskingPriceChartWithSwipe() throws Exception {
		onPage.shouldSeeAskingPriceChartWithSwipe();
		this.isChartDisplayed();

	}

	@Step
	public void shouldBuildingTypeChartDisplayed() {
		onPage.shouldBuildingTypeDisplayed();
		this.isChartDisplayed();
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
		onPage.shouldGardenChartDisplayed();
		this.isChartDisplayed();
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
		this.isChartDisplayed();
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
		this.isChartDisplayed();
	}

	@Step
	public void isGardenPremiumChartDisplayed(){
		Assert.assertTrue(onPage.isGardenPremiumChartDisplayed());
		this.isChartDisplayed();
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
		this.isChartDisplayed();
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
	public void addMedianAskingPerFTChart(){
		onPage.medianAskingPerFTButtonClick();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifyAskingPricePerFTChart(){
		onPage.addAndVerifyAskingPricePerFTChart();
		this.isChartDisplayed();
	}

	@Step
	public void addListingCountChart(){
		onPage.listingCountButtonClick();
		this.isChartDisplayed();
	}

	@Step
	public void addMedianMonthliesChart(){
		onPage.medianMonthliesButtonClick();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifyMonthliesChart(){
		onPage.addAndVerifyMonthliesChart();
		this.isChartDisplayed();
	}

	@Step
	public void addMedianPropertyTaxesChart(){
		onPage.medianPropertyTaxesButtonClick();
		this.isChartDisplayed();
	}

	@Step
	public void shouldSeeMedianAskingPricePerBedChart(){
		onPage.shouldSeeMedianAskingPricePerBedChart();
		this.isChartDisplayed();
	}

	@Step
	public void addBedroomsChart(){
		onPage.bedroomsButtonClick();
	}

	@Step
	public void shouldSeeBedroomsChart(){
		onPage.shouldSeeBedroomsChart();
		this.isChartDisplayed();
	}

	@Step
	public void addBuildingTypeByDealCountChart(){
		onPage.buildingTypeByDealCountButtonClick();
	}

	@Step
	public void addAndVerifyDoormanChart(){
		onPage.addAndVerifyDoormanChart();
	}

	@Step
	public void addAndVerifyElevatorChart(){
		onPage.addAndVerifyElevatorChart();
		this.isChartDisplayed();
	}

	@Step
    public void addAndVerifyElevatorPremiumChart(){
	    onPage.addAndVerifyElevatorPremiumChart();
	    this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyFireplaceChart(){
		onPage.addAndVerifyFireplaceChart();
		this.isChartDisplayed();
	}

	@Step
    public void addAndVerifyWorkingFireplacePremiumChart(){
	    onPage.addAndVerifyWorkingFireplacePremiumChart();
	    this.isChartDisplayed();
    }

	@Step
	public void selectREBNYListingsWithMKTChare(){
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.mktShareButtonClick();
	}

	@Step
	public void addAndVerifyGarageChart(){
		onPage.addAndVerifyGarageChart();
		this.isChartDisplayed();
	}

	@Step
    public void addAndVerifyGaragePremiumChart(){
	    onPage.addAndVerifyGaragePremiumChart();
	    this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyGymChart(){
		onPage.addAndVerifyGymChart();
        this.isChartDisplayed();
	}

	@Step
    public void addAndVerifyGymPremiumChart(){
	    onPage.addAndVerifyGymPremiumChart();
        this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyLaundryBuildingChart(){
		onPage.addAndVerifyLaundryBuildingChart();
		this.isChartDisplayed();
	}

    @Step
    public void addAndVerifyLaundryBuildingPremiumChart(){
        onPage.addAndVerifyLaundryBuildingPremiumChart();
        this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyOutdoorSpaceChart(){
		onPage.addAndVerifyOutdoorSpaceChart();
		this.isChartDisplayed();
	}

    @Step
    public void addAndVerifyOutdoorSpacePremiumChart(){
        onPage.addAndVerifyOutdoorSpacePremiumChart();
        this.isChartDisplayed();
    }

    @Step
	public void addAndVerifyPetsChart(){
		onPage.addAndVerifyPetsChart();
		this.isChartDisplayed();
	}

    @Step
    public void addAndVerifyPetsPremiumChart(){
        onPage.addAndVerifyPetsPremiumChart();
        this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyPoolChart(){
		onPage.addAndVerifyPoolChart();
		this.isChartDisplayed();
	}

    @Step
    public void addAndVerifyPoolPremiumChart(){
        onPage.addAndVerifyPoolPremiumChart();
        this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyPrewarChart(){
		onPage.addAndVerifyPrewarChart();
		this.isChartDisplayed();
	}

    @Step
    public void addAndVerifyPrewarPremiumChart(){
        onPage.addAndVerifyPrewarPremiumChart();
        this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyWasherDryerChart(){
		onPage.addAndVerifyWasherDryerChart();
		this.isChartDisplayed();
	}

    @Step
    public void addAndVerifyWasherDryerPremiumChart(){
        onPage.addAndVerifyWasherDryerPremiumChart();
        this.isChartDisplayed();
    }

	@Step
	public void addAndVerifyBuildingTypeChart(){
		onPage.addAndVerifyBuildingTypeChart();
		this.isChartDisplayed();
	}

	@Step
	public void dollarPerFTByPriceSegmentButtonClick(){
		onPage.dollarPerFTByPriceSegmentButtonClick();
	}

	@Step
	public void isDollarPerFTByPriceSegmentChartAdd(){
		onPage.isDollarPerFTByPriceSegmentChartAdd();
		this.isChartDisplayed();
	}

	@Step
	public void selectREBNYListingsWithDistribution(){
		onPage.addButtonClick();
		onPage.rebnyListingsButtonClick();
		onPage.distributionButtonClick();
	}

	@Step
	public void addAndVerifyAskingPriceByBedsChart(){
		onPage.addAndVerifyAskingPriceByBedsChart();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifyAskingPriceByPriceSegmentChart(){
		onPage.addAndVerifyAskingPriceByPriceSegmentChart();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifyAskingPriceByTypeChart(){
		onPage.addAndVerifyAskingPriceByTypeChart();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifyAskingPricePerBedChart(){
		onPage.addAndVerifyAskingPricePerBedChart();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifyDOMByNumberBedsChart(){
		onPage.addAndVerifyDOMByNumberBedsChart();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifyDOMByPriceSegmentChart(){
		onPage.addAndVerifyDOMByPriceSegmentChart();
		this.isChartDisplayed();
	}

	@Step
	public void addAndVerifySquareFeetChart(){
		onPage.addAndVerifySquareFeetChart();
	}

	public void isChartDisplayed(){
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
    public void shouldSeePremiumDoormanChart(){
	    onPage.shouldSeePremiumDoormanChart();
	    this.isChartDisplayed();
    }

    @Step
    public void doormanButtonClick(){
	    onPage.doormanButtonClick();
    }

    @Step
    public void selectREBNYListingsWithFeatures(){
        onPage.addButtonClick();
        onPage.rebnyListingsButtonClick();
        onPage.featuresButtonClick();
    }

    @Step
    public void addAndVerifyNewDevelopmentChart(){
        onPage.addAndVerifyNewDevelopmentChart();
        this.isChartDisplayed();
    }
}
