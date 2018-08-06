package com.perchwell.tests.ClientTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "DiscussionsContacts"})
public class DT2_AddDeletedClientAgainTest extends SampleTest {

    @Test
    public void addDeletedClientAgain() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING);
        user.atEmailPage.acceptClientInvitation();
        user.atClientPage.swipeCreatedClientName();
        user.atClientPage.clickOnDeleteButton();
        user.atClientPage.clickOnAddNewClientButton();
        user.atClientPage.setJustDeletedClientData();
        user.atClientPage.clickOnGroupLabel();
        user.atClientPage.selectGroup(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.clickOnInviteButton();
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atEmailPage.shouldNotSecondInvitationSent();
    }
}
