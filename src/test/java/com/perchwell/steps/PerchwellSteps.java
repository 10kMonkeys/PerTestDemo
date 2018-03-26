package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchwellPage;
import org.junit.Assert;

public class PerchwellSteps extends ScenarioSteps {
	PerchwellPage onPage;


	@Step
	public void skipAllHints() {
		onPage.clickEditSearchFiltersHint();
		if (onPage.isEditSearchFiltersHintisDisplayed()) {
			onPage.clickEditSearchFiltersHint();
		}
		onPage.clickManageYourProfileHint();
		onPage.clickTransformDataHint();
		onPage.clickExploreSearchResultHint();
	}

	@Step
	public void shouldSeeEditSearchFiltersHint() throws Exception {
		Assert.assertTrue(onPage.editSearchFiltersHintIsDispalyed());
	}

	@Step
	public void clickOpenAccountButton() {
		onPage.clickOpenAccountButton();
	}

	@Step
	public void clickMyNewSearch() {
		onPage.clickMagnifer();
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

		onPage.addValueInSessionVariable(notice, String.valueOf(onPage.countItemsInListView()));
		//onPage.numberOfItemsInListView= onPage.countItemsInListView();
	}

    @Step
    public void openThirdBuilding() throws Exception {
       onPage.isBuildingDisplayedWithSwipe(onPage.getThirdBuilding());
       onPage.openThirdBuilding();
    }

	@Step
	public void countItemsInListViewBeforApplyingFilter(){
	onPage.numberOfItemsInListView= onPage.countItemsInListView();
	}

	@Step(" '{0}' and '{1}' should be different")
	public void resultsCountIsChanged(String quantity_before, String quantity_after) {

		int befor = Integer.parseInt(onPage.getValueFromSessionVariable(quantity_before));
		int after = Integer.parseInt(onPage.getValueFromSessionVariable(quantity_after));
		System.out.print("Count after" + after);
		System.out.print("Count before" + befor);
		Assert.assertTrue(befor != after);
		//Save new value number of items

	}

	@Step
	public void clickMap() {
		onPage.clickMap();
	}

	@Step
	public void getFirstBuildingAddress() {
		onPage.addBuildingAddressInSessionVariable("buidingAddress", onPage.getFistBuildingAddress());
	}

	@Step
	public void clickAnalytics() {
		onPage.openAnalytics();
	}

	@Step
	public void clickList() {
		onPage.clickList();
	}

	@Step("Should see listings only from selected district {0}")
	public void shouldSeeListingsOnlyFromSelectedDistrict(String city) {
		Assert.assertTrue(onPage.isElementExistsInEachCell(city));
	}

	@Step("Should see listing with filters are applyed {0}")
	public void isFilter1Bath1BedApplied(String search) {
		Assert.assertTrue(onPage.isElementExistsInEachCell(search));
	}

	@Step("'{0}' and '{1}' should be equal")
	public void resultsCountIsEqual(String s2, String s1) {

		int number1 = Integer.parseInt(onPage.getValueFromSessionVariable(s1));
		int number2 = Integer.parseInt(onPage.getValueFromSessionVariable(s2));
		Assert.assertTrue(number1 == number2);

	}

	@Step
	public void shouldSeeTheSameSearchName() {
		Assert.assertEquals(onPage.getCurrentSearchName(), onPage.getValueFromSessionVariable("SearchName"));
	}

	@Step
	public void shouldSeePreviouslyCreatedNameOfSearch() {
		Assert.assertTrue(onPage.getCurrentSearchName().equalsIgnoreCase( onPage.getValueFromSessionVariable("Search")));
	}

	@Step
	public void shouldSeeListingOnlyWithSelectedRooms(String rooms) {
		Assert.assertTrue(onPage.isContainParticularRooms(rooms));
	}

	@Step
	public void shouldSeeListing4AndMoreRooms(String roomType) {
		Assert.assertTrue(onPage.isContains4PlusParticularRooms(roomType));

	}

	@Step
	public void shouldSeeListingOnlyWithStudios() {
		Assert.assertTrue(onPage.isContainsStudios());
	}

	@Step
	public void clickListingsByButton() {
		onPage.clickOnListingsByButton();
	}

	@Step
	public void clickBedroomsSortButton() {
		onPage.clickOnBedroomsSortButton();
	}

	@Step
	public void shouldListingsSortedByRooms(String roomType) {
		onPage.isListingsSortedByRooms(roomType);
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
    public void clickLeastExpensiveButton() {
	    onPage.clickOnLeastExpensiveButton();
    }

    @Step
    public void clickMostExpensiveButton() {
        onPage.clickOnMostExpensiveButton();
    }

    @Step
    public void shouldListingBeSortedByLeastExpensive() {
        Assert.assertTrue(onPage.isListingSortedByLeastExpensive());
    }

    @Step
    public void shouldListingBeSortedByMostExpensive() {
        Assert.assertTrue(onPage.isListingSortedByMostExpensive());
    }

    @Step
    public void shouldListingBeSortedByBedrooms() {
        Assert.assertTrue(onPage.isListingSortedByBedrooms());
    }

    @Step
    public void shouldListingBeSortedByBathrooms() {
        Assert.assertTrue(onPage.isListingSortedByBathrooms());
    }
}
