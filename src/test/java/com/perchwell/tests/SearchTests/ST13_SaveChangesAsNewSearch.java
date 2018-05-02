package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "Second"})
public class ST13_SaveChangesAsNewSearch extends SampleTest {

	@Test
	public void changeExistingSearch() {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.clickOnLoadSavedSearchButton();
		searchSteps.clickOnExistingSearchInList();
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.setMinimumPriceFilter("150000");
		searchSteps.clickOnFilterStudioBeds();
		searchSteps.clickOnTapToSaveChanges();
		searchSteps.saveAsOptionSelect();
		searchSteps.setSearchName();
		searchSteps.clickOnSaveButton();
		perchwellSteps.shouldSeePreviouslyCreatedNameOfSearch();
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.clickOnLoadSavedSearchButton();
		searchSteps.shouldSeePreviouslyCreatedSearch();
	}
}
