package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST15_ApplyingLocationFilterTest extends SampleTest {

@Ignore
	@Test
	public void resultAfterApplyingLocationFilter() {
	user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
	user.atPerchwellPage.skipAllHints();
	user.atPerchPopup.clickNotNowButton();
	user.atPerchwellPage.clickOnMyNewSearch();
	user.atSearchPage.deleteDefaultLocationInFilter();
	user.atSearchPage.addLocationFilter();
	user.atSearchPage.clickOnApplyButton();
	user.atPerchwellPage.shouldSeeListingsOnlyFromSelectedDistrict("ALPHABET CITY");
	}
}
