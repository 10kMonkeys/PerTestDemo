package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests"})
public class TC14_ChangeExistingSearch extends SampleTest {

	@Test
	public void changeExistingSearch() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMyNewSearch();

		searchSteps.clickLoadSavedSearchButton();
		searchSteps.clickExistingSearchInList();
		perchwellSteps.countItemsInListView("The number of elements before search changing");


		perchwellSteps.clickMyNewSearch();
		searchSteps.setMinimumPriceFilter("700000");
		searchSteps.clickFilter1Bath();
		searchSteps.clickApplyButton();

		perchwellSteps.countItemsInListView("The number of elements after search changing");
		perchwellSteps.resultsCountIsChanged("The number of elements before search changing","The number of elements after search changing");
		perchwellSteps.clickMyNewSearch();
		searchSteps.clickTapToSaveChanges();
		searchSteps.overwriteOptionSelect();
		perchwellSteps.countItemsInListView("The number of elements after overwrite");
		perchwellSteps.resultsCountIsEqual("The number of elements after overwrite","The number of elements after search changing");
		perchwellSteps.shouldSeeTheSameSearchName();
		perchwellSteps.clickMyNewSearch();

	}

}
