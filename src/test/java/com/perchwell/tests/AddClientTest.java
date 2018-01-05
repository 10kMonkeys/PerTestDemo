package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class AddClientTest extends SampleTest {

@Test
public void addClient() throws Exception {

	loginSteps.loginAsBroker();
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