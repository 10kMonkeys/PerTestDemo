package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.clientdetails.ClientPage;

public class ClientSteps extends ScenarioSteps {

	ClientPage onPage;

	@Step
	public void setRandomClientData() {
		SessionVariables.addValueInSessionVariable("User_name", onPage.generateClientName());
		this.onPage.setClientName(SessionVariables.getValueFromSessionVariable("User_name"));
		SessionVariables.addValueInSessionVariable("User_email", onPage.generateClientEmail());
		this.onPage.setClientEmail(SessionVariables.getValueFromSessionVariable("User_email"));
	}

	@Step
	public void shouldSeeRecentlyCreatedClient() throws Exception {

		if(Config.isAndroid()) {
			onPage.isClientOrAgentDisplayedAndroid(SessionVariables.getValueFromSessionVariable("User_name"));
		} else {
			onPage.isClientOrAgentDisplayed(SessionVariables.getValueFromSessionVariable("User_name"));
		}
	}

	@Step
	public void clickOnYesButtonLogOutWindow() {
		onPage.clickOnYesButtonLogOutWindow();
	}

	@Step
	public void clickOnGroupLabel() {
		onPage.clickOnGroupLabel();
	}

	@Step
	public void selectGroup(String groupName) {
		onPage.selectGroup(groupName);
	}

	@Step
	public void clickOnAddNewClientButton() {
		if (onPage.getAddNewClientButton().isDisplayed()) {
			onPage.clickOnAddNewClientButton();
		} else {
			onPage.clickOnInviteNewClientButton();
		}
	}

	@Step
	public void clickOnInviteButton() {
		onPage.clickOnInviteButton();
	}

	@Step
	public void invitationEmailSent() {
		onPage.checkInvitationEmailSent("User_email");
//		Boolean result = onPage.checkInvitationEmailSent("User_email");
//		if (!result) {
//			result = onPage.checkInvitationEmailSent("User_email");
//		}
//		Assert.assertTrue(result);
	}

	@Step
	public void selectClient() {
		SessionVariables.addValueInSessionVariable("Client", onPage.getFirstClientOrAgentName());
		onPage.clickOnFirstClientOrAgent();
	}

	@Step
	public void clickOnCrossBackButtonFromClients() {
		onPage.clickOnCrossBackButtonFromClients();
	}

	@Step
	public void clickOnBackButtonCreateAgent() {
		onPage.clickOnBackButtonCreateAgent();
	}

	@Step
	public void clickOnBackButtonCreateAgentOnlyIOS() {
		if(!Config.isAndroid()) {
			onPage.clickOnBackButtonCreateAgent();
		}
	}

	@Step
	public void clickOnCancelButtonInDiscussWithClient() {
		onPage.clickOnCancelButtonInDiscussWithClient();
	}

	@Step
	public void clickOnJustCreatedClient() {
		onPage.clickOnDesiredClientOrAgent(SessionVariables.getValueFromSessionVariable("User_name"));
	}

	@Step
	public void clickOnExistingClient() throws Exception {
		onPage.isClientOrAgentDisplayed(AppProperties.INSTANCE.getProperty("client_name").toUpperCase());
		onPage.clickOnDesiredClientOrAgent(AppProperties.INSTANCE.getProperty("client_name").toUpperCase());
		SessionVariables.addValueInSessionVariable("Client", AppProperties.INSTANCE.getProperty("client_name"));
	}

	@Step
	public void logOut() {
		onPage.logOut();
	}

	public void clickOnAddNewAgentButton() {
		//if (onPage.getAddNewClientButton().isDisplayed()) {
		onPage.clickOnAddNewAgentButton();
//		} else {
//			onPage.clickOnInviteNewClientButton();
//		}
	}

	@Step("Set email {0}")
	public void setAgentEmail(String email) {
		this.onPage.setAgentEmail(email);
	}

	@Step("Set text in the message field {0}")
	public void setMessageField(String msg) {
		onPage.setMessageField(msg);
		SessionVariables.addValueInSessionVariable("Msg_for_agent", msg);
	}

	@Step
	public void clickOnExistingAgent() throws Exception {
		onPage.isClientOrAgentDisplayed(AppProperties.INSTANCE.getProperty("broker_name").toUpperCase());
		onPage.clickOnDesiredClientOrAgent(AppProperties.INSTANCE.getProperty("broker_name").toUpperCase());
		SessionVariables.addValueInSessionVariable("Agent", AppProperties.INSTANCE.getProperty("broker_name"));
	}

	@Step
	public void iOSClickOnClientSuccessfullyAddedOkButton() {
		onPage.clickOnClientSuccessfullyAddedOkButton();
	}

	@Step
	public void clickOnAgentSuccessfullyAddedOkButton() {
		if(!Config.isAndroid()) {
			onPage.clickOnClientSuccessfullyAddedOkButton();
		}
	}

	@Step
	public void swipeCreatedClientName() throws Exception {
		onPage.swipeCreatedClientName(SessionVariables.getValueFromSessionVariable("User_name"));
	}

	@Step
	public void clickOnDeleteButton() {
		onPage.clickOnDeleteButton();
	}

	@Step
	public void setJustDeletedClientData() {
		this.onPage.setClientName(SessionVariables.getValueFromSessionVariable("User_name"));
		this.onPage.setClientEmail(SessionVariables.getValueFromSessionVariable("User_email"));
	}

	@Step
	public void enterValueInSearchField(String someText) {
		onPage.enterValueInSearchField(someText);
	}

	@Step
	public void clickOutsideSearchSection() {
		onPage.clickOutsideSearchField();
	}

	@Step
	public void clickOnDeleteIconNextToSearchText() {
		onPage.clickOnClearTextButton();
	}

	@Step
	public void shouldTestClientPresentInClientsList() {
		onPage.isTestClientPresent();
	}

	@Step
	public void noteNumberClientsBeforeSearch() {
		onPage.noteNumberClientsBeforeSearch();
	}

	@Step
	public void shouldSearchBeCleared() {
		onPage.isSearchFieldCleared();
	}

	@Step
	public void selectTestClient() throws Exception {
		onPage.clickOnTestClient();
	}

	@Step
	public void addNewClient(String groupName) {
		this.clickOnAddNewClientButton();
		this.setRandomClientData();
		this.clickOnGroupLabel();
		this.selectGroup(groupName);
		this.clickOnInviteButton();
	}

	@Step
	public void clickOnGroupsButton() {
		onPage.clickOnGroupsButton();
	}

	@Step
	public void shouldClientNotBePresented() {
		onPage.isClientNotPresented(SessionVariables.getValueFromSessionVariable("User_name"));
	}

	@Step
	public void clickOnExistingClientForRemoveMessage() throws Exception {
		onPage.isClientOrAgentDisplayed(SessionVariables.getValueFromSessionVariable("User_name").toUpperCase());
		onPage.clickOnDesiredClientOrAgent(SessionVariables.getValueFromSessionVariable("User_name").toUpperCase());
	}

	@Step
	public void deselectActivelySearchingGroup() {
		onPage.clickOnActivelySearchingGroup();
	}

	@Step
	public void deselectInactiveGroup() {
		onPage.clickOnInactiveGroup();
	}

	@Step
	public void deselectNewContactsGroup() {
		onPage.clickOnNewContactsGroup();
	}

	@Step
	public void deselectPassivelySearchingGroup() {
		onPage.clickOnPassivelySearchingGroup();
	}

	@Step
	public void deselectNotGroupedGroup() {
		onPage.clickOnNotGroupedGroup();
	}

	@Step
	public void clickOnDoneButton() {
		onPage.clickOnDoneButton();
	}

	@Step
	public void checkFilteredClients(String clientGroup) {
		onPage.checkFilteredClients(clientGroup);
	}

	@Step
	public void shouldSeeClientGroup(String clientGroup) {
		onPage.shouldSeeClientGroup(clientGroup);
	}

	public void selectInactiveGroup() {
		onPage.clickOnInactiveGroup();
	}

	@Step
	public void selectNewContactsGroup() {
		onPage.clickOnNewContactsGroup();
	}

	@Step
	public void selectPassivelySearchingGroup() {
		onPage.clickOnPassivelySearchingGroup();
	}

	@Step
	public void selectNotGroupedGroup() {
		onPage.clickOnNotGroupedGroup();
	}

	@Step
	public void androidOpenDiscussionWithCreatedClient() {
		if (Config.isAndroid()) {
			Helper.androidSwipeDownUntilElementVisible(SessionVariables.getValueFromSessionVariable("User_name"));
			this.clickOnJustCreatedClient();
		}
	}

	@Step
	public void openDiscussion() {
		this.iOSClickOnClientSuccessfullyAddedOkButton();
		this.androidOpenDiscussionWithCreatedClient();
	}

	@Step
	public void clickOnCancelButton() {
		onPage.clickOnCancelButton();
	}

	@Step
	public void clickOnBackButtonCreateClientOnlyIOS() {
		if(!Config.isAndroid()) {
			onPage.clickOnBackButtonCreateClientOnlyIOS();
		}
	}
}
