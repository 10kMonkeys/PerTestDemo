package com.perchwell.tests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "ClientsTests", "First"})
public class ST5_AddClientTest extends SampleTest {

	@Test
	public void addClient() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnClientsLabel();
		user.atClientPage.addNewClient(ClientGroups.ACTIVELYSEARCHING);
		user.atClientPage.shouldSeeRecentlyCreatedClient();
		user.atClientPage.invitationEmailSent();
	}
}