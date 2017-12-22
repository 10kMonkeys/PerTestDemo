package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


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

}
}