package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
public class DT1_DeleteClientTest extends SampleTest {

    @Test
    public void deleteClient() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickClientsLabel();
        clientSteps.addNewClient(ClientGroups.ACTIVELYSEARCHING);
        clientSteps.swipeCreatedClientName();
        clientSteps.clickOnDeleteButton();
        clientSteps.isClientNotPresented();
        clientSteps.closePage();
        accountSteps.clickClientsLabel();
        clientSteps.isClientNotPresented();
    }
}
