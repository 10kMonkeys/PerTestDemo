package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "CompareTests", "DiscussionsContacts"})
public class DT6_FilterByGroupsTest extends SampleTest {

    @Test
    public void checkFilterByGroup() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.addNewClient(ClientGroups.INACTICE);
        user.atClientPage.addNewClient(ClientGroups.NEW_CONTACTS);
        user.atClientPage.addNewClient(ClientGroups.PASSIVELY_SEARCHING);
        user.atClientPage.addNewClient(ClientGroups.NOT_GROUPED);
        user.atClientPage.clickOnGroupsButton();
        user.atClientPage.deselectInactiveGroup();
        user.atClientPage.deselectNewContactsGroup();
        user.atClientPage.deselectPassivelySearchingGroup();
        user.atClientPage.deselectNotGroupedGroup();
        user.atClientPage.clickOnDoneButton();
        user.atClientPage.checkFilteredClients(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.clickOnGroupsButton();
        user.atClientPage.deselectActivelySearchingGroup();
        user.atClientPage.selectInactiveGroup();
        user.atClientPage.clickOnDoneButton();
        user.atClientPage.checkFilteredClients(ClientGroups.INACTICE);
        user.atClientPage.clickOnGroupsButton();
        user.atClientPage.deselectInactiveGroup();
        user.atClientPage.selectNewContactsGroup();
        user.atClientPage.clickOnDoneButton();
        user.atClientPage.checkFilteredClients(ClientGroups.NEW_CONTACTS);
        user.atClientPage.clickOnGroupsButton();
        user.atClientPage.deselectNewContactsGroup();
        user.atClientPage.selectPassivelySearchingGroup();
        user.atClientPage.clickOnDoneButton();
        user.atClientPage.checkFilteredClients(ClientGroups.PASSIVELY_SEARCHING);
        user.atClientPage.clickOnGroupsButton();
        user.atClientPage.deselectPassivelySearchingGroup();
        user.atClientPage.selectNotGroupedGroup();
        user.atClientPage.clickOnDoneButton();
        user.atClientPage.checkFilteredClients(ClientGroups.NOT_GROUPED);
    }
}
