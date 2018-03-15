package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests"})
public class TC13_SaveChangesAsNewSearch  extends SampleTest {


	@Test
	public void changeExistingSearch(){

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMyNewSearch();

		searchSteps.clickLoadSavedSearchButton();
		searchSteps.clickExistingSearchInList();
		perchwellSteps.clickMyNewSearch();

		searchSteps.setMinimumPriceFilter("150000");
		searchSteps.clickFilterStudioBeds();

		searchSteps.clickTapToSaveChanges();
		searchSteps.saveAsOptionSelect();
		searchSteps.setSearchName();
		searchSteps.clickSaveButton();
		perchwellSteps.shouldSeePreviouslyCreatedNameOfSearch();
		perchwellSteps.clickMyNewSearch();

		searchSteps.clickLoadSavedSearchButton();
		searchSteps.shouldSeePreviouslyCreatedSearch();




	}

}
