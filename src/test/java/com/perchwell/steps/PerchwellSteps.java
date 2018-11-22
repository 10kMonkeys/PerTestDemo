package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchwellPage;
import org.junit.Assert;

public class PerchwellSteps extends ScenarioSteps {

	PerchwellPage onPage;

	@Step
	public void skipAllHints() {
		if(!Config.isAndroid()) {
			onPage.clickOnEditSearchFiltersHint();
			if (onPage.isEditSearchFiltersHintIsDisplayed()) {
				onPage.clickOnEditSearchFiltersHint();
			}
			onPage.clickOnManageYourProfileHint();
			onPage.clickOnTransformDataHint();
			onPage.clickExploreSearchResultHint();
		}
	}

	@Step
	public void shouldSeeEditSearchFiltersHint() {
		onPage.shouldSeeEditSearchFiltersHint();
	}

	@Step
	public void clickOnOpenAccountButton() {
		onPage.clickOnOpenAccountButton();
	}

	@Step
	public void clickOnMyNewSearch() {
		onPage.clickOnMagnifier();
	}

	@Step
	public void clickOnMyNewSearchWithWait() {
		onPage.clickOnMagnifierWithWait();
	}

	@Step
	public void openFirstBuilding() {
		onPage.openFirstBuilding();
	}

	@Step
	public void openSecondBuilding() {
		onPage.openSecondBuilding();
	}

	@Step
	public void countItemsInListView(String notice) {
		SessionVariables.addValueInSessionVariable(notice, String.valueOf(onPage.countItemsInListView()));
	}

    @Step
    public void openThirdBuilding() throws Exception {
       onPage.isBuildingDisplayedWithSwipe(onPage.getThirdBuilding());
       onPage.openThirdBuilding();
    }

	@Step
	public void countItemsInListViewBeforApplyingFilter() {
		onPage.numberOfItemsInListView = onPage.countItemsInListView();
	}

	@Step(" '{0}' and '{1}' should be different")
	public void resultsCountIsChanged(String quantity_before, String quantity_after) {
		int before = Integer.parseInt(SessionVariables.getValueFromSessionVariable(quantity_before));
		int after = Integer.parseInt(SessionVariables.getValueFromSessionVariable(quantity_after));
		System.out.print("Count after" + after);
		System.out.print("Count before" + before);
		Assert.assertTrue(before != after);
		//Save new value number of items
	}

	@Step
	public void clickOnMap() {
		onPage.clickOnMap();
	}

	@Step
	public void getFirstBuildingAddress() {
		onPage.addBuildingAddressInSessionVariable("buildingAddress", onPage.getFistBuildingAddress());
	}

	@Step
	public void clickOnAnalytics() {
		onPage.openAnalytics();
	}

	@Step
	public void clickOnList() {
		onPage.clickOnList();
	}

	@Step("Should see listings only from selected district {0}")
	public void shouldSeeListingsOnlyFromSelectedDistrict(String city) {
		onPage.isElementExistsInEachCell(city);
	}

	@Step("Should see listing with filters are applyed {0}")
	public void isFilter1Bath1BedApplied(String search) {
		onPage.isElementExistsInEachCell(search);
	}

    @Step("Should see listing with filters are applyed {0}")
    public void shouldFilter1Bed1AndHalfBathBeApplied() {
		if(Config.isAndroid()) {
			onPage.shouldFilter1Bed1AndHalfBathApplied("1 BD | 1½ BA");
		} else {
			onPage.shouldFilter1Bed1AndHalfBathApplied("1 BD  |  1½ BA");
		}
    }

	@Step("'{0}' and '{1}' should be equal")
	public void resultsCountIsEqual(String s2, String s1) {
		int number1 = Integer.parseInt(SessionVariables.getValueFromSessionVariable(s1));
		int number2 = Integer.parseInt(SessionVariables.getValueFromSessionVariable(s2));
		Assert.assertEquals(number1, number2);
	}

	@Step
	public void shouldSeeTheSameSearchName() {
		onPage.shouldSeeTheSameSearchName(onPage.getCurrentSearchName(),SessionVariables.getValueFromSessionVariable("SearchName"));
	}

	@Step
	public void shouldSeePreviouslyCreatedNameOfSearch() {
		onPage.shouldSeePreviouslyCreatedNameOfSearch(onPage.getCurrentSearchName(),SessionVariables.getValueFromSessionVariable("Search"));
	}

	@Step
	public void shouldSeeListingOnlyWithSelectedRooms(String rooms) {
		onPage.isContainParticularRooms(rooms);
	}

	@Step
	public void shouldSeeListing4AndMoreRooms(String roomType) {
		onPage.isContains4PlusParticularRooms(roomType);
	}

	@Step
	public void shouldSeeListingOnlyWithStudios() {
		onPage.isContainsStudios();
	}

	@Step
	public void clickOnListingsByButton() {
		onPage.clickOnListingsByButton();
	}

	@Step
	public void clickOnBedroomsSortButton() {
		onPage.clickOnBedroomsSortButton();
	}

	@Step
	public void checkSortLabel(String sortType) {
		onPage.checkSortLabel(sortType);
	}

	@Step
	public void clickBathroomsSortButton() {
		onPage.clickOnBathroomsSortButton();
	}

	@Step
    public void clickOnLeastExpensiveButton() {
	    onPage.clickOnLeastExpensiveButton();
    }

    @Step
    public void clickOnMostExpensiveButton() {
        onPage.clickOnMostExpensiveButton();
    }

    @Step
    public void shouldListingBeSortedByLeastExpensive() {
        onPage.isListingSortedByLeastExpensive();
    }

    @Step
    public void shouldListingBeSortedByMostExpensive() {
        onPage.isListingSortedByMostExpensive();
    }

    @Step
    public void shouldListingBeSortedByBedrooms() {
        onPage.isListingSortedByBedrooms();
    }

	@Step
	public void shouldListingBeSortedByBedroomsInBuilding() {
		onPage.ListingBeSortedByBedroomsInBuilding();
	}

    @Step
    public void shouldListingBeSortedByBathrooms() {
        onPage.isListingSortedByBathrooms();
    }

    @Step
	public void clickOnTotalRoomsSortButton() {
		onPage.clickOnTotalRoomsButton();
	}

	@Step
	public void shouldSeeInitialIcon() {
		onPage.isInitialIconDispalyed();
	}

	@Step
	public void clickOnInitials() {
		onPage.clickOnInitials();
	}

	@Step
	public void clickOnResetPassword() {
		onPage.clickOnResetPassword();
	}

	@Step
    public void isListingsQuantity() {
		onPage.isListingsQuantity();
    }

    @Step
	public void checkListingsQuantity() {
		Assert.assertTrue(onPage.checkListingsQuantity());
	}

	@Step
	public void shouldSeeListingsEqualOrMoreMinPrice() {
		Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("min"));
	}

	@Step
	public void shouldSeeListingsEqualOrLessMaxPrice() {
		Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("max"));
	}

	@Step
	public void shouldSeeListingsBetweenMinAndMaxPrices() {
		Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("between min and max"));
	}

	@Step
	public void clickOnAddressSortButton() {
		onPage.clickOnAddressSortButton();
	}

	@Step
	public void closeAccountMenu() {
		onPage.closeAccountMenu();
	}

	@Step
    public void openSpecificBuilding() throws Exception {
		onPage.openSpecificBuilding();
    }

    @Step
	public void shouldSeeListingWithLabel(String label) {
		onPage.isContainLabel(label);

	}

	@Step
	public void shouldSeeListingWithLabels (String label1, String label2){
		onPage.isContainLabels(label1, label2);
	}

	@Step
	public void clickOnMyNewSearchWithPause() {
		onPage.waitForClickOnMagnifier();
	}

	@Step
    public void checkFilterIsApplied() {
		onPage.checkFilterIsApplied();
    }
	
    @Step
	public void shouldSeeListingsFromAllUpperEastSideDistricts(String carnegieHill, String lenoxHill, String upperEastSide, String yorkville) {
		onPage.shouldSeeListingsFromAllUpperEastSideDistricts(carnegieHill, lenoxHill, upperEastSide, yorkville);
	}

	@Step
	public void shouldSeeListingsTwoDistricts(String firstDist, String secondDist) {
		onPage.shouldSeeListingsTwoDistricts(firstDist, secondDist);
	}

	@Step
	public void checkFourDistrictsListings() {
		onPage.checkFourDistrictsListings();
	}

	@Step
	public void openTwoAgentListing() {
		onPage.openTwoAgentListing();
	}

	@Step
	public void waitUntilAccountIconAppears() {
		onPage.waitUntilAccountIconAppears();

	}

	@Step
	public void checkIfListingsAreFilteredByMinBeds(int value) {
		onPage.checkIfListingsAreFilteredByMinBeds(value);
	}

	@Step
	public void checkIfListingsAreFilteredByMinBaths(double value) {
		onPage.checkIfListingsAreFilteredByMinBaths(value);
	}

	@Step
	public void checkIfListingsAreFilteredByMultipleBedroomsFilters() {
		onPage.checkIfListingsAreFilteredByMultipleBedroomsFilters();
	}

	@Step
	public void checkIfListingsWereNotChanged() {
		onPage.checkIfListingsWereNotChanged();
	}

	@Step
	public void checkIfThereIsNoListingsWithoutBeds() {
		onPage.checkIfThereIsNoListingsWithoutBeds();
	}

	@Step
	public void checkIfThereIsNoListingsWithoutBaths() {
		onPage.checkIfThereIsNoListingsWithoutBaths();
	}

	@Step
	public void listingsFilteredByMultiBathroomsFilters() {
		onPage.listingsFilteredByMultiBathroomsFilters();
	}

	@Step
	public void checkIfListingsWereChanged() {
	}
}
