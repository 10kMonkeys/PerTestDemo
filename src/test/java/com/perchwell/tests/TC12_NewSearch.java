package com.perchwell.tests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TC12_NewSearch extends SampleTest {

	@Test
	public void newSearch() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMyNewSearch();
		searchSteps.setUpFilter3Baths();
		searchSteps.setUpFilterFirepace();
		searchSteps.clickApplyButton();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMap();
		mapSteps.clickNotNowButton();
		mapSteps.clickMyNewSearch();
		searchSteps.setUpFilter2Bads();
		searchSteps.clickApplyButton();
		perchwellSteps.clickAnalytics();
		analyticsSteps.addChartFromREBNYSection();
		analyticsSteps.skipHints();
		analyticsSteps.addButtonClick();
		analyticsSteps.addChartFromACRISSection();
		analyticsSteps.addButtonClick();
		analyticsSteps.addChartFromNYCSection();
		analyticsSteps.addButtonClick();
		analyticsSteps.addChartFromManagementSection();
		analyticsSteps.addButtonClick();
		analyticsSteps.addTwoCharts();
		analyticsSteps.clickMyNewSearch();
		searchSteps.clickTapToSaveChanges();
		searchSteps.setSearchName();
		searchSteps.clickSaveButton();
		perchwellSteps.clickMyNewSearch();
		searchSteps.clickLoadSavedSearchButton();
		searchSteps.shouldSeePreviouslyCreatedSearch();
		searchSteps.clickPreviouslyCreatedSearch();
		//Will be a check applying filter here
		perchwellSteps.clickMap();

		//mapSteps.clickNotNowButton();
		//Will be a check applying filter here
		perchwellSteps.clickAnalytics();

		analyticsSteps.isBuildingTypeChartDisplayed();
		analyticsSteps.shouldSeeDomByPriceCartChart();
		analyticsSteps.shouldSeeDaysOnMarketChartWithSwipe();
		analyticsSteps.shouldSeeDomByPrice2ChartWithSwipe();
		analyticsSteps.shouldSeeBuildingHeightCartWithSwipe();
		analyticsSteps.shouldSeeAscingPriceChartWithSwipe();

	}
}
