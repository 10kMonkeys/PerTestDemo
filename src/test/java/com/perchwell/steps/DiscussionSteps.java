package com.perchwell.steps;

import com.perchwell.pages.perchwell.DiscussionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class DiscussionSteps extends ScenarioSteps {

	DiscussionPage onPage;

	@Step
	public void shouldSeeDicsussionWithNewClient() {
		Assert.assertTrue(onPage.ccMyEmailTextDispayed());
	}

	@Step
	public void clickBackButton() {
		onPage.clickBackButton();
	}

	private void typeMessage(String text) {
		onPage.typeMessage(text);
		onPage.addValueInSessionVariable("message", text);
	}

	private void clickSend() {
		onPage.clickSend();
	}

	@Step("Send message '{0}'")
	public void sendMessage(String text) {
		this.typeMessage(text);
		this.clickSend();
	}

	@Step
	public void shouldSeeMessageInDiscussion() {
		Assert.assertTrue(onPage.messageIsDispayed());

	}

}

