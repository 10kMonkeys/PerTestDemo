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
	public void setUpFilter2Bads() {
		onPage.selectFilterFor2Bads();
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
}
