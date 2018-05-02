package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
public class DT2_AddDeletedClientAgainTest extends SampleTest {

    @Test
    public void addDeletedClientAgain() throws Exception {
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
        emailSteps.acceptClientInvitation();
        clientSteps.swipeCreatedClientName();
        clientSteps.clickOnDeleteButton();
        clientSteps.clickOnAddNewClientButton();
        clientSteps.setJustDeletedClientData();
        clientSteps.clickOnGroupLabel();
        clientSteps.selectGroup("Actively Searching");
        clientSteps.clickOnInviteButton();
        clientSteps.shouldSeeRecentlyCreatedClient();
        emailSteps.shouldNotSecondInvitationSent();
    }
}
