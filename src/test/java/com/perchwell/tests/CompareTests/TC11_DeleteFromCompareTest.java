package com.perchwell.tests.CompareTests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class TC11_DeleteFromCompareTest extends SampleTest {



@Test
public void deleteFromCompare() throws Exception {

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
	compareSteps.shoudSeeFirstBuildingInCompare("the first building");
	compareSteps.scrollUpFirstBuilding();
	compareSteps.shoudSeeRemovePropertyMsg();
	compareSteps.clickCancelMsgButton();
	compareSteps.shoudSeeFirstBuildingInCompare("the first building");
	compareSteps.scrollUpFirstBuilding();
	compareSteps.clickRemoveMsgButtom();
	compareSteps.notSeeFirstBuildingInCompare("the first building");


}
}