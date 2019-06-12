package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "iOS_First", "Android_First", "First", "Local_Android_Run"})
public class ST12_NewSearch extends SampleTest {

	@Ignore
	@Test
	public void newSearch() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnMyNewSearch(); //old search
		user.inSearchMenu.openSearchPage(); //new search
		user.atSearchPage.selectBedroomsRangeOption();
		user.atSearchPage.selectFilter1Bed();
		user.atSearchPage.clickOnShowMoreFeaturesAndAmenitiesButton();
		user.atSearchPage.setUpFilterLaundryBLDG();
		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.clickOnMap();
		user.atMapPage.clickOnNotNowButton();
		user.atMapPage.clickOnMyNewSearch(); //old search
		user.inSearchMenu.openSearchPage(); //new search
		user.atSearchPage.selectBathroomsRangeOption();
		user.atSearchPage.selectFilter1AndHalfBath();
		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.clickOnAnalytics();
		user.atRebnyListingsPage.addChartFromREBNYSection();
		user.atAnalyticsPage.skipHints();
		user.atAnalyticsPage.addButtonClick();
		user.atAcrisClosingPage.addChartFromACRISSection();
		user.atAnalyticsPage.addButtonClick();
		user.atNycTownhousesPage.addChartFromNYCSection();
		user.atAnalyticsPage.addButtonClick();
		user.atManagementPage.addChartFromManagementSection();
		user.atAnalyticsPage.addButtonClick();
		user.atRebnyListingsPage.addBedroomsChartFromREBNYListings();
		user.atAnalyticsPage.addButtonClick();
		user.atAcrisClosingPage.addBuildingTypeByDealCountChartFromACRISClosing();
		user.atAnalyticsPage.clickMyNewSearch(); //old search
//		user.inSearchMenu.openSearchPage(); //new search
		user.atSearchPage.clickOnSaveSearchButton();
		user.atSearchPage.setSearchName();
		user.atSearchPage.clickOnSaveButton();
		user.atPerchwellPage.clickOnMyNewSearchWithWait(); //search old
		user.atSearchPage.clickOnMySavedSearches(); //search old
		user.inSearchMenu.openSavedSearches(); // search new
		user.atSearchPage.createNewSearchClick();
//		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.clickOnMyNewSearch(); //search old
		user.atSearchPage.clickOnMySavedSearches(); //search old
		user.inSearchMenu.openSavedSearches(); //search new
		user.atSearchPage.clickOnPreviouslyCreatedSearch();
		user.atPerchwellPage.clickOnList();
		user.atPerchwellPage.shouldFilter1Bed1AndHalfBathBeApplied("1 BD", "1½ BA");
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.shouldFilterLaundryBLDG();
		user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
		user.atPerchwellPage.openSecondBuilding();
		user.atOpenedBuildingPage.shouldFilterLaundryBLDG();
		user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
		user.atPerchwellPage.clickOnMap();
		user.atMapPage.checkForChangesAfterApplyingTheFilter();
		user.atPerchwellPage.clickOnAnalytics();
		user.atAcrisClosingPage.isBuildingTypeByDealCountChartDisplayed();
		user.atRebnyListingsPage.shouldSeeBedroomCountChart();
		user.atManagementPage.shouldSeeDaysOnMarketChartWithSwipe();
		user.atNycTownhousesPage.isGardenChartDisplayed();
		user.usingComplexSteps.justSwipeForAndroid();
		user.atAcrisClosingPage.shouldSeeBuildingHeightChartWithSwipe();
		user.atRebnyListingsPage.shouldSeeAskingPriceChartWithSwipe();
		user.atAnalyticsPage.clickOnMagnifierIconWithPreviouslySavedSearch(); // search old
		user.inSearchMenu.openSearchPage(); //new search
		user.atSearchPage.should1AndHalfBathFilterBeApplied();
		user.atSearchPage.should1BedFilterBeApplied();
		user.atSearchPage.clickOnShowMoreFeaturesAndAmenitiesButton();
		user.atSearchPage.shouldLaundryBLDGFilterBeApplied();
	}
}
