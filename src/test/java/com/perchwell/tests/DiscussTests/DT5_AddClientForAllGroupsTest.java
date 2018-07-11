package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class DT5_AddClientForAllGroupsTest extends SampleTest {

    @Test
    public void addClientForAllGroups() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();

        user.atClientPage.addNewClient("Actively Searching");
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnDesiredClient();
// user.atClientPage.shouldSeeClientGroup("Actively Searching"); //todo implement after fix of hotelka
        user.atClientPage.clickOnBackButton();

        user.atClientPage.addNewClient("Inactive");
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnDesiredClient();
// user.atClientPage.shouldSeeClientGroup("Inactive"); //todo implement after fix of hotelka
        user.atClientPage.clickOnBackButton();

        user.atClientPage.addNewClient("New contacts");
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnDesiredClient();
// user.atClientPage.shouldSeeClientGroup("New contacts"); //todo implement after fix of hotelka
        user.atClientPage.clickOnBackButton();

        user.atClientPage.addNewClient("Passively Searching");
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnDesiredClient();
// user.atClientPage.shouldSeeClientGroup("Passively Searching"); //todo implement after fix of hotelka
        user.atClientPage.clickOnBackButton();

        user.atClientPage.addNewClient("Not Grouped");
        user.atClientPage.shouldSeeRecentlyCreatedClient();
        user.atClientPage.clickOnDesiredClient();
// user.atClientPage.shouldSeeClientGroup("Not Grouped"); //todo implement after fix of hotelka
        user.atClientPage.clickOnBackButton();
    }
}
