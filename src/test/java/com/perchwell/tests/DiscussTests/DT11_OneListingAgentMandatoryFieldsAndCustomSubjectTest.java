package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.SessionVariables;
import org.junit.Test;

public class DT11_OneListingAgentMandatoryFieldsAndCustomSubjectTest extends SampleTest {

    @Test
    public void oneListingAgentMandatoryFieldsAndCustomSubject() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atSellersAgentPage.findBuildingWithOneSellersAgent();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnSelectionButtonByAddress(SessionVariables.getValueFromSessionVariable("building address"));
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
        user.atDiscussThisListingPage.checkIfSendEmailButtonIsDisabled();
        user.atDiscussThisListingPage.fillInMessageField(DiscussionMessages.LETS_START_DISCUSSION);
        user.atDiscussThisListingPage.clickOnCollapseIcon();
        user.atDiscussThisListingPage.checkIfSendEmailButtonIsEnabled();
        user.atDiscussThisListingPage.clearSubjectField();
        user.atDiscussThisListingPage.checkIfSendEmailButtonIsDisabled();
        user.atDiscussThisListingPage.fillInSubjectField(DiscussionMessages.HELLO);
        user.atDiscussThisListingPage.checkIfSendEmailButtonIsEnabled();
        user.atDiscussThisListingPage.clickOnSendEmailButton();
    }
}
