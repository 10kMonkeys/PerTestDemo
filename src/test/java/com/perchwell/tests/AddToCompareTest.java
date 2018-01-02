package com.perchwell.tests;

import org.junit.Test;

public class AddToCompareTest extends SampleTest {


@Test
public void addToCompare() throws Exception {

	loginSteps.loginAsBroker();
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
	compareSteps.firstBuildingIsDispayed();
	compareSteps.shoudSeeFirstBuildingInCompare("the first building");
	compareSteps.secondBuildingIsDispayed();
	compareSteps.shoudSeeSecondBuildingInCompare("the second building");
	compareSteps.thirdBuildingIsDispayed("the third building");


}
}