package com.perchwell.tests.ClientTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "DiscussionsContacts"})
public class DT1_DeleteClientTest extends SampleTest {

    @Test
    public void deleteClient() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.swipeCreatedClientName();
        user.atClientPage.clickOnDeleteButton();
        user.atClientPage.shouldClientNotBePresented();
        user.atClientPage.clickOnCrossBackButtonFromClients(); //new ai
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.shouldClientNotBePresented();
    }
}
