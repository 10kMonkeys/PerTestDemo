package com.perchwell.steps;

import com.perchwell.pages.perchwell.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {
	SearchPage onPage;

	@Step
	public void clickDeleteSecondLocation() {
		onPage.clickDeleteSecondLocation();
	}

	@Step
	public void clickApplyButton() {
		onPage.clickApplyButton();
	}

	@Step
	public void setUpFilter3Baths() {
		onPage.selectFilterFor3Baths();
	}

	@Step
	public void clickFilter2Beds() {
		onPage.selectFilterFor2Beds();
	}

	@Step
	public void setUpFilterFirepace() {
		onPage.scrollToFireplace();
		onPage.selectFilterFireplace();
	}

	@Step
	public void clickLoadSavedSearchButton() {
		onPage.clickLoadSavedSearchButton();
	}

	@Step
	public void clickTapToSaveChanges() {
		onPage.clickTapToSaveChanges();
	}

	public void setSearchName() {
		onPage.addValueInSessionVariable("Search", onPage.generateRandomString("SEARCH"));
		onPage.setSearchName(onPage.getValueFromSessionVariable("Search"));
	}

	public void clickSaveButton() {
		onPage.clickSaveButton();
	}

	public void clickPreviouslyCreatedSearch() {
		onPage.clickPreviouslyCreatedSearch(onPage.getValueFromSessionVariable("Search"));
	}

	public void shouldSeePreviouslyCreatedSearch() {
		Assert.assertTrue(onPage.shouldSeePreviouslyCreatedSearch(onPage.getValueFromSessionVariable("Search")));
	}

	@Step
	public void setMinimumPriceFilter(String amount) {
		onPage.setMinimumPriceFilter(amount);
	}

	@Step
	public void clickFilterStudioBeds() {
		onPage.clickOnFilterStudioBeds();
	}

	@Step
	public void clickFilter1Bath() {
		onPage.clickOnFilter1Bath();
	}

	public void deleteDefaultLocationInFilter() {
		onPage.clickDeleteTagButtonBROOKLYN();
		onPage.clickDeleteTagButtonQUEENS();
		onPage.clickDeleteTagButtonMANHATTAN();
	}

	@Step
	public void addLocationFilter() {
		onPage.clickOnLocationFilter();
		//onPage.addLocationFilterAlphabetCity();
	}

	@Step
	public void clickThirdSearchInList() {
		onPage.clickThirdSearchInList();
	}

	private void createNewSearchStudioBeds() {
		onPage.clickOnFilterStudioBeds();
		this.clickTapToSaveChanges();
		this.setSearchName();
		this.clickSaveButton();
	}

	@Step
	public void clickExistingSearchInList() {

		if (!onPage.isAnySearchExist()) {

			PerchwellSteps perchwellSteps=new PerchwellSteps();
			onPage.savedSearchCancelButtonClick();
			createNewSearchStudioBeds();
			perchwellSteps.clickMyNewSearch();
			this.clickLoadSavedSearchButton();
		}
		onPage.selectFirstSearchAndSaveName();

	}

	@Step
	public void overwriteOptionSelect() {
		onPage.overwriteOptionSelect();
	}

	@Step
	public void saveAsOptionSelect() {
		onPage.saveAsOptionSelect();
	}

	@Step
	public void clickActiveFilter(){
		onPage.setFilterActive();
	}

	@Step
	public void isBuildingsFilteredAfterApplyingStatusFilter() throws Exception {
		Assert.assertTrue(onPage.isElementExistsInEachCell(onPage.getValueFromSessionVariable("filterName")));
	}

	@Step
	public void setUpFilterContract() {
		onPage.addValueInSessionVariable("filterName","InContractBanner");
		onPage.setFilterForContract();
	}

	@Step
	public void setUpFilterOffMkt(){
		onPage.addValueInSessionVariable("filterName","OffMarketBanner");
		onPage.setFilterForOffMkt();
	}

	@Step
	public void setUpFilterSold(){
		onPage.addValueInSessionVariable("filterName","SoldBanner");
		onPage.setFilterForSoldOrRented();
	}

	@Step
	public void setUpFilterRented(){
		onPage.addValueInSessionVariable("filterName","RentedBanner");
		onPage.setFilterForRentals();
	}

	@Step
	public void createNewSearchClick(){
		onPage.createNewSearchButtonClick();
	}

	@Step
    public void clickFilter1Bed() {
		onPage.clickOnFilter1Bed();
    }

    @Step
	public void clickFilter3Beds() {
		onPage.clickOnFilter3Beds();
	}

	@Step
	public void clickFilter4PlusBeds() {
		onPage.clickOnFilter4PlusBeds();
	}

	@Step
	public void saveCurrentSearch() {
		this.clickTapToSaveChanges();
		this.setSearchName();
		this.clickSaveButton();
	}

	@Step
	public void checkNoOneBedsFilterSelected() {
	}

	@Step
	public void clickResetFilter() {
		onPage.clickOnResetFilters();
	}

	@Step
	public void clickFilter1AndHalfBath() {
		onPage.clickOnFilter1AndHalfBath();
	}
	@Step
	public void clickFilter2Baths() {
		onPage.clickOnFilter2Baths();
	}

	@Step
	public void clickFilter3Baths() {
		onPage.clickOnFilter3Baths();
	}

	@Step
	public void clickFilter4PlusBaths() {
		onPage.clickOnFilter4PlusBaths();
	}

	@Step
	public void swipeCreatedSearch() throws Exception {
		onPage.swipeCreatedSearch(onPage.getValueFromSessionVariable("Search"));
	}

	@Step
	public void clickOnDeleteSearchButton() {
		onPage.clickOnDeleteSearchButton();
	}

	@Step
	public void shouldDeleteSearch() {
		Assert.assertFalse(onPage.isDeletedSearch(onPage.getValueFromSessionVariable("Search")));
	}
}
