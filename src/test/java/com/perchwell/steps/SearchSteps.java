package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {

	SearchPage onPage;

	@Step
	public void clickOnDeleteSecondLocation() {
		onPage.clickOnDeleteSecondLocation();
	}

	@Step
	public void clickOnApplyButton() {
		onPage.clickOnApplyButton();
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
	public void clickOnLoadSavedSearchButton() {
		onPage.clickLoadSavedSearchButton();
	}

	@Step
	public void clickOnTapToSaveChanges() {
		onPage.clickOnTapToSaveChanges();
	}

	public void setSearchName() {
		SessionVariables.addValueInSessionVariable("Search", onPage.generateRandomString("SEARCH"));
		onPage.setSearchName(SessionVariables.getValueFromSessionVariable("Search"));
	}

	public void clickOnSaveButton() {
		onPage.clickOnSaveButton();
	}

	public void clickOnPreviouslyCreatedSearch() {
		onPage.clickOnPreviouslyCreatedSearch(SessionVariables.getValueFromSessionVariable("Search"));
	}

	public void shouldSeePreviouslyCreatedSearch() {
		onPage.shouldSeePreviouslyCreatedSearch(SessionVariables.getValueFromSessionVariable("Search"));
	}

	@Step
	public void setMinimumPriceFilter(String amount) {
		onPage.setMinimumPriceFilter(amount);
		SessionVariables.addValueInSessionVariable("min_price", amount);
	}

	@Step
	public void selectFilterStudioBeds() {
		onPage.selectFilterStudioBeds();
	}

	@Step
	public void clickOnFilterStudioBeds() {
		onPage.clickOnFilterStudioBeds();
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
	}

	@Step
	public void clickOnThirdSearchInList() {
		onPage.clickOnThirdSearchInList();
	}

	private void createNewSearchStudioBeds() {
		onPage.selectFilterStudioBeds();
		this.clickOnTapToSaveChanges();
		this.setSearchName();
		this.clickOnSaveButton();
	}

	@Step
	public void clickOnExistingSearchInList() {
		if (!onPage.isAnySearchExist()) {
			PerchwellSteps perchwellSteps = new PerchwellSteps();
			onPage.savedSearchCancelButtonClick();
			createNewSearchStudioBeds();
			perchwellSteps.clickOnMyNewSearch();
			this.clickOnLoadSavedSearchButton();
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
	public void clickOnFilter1Bed() {
		onPage.clickOnFilter1Bed();
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
		this.clickOnTapToSaveChanges();
		this.setSearchName();
		this.clickOnSaveButton();
	}

	@Step
	public void checkNoOneBedsFilterSelected() {
		onPage.checkNoOneBedsFilterSelected();
	}

	@Step
	public void clickOnResetFilter() {
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
		onPage.swipeCreatedSearch(SessionVariables.getValueFromSessionVariable("Search"));
	}

	@Step
	public void clickOnDeleteSearchButton() {
		onPage.clickOnDeleteSearchButton();
	}

	@Step
	public void shouldDeleteSearch() {
		onPage.shouldDeleteSearch();
	}

	@Step
	public void shouldMinPriceHaveTheSameValue() {
		onPage.shouldMinPriceHaveTheSameValue();
	}

	@Step
	public void shouldFilter1BedBeOfTheSameStatus() {
		onPage.shouldFilter1BedBeOfTheSameStatus();
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
		SessionVariables.addValueInSessionVariable("max_price", amount);
	}

	@Step
	public void checkNoOnePriceFilterSelected() {
		onPage.shouldNoOnePriceFilterBeSelected();
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

	@Step
    public void removeBrooklynFromFilter() {
    	onPage.removeBrooklynFromFilter();
	}

	@Step
	public void setUpFilterLaundryBLDG() {
		onPage.scrollToLaundryBLDG();
		onPage.setUpFilterLaundryBLDG();
	}

	@Step
	public void shouldLaundryBLDGFilterBeApplied() {
		onPage.shouldLaundryBLDGFilterBeApplied();
	}

	@Step
    public void removeManhattanFromFilter() {
		onPage.clickDeleteTagButtonMANHATTAN();
    }
}
