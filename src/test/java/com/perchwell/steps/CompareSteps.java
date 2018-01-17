package com.perchwell.steps;

import com.perchwell.pages.perchwell.ComparePage;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CompareSteps extends ScenarioSteps {
	ComparePage onPage;

	@Step(("The first buildingAddressList is displayed without swipe"))
	public void firstBuildingIsDispayed() {
		Assert.assertTrue(onPage.firstBuildingIsDispayed());
	}

	@Step("The second buildingAddressList is displayed without swipe")
	public void secondBuildingIsDispayed() {
		Assert.assertTrue(onPage.secondBuildingIsDispayed());
	}

	@Step("Shoud see {0} is selected earlier for compare")
	public void shoudSeeSecondBuildingInCompare(String building) {
		Assert.assertTrue(onPage.getSecondBuildingAddress().equalsIgnoreCase(onPage.getBuildingAddressFromSessionVariable(building)));
	}

	@Step(("The third buildingAddressList is displayed with swipe"))
	public void thirdBuildingIsDispayed(String building) throws Exception {
		Assert.assertTrue(onPage.isBuildingDisplayedWithSwipe(onPage.getBuildingAddressFromSessionVariable(building)));
	}

	@Step
	public void clickSwipeUpToRemoveHint() {
		onPage.clickSwipeUpToRemoveHint();
	}

	@Step
	public void clickCancelMsgButton() {
		onPage.clickCancelMsgButton();
	}

	@Step
	public void clickRemoveMsgButtom() {
		onPage.clickRemoveMsgButtom();
	}

	@Step
	public void scrollUpFirstBuilding() throws Exception {
		onPage.scrollUpFirstBulding();
	}

	@Step
	public void shoudSeeRemovePropertyMsg() {
		Assert.assertTrue(onPage.removePropertyMsgIsDispayed());
	}

	@Step("Shoudn't exist {0} in compare")
	public void notSeeFirstBuildingInCompare(String building) {
		Assert.assertFalse(onPage.getFirstBuildingAddress().equalsIgnoreCase(onPage.getBuildingAddressFromSessionVariable(building)));
	}

	@Step("Shoud see {0} is selected earlier for compare")
	public void shoudSeeFirstBuildingInCompare(String building) {
		Assert.assertTrue(onPage.getFirstBuildingAddress().equalsIgnoreCase(onPage.getBuildingAddressFromSessionVariable(building)));
	}

//@Deprecated
//@Step("Shoud see the first buildingAddressList is selected earlier for compare")
//public void shoudSeeFirstBuildingInCompare() {
//
//	Assert.assertTrue(comparePage.getFirstBuildingAddress().equalsIgnoreCase(openedBuildingPage.buildingAddressList.get(0)));
//
//}

}
