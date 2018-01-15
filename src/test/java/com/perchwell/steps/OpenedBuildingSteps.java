package com.perchwell.steps;

import com.perchwell.pages.perchwell.OpenedBuildingPage;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class OpenedBuildingSteps extends ScenarioSteps {

	OpenedBuildingPage openedBuildingPage;

	@Step
	public void clickDiscussWithMyClientHint() {
		openedBuildingPage.clickDiscussWithMyClientHint();
	}

	@Step
	public void clickMyTagsLabel() {
		openedBuildingPage.clickMyTagsLabel();
	}

	@Step
	public void clickBackButton() {
		openedBuildingPage.clickBackButton();
	}

	@Step
	public void ckickDeleteTagButton() {
		openedBuildingPage.ckickDeleteTagButton();
	}

	@Step("Add to compare {0}")
	public void addToCompare(String buildingName) {
		openedBuildingPage.clickAddToCompareButton();
		addBuildingAddressInSessionVariable(buildingName, openedBuildingPage.getBuildingAddress());
	}

	@Step
	public void clickDiscussWithMyClientButton() {
		openedBuildingPage.clickDiscussWithClientButton();
	}

	@Step
	public void clickAddDiscusButton() {
		openedBuildingPage.clickAddDiscus();
	}


	private void addBuildingAddressInSessionVariable(String buildingName, String buildingAddress) {
		openedBuildingPage.addAddressInSessionVariable(buildingName, buildingAddress);
	}

	public void shouldSeeBuildingAddress() {
		Assert.assertTrue(openedBuildingPage.getBuildingAddress().equalsIgnoreCase(openedBuildingPage.getFromSessionVariable("buidingAddress")));
	}

	@Step
	public void openExistingDuscussion() {
		openedBuildingPage.openExistingDuscussion(openedBuildingPage.getFromSessionVariable("Client"));
	}

	public void shouldSeeExistingDuscussion() {
	Assert.assertTrue(openedBuildingPage.duscussionIsDisplayed(openedBuildingPage.getFromSessionVariable("Client")));
	}
}

