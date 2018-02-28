package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;

@WithTag(type = "SmokeTestSuit", name = "FiltersTests")
public class TC15_ApplyingLocationFilterTest extends SampleTest {

@Ignore
	@Test
	public void resultAfterApplyingLocationFilter() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickMyNewSearch();
		searchSteps.deleteDefaultLocationInFilter();
		searchSteps.addLocationFilter();
		searchSteps.clickApplyButton();
		perchwellSteps.shouldSeeListingsOnlyFromSelectedDistrict("ALPHABET CITY");

	}
}
