package com.perchwell.steps;

import com.perchwell.pages.perchwell.OpenedBuildingPage;
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
	public void clickDiscussWithMyClientOption() {
		onPage.clickDiscussWithClientOption();
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
	public void clickSendWithinPerchwell() {
		onPage.clickSendWithinPerchwell();
	}

	@Step
	public void shouldSeeExistingDuscussionWithAgent() {
		Assert.assertTrue(onPage.duscussionIsDisplayed(onPage.getFromSessionVariable("Agent")));
	}

	@Step
	public void openExistingDuscussionWithAgent() {
		onPage.openExistingDiscussionWithAgent(onPage.getFromSessionVariable("Agent"));
	}

	@Step
	public void isDiscussionWithMyClientDisplayed() {
		Assert.assertTrue(onPage.isDiscussionWithMyClientDisplayed());

	}

	public void isFilterStudioApplied() {

		Assert.assertTrue(onPage.isTextStudioDisplayed());
	}

	public void isFilter1BathApplied() {
		Assert.assertTrue(onPage.isText1BathDisplayed());
	}

	@Step
	public void shouldFilterFirepaceApplied() throws Exception {
		onPage.clickFeaturesAmenities();
		onPage.shouldFireplaceDisplayed();
	}

	public void clickShareButton() {
		onPage.clickShareButton();
	}

	@Step
	public void isBuildingOpen(){
		Assert.assertTrue(onPage.isBuildingOpen());
	}
}

