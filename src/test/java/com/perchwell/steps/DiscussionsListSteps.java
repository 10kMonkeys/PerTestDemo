package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.DiscussionsListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiscussionsListSteps extends ScenarioSteps {
	DiscussionsListPage onPage;

	@Step("Previously created discussion is displayed first")
	public void shouldBeCreatedDiscussionFirst() {
		onPage.shouldBeCreatedDiscussionFirst();
	}

	@Step
	public void clickOnFirstDiscussion() {
		onPage.clickOnFirstDiscussion();
	}

	@Step
	public void shouldBeLastDiscussionWithBrokerFirst() {
		onPage.shouldBeLastDiscussionWithBrokerFirst();
	}

	@Step
	public void shouldFindDiscussionsEmailForExistingClient() {
		onPage.shouldFindDiscussionsEmailForExistingClient();
	}

	@Step("Discussion with new agent is not created")
	public void shouldNotBeDiscussionWithMessageDisplayed() {
		onPage.shouldNotBeDiscussionWithMessageDisplayed();
	}

	@Step
	public void swipeFirstDiscussionName() throws Exception {
		onPage.swipeFirstDiscussionName(onPage.getFirstItemValue());
	}

	@Step
	public void clickOnDeleteButton() {
		onPage.clickOnDeleteButton();
	}

	@Step
	public void shouldBeDiscussionDeletedFromDiscussionsList() {
		onPage.shouldBeDiscussionDeletedFromDiscussionsList();
	}

	@Step
	public void shouldBeNotDisplayedPreviouslyDeletedDiscussion() {
		onPage.shouldBeDiscussionDeletedFromDiscussionsList();
	}

	@Step
	public void closePage() {
		onPage.closePage();
	}

	@Step
	public void enterValueInSearchField(String someText) {
		onPage.enterValueInSearchField(someText);
	}

	@Step
	public void shouldBeTestClientPresentInFilterResult() {
		onPage.shouldBeTestClientPresentInFilterResult();
	}

	@Step
	public void shouldBeNothingDisplayedInFilterByPerson() {
		onPage.shouldBeNothingDisplayedInFilterByPerson();
	}

	@Step
	public void clickDeleteIconNextToSearchText() {
		onPage.clickOnClearTextButton();
	}

	@Step
	public void selectTestClient() throws Exception {
		onPage.clickOnTestClientInFilterSearch();
	}

	@Step
	public void shouldBeOnlyDiscussionWithTestClientDisplayed() {
		onPage.shouldBeOnlyDiscussionWithTestClientDisplayed();
	}

	@Step
	public void swipeJustCreatedDiscussion() throws Exception {
		onPage.swipeFirstDiscussionName(onPage.getJustCreatedDiscussion(
				SessionVariables.getValueFromSessionVariable("message")));
	}
}
