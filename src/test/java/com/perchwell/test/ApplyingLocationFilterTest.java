package com.perchwell.test;

import org.junit.Ignore;
import org.junit.Test;

public class ApplyingLocationFilterTest extends SampleTest {


	@Ignore
	@Test
public void resultAfterApplyingLocationFilter() {
	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.countItemsInListViewBeforApplyingFilter();
    perchwellSteps.clickMagnifer();
   // searchSteps.clickDeleteFirstLocation();
	searchSteps.clickDeleteSecondLocation();
	searchSteps.clickApplyButton();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.shoudSeeNoLessItemsInListViewAfterDeleteFilter();
	perchwellSteps.clickMap();
	mapSteps.ckickNotNowButton();
	mapSteps.countItemsInListView();
	mapSteps.countItemsInListAndMapViewIsSame();

}
}
