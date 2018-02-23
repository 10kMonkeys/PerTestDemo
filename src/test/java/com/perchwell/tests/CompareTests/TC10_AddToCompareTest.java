package com.perchwell.tests.CompareTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;

@WithTag(type = "SmokeTestSuit", name = "CompareTests")
public class TC10_AddToCompareTest extends SampleTest {

	@Test
	public void addToCompare() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.addToCompare("the first building");
		openedBuildingSteps.clickBackButton();
		perchwellSteps.openSecondBuilding();
		openedBuildingSteps.addToCompare("the second building");
		openedBuildingSteps.clickBackButton();
		perchwellSteps.openThirdBuilding();
		openedBuildingSteps.addToCompare("the third building");
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickCompareLabel();
		compareSteps.clickSwipeUpToRemoveHint();
		//compareSteps.firstBuildingIsDispayed();
		compareSteps.shoudSeeFirstBuildingInCompare("the first building");
		//compareSteps.secondBuildingIsDispayed();
		compareSteps.shoudSeeSecondBuildingInCompare("the second building");
		compareSteps.thirdBuildingIsDispayed("the third building");
	}
}