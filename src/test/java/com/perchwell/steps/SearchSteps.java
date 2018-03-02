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
	public void setUpFilter2Beds() {
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
		onPage.addValueInSessionVariable("Search", onPage.generateRandomString("Search"));
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
	public void setFilterForStudioBeds() {
		onPage.setFilterForStudioBeds();
	}

	@Step
	public void setUpFilter1Bath() {
		onPage.setFilterFor1Bath();
	}

	@Step
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
		onPage.setFilterForStudioBeds();
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
}
