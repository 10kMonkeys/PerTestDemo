package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ElementsNumberTitles;
import com.perchwell.data.FilterPrices;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "iOS_Second", "Android_Second", "Second"})
public class ST14_ChangeExistingSearch extends SampleTest {

	@Test
	public void saveChangesAsNewSearch() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.usingComplexSteps.saveNewSearchAndStartNewSearch(); //search new and old inside
		user.atPerchwellPage.clickOnMyNewSearch(); //search old
		user.atSearchPage.clickOnMySavedSearches(); //search old
		user.inSearchMenu.openSavedSearches(); //search new
		user.atSearchPage.clickOnExistingSearchInList(); //temp comment inside + update to select just created search, not 1st
		user.atPerchwellPage.countItemsInListView(ElementsNumberTitles.QTY_BEFORE_SEARCH_CHANGING);
		user.atPerchwellPage.clickOnMyNewSearch(); //search old
		user.inSearchMenu.openSearchPage(); //search new
		user.atSearchPage.setMinimumPriceFilter(FilterPrices.ST14_MIN_PRICE);
		user.atSearchPage.selectBedroomsRangeOptionIfNotSelected();
		user.atSearchPage.clickOnFilter1Bed(); // selected filters missed
		user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
		user.atPerchwellPage.countItemsInListView(ElementsNumberTitles.QTY_AFTER_SEARCH_CHANGING);
		user.atPerchwellPage.resultsCountIsChanged(ElementsNumberTitles.QTY_BEFORE_SEARCH_CHANGING,
				ElementsNumberTitles.QTY_AFTER_SEARCH_CHANGING);
		user.atPerchwellPage.clickOnMyNewSearch(); //search old
		user.atSearchPage.clickOnSaveSearchButton();
		user.atSearchPage.overwriteOptionSelect();
		user.atPerchwellPage.countItemsInListView(ElementsNumberTitles.QTY_AFTER_OVERWRITE);
		user.atPerchwellPage.resultsCountIsEqual(ElementsNumberTitles.QTY_AFTER_OVERWRITE,
				ElementsNumberTitles.QTY_AFTER_SEARCH_CHANGING);
		user.atPerchwellPage.shouldSeeTheSameSearchName();
		user.atPerchwellPage.clickOnMyNewSearch(); //search old
		user.inSearchMenu.openSearchPage(); //search new
		user.atSearchPage.shouldMinPriceHaveTheSameValue();
		user.atSearchPage.shouldFilter1BedBeOfTheSameStatus(); // selected filters missed
	}
}
