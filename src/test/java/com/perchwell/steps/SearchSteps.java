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
	public void selectFilter2Beds() {
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
		onPage.shouldSeePreviouslyCreatedSearch(onPage.getValueFromSessionVariable("Search"));
	}

	@Step
	public void setMinimumPriceFilter(String amount) {
		onPage.setMinimumPriceFilter(amount);
		onPage.addValueInSessionVariable("min price", amount);
	}

	@Step
	public void selectFilterStudioBeds() {
		onPage.selectFilterStudioBeds();
	}

	@Step
	public void clickFilterStudioBeds() {
		onPage.clickFilterStudioBeds();
	}

	@Step
	public void selectFilter1Bath() {
		onPage.selectFilter1Bath();
	}

	public void deleteDefaultLocationInFilter() {
		onPage.clickDeleteTagButtonBROOKLYN();
		onPage.clickDeleteTagButtonQUEENS();
		onPage.clickDeleteTagButtonMANHATTAN();
	}

	@Step
	public void addLocationFilter() {
		onPage.clickOnLocationFilter();
//		onPage.addLocationFilterAlphabetCity();
	}

	@Step
	public void clickThirdSearchInList() {
		onPage.clickThirdSearchInList();
	}

	private void createNewSearchStudioBeds() {
		onPage.selectFilterStudioBeds();
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
	public void selectContractFilter() {
		onPage.selectContractFilter();
	}

	@Step
	public void selectOffMktFilter() {
		onPage.selectOffMktFilter();
	}

	@Step
	public void selectSoldOrRentFilter() throws Exception {
		onPage.selectSoldOrRentFilter();
	}

	@Step
	public void selectRentedFilter() {
		onPage.selectRentedFilter();
	}

	@Step
	public void createNewSearchClick(){
		onPage.createNewSearchButtonClick();
	}

	@Step
    public void selectFilter1Bed() {
		onPage.selectFilter1Bed();
    }

	@Step
	public void clickFilter1Bed() {
		onPage.clickFilter1Bed();
		onPage.setUpSessionVariableForStatusFilter(onPage.getFilterFor1Bed());
	}

    @Step
	public void selectFilter3Beds() {
		onPage.selectFilter3Beds();
	}

	@Step
	public void selectFilter4PlusBeds() {
		onPage.selectFilter4PlusBeds();
	}

	@Step
	public void saveCurrentSearch() {
		this.clickTapToSaveChanges();
		this.setSearchName();
		this.clickSaveButton();
	}

	@Step
	public void checkNoOneBedsFilterSelected() {
		onPage.checkNoOneBedsFilterSelected();
	}

	@Step
	public void clickResetFilter() {
		onPage.clickOnResetFilters();
	}

	@Step
	public void selectFilter1AndHalfBath() {
		onPage.selectFilter1AndHalfBath();
	}
	@Step
	public void selectFilter2Baths() {
		onPage.selectFilter2Baths();
	}

	@Step
	public void selectFilter3Baths() {
		onPage.selectFilter3Baths();
	}

	@Step
	public void selectFilter4PlusBaths() {
		onPage.selectFilter4PlusBaths();
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

	@Step
	public void shouldMinPriceHaveTheSameValue() {
		Assert.assertTrue(onPage.isMinPriceSaved());
	}

	@Step
	public void shouldFilter1BedBeOfTheSameStatus() {
		Assert.assertTrue(onPage.isFilterFor1BedSaved());
	}

	@Step
	public void deselectFilterStudioBeds() {
		onPage.deselectFilterStudioBeds();
	}

	@Step
	public void deselectFilter1Bed() {
		onPage.deselectFilter1Bed();
	}

	@Step
	public void deselectFilter2Beds() {
		onPage.deselectFilter2Beds();
	}

	@Step
	public void deselectFilter3Beds() {
		onPage.deselectFilter3Beds();
	}

	@Step
	public void deselectFilter1Bath() {
		onPage.deselectFilter1Bath();
	}

	@Step
	public void deselectFilter1AndHalfBath() {
		onPage.deselectFilter1AndHalfBath();
	}

	@Step
	public void deselectFilter2Baths() {
		onPage.deselectFilter2Baths();
	}

	@Step
	public void deselectFilter3Baths() {
		onPage.deselectFilter3Baths();
	}

	@Step
	public void checkNoOneBathsFilterSelected() {
		onPage.checkNoOneBathsFilterSelected();
	}

	@Step
	public void eraseMinValueOfPriceFilter() {
		onPage.clearPriceFilterValue("minPrice");
	}

	@Step
	public void setMaximumPriceFilter(String amount) {
		onPage.setMaximumPriceFilter(amount);
		onPage.addValueInSessionVariable("max price", amount);
	}

	@Step
	public void checkNoOnePriceFilterSelected() {
		Assert.assertTrue(onPage.isMinAndMaxPricesNotSet());
	}

	@Step
	public void deselectActiveFilter() {
		onPage.deselectActiveFilter();
	}

	@Step
	public void deselectContractFilter() {
		onPage.deselectContractFilter();
	}

	@Step
	public void deselectOffMktFilter() {
		onPage.deselectOffMktFilter();
	}

	@Step
	public void checkSalesAndActiveFiltersSelected() {
		onPage.checkSalesAndActiveFiltersSelected();
	}

	@Step
	public void shouldFireplaceFilterBeApplied() {
		onPage.shouldFireplaceFilterBeSelected();
	}

	@Step
	public void should1BedFilterBeApplied() {
		onPage.should1BedFilterBeApplied();
	}

	@Step
	public void should1AndHalfBathFilterBeApplied() {
		onPage.should1AndHalfBathFilterBeApplied();
	}
}
