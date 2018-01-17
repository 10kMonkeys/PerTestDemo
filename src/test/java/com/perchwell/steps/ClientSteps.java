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
		onPage.addValueInSessionVariable("User email", onPage.generateClientEmail()) ;
		this.onPage.setClientEmail(onPage.getValueFromSessionVariable("User email"));
	}

	@Step
	public void shouldSeeRecentlyCreatedClient() throws Exception {
		Assert.assertTrue(onPage.isClientDisplayed(onPage.getValueFromSessionVariable("User name")));
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
		onPage.addValueInSessionVariable("Client", onPage.getClientName());
		onPage.clickClient();
	}

	@Step
	public void clickBackButton() {
		onPage.clickBackButton();
	}

	@Step
	public void closePage() {
		onPage.closePage();
	}

	@Step
	public void clickDesiredClient() throws Exception {
		onPage.clickDesiredClient(onPage.getValueFromSessionVariable("User name"));
	}

	@Step
	public void clickExistingClient() throws Exception {
		if (onPage.isClientDisplayed(AppProperties.INSTANCE.getProperty("client_name").toUpperCase())) {
			onPage.clickDesiredClient(AppProperties.INSTANCE.getProperty("client_name").toUpperCase());
			onPage.addValueInSessionVariable("Client", AppProperties.INSTANCE.getProperty("client_name"));
		}
	}

	@Step
	public void logOut() {
		onPage.logOut();
	}
}
