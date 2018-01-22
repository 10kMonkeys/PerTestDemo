package com.perchwell.steps;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.perchwell.AnalyticsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AnalyticsSteps extends ScenarioSteps {
	AnalyticsPage onPage;
//
//	@Step
//	public void holdCharts() {
//		onPage.holdCharts();
//	}
//
//	@Step
//	public void deleteChart() {
//		onPage.deleteChart();
//	}
//
//	@Step
//	public void isAddIconDisplayed() {
//		Assert.assertTrue(onPage.isAddIconDisplayed());
//	}
//
//	@Step
//	public void addChartFromREBNYSection() {
//		onPage.addChartFromREBNYSection();
//	}
//
//	@Step
//	public void addButtonClick() {
//		onPage.addButtonClick();
//	}
//
//	@Step
//	public void shareButtonClick() {
//		onPage.shareButtonClick();
//	}
//
//	@Step
//	public void addChartFromACRISSection() {
//		onPage.addChartFromACRISSection();
//	}
//
//	@Step
//	public void addChartFromNYCSection() {
//		onPage.addChartFromNYCSection();
//	}
//
//	@Step
//	public void addChartFromManagementSection() {
//		onPage.addChartFromManagementSection();
//	}
//
//	@Step
//	public void addTwoCharts() {
//		onPage.addTwoCharts();
//	}
//
//	@Step
//	public void skipHints() {
//		onPage.skipHints();
//	}
//
//	@Step
//	public void isMessageMaximumSixChartsDisplayed() {
//		Assert.assertTrue(onPage.isMessageMaximumSixChartsDisplayed());
//	}
//
//	@Step
//	public void isAskingPriseChartAdd() {
//		Assert.assertTrue(onPage.isAskingPriseChartAdd());
//	}
//
//	@Step
//	public void isBuildingHeightCartAdd() {
//		Assert.assertTrue(onPage.isBuildingHeightCartAdd());
//	}
//
//	@Step
//	public void isDomByPriceCartAdd() {
//		Assert.assertTrue(onPage.isDomByPriceCartAdd());
//	}
//
//	@Step
//	public void isDaysOnMarketAdd() {
//		Assert.assertTrue(onPage.isDaysOnMarketAdd());
//	}
//
//	@Step
//	public void okButtonClick() {
//		onPage.okButtonClick();
//	}
//
//	@Step
//	public void doneMovingCharts() {
//		onPage.doneMovingChartsButtonClick();
//	}
//
//	@Step
//	public void isDealCountByTypeDeleted() {
//		Assert.assertFalse(onPage.isDealCountByTypeDisplayed());
//	}
//
//	@Step
//	public void addAskingPriceChartWithMKTShare() {
//		onPage.addAskingPriceChartWithMKTShare();
//	}
//
//	@Step
//	public void isThisIsAProOnlyFeatureMessageShow() {
//		onPage.isThisIsAProOnlyFeatureMessageShow();
//	}
//
//	@Step
//	public void addBuildingHeightChartWithMKTShare() {
//		onPage.addBuildingHeightChartWithMKTShare();
//	}

	public void clickMyEmailOption() {
		onPage.clickMyEmailOption();
	}

	@Step
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
		onPage.domByPriceButtonClick();
	}

	@Step
	public void addChartFromManagementSection() {
		onPage.managementButtonClick();
		onPage.daysOnMarketButtonClick();
	}

	@Step
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

}
