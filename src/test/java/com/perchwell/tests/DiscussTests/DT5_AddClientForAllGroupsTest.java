package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "CompareTests", "DiscussionsContacts"})
public class DT5_AddClientForAllGroupsTest extends SampleTest {

    @Test
    public void addClientForAllGroups() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnJustCreatedClient();
        user.atClientPage.shouldSeeClientGroup(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.clickOnBackButtonCreateAgent();
        user.atClientPage.addNewClient(ClientGroups.INACTICE);
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnJustCreatedClient();
        user.atClientPage.shouldSeeClientGroup(ClientGroups.INACTICE);
        user.atClientPage.clickOnBackButtonCreateAgent();
        user.atClientPage.addNewClient(ClientGroups.NEW_CONTACTS);
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnJustCreatedClient();
        user.atClientPage.shouldSeeClientGroup(ClientGroups.NEW_CONTACTS);
        user.atClientPage.clickOnBackButtonCreateAgent();
        user.atClientPage.addNewClient(ClientGroups.PASSIVELY_SEARCHING);
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnJustCreatedClient();
        user.atClientPage.shouldSeeClientGroup(ClientGroups.PASSIVELY_SEARCHING);
        user.atClientPage.clickOnBackButtonCreateAgent();
        user.atClientPage.addNewClient(ClientGroups.NOT_GROUPED);
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnJustCreatedClient();
        user.atClientPage.shouldSeeClientGroup(ClientGroups.NOT_GROUPED);
    }
}
