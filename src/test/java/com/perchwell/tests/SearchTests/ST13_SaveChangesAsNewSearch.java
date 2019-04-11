package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.data.FilterPrices;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "iOS_Second", "Android_Second", "Second"})
public class ST13_SaveChangesAsNewSearch extends SampleTest {

	@Test
	public void changeExistingSearch() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atSearchPage.clickOnSaveSearchButton();
		user.atSearchPage.setSearchName();
		user.atSearchPage.clickOnSaveButton();
		user.inSearchMenu.openSearchPage(); //new search
		user.atSearchPage.setMinimumPriceFilter(FilterPrices.ST13_MIN_PRICE);
		user.atSearchPage.selectBedroomsRangeOptionIfNotSelected();
		user.atSearchPage.clickOnFilterStudioBeds(); //add (No 'selected' attribute)
		user.atSearchPage.clickOnSaveSearchButton();
		user.atSearchPage.saveAsOptionSelect();
		user.atSearchPage.setSearchName();
		user.atSearchPage.clickOnSaveButton();
		user.atPerchwellPage.shouldSeePreviouslyCreatedNameOfSearch();
		user.inSearchMenu.openSavedSearches(); //search new
		user.atSearchPage.shouldSeePreviouslyCreatedSearch();
	}
}
