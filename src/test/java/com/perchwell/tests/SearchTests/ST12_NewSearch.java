package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "First"})
public class ST12_NewSearch extends SampleTest {

	@Test
	public void newSearch() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMyNewSearch();
		searchSteps.clickFilter1Bed();
		searchSteps.setUpFilterFirepace();
		searchSteps.clickApplyButton();
		perchwellSteps.clickMap();
		mapSteps.clickNotNowButton();
		mapSteps.clickMyNewSearch();
		searchSteps.selectFilter1AndHalfBath();
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
		perchwellSteps.clickList();
		perchwellSteps.shouldFilter1Bed1AndHalfBathBeApplied();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.shouldFilterFirepaceApplied();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.openSecondBuilding();
		openedBuildingSteps.shouldFilterFirepaceApplied();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.openThirdBuilding();
		openedBuildingSteps.shouldFilterFirepaceApplied();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickMap();
		mapSteps.checkForChangesAfterApplyingTheFilter();
		perchwellSteps.clickAnalytics();
		analyticsSteps.shouldBuildingTypeChartDisplayed();
		analyticsSteps.shouldSeeDomByPriceCartChart();
		analyticsSteps.shouldSeeDaysOnMarketChartWithSwipe();
		analyticsSteps.isGardenChartDisplayed();
		analyticsSteps.shouldSeeBuildingHeightCartWithSwipe();
		analyticsSteps.shouldSeeAscingPriceChartWithSwipe();
		analyticsSteps.clickOnMagnifierIconWithPreviouslySavedSearch();
		searchSteps.shouldFireplaceFilterBeApplied();
		searchSteps.should1AndHalfBathFilterBeApplied();
		searchSteps.should1BedFilterBeApplied();
	}
}
