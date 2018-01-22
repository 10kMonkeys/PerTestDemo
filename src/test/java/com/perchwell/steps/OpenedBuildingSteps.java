package com.perchwell.steps;

import com.perchwell.pages.perchwell.OpenedBuildingPage;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class OpenedBuildingSteps extends ScenarioSteps {

	OpenedBuildingPage onPage;

	@Step
	public void clickDiscussWithMyClientHint() {
		onPage.clickDiscussWithMyClientHint();
	}

	@Step
	public void clickMyTagsLabel() {
		onPage.clickMyTagsLabel();
	}

	@Step
	public void clickBackButton() {
		onPage.clickBackButton();
	}

	@Step
	public void ckickDeleteTagButton() {
		onPage.ckickDeleteTagButton();
	}

	@Step("Add to compare {0}")
	public void addToCompare(String buildingName) {
		onPage.clickAddToCompareButton();
		addBuildingAddressInSessionVariable(buildingName, onPage.getBuildingAddress());
	}

	@Step
	public void clickDiscussWithMyClientButton() {
		onPage.clickDiscussWithClientButton();
	}

	@Step
	public void clickAddDiscusButton() {
		onPage.clickAddDiscus();
	}

	private void addBuildingAddressInSessionVariable(String buildingName, String buildingAddress) {
		onPage.addAddressInSessionVariable(buildingName, buildingAddress);
	}

	public void shouldSeeBuildingAddress() {
		Assert.assertTrue(onPage.getBuildingAddress().equalsIgnoreCase(onPage.getFromSessionVariable("buidingAddress")));
	}

	@Step
	public void openExistingDuscussion() {
		onPage.openExistingDuscussion(onPage.getFromSessionVariable("Client"));
	}

	public void shouldSeeExistingDuscussion() {
		Assert.assertTrue(onPage.duscussionIsDisplayed(onPage.getFromSessionVariable("Client")));
	}

	@Step
	public void clickDiscussWithMyAgentButton() {
		onPage.clickDiscussWithMyAgentButton();
	}

	@Step
	public void shouldSeeExistingDuscussionWithAgent() {
		Assert.assertTrue(onPage.duscussionIsDisplayed(onPage.getFromSessionVariable("Agent")));
	}

	@Step
	public void openExistingDuscussionWithAgent() {
		onPage.openExistingDuscussion(onPage.getFromSessionVariable("Agent"));
	}
}

