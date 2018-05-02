package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "Second"})
public class ST14_ChangeExistingSearch extends SampleTest {

	@Test
	public void changeExistingSearch() {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.clickOnLoadSavedSearchButton();
		searchSteps.clickOnExistingSearchInList();
		perchwellSteps.countItemsInListView("The number of elements before search changing");
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.setMinimumPriceFilter("700000");
		searchSteps.clickOnFilter1Bed();
		searchSteps.clickOnApplyButton();
		perchwellSteps.countItemsInListView("The number of elements after search changing");
		perchwellSteps.resultsCountIsChanged("The number of elements before search changing","The number of elements after search changing");
		perchwellSteps.clickOnMyNewSearch();
		searchSteps.clickOnTapToSaveChanges();
		searchSteps.overwriteOptionSelect();
		perchwellSteps.countItemsInListView("The number of elements after overwrite");
		perchwellSteps.resultsCountIsEqual("The number of elements after overwrite","The number of elements after search changing");
		perchwellSteps.shouldSeeTheSameSearchName();
		perchwellSteps.clickOnMyNewSearch();
        searchSteps.shouldMinPriceHaveTheSameValue();
        searchSteps.shouldFilter1BedBeOfTheSameStatus();
	}

}
