package com.perchwell;

import org.junit.Test;

public class DeleteFromCompareTest extends SampleTest{



@Test
public void deleteFromCompare() throws Exception {

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
	compareSteps.shoudSeeFirstBuildingInCompare();
	compareSteps.scrollUpFirstBuilding();
	compareSteps.shoudSeeRemovePropertyMsg();
	compareSteps.clickCancelMsgButton();
	compareSteps.shoudSeeFirstBuildingInCompare();
	compareSteps.scrollUpFirstBuilding();
	compareSteps.clickRemoveMsgButtom();
	compareSteps.notSeeFirstBuildingInCompare();


}}