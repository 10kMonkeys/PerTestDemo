package com.perchwell.steps;

import com.perchwell.pages.perchwell.ComparePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CompareSteps extends ScenarioSteps {

	ComparePage onPage;

	@Step(("The first buildingAddressList is displayed without swipe"))
	public void firstBuildingIsDispayed() {
		onPage.firstBuildingIsDisplayed();
	}

	@Step("The second buildingAddressList is displayed without swipe")
	public void secondBuildingIsDispayed() {
		onPage.secondBuildingIsDisplayed();
	}

	@Step("Shoud see {0} is selected earlier for compare")
	public void shouldSeeSecondBuildingInCompare(String building) {
		onPage.shouldSeeSecondBuildingInCompare(building);
	}

	@Step("The third buildingAddressList is displayed with swipe")
	public void thirdBuildingIsDisplayed(String building) throws Exception {
		onPage.thirdBuildingIsDisplayed(building);
	}

	@Step
	public void clickOnSwipeUpToRemoveHint() {
		onPage.clickOnSwipeUpToRemoveHint();
	}

	@Step
	public void clickOnCancelMsgButton() {
		onPage.clickOnCancelMsgButton();
	}

	@Step
	public void clickOnRemoveMsgButton() {
		onPage.clickOnRemoveMsgButton();
	}

	@Step
	public void scrollUpFirstBuilding() {
		onPage.scrollUpFirstBuilding();
	}

	@Step
	public void shouldSeeRemovePropertyMsg() {
		onPage.removePropertyMsgIsDisplayed();
	}

	@Step("Shouldn't exist {0} in compare")
	public void notSeeFirstBuildingInCompare(String building) {
		onPage.notSeeFirstBuildingInCompare(building);
	}

	@Step("Should see {0} is selected earlier for compare")
	public void shouldSeeFirstBuildingInCompare(String building) {
		onPage.shouldSeeFirstBuildingInCompare(building);
	}
}
