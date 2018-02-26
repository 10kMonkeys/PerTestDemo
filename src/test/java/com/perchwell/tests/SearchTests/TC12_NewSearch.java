package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests"})
public class TC12_NewSearch extends SampleTest {
	@Ignore
	@Test
	public void newSearch() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMyNewSearch();
		searchSteps.setFilterForStudioBeds();
		searchSteps.setUpFilterFirepace();
		searchSteps.clickApplyButton();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMap();
		mapSteps.clickNotNowButton();
		mapSteps.clickMyNewSearch();
		searchSteps.setUpFilter1Bath();
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
		perchwellSteps.clickList();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.isFilterStudioApplied();
		openedBuildingSteps.isFilter1BathApplied();
		openedBuildingSteps.clickBackButton();

		perchwellSteps.openSecondBuilding();
		openedBuildingSteps.isFilterStudioApplied();
		openedBuildingSteps.isFilter1BathApplied();
		openedBuildingSteps.clickBackButton();

		perchwellSteps.openThirdBuilding();
		openedBuildingSteps.isFilterStudioApplied();
		openedBuildingSteps.isFilter1BathApplied();
		openedBuildingSteps.clickBackButton();


		//	openedBuildingSteps.isFilterFirepaceApplied();
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
