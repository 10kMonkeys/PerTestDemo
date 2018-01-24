package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Ignore;
import org.junit.Test;

public class ApplyingLocationFilterTest extends SampleTest {


@Ignore
	@Test
public void resultAfterApplyingLocationFilter() throws Exception {
	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.countItemsInListViewBeforApplyingFilter();
    perchwellSteps.clickMyNewSearch();
   // searchSteps.clickDeleteFirstLocation();
	searchSteps.clickDeleteSecondLocation();
	searchSteps.clickApplyButton();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.shoudSeeNoLessItemsInListViewAfterDeleteFilter();
	perchwellSteps.clickMap();
	mapSteps.clickNotNowButton();
	mapSteps.countItemsInMapView();
	mapSteps.itemsInListAndMapViewIsSame();

}
}
