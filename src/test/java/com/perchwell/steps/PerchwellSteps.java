package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchwellPage;
import org.junit.Assert;

import static com.perchwell.helpers.Helper.universalSingleSwipe;

public class PerchwellSteps extends ScenarioSteps {

	PerchwellPage onPage;

	@Step
	public void skipAllHints() {
		if(!Config.isAndroid()) {
			onPage.clickOnEditSearchFiltersHint();
//			if (onPage.isEditSearchFiltersHintIsDisplayed()) {
//				onPage.clickOnEditSearchFiltersHint();
//			}
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
		if(Config.isAndroid()) {
			onPage.clickOnMagnifier();
		}
	}

	@Step
	public void clickOnMyNewSearchWithWait() {
		waitABit(3000);
		if(Config.isAndroid()) {
			onPage.clickOnMagnifierWithWait();
		}
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
	public void getFirstListingAddress() {
		onPage.addBuildingAddressInSessionVariable("listingAddress1", onPage.getFistBuildingAddress());
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
    public void shouldFilter1Bed1AndHalfBathBeApplied(String beds, String baths) {
		if(Config.isAndroid()) {
			onPage.shouldFilter1Bed1AndHalfBathApplied("1 BD | 1½ BA");
		} else {
//			onPage.shouldFilter1Bed1AndHalfBathApplied("1 BD  |  1½ BA");
			onPage.isContainParticularBeds(beds);
			onPage.isContainParticularBaths(baths);
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
	public void shouldSeeListingOnlyWithSelectedBeds(String rooms) {
		if (Config.isAndroid()) {
			for (int i = 0; i<PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.isContainParticularBeds(rooms);
				universalSingleSwipe();
			}
		} else {
			onPage.isContainParticularBeds(rooms);
		}
	}

	@Step
	public void shouldSeeListingOnlyWithSelectedBaths(String rooms) {
		if (Config.isAndroid()) {
			for (int i = 0; i<PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.isContainParticularBaths(rooms);
				universalSingleSwipe();
			}
		} else {
			onPage.isContainParticularBaths(rooms);
		}
	}

	@Step
	public void shouldSeeListing4AndMoreBeds(String roomType) {
		if (Config.isAndroid()) {
			for (int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.isContains4PlusParticularBeds(roomType);
				universalSingleSwipe();
			}
		} else {
			onPage.isContains4PlusParticularBeds(roomType);
		}
	}

	@Step
	public void shouldSeeListing4AndMoreBaths(String roomType) {
		if (Config.isAndroid()) {
			for (int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.isContains4PlusParticularBaths(roomType);
				universalSingleSwipe();
			}
		} else {
			onPage.isContains4PlusParticularBaths(roomType);
		}
	}

	@Step
	public void shouldSeeListingOnlyWithStudios() {
		if (Config.isAndroid()) {
			for (int i = 0; i<PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.isContainsStudios();
				universalSingleSwipe();
			}
		} else {
				onPage.isContainsStudios();
			}
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
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("min"));
				universalSingleSwipe();
			}
		} else {
			Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("min"));
		}
	}

	@Step
	public void shouldSeeListingsEqualOrLessMaxPrice() {
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("max"));
				universalSingleSwipe();
			}
		} else {
			Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("max"));
		}
	}

	@Step
	public void shouldSeeListingsBetweenMinAndMaxPrices() {
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("between min and max"));
				universalSingleSwipe();
			}
		} else {
			Assert.assertTrue(onPage.isPriceFilterAppliedOnListings("between min and max"));
		}
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
    public void openSpecificBuilding() {
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
		if(Config.isAndroid()) {
			onPage.waitForClickOnMagnifier();
		}
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
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.checkIfListingsAreFilteredByMinBeds(value);
				universalSingleSwipe();
			}
		} else {
			onPage.checkIfListingsAreFilteredByMinBeds(value);
		}
	}

	@Step
	public void checkIfListingsAreFilteredByMinBaths(double value) {
		if (Config.isAndroid()) {
			for (int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.checkIfListingsAreFilteredByMinBaths(value);
				universalSingleSwipe();
			}
		} else {
			onPage.checkIfListingsAreFilteredByMinBaths(value);
		}
	}

	@Step
	public void checkIfListingsAreFilteredByMultipleBedroomsFilters() {
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.checkIfListingsAreFilteredByMultipleBedroomsFilters();
				universalSingleSwipe();
			}
		} else {
			onPage.checkIfListingsAreFilteredByMultipleBedroomsFilters();
		}
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
		Assert.assertFalse(onPage.checkListingsQuantity());
	}

	@Step
	public void shouldSeeListingWithSqFeetEqualAndMore(String minValue) {
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.shouldSeeListingWithSqFeetEqualAndMore(minValue);
				universalSingleSwipe();
			}
		} else {
			onPage.shouldSeeListingWithSqFeetEqualAndMore(minValue);
		}
	}

	@Step
	public void shouldSeeListingWithSqFeetEqualAndLess(String maxValue) {
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.shouldSeeListingWithSqFeetEqualAndLess(maxValue);
				universalSingleSwipe();
			}
		} else {
			onPage.shouldSeeListingWithSqFeetEqualAndLess(maxValue);
		}
	}

	@Step
	public void shouldSeeListingWithSqFeetEqualAndBetween(String minValue, String maxValue) {
		if(Config.isAndroid()) {
			for(int i = 0; i < PerchwellPage.ANDROID_LOOP_COUNTER; i++) {
				onPage.shouldSeeListingWithSqFeetEqualAndMore(minValue);
				onPage.shouldSeeListingWithSqFeetEqualAndLess(maxValue);
				universalSingleSwipe();
			}
		} else {
			onPage.shouldSeeListingWithSqFeetEqualAndMore(minValue);
			onPage.shouldSeeListingWithSqFeetEqualAndLess(maxValue);
		}
	}

	@Step
    public void checkListingsType(String property) {
		onPage.checkListingsType(property);
    }

    @Step
	public void clickOnSaveButton() {
		onPage.clickOnSaveButton();
	}

	@Step
	public void checkListingsQuantityIsEqual() {
		onPage.checkListingsQuantityIsEqual();

	}

	@Step
	public void checkIfListingsAmountIsLessThenInitial() {
		onPage.checkIfListingsAmountIsLessThenInitial();
	}

	@Step
    public void clickOnSelectionButtonByAddress(String address) {
		onPage.clickOnSelectionButtonByAddress(address);
	}

	@Step
	public void clickOnMoreOptionsButton() {
		onPage.clickOnMoreOptionsButton();
	}

	@Step
	public void selectContactListingAgentsOption() {
		onPage.selectContactListingAgentsOption();
	}

	@Step
    public void selectFirstTestListingWithOneAgent() {
		onPage.selectFirstTestListingWithOneAgent();
    }

    @Step
    public void selectTestListingWithTwoAgents() {
		onPage.selectTestListingWithTwoAgents();
    }

	@Step
	public void clickOnContactListingAgentsButton() {
		onPage.clickOnContactListingAgentsButton();
	}

	@Step
	public void checkSelectionMenuIsShown(int value) {
		onPage.checkMoreButtonIsShown();
		onPage.checkSelectAllButtonIsShown();
		onPage.checkDeselectAllButtonIsShown();
		onPage.checkSelectedLabelEquals(value);
		onPage.checkSelectedWordIsShown();
	}

	@Step
	public void checkThatThreeListingsAreSelected() {
		onPage.checkThatThreeListingsAreSelected();
	}

	@Step
	public void selectFirstListing() {
		onPage.selectFirstListings();
	}

	@Step
	public void selectSecondListingAfterFirst() {
		onPage.selectFirstListings();
	}

	@Step
	public void selectThirdListingAfterSecond() {
		onPage.selectFirstListings();
	}

	@Step
	public void getListingsAddresses(int amount) {
		onPage.getListingsAddresses(amount);
	}

	@Step
	public void clickOnTagSelectedListingsOption() {
		onPage.clickOnTagSelectedListingsOption();
	}

	@Step
	public void clickOnSelectAll() {
		onPage.clickOnSelectAll();
	}

	public void selectThirdAndFourthListingsByAddress() {
		onPage.selectThirdAndFourthListingsByAddress();
	}

	@Step
	public void clickOnDeselectAllListingsButton() {
		onPage.clickOnDeselectAllListingsButton();
	}

	@Step
	public void clickOnTagIconOnFirstListing() {
		onPage.clickOnTagIconOnFirstListing();
	}

	@Step
    public void checkOneListingIsSelected() {
		onPage.checkOneListingIsSelected();
    }

    @Step
	public void clickOnListShareButton() {
		onPage.clickOnDiscussionIconOnFirstListing();
	}

	@Step
	public void checkSelectedLabelEquals(int value) {
		onPage.checkSelectedLabelEquals(value);
	}

	@Step
	public void checkListingsAreSelected(int value) {
		onPage.checkListingsAreSelected(value);
	}

	@Step
	public void tabBarIsHidden() {
		onPage.tabBarIsHidden();
	}

	@Step
	public void tabBarIsShown() {
		onPage.tabBarIsShown();
	}

	@Step
	public void sortingMenuIsHidden() {
		onPage.sortingMenuIsHidden();
	}

	@Step
	public void checkNoOneListingIsSelected() {
		onPage.checkNoOneListingIsSelected();
	}

	@Step
	public void multiSelectMenuIsHidden() {
		onPage.multiSelectMenuIsHidden();
	}

	@Step
	public void swipeUpListViewToRefresh() {
		onPage.swipeUpListViewToRefresh();
	}

	@Step
    public void checkTagsIconCountForFirstAndSecondListings(String value) {
		this.checkTagsIconCountForFirstListing(value);
		this.checkTagsIconCountForSecondListing(value);
    }

    @Step
	public void clickOnTagIconOnSecondListing() {
		onPage.clickOnTagIconOnSecondListing();
	}

	@Step
	public void checkTagsIconCountForFirstListing(String value) {
		onPage.checkTagsIconCountForFirstListing(value);
	}

	@Step
	public void checkTagsIconCountForSecondListing(String value) {
		onPage.checkTagsIconCountForSecondListing(value);
	}

	@Step
	public void getListingsAmount() {
		onPage.getListingsAmount();
	}

	@Step
	public void checkIfCurrentListingsAddressesIsReturned() {
		onPage.checkIfCurrentListingsAddressesIsReturned();
	}

	@Step
	public void openListingWithOneAgent() {
		onPage.openListingWithOneAgent();
	}
}
