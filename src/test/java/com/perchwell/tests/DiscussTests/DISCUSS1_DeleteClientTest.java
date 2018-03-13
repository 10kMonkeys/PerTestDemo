package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
public class DISCUSS1_DeleteClientTest extends SampleTest {

    @Test
    public void deleteClient() throws Exception {
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
        clientSteps.swipeCreatedClientName();
        clientSteps.clickOnDeleteButton();
        clientSteps.shouldDeleteClientFromClientsList();
        clientSteps.closePage();
        accountSteps.clickClientsLabel();
        clientSteps.shouldNotContainPreviouslyDeletedClient();
    }
}
