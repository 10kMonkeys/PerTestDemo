package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.DiscussionPage;
import io.appium.java_client.AppiumDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class DiscussionSteps extends ScenarioSteps {
	DiscussionPage onPage;

	@Step
	public void shouldSeeDicsussionWithNewClient() {
		onPage.shouldBeCcMyEmailTextDispayed();
	}

	@Step
	public void clickOnBackButtonFromDiscussion() {
		onPage.clickOnBackButtonFromDiscussion();
	}

	@Step
	public void clickOnBackButtonFromDiscussionOnlyIOS() {
		if(!Config.isAndroid()) {
			onPage.clickOnBackButtonFromDiscussion();
		}
	}

	@Step
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
	public void clickOnCrossBackButtonFromDiscussion() {
		onPage.clickOnCrossBackButtonFromDiscussion();
	}

	@Step
	public void sendMessageWithPause(String text) {
		if(!Config.isAndroid()) {
			waitABit(20000);
		}
		this.typeMessage(text);
		this.clickOnSendButton();
	}

	@Step
	public void clickOnCrossBackButtonFromDiscussionsPage() {
		onPage.clickOnCrossBackButtonFromDiscussionsPage();
	}

	@Step
	public void justSendMessage(String text) {
		onPage.typeMessage(text);
		this.clickOnSendButton();
	}

	@Step
	public void clickOnArrowBackFromDiscussionToListViewButton() {
		onPage.clickOnArrowBackFromDiscussionToListViewButton();
	}
}
