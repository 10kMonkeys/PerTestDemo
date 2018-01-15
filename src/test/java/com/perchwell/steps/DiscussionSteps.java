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
	Assert.assertTrue(discussionPage.ccMyEmailTextDispayed());
}


@Step
public void clickBackButton() {
	discussionPage.clickBackButton();
}
}

