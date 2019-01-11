package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class DT12_TwoAgentsListingDefaultSubjectTest extends SampleTest {

    @Test
    public void twoAgentsListingDefaultSubject() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInAddressSearchField("240 EAST 35TH");
        user.atSearchPage.clickOnListingByAddress("240 EAST 35TH");
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnSelectionButtonByAddress("240 East 35th St. #11A");
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
        user.atContactListingAgentSteps.fillInMessageField(DiscussionMessages.LETS_START_DISCUSSION);
        user.atContactListingAgentSteps.clickOnCollapseIcon();
        user.atContactListingAgentSteps.fillInEmailField(AppProperties.INSTANCE.getProperty("client_email"));
        user.atContactListingAgentSteps.checkIfEmailIsAdded(AppProperties.INSTANCE.getProperty("client_email"));
        user.atContactListingAgentSteps.clickOnSendEmailButton();
    }
}
