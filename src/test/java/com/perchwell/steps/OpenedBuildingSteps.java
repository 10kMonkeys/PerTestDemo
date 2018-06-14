package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class OpenedBuildingSteps extends ScenarioSteps {

	OpenedBuildingPage onPage;

	@Step
	public void clickOnDiscussWithMyClientHint() {
		onPage.clickOnDiscussWithMyClientHint();
	}

	@Step
	public void clickOnMyTagsLabel() {
		onPage.clickOnMyTagsLabel();
	}

	@Step
	public void clickOnBackButton() {
		onPage.clickOnBackButton();
	}

	@Step
	public void clickOnDeleteTagButton() {
		onPage.clickOnDeleteTagButton();
	}

	@Step("Add to compare {0}")
	public void addToCompare(String buildingName) {
		onPage.clickOnAddToCompareButton();
		SessionVariables.addValueInSessionVariable(buildingName, onPage.getBuildingAddress());
	}

	@Step
	public void clickOnDiscussWithMyClientOption() {
		onPage.clickOnDiscussWithClientOption();
	}

	@Step
	public void clickOnAddDiscusButton() {
		onPage.clickOnAddDiscus();
	}

	@Step
	public void shouldSeeBuildingAddress() {
		onPage.isBuildingAddressDisplayed();
	}

	@Step
	public void openExistingDiscussion() {
		onPage.openExistingDiscussion(SessionVariables.getValueFromSessionVariable("Client"));
	}

	public void shouldSeeExistingDiscussion() {
		onPage.discussionIsDisplayed(SessionVariables.getValueFromSessionVariable("Client"));
	}

	@Step
	public void clickOnSendWithinPerchwell() {
		onPage.clickOnSendWithinPerchwell();
	}

	@Step
	public void shouldSeeExistingDiscussionWithAgent() {
		onPage.discussionIsDisplayed(SessionVariables.getValueFromSessionVariable("Agent"));
	}

	@Step
	public void openExistingDiscussionWithAgent() {
		onPage.openExistingDiscussion(SessionVariables.getValueFromSessionVariable("Agent"));
	}

	@Step
	public void isDiscussionWithMyClientDisplayed() {
		onPage.isDiscussionWithMyClientDisplayed();
	}

	@Step
	public void isFilterStudioApplied() {
		onPage.isTextStudioDisplayed();
	}

	@Step
	public void isFilter1BathApplied() {
		onPage.isText1BathDisplayed();
	}

	@Step
	public void shouldFilterFireplaceApplied() throws Exception {
		onPage.clickFeaturesAmenities();
		onPage.isFireplaceDisplayed();
	}

	@Step
	public void clickShareButton() {
		onPage.clickOnShareButton();
	}

	@Step
	public void isBuildingOpen() {
		onPage.isBuildingOpen();
	}

	@Step
	public void openDiscussionWithJustCreatedClient() {
		onPage.openDiscussionWithJustCreatedClient(SessionVariables.getValueFromSessionVariable("User_name"));
	}
}

