package com.perchwell.tests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "ClientsTests", "Second"})
public class ST5_AddClientTest extends SampleTest {

	@Test
	public void addClient() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickClientsLabel();
		clientSteps.clickAddNewClientButton();
		clientSteps.setRundomClientData();
		clientSteps.clickGroupLabel();
		clientSteps.selectGroup("Actively Searching");
		clientSteps.clickInviteButton();
		clientSteps.shouldSeeRecentlyCreatedClient();
		clientSteps.invitationEmailSent();
	}
}