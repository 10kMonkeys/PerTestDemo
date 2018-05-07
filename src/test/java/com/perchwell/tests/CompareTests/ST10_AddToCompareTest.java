package com.perchwell.tests.CompareTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Buildings;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "CompareTests", "First"})
public class ST10_AddToCompareTest extends SampleTest {

	@Test
	public void addToCompare() throws Exception {

		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.addToCompare(Buildings.FIRSTBUILDING);
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.openSecondBuilding();
		user.atOpenedBuildingPage.addToCompare(Buildings.SECONDBUILDING);
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.openThirdBuilding();
		user.atOpenedBuildingPage.addToCompare(Buildings.THIRDBUILDING);
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnCompareLabel();
		user.atComparePage.clickOnSwipeUpToRemoveHint();
		user.atComparePage.shouldSeeFirstBuildingInCompare(Buildings.FIRSTBUILDING);
		user.atComparePage.shouldSeeSecondBuildingInCompare(Buildings.SECONDBUILDING);
		user.atComparePage.thirdBuildingIsDisplayed(Buildings.THIRDBUILDING);
	}
}