package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "Second"})
public class ST14_ChangeExistingSearch extends SampleTest {

	@Test
	public void changeExistingSearch() {

		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();

		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.selectFilter1Bed();
		user.atSearchPage.selectFilter4PlusBeds();
		user.atSearchPage.saveCurrentSearch();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnLoadSavedSearchButton();
		user.atSearchPage.createNewSearchClick();
		user.atSearchPage.clickOnApplyButton();

		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnLoadSavedSearchButton();
		user.atSearchPage.clickOnExistingSearchInList();
		user.atPerchwellPage.countItemsInListView("The number of elements before search changing");
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.setMinimumPriceFilter("700000");
		user.atSearchPage.clickOnFilter1Bed();
		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.countItemsInListView("The number of elements after search changing");
		user.atPerchwellPage.resultsCountIsChanged("The number of elements before search changing","The number of elements after search changing");
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnTapToSaveChanges();
		user.atSearchPage.overwriteOptionSelect();
		user.atPerchwellPage.countItemsInListView("The number of elements after overwrite");
		user.atPerchwellPage.resultsCountIsEqual("The number of elements after overwrite","The number of elements after search changing");
		user.atPerchwellPage.shouldSeeTheSameSearchName();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.shouldMinPriceHaveTheSameValue();
		user.atSearchPage.shouldFilter1BedBeOfTheSameStatus();
	}
}
