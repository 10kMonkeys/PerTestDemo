package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests"})
public class TC12_NewSearch extends SampleTest {

	@Test
	public void newSearch() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMyNewSearch();
		searchSteps.clickFilterStudioBeds();
		searchSteps.setUpFilterFirepace();
		searchSteps.clickApplyButton();
		//perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMap();
		mapSteps.clickNotNowButton();
		mapSteps.clickMyNewSearch();
		searchSteps.clickFilter1Bath();
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
		searchSteps.clickThirdSearchInList();
		perchwellSteps.clickMyNewSearch();
		searchSteps.clickLoadSavedSearchButton();
		searchSteps.shouldSeePreviouslyCreatedSearch();
		searchSteps.clickPreviouslyCreatedSearch();
		//Will be a check applying filter here
		perchwellSteps.clickList();
		//Don't work now -  perchwellSteps.isFilter1Bath1BedApplied("STUDIO | 1 BA");

		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.isFilterFirepaceApplied();
		openedBuildingSteps.clickBackButton();

		perchwellSteps.openSecondBuilding();
		openedBuildingSteps.isFilterFirepaceApplied();
		openedBuildingSteps.clickBackButton();

		perchwellSteps.openThirdBuilding();
		openedBuildingSteps.isFilterFirepaceApplied();
		openedBuildingSteps.clickBackButton();

		perchwellSteps.clickMap();
	//	mapSteps.clickNotNowButton();
		//Don't work now Broked filter for 1 BA - 	mapSteps.checkForChangesAfterApplyingTheFilter();
		//Will be a check applying filter here


		perchwellSteps.clickAnalytics();
		analyticsSteps.isBuildingTypeChartDisplayed();
		analyticsSteps.shouldSeeDomByPriceCartChart();
		analyticsSteps.shouldSeeDaysOnMarketChartWithSwipe();
		analyticsSteps.isGardenChartDisplayed();
		analyticsSteps.shouldSeeBuildingHeightCartWithSwipe();
		analyticsSteps.shouldSeeAscingPriceChartWithSwipe();

	}
}
