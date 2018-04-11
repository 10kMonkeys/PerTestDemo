package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import com.perchwell.pages.clientdetails.ClientPage;

public class ClientSteps extends ScenarioSteps {

	ClientPage onPage;

	@Step
	public void setRundomClientData() {
		onPage.addValueInSessionVariable("User name", onPage.generateClientName());
		this.onPage.setClientName(onPage.getValueFromSessionVariable("User name"));
		onPage.addValueInSessionVariable("User email", onPage.generateClientEmail());
		this.onPage.setClientEmail(onPage.getValueFromSessionVariable("User email"));
	}

	@Step
	public void shouldSeeRecentlyCreatedClient() throws Exception {
		Assert.assertTrue(onPage.isClientOrAgentDisplayed(onPage.getValueFromSessionVariable("User name")));
	}

	@Step
	public void clickYesButtonLogOutWindow() {
		onPage.clickYesButtonLogOutWindow();
	}

	@Step
	public void clickGroupLabel() {
		onPage.clickGroupLabel();
	}

	@Step
	public void selectGroup(String groupName) {
		onPage.selectGroup(groupName);
	}

	@Step
	public void clickAddNewClientButton() {
		if (onPage.getAddNewClientButton().isDisplayed()) {
			onPage.clickAddNewClientButton();
		} else {
			onPage.clickInviteNewClientButton();
		}
	}

	@Step
	public void clickInviteButton() {
		onPage.clickInviteButton();
	}

	@Step
	public void invitationEmailSent() {
		Assert.assertTrue(onPage.invitationEmailSent("User email"));
	}

	@Step
	public void selectClient() {
		onPage.addValueInSessionVariable("Client", onPage.getFirstClientOrAgentName());
		onPage.clickFirstClientOrAgent();
	}

	@Step
	public void clickBackButton() {
		onPage.clickBackButton();
	}

	@Step
	public void clickBackButtonCreateAgent() {
		onPage.clickBackButtonCreateAgent();
	}

	@Step
	public void closePage() {
		onPage.closePage();
	}

	@Step
	public void clickDesiredClient() throws Exception {
		onPage.clickDesiredClientOrAgent(onPage.getValueFromSessionVariable("User name"));
	}

	@Step
	public void clickExistingClient() throws Exception {
		if (onPage.isClientOrAgentDisplayed(AppProperties.INSTANCE.getProperty("client_name").toUpperCase())) {
			onPage.clickDesiredClientOrAgent(AppProperties.INSTANCE.getProperty("client_name").toUpperCase());
			onPage.addValueInSessionVariable("Client", AppProperties.INSTANCE.getProperty("client_name"));
		}
		else Assert.fail("Does not exist client with name '"+AppProperties.INSTANCE.getProperty("client_name")+"'. "
								 + "The name and mail of the client, who associated with the current broker, must be specified in the app.properties.");
	}

	@Step
	public void logOut() {
		onPage.logOut();
	}

	public void clickAddNewAgentButton() {
		//if (onPage.getAddNewClientButton().isDisplayed()) {
		onPage.clickAddNewAgentButton();
//		} else {
//			onPage.clickInviteNewClientButton();
//		}
	}

	@Step("Set email {0}")
	public void setAgentEmail(String email) {
		this.onPage.setAgentEmail(email);
	}

	@Step("Set text in the message field {0}")
	public void setMessageField(String msg) {
		onPage.setMessageField(msg);
		onPage.addValueInSessionVariable("Msg for agent", msg);
	}

	@Step
	public void clickExistingAgent() throws Exception {
		onPage.addValueInSessionVariable("Agent", onPage.getFirstClientOrAgentName());
		onPage.clickFirstClientOrAgent();
	}
	@Step
	public void clickClientSuccessfullyAddedOkButton() {
		onPage.clickClientSuccessfullyAddedOkButton();
	}
	@Step
	public void clickAgentSuccessfullyAddedOkButton() {
		onPage.clickClientSuccessfullyAddedOkButton();
	}

	@Step
	public void swipeCreatedClientName() throws Exception {
		onPage.swipeCreatedClientName(onPage.getValueFromSessionVariable("User name"));
	}

	@Step
	public void clickOnDeleteButton() {
		onPage.clickOnDeleteButton();
	}

	@Step
	public void shouldDeleteClientFromClientsList() {
		Assert.assertTrue(onPage.isDeletedClientNotPresentInClientsList(onPage.getValueFromSessionVariable("User name")));
	}

	@Step
	public void shouldNotContainPreviouslyDeletedClient() {
		Assert.assertTrue(onPage.isDeletedClientNotPresentInClientsList(onPage.getValueFromSessionVariable("User name")));
	}

	@Step
	public void setJustDeletedClientData() {
		this.onPage.setClientName(onPage.getValueFromSessionVariable("User name"));
		this.onPage.setClientEmail(onPage.getValueFromSessionVariable("User email"));
	}
}
