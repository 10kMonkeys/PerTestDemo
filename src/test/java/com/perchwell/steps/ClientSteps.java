package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import com.perchwell.pages.clientdetails.ClientPage;

public class ClientSteps extends ScenarioSteps {

	ClientPage clientPage;

	@Step
	public void setRundomClientData() {
		clientPage.addValueInSessionVariable("User name",clientPage.generateClientName());
		this.clientPage.setClientName(clientPage.getValueFromSessionVariable("User name"));
		clientPage.addValueInSessionVariable("User email", clientPage.generateClientEmail()) ;
		this.clientPage.setClientEmail(clientPage.getValueFromSessionVariable("User email"));
	}

	@Step
	public void shouldSeeRecentlyCreatedClient() throws Exception {
		Assert.assertTrue(clientPage.isClientDisplayed(clientPage.getValueFromSessionVariable("User name")));
	}

	@Step
	public void clickYesButtonLogOutWindow() {
		clientPage.clickYesButtonLogOutWindow();
	}

	@Step
	public void clickGroupLabel() {
		clientPage.clickGroupLabel();
	}

	@Step
	public void selectGroup(String groupName) {
		clientPage.selectGroup(groupName);
	}

	@Step
	public void clickAddNewClientButton() {
		if (clientPage.getAddNewClientButton().isDisplayed()) {
			clientPage.clickAddNewClientButton();
		} else {
			clientPage.clickInviteNewClientButton();
		}
	}

	@Step
	public void clickInviteButton() {
		clientPage.clickInviteButton();
	}

	@Step
	public void invitationEmailSent() {
		Assert.assertTrue(clientPage.invitationEmailSent("User email"));
	}

	@Step
	public void selectClient() {
		clientPage.addValueInSessionVariable("Client", clientPage.getClientName());
		clientPage.clickClient();
	}

	@Step
	public void clickBackButton() {
		clientPage.clickBackButton();
	}

	@Step
	public void closePage() {
		clientPage.closePage();
	}

	@Step
	public void clickDesiredClient() throws Exception {
		clientPage.clickDesiredClient(clientPage.getValueFromSessionVariable("User name"));
	}

	@Step
	public void clickExistingClient() throws Exception {
		if (clientPage.isClientDisplayed(AppProperties.INSTANCE.getProperty("client_name").toUpperCase())) {
			clientPage.clickDesiredClient(AppProperties.INSTANCE.getProperty("client_name").toUpperCase());
			clientPage.addValueInSessionVariable("Client", AppProperties.INSTANCE.getProperty("client_name"));
		}
	}

	@Step
	public void logOut() {
		clientPage.logOut();
	}
}
