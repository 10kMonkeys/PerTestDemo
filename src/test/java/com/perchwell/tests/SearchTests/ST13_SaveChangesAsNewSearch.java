package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.data.FilterPrices;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "Second"})
public class ST13_SaveChangesAsNewSearch extends SampleTest {

	@Test
	public void changeExistingSearch() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnTapToSaveChanges();
		user.atSearchPage.setSearchName();
		user.atSearchPage.clickOnSaveButton();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.setMinimumPriceFilter(FilterPrices.ST13_MIN_PRICE);
		user.atSearchPage.selectBedroomsRangeOptionIfNotSelected();
		user.atSearchPage.clickOnFilterStudioBeds(); //add (No 'selected' attribute)
		user.atSearchPage.clickOnTapToSaveChanges();
		user.atSearchPage.saveAsOptionSelect();
		user.atSearchPage.setSearchName();
		user.atSearchPage.clickOnSaveButton();
		user.atPerchwellPage.shouldSeePreviouslyCreatedNameOfSearch();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnLoadSavedSearchButton();
		user.atSearchPage.shouldSeePreviouslyCreatedSearch(); //
	}
}
