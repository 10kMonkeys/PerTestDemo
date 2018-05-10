package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ElementsNumberTitles;
import com.perchwell.data.FilterPrices;
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
		user.usingComplexSteps.saveNewSearchAndStartNewSearch();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnLoadSavedSearchButton();
		user.atSearchPage.clickOnExistingSearchInList();
		user.atPerchwellPage.countItemsInListView(ElementsNumberTitles.QTYBEFORESEARCHCHANGING);
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.setMinimumPriceFilter(FilterPrices.ST14MINPRICE);
		user.atSearchPage.clickOnFilter1Bed();
		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.countItemsInListView(ElementsNumberTitles.QTYAFTERSEARCHCHANGING);
		user.atPerchwellPage.resultsCountIsChanged(ElementsNumberTitles.QTYBEFORESEARCHCHANGING,
				ElementsNumberTitles.QTYAFTERSEARCHCHANGING);
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnTapToSaveChanges();
		user.atSearchPage.overwriteOptionSelect();
		user.atPerchwellPage.countItemsInListView(ElementsNumberTitles.QTYAFTEROVERWRITE);
		user.atPerchwellPage.resultsCountIsEqual(ElementsNumberTitles.QTYAFTEROVERWRITE,
				ElementsNumberTitles.QTYAFTERSEARCHCHANGING);
		user.atPerchwellPage.shouldSeeTheSameSearchName();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.shouldMinPriceHaveTheSameValue();
		user.atSearchPage.shouldFilter1BedBeOfTheSameStatus();
	}
}
