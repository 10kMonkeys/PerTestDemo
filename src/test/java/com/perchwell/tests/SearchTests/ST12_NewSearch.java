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
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.selectFilter1Bed();
		searchSteps.setUpFilterFirepace();
		searchSteps.clickOnApplyButton();
		perchwellSteps.clickOnMap();
		mapSteps.clickOnNotNowButton();
		mapSteps.clickOnMyNewSearch();
		searchSteps.selectFilter1AndHalfBath();
		searchSteps.clickOnApplyButton();
		perchwellSteps.clickOnAnalytics();
		rebnyListingsSteps.addChartFromREBNYSection();
		analyticsSteps.skipHints();
		analyticsSteps.addButtonClick();
		acrisClosingSteps.addChartFromACRISSection();
		analyticsSteps.addButtonClick();
		nycTownhousesSteps.addChartFromNYCSection();
		analyticsSteps.addButtonClick();
		managementSteps.addChartFromManagementSection();
		analyticsSteps.addButtonClick();
		rebnyListingsSteps.addBedroomsChartFromREBNYListings();
		analyticsSteps.addButtonClick();
		acrisClosingSteps.addBuildingTypeByDealCountChartFromACRISCloasing();
		analyticsSteps.clickMyNewSearch();
		searchSteps.clickOnTapToSaveChanges();
		searchSteps.setSearchName();
		searchSteps.clickOnSaveButton();
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.clickOnLoadSavedSearchButton();
		searchSteps.clickOnThirdSearchInList();
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.clickOnLoadSavedSearchButton();
		searchSteps.shouldSeePreviouslyCreatedSearch();
		searchSteps.clickOnPreviouslyCreatedSearch();
		perchwellSteps.clickOnList();
		perchwellSteps.shouldFilter1Bed1AndHalfBathBeApplied();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickOnDiscussWithMyClientHint();
		openedBuildingSteps.shouldFilterFireplaceApplied();
		openedBuildingSteps.clickOnBackButton();
		perchwellSteps.openSecondBuilding();
		openedBuildingSteps.shouldFilterFireplaceApplied();
		openedBuildingSteps.clickOnBackButton();
		perchwellSteps.openThirdBuilding();
		openedBuildingSteps.shouldFilterFireplaceApplied();
		openedBuildingSteps.clickOnBackButton();
		perchwellSteps.clickOnMap();
		mapSteps.checkForChangesAfterApplyingTheFilter();
		perchwellSteps.clickOnAnalytics();
		acrisClosingSteps.shouldBuildingTypeChartDisplayed();
		rebnyListingsSteps.shouldSeeBedroomCountChart();
		managementSteps.shouldSeeDaysOnMarketChartWithSwipe();
		nycTownhousesSteps.isGardenChartDisplayed();
		acrisClosingSteps.shouldSeeBuildingHeightChartWithSwipe();
		rebnyListingsSteps.shouldSeeAskingPriceChartWithSwipe();
		analyticsSteps.clickOnMagnifierIconWithPreviouslySavedSearch();
		searchSteps.shouldFireplaceFilterBeApplied();
		searchSteps.should1AndHalfBathFilterBeApplied();
		searchSteps.should1BedFilterBeApplied();
	}
}
