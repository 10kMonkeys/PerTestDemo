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
    public void clickOnMySavedSearches() {
        if (Config.isAndroid()) {
            onPage.clickLoadSavedSearchButton();
        }
    }

    @Step
    public void clickOnSaveSearchButton() {
        onPage.clickOnSaveSearchButton();
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

    @Step
    private void createNewSearchStudioBeds() {
        onPage.selectFilterStudioBeds();
        this.clickOnSaveSearchButton();
        this.setSearchName();
        this.clickOnSaveButton();
    }

    @Step
    public void clickOnExistingSearchInList() {
//		if (!onPage.isAnySearchExist()) {
//			PerchwellSteps perchwellSteps = new PerchwellSteps();
//			onPage.savedSearchCancelButtonClick();
//			createNewSearchStudioBeds();
//			perchwellSteps.clickOnMyNewSearch();
//			this.clickOnMySavedSearches();
//		}
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
    public void selectSoldOrRentFilter() {
        onPage.selectSoldOrRentFilter();
    }

    @Step
    public void selectRentalsProperty() {
        onPage.selectRentalsProperty();
    }

    @Step
    public void createNewSearchClick() {
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
        this.clickOnSaveSearchButton();
        this.setSearchName();
        this.clickOnSaveButton();
    }

    @Step
    public void checkNoOneBedsRangeFilterSelected() {
        onPage.checkNoOneBedsRangeFilterSelected();
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
    public void checkNoOneBathsRangeFilterSelected() {
        onPage.checkNoOneBathsRangeFilterSelected();
    }

    @Step
    public void eraseMinValueOfPriceFilter() {
        onPage.clearPriceFilterValue("minPrice");
    }

    @Step
    public void eraseMaxValueOfPriceFilter() {
        onPage.clearPriceFilterValue("maxPrice");
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
//		onPage.scrollToLaundryBLDG();
        onPage.setUpFilterLaundryBLDG();
    }

    @Step
    public void shouldLaundryBLDGFilterBeApplied() {
        onPage.shouldLaundryBLDGFilterBeApplied();
    }

    @Step
    public void removeManhattanFromFilter() {
        if (Config.isAndroid()) {
            onPage.clickDeleteTagButtonMANHATTAN();
        } else {
            onPage.clickOnNeighborhoodsPlusButton();
            onPage.uncheckManhattan();
            onPage.clickOnBackFromNeighborhoodsPage();
        }
    }

    @Step
    public void selectCondoFilter() {
        onPage.selectCondoFilter();
    }

    @Step
    public void selectOutdoorSpaceFilter() {
        onPage.selectOutdoorSpaceFilter();
    }

    @Step
    public void selectPrewarFilter() {
        onPage.selectPrewarFilter();
    }

    @Step
    public void setSquareFeetMinFilter(String value) {
        onPage.setSquareFeetMinFilter(value);
    }

    @Step
    public void clickOnDoormanFilter() {
        onPage.clickOnDoormanFilter();
    }

    @Step
    public void addElevatorFilter() {
        onPage.addElevatorFilter();
    }

    @Step
    public void clickOnLaundryBuildingFilter() {
        onPage.clickOnLaundryBuildingFilter();
    }

    @Step
    public void clickOnPetsFilter() {
        onPage.clickOnPetsFilter();
    }

    @Step
    public void clickOnDevelopmentFilter() {
        onPage.clickOnDevelopmentFilter();
    }

    @Step
    public void clickOnPoolFilter() {
        onPage.clickOnPoolFilter();
    }

    @Step
    public void clickOnFireplaceFilter() {
        onPage.clickOnFireplaceFilter();
    }

    @Step
    public void selectChelseaTag() {
        onPage.clickOnLocationFilter();
    }

    @Step
    public void setMinimumSquareFeet(String value) {
        onPage.setMinimumSquareFeet(value);
    }

    @Step
    public void clickOnLaundryUnitFilter() {
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

    @Step
    public void selectBathroomsRangeOption() {
        onPage.selectBathroomsRangeOption();
    }

    @Step
    public void selectBedroomsRangeOption() {
        onPage.selectBedroomsRangeOption();
    }

    @Step
    public void selectBedroomsRangeOptionIfNotSelected() {
        onPage.selectBedroomsRangeOptionIfNotSelected();
    }

    @Step
    public void selectStudioBedsMinimumFilter() {
        onPage.selectStudioBedsMinimumFilter();
    }

    @Step
    public void checkIfStudioBedsFilterIsDeselected() {
        onPage.checkIfStudioBedsFilterIsDeselected();
    }

    @Step
    public void selectOneBedMinimumFilter() {
        onPage.selectOneBedMinimumFilter();
    }

    @Step
    public void selectTwoBedsMinimumFilter() {
        onPage.selectTwoBedsMinimumFilter();
    }

    @Step
    public void selectThreeBedsMinimumFilter() {
        onPage.selectThreeBedsMinimumFilter();
    }

    @Step
    public void selectFourBedsMinimumFilter() {
        onPage.selectFourBedsMinimumFilter();
    }

    @Step
    public void selectOneBathMinimumFilter() {
        onPage.selectOneBathMinimumFilter();
    }

    @Step
    public void selectOneAndHalfBathroomsFilter() {
        onPage.selectOneAndHalfBathroomsFilter();
    }

    @Step
    public void selectTwoBathsMinimumFilter() {
        onPage.selectTwoBathsMinimumFilter();
    }

    @Step
    public void selectThreeBathsMinimumFilter() {
        onPage.selectThreeBathsMinimumFilter();
    }

    @Step
    public void selectFourBathsMinimumFilter() {
        onPage.selectFourBathsMinimumFilter();
    }

    @Step
    public void checkIfOneBathMinimumFilterIsDeselected() {
        onPage.checkIfOneBathMinimumFilterIsDeselected();
    }

    @Step
    public void deselectFilter4Beds() {
        onPage.deselectFilter4Beds();
    }

    @Step
    public void deselectFilter4Baths() {
        onPage.deselectFilter4Baths();
    }

    @Step
    public void selectBedroomsMinimumOption() {
        onPage.selectBedroomsMinimumOption();
    }

    @Step
    public void checkNoOneBedsMinimumFilterSelected() {
        onPage.checkNoOneBedsMinimumFilterSelected();
    }

    @Step
    public void checkNoOneBathsMinimumFilterSelected() {
        onPage.checkNoOneBathsMinimumFilterSelected();
    }

    @Step
    public void selectBathroomsMinimumOption() {
        onPage.selectBathroomsMinimumOption();
    }

    @Step
    public void check2BedsMinFilterSelected() {
        onPage.check2BedsMinFilterSelected();
    }

    @Step
    public void check2BedsRangeFilterSelected() {
        onPage.check2BedsRangeFilterSelected();
    }

    @Step
    public void checkMultiBedroomsFiltersSelected() {
        onPage.checkMultiBedroomsFiltersSelected();
    }

    @Step
    public void checkMultiBedroomsFiltersSelectedFrom1To3() {
        onPage.checkMultiBedroomsFiltersSelectedFrom1To3();
    }

    @Step
    public void check2BathsMinFilterSelected() {
        onPage.check2BathsMinFilterSelected();
    }

    @Step
    public void check2BathsRangeFilterSelected() {
        onPage.check2BathsRangeFilterSelected();
    }

    @Step
    public void checkMultiBathroomsFiltersSelected() {
        onPage.checkMultiBathroomsFiltersSelected();
    }

    @Step
    public void checkMultiBathroomsFiltersSelected1To3() {
        onPage.checkMultiBathroomsFiltersSelected1To3();
    }

    @Step
    public void checkBedroomsRangeButtonIsNotSelected() {
        onPage.checkBedroomsRangeButtonIsNotSelected();
    }

    @Step
    public void checkBathroomsRangeButtonIsNotSelected() {
        onPage.checkBathroomsRangeButtonIsNotSelected();
    }

    @Step
    public void collapseBedroomsFilters() {
        onPage.collapseBedroomsFilters();
    }

    @Step
    public void collapseBathroomsFilters() {
        onPage.collapseBathroomsFilters();
    }

    @Step
    public void checkBedroomsRangeButtonSelected() {
        onPage.checkBedroomsRangeButtonSelected();
    }

    @Step
    public void checkBathroomsRangeButtonSelected() {
        onPage.checkBathroomsRangeButtonSelected();
    }

    @Step
    public void expandManhattanSection() {
        onPage.expandManhattanSection();
    }

    @Step
    public void expandAllDownTownSection() {
        if (Config.isAndroid()) {
            onPage.expandAllDownTownSection();
        }
    }

    @Step
    public void clearSquareFeetMinFilter() {
        onPage.clearSquareFeetMinFilter();
    }

    @Step
    public void setSquareFeetMaxFilter(String value) {
        onPage.setSquareFeetMaxFilter(value);
    }

    @Step
    public void shouldSqFeetMinAndMaxFieldsCleared() {
        onPage.checkSqFeetMinFieldIsEmpty();
        onPage.checkSqFeetMaxFieldIsEmpty();
    }

    @Step
    public void deselectCondoFilter() {
        onPage.deselectCondoFilter();
    }

    @Step
    public void selectCoopFilter() {
        onPage.selectCoopFilter();
    }

    @Step
    public void deselectCoopFilter() {
        onPage.deselectCoopFilter();
    }

    @Step
    public void selectTownhouseFilter() {
        onPage.selectTownhouseFilter();
    }

    @Step
    public void selectSalesProperty() {
        onPage.selectSalesProperty();
    }

    @Step
    public void checkNoOnePropertyIsSelectedInSales() {
        onPage.checkNoOnePropertyIsSelectedInSales();
    }

    @Step
    public void checkNoOnePropertyIsSelectedInRentals() {
        onPage.checkNoOnePropertyIsSelectedInRentals();
    }

    @Step
    public void swipeToPropertiesSection() {
        onPage.swipeToPropertiesSection();
    }

    @Step
    public void deselectTownhouseFilter() {
        onPage.deselectTownhouseFilter();
    }

    @Step
    public void selectRentalFilter() {
        onPage.selectRentalFilter();
    }

    @Step
    public void clickOnCollapsePropertyButton() {
        onPage.clickOnCollapsePropertyButton();
    }

    @Step
    public void checkCondoFilterIsSelectedInSalesProperty() {
        onPage.checkCondoFilterIsSelectedInSalesProperty();
    }

    @Step
    public void checkCondoFilterIsSelectedInRentalsProperty() {
        onPage.checkCondoFilterIsSelectedInRentalsProperty();
    }

    @Step
    public void saveCurrentFirstSearch() {
        this.clickOnSaveSearchButton();
        this.setFirstSearchName();
        this.clickOnSaveButton();
    }

    @Step
    public void saveCurrentSecondSearch() {
        this.clickOnSaveSearchButton();
        this.setSecondSearchName();
        this.clickOnSaveButton();
    }

    @Step
    private void setFirstSearchName() {
        SessionVariables.addValueInSessionVariable("FirstSearch", onPage.generateRandomString("SEARCH"));
        onPage.setSearchName(SessionVariables.getValueFromSessionVariable("FirstSearch"));
    }

    @Step
    private void setSecondSearchName() {
        SessionVariables.addValueInSessionVariable("SecondSearch", onPage.generateRandomString("SEARCH"));
        onPage.setSearchName(SessionVariables.getValueFromSessionVariable("SecondSearch"));
    }

    @Step
    public void clickOnPreviouslyCreatedFirstSearch() {
        onPage.clickOnPreviouslyCreatedSearch(SessionVariables.getValueFromSessionVariable("FirstSearch"));
    }

    @Step
    public void clickOnPreviouslyCreatedSecondSearch() {
        onPage.clickOnPreviouslyCreatedSearch(SessionVariables.getValueFromSessionVariable("SecondSearch"));
    }

    @Step
    public void fillInAddressSearchField(String address) {
        onPage.searchDistrict(address);
    }

    @Step
    public void closeSearch() {
        onPage.closeSearch();
    }

    @Step
    public void checkManhattanIsNotVisible() {
        onPage.checkManhattanIsNotVisible();
    }

    @Step
    public void addThreeBuildingFilters(String value) {
        onPage.clickOnSearchByAddressButton();
        onPage.searchDistrict(value);
        onPage.clickOnFirstSixListings();
        onPage.clickOnBackFromNeighborhoodsPage();
    }

    @Step
    public void checkIfBuildingsFilterChangesAreSaved() {
        onPage.checkIfBuildingsFilterChangesAreSaved();
    }

    @Step
    public void clearMinimumPriceFilters() {
        onPage.clearMinimumPriceFilters();
    }

    @Step
    public void clearMaximumPriceFilters() {
        onPage.clearMaximumPriceFilters();
    }

    @Step
    public void deleteThreeFirstBuildingFilters() {
        onPage.deleteFirstBuildingFilter();
    }

    @Step
    public void checkIfBedAndBathThreeMinimumFiltersAreSelected() {
        onPage.checkIfBedAndBathThreeMinimumFiltersAreSelected();
    }

    @Step
    public void checkIfBedAndBathThreeRangeFiltersAreSelected() {
        onPage.checkIfBedAndBathThreeRangeFiltersAreSelected();
    }

    @Step
    public void fillInTotalRoomsMinField(String value) {
        onPage.fillInTotalRoomsMinField(value);
    }

    @Step
    public void clearTotalRoomsMinValueFiled() {
        onPage.clearTotalRoomsMinValueFiled();
    }

    @Step
    public void clickOnOutdoorSpaceFilter() {
        onPage.clickOnOutdoorSpaceFilter();
    }

    @Step
    public void checkLaundryBuildingAndOutdoorSpaceFiltersAreSelected() {
        onPage.checkLaundryBuildingAndOutdoorSpaceFiltersAreSelected();
    }

    @Step
    public void deselectOutDoorSpaceCheckmarkFilter() {
        onPage.deselectOutDoorSpaceCheckmarkFilter();
    }

    @Step
    public void openCustomBoundariesPage() {
        onPage.openCustomBoundariesPage();
    }

    @Step
    public void checkJustCreatedCustomBoundaryIsDisplayed() {
        onPage.checkJustCreatedCustomBoundaryIsDisplayed();
    }

    @Step
    public void openJustCreatedCustomBoundary() {
        onPage.openJustCreatedCustomBoundary();
    }

    @Step
    public void removeJustCreatedCustomBoundary() {
        onPage.removeJustCreatedCustomBoundary();
    }

    @Step
    public void selectSponsorOption() {
        onPage.selectSponsorOption();
    }

    @Step
    public void checkIfSponsorOptionIsSelected() {
        onPage.checkIfSponsorOptionIsSelected();
    }

    @Step
    public void selectResaleOption() {
        onPage.selectResaleOption();
    }

    @Step
    public void fillInPricePerSquareFeetMinField(String value) {
        onPage.fillInPricePerSquareFeetMinField(value);
    }

    @Step
    public void fillInPricePerSquareFeetMaxField(String value) {
        onPage.fillInPricePerSquareFeetMaxField(value);
    }

    @Step
    public void clearMinPricePerSFTField() {
        onPage.clearMinPricePerSFTField();
    }

    @Step
    public void clearMaxPricePerSFTField() {
        onPage.clearMaxPricePerSFTField();
    }

    @Step
    public void fillInMonthliesMinField(String value) {
        onPage.fillInMonthliesMinField(value);
    }

    @Step
    public void fillInMonthliesMaxField(String value) {
        onPage.fillInMonthliesMaxField(value);
    }

    @Step
    public void clearMinMonthliesField() {
        onPage.clearMinMonthliesField();
    }

    @Step
    public void clearMaxMonthliesField() {
        onPage.clearMaxMonthliesField();
    }

    @Step
    public void fillInFinancingMinField(String value) {
        onPage.fillInFinancingMinField(value);
    }

    @Step
    public void fillInFinancingMaxField(String value) {
        onPage.fillInFinancingMaxField(value);
    }

    @Step
    public void clearMinFinancingField() {
        onPage.clearMinFinancingField();
    }

    @Step
    public void clearMaxFinancingField() {
        onPage.clearMaxFinancingField();
    }

    @Step
    public void selectCorePublicOption() {
        onPage.selectCorePublicOption();
    }

    @Step
    public void selectOtherPublicOption() {
        onPage.selectOtherPublicOption();
    }

    @Step
    public void checkIfFieldIsFilledByCorrectValue(String element, String value) {
        onPage.checkIfFieldIsFilledByCorrectValue(element, value);
    }

    @Step
    public void enterTextInTextSearchField(String value) {
        onPage.enterTextInTextSearchField(value);
    }

    @Step
    public void clearTextSearchField() {
        onPage.clearTextSearchField();
    }

    @Step
    public void checkThatAllOfTheseTermsButtonSelected() {
        onPage.checkThatAllOfTheseTermsButtonSelected();
    }

    @Step
    public void clickOnAllOfTheseTermsButton() {
        onPage.clickOnAllOfTheseTermsButton();
    }

    @Step
    public void clickOnAnyOfTheseTermsButton() {
        onPage.clickOnAnyOfTheseTermsButton();
    }

    @Step
    public void checkThatTextSearchFieldSavedText(String value) {
        onPage.checkThatTextSearchFieldSavedTest(value);
    }

    @Step
    public void clearSquareFeetMaxFilter() {
        onPage.clearSquareFeetMaxFilter();
    }

    @Step
    public void setMaxBldgWidthValue() throws Exception {
        onPage.setMaxBldgWidthValue();
    }

    @Step
    public void setDateRangeForNextMonth(String firstDate, String secondDate) {
        onPage.openNextMonthPage();
        onPage.setDateRange(firstDate);
        onPage.setDateRange(secondDate);
    }

    @Step
    public void checkIfOpenHouseDateRangeIsCorrect(String firstDate, String secondDate) {
        onPage.checkIfOpenHouseDateRangeIsCorrect(firstDate, secondDate);
    }

    @Step
    public void setDateRangeForPreviousMonth(String firstDate, String secondDate) {
        onPage.openPreviousMonthPage();
        onPage.setDateRange(firstDate);
        onPage.setDateRange(secondDate);
    }

    @Step
    public void selectListedListingActivityOption() {
        onPage.selectListedListingActivityOption();
    }

    @Step
    public void clickOnResetDateButton() {
        onPage.clickOnResetDataButton();
    }

    @Step
    public void clickOnListingActivityMinValueField() {
        onPage.clickOnListingActivityMinValueField();
    }

    @Step
    public void closeCalendar() {
        onPage.clickOnCloseCalendarButton();
    }

    @Step
    public void clickOnOpenHouseMinValueField() {
        onPage.clickOnOpenHouseMinValueField();
    }

    public void checkIfListingStatusDateRangeIsCorrect(String firstDate, String secondDate) {
        onPage.checkIfListingStatusDateRangeIsCorrect(firstDate, secondDate);
    }

    @Step
    public void checkIfCorePublicOptionIsSelected() {
        onPage.checkIfCorePublicOptionIsSelected();
    }

    @Step
    public void checkIfMaxBldgWidthValueIsCorrect(String maxFilterValue) {
        onPage.checkIfMaxBldgWidthValueIsCorrect(maxFilterValue);
    }

    @Step
    public void clickOnListingByAddress(String address) {
        onPage.clickOnListingByAddress(address);
    }

    @Step
    public void fillInTotalRoomsMaxField(String value) {
        onPage.fillInTotalRoomsMaxField(value);
    }

    @Step
    public void clearTotalRoomsMaxValueFiled() {
        onPage.clearTotalRoomsMaxValueFiled();
    }

    @Step
    public void singleUpSwipeForAndroid() {
        onPage.singleUpSwipeForAndroid();
    }
}
