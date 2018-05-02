package com.perchwell.tests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "ClientsTests", "First"})
public class ST5_AddClientTest extends SampleTest {

	@Test
	public void addClient() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOnOpenAccountButton();
		accountSteps.clickOnClientsLabel();
		clientSteps.clickOnAddNewClientButton();
		clientSteps.setRandomClientData();
		clientSteps.clickOnGroupLabel();
		clientSteps.selectGroup("Actively Searching");
		clientSteps.clickOnInviteButton();
		clientSteps.shouldSeeRecentlyCreatedClient();
		clientSteps.invitationEmailSent();
	}
}