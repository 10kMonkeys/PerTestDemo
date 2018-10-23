package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Districts;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST15_ApplyingLocationFilterTest extends SampleTest {

	@Test
	public void resultAfterApplyingLocationFilter() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
					AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnNeighborhoodsPlusButton();
		user.atSearchPage.expandManhattanSection();
		user.atSearchPage.addAlphabetCity();
		user.atSearchPage.deleteBrooklyn();
		user.atSearchPage.deleteQueens();
		user.atSearchPage.clickOnBackFromNeighborhoodsPage();
		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.shouldSeeListingsOnlyFromSelectedDistrict(Districts.ALPHABET_CITY);
	}
}
