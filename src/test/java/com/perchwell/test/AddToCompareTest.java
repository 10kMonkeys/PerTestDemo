package com.perchwell.test;

import org.junit.Test;

public class AddToCompareTest extends SampleTest {


@Test
public void addToCompare() throws Exception {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.addToCompare();
	openedBuildingSteps.clickBackButton();
	perchwellSteps.openSecondBuilding();
	openedBuildingSteps.addToCompare();
	openedBuildingSteps.clickBackButton();
	perchwellSteps.openThirdBuilding();
	openedBuildingSteps.addToCompare();
	openedBuildingSteps.clickBackButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.clickCompareLabel();
	compareSteps.clickSwipeUpToRemoveHint();
	compareSteps.firstBuildingIsDispayed();
	compareSteps.shoudSeeFirstBuildingInCompare();
	compareSteps.secondBuildingIsDispayed();
	compareSteps.shoudSeeSecondBuildingInCompare();
	compareSteps.thirdBuildingIsDispayed();


}
}