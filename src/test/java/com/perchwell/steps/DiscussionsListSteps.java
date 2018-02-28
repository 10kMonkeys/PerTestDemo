package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import com.perchwell.pages.perchwell.DiscussionsListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.seleniumhq.jetty9.util.PathWatcher;

public class DiscussionsListSteps extends ScenarioSteps {
DiscussionsListPage onPage;

	@Step("Previusoly created discussion is displayed first")
	public void createdDiscussionIsFirst(){
		Assert.assertTrue(onPage.getFistDiscussionClient().equalsIgnoreCase(onPage.getValueFromSessionVariable("Client")));
		Assert.assertTrue(onPage.getFistDiscussionMessage().equalsIgnoreCase(onPage.getValueFromSessionVariable("message")));
	}

	public void clickFirstDiscusion() {
		onPage.clickFirstDiscussion();
	}

	public void lastDiscussionWithBrokerIsFirst() {
		Assert.assertTrue(onPage.getFistDiscussionMessage().equalsIgnoreCase(onPage.getValueFromSessionVariable("message")));
	}

	public void shouldFindDiscussionsEmailForExistingClient() {
		Assert.assertTrue(onPage.discussionsEmailSent(onPage.getValueFromSessionVariable("message")));
	}

	@Step("Discussion with new agent is not created")
	public void discussionWithMessageNotDisplayed(){
		Assert.assertFalse(onPage.discusionWithMsgIsDispayed(onPage.getValueFromSessionVariable("Msg for agent")));
	}

}

