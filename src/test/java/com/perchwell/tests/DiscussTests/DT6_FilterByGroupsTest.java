package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class DT6_FilterByGroupsTest extends SampleTest {

    @Test
    public void checkFilterByGroup() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.addNewClient("Actively Searching");
        user.atClientPage.addNewClient("Inactive");
        user.atClientPage.addNewClient("New contacts");
        user.atClientPage.addNewClient("Passively Searching");
        user.atClientPage.addNewClient("Not Grouped");
        user.atClientPage.clickOnGroupsButton();
    }
}
