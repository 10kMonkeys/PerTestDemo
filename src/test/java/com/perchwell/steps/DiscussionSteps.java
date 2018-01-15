package com.perchwell.steps;
import com.perchwell.pages.perchwell.DiscussionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class DiscussionSteps extends ScenarioSteps {

DiscussionPage discussionPage;

	@Step
	public void shouldSeeDicsussionWithNewClient() {
		Assert.assertTrue(discussionPage.ccMyEmailTextDispayed());
	}


	@Step
	public void clickBackButton() {
		discussionPage.clickBackButton();
	}


	private void typeMessage(String text) {
		discussionPage.typeMessage(text);
		discussionPage.addValueInSessionVariable("message",text);
	}


	private void clickSend() {
		discussionPage.clickSend();
	}

	@Step("Send message '{0}'")
	public void sendMessage(String text) {
		this.typeMessage(text);
		this.clickSend();
	}

public void shouldSeeMessageInDiscussion() {
	Assert.assertTrue(discussionPage.messageIsDispayed());

}
}

