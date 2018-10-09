package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
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
	public void clickOnLoadSavedSearchButton() {
		onPage.clickLoadSavedSearchButton();
	}

	@Step
	public void clickOnTapToSaveChanges() {
		onPage.clickOnTapToSaveChanges();
	}

	@Step
	public void setSearchName() {
		SessionVariables.addValueInSessionVariable("Search", onPage.generateRandomString("SEARCH"));
		onPage.setSearchName(SessionVariables.getValueFromSessionVariable("Search"));
	}

	@Step
	public void clickOnSaveButton() {
		onPage.clickOnSaveButton();
	}

	@Step
	public void clickOnPreviouslyCreatedSearch() {
		onPage.clickOnPreviouslyCreatedSearch(SessionVariables.getValueFromSessionVariable("Search"));
	}

	@Step
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

	@Step
	public void deleteManhattan() {
		onPage.uncheckManhattan();
	}

	@Step
	public void deleteBrooklyn() {
		onPage.uncheckBrooklyn();
	}

	@Step
	public void deleteQueens() {
		onPage.uncheckQueens();
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
	public void checkSalesAndActiveFiltersSelected() throws Exception {
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
		if(Config.isAndroid()) {
			onPage.clickDeleteTagButtonMANHATTAN();
		} else {
			onPage.clickOnNeighborhoodsPlusButton();
			onPage.uncheckManhattan();
			onPage.clickOnBackFromNeighborhoodsPage();
		}
    }

	@Step
    public void selectCondoFilter() throws Exception {
		onPage.selectCondoFilter();
    }

    @Step
	public void selectOutdoorSpaceFilter() throws Exception {
		onPage.selectOutdoorSpaceFilter();
	}

	@Step
	public void selectPrewarFilter() throws Exception {
		onPage.selectPrewarFilter();
	}

	@Step
	public void setSquareFeetMinFilterToSixK() throws Exception {
		onPage.setSquareFeetMinFilterToSixK();
	}

	@Step
	public void clickOnDoormanFilter() throws Exception {
		onPage.clickOnDoormanFilter();
	}

	@Step
	public void AddElevatorFilter() throws Exception {
		onPage.AddElevatorFilter();
	}

	@Step
	public void clickOnLaundryBuildingFilter() throws Exception {
		onPage.clickOnLaundryBuildingFilter();
	}

	@Step
	public void clickOnPetsFilter() throws Exception {
		onPage.clickOnPetsFilter();
	}

	@Step
	public void clickOnDevelopmentFilter() throws Exception {
		onPage.clickOnDevelopmentFilter();
	}

	@Step
	public void clickOnPoolFilter() throws Exception {
		onPage.clickOnPoolFilter();
	}

	@Step
	public void clickOnFireplaceFilter() throws Exception {
		onPage.clickOnFireplaceFilter();
	}

	@Step
	public void selectChelseaTag() {
		onPage.clickOnLocationFilter();
	}

	@Step
	public void setMinimumSquareFeet(String value) throws Exception {
		onPage.setMinimumSquareFeet(value);
	}

	@Step
	public void clickOnLaundryUnitFilter() throws Exception {
		onPage.clickOnLaundryUnitFilter();
	}

	@Step
	public void clickOnApplyButtonWithoutKeyboard() {
		onPage.clickOnApplyButtonWithoutKeyboard();
	}

	@Step
	public void clickOnNeighborhoodsPlusButton() {
		onPage.clickOnNeighborhoodsPlusButton();
	}

	@Step
	public void addAlphabetCity() {
		onPage.clickOnAlphabetCityCheckbox();
	}

	@Step
	public void clickOnBackFromNeighborhoodsPage() {
		onPage.clickOnBackFromNeighborhoodsPage();
	}

	@Step
	public void selectDistrict(String district, String districtID) {
		onPage.searchDistrict(district);
		onPage.selectDistrict(districtID);
	}

	@Step
	public void deleteMidwoodFromFilter() {
		onPage.uncheckMidwoodFromFilter();
	}

	@Step
	public void deleteAllUpperEastSideFromFilter() {
		onPage.uncheckAllUpperEastSideFromFilter();
	}

	@Step
	public void deleteCarnegieHillsFromFilter() {
		onPage.uncheckCarnegieHillsFromFilter();
	}

	@Step
	public void deleteUpperEastSideFromFilter() {
		onPage.uncheckUpperEastSideFromFilter();
	}

	@Step
	public void deleteYorkvilleFromFilter() {
		onPage.uncheckYorkvilleFromFilter();
	}

	@Step
	public void clickOnSearchByAddressButton() {
		onPage.clickOnSearchByAddressButton();
	}

	@Step
	public void fillInSearchField(String value) {
		onPage.fillInSearchField(value);
	}

	@Step
	public void clickOnTestBuilding() {
		onPage.clickOnTestBuilding();
	}

	@Step
	public void clickOnShowMoreFeaturesAndAmenitiesButton() {
		onPage.clickOnShowMoreFeaturesAndAmenitiesButton();
	}
}
