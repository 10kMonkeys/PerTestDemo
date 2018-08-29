package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.DiscussionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiscussionSteps extends ScenarioSteps {
	DiscussionPage onPage;

	@Step
	public void shouldSeeDicsussionWithNewClient() {
		onPage.shouldBeCcMyEmailTextDispayed();
	}

	@Step
	public void clickOnBackButton() {
		onPage.clickOnBackButton();
	}

	private void typeMessage(String text) {
		onPage.typeMessage(text);
		SessionVariables.addValueInSessionVariable("message", text);
	}

	private void clickOnSendButton() {
		onPage.clickOnSendButton();
	}

	@Step("Send message '{0}'")
	public void sendMessage(String text) {
		this.typeMessage(text);
		this.clickOnSendButton();
	}

	@Step
	public void shouldSeeMessageInDiscussion() {
		onPage.shouldBeMessageDispayed(SessionVariables.getValueFromSessionVariable("message"));
	}

	@Step
	public void clickOnCloseButton() {
		onPage.clickOnCloseButton();
	}

	@Step
	public void clickOnDiscussionsCancelButton() {
		onPage.clickOndiscussionsCancelButton();
	}

	@Step
	public void sendMessageWithPause(String text) {
		waitABit(20000);
		this.typeMessage(text);
		this.clickOnSendButton();
	}
}
