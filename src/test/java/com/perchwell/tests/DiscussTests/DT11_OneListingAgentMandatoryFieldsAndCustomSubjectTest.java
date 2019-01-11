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
        user.atContactListingAgentSteps.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentSteps.fillInMessageField(DiscussionMessages.LETS_START_DISCUSSION);
        user.atContactListingAgentSteps.clickOnCollapseIcon();
        user.atContactListingAgentSteps.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentSteps.clearSubjectField();
        user.atContactListingAgentSteps.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentSteps.fillInSubjectField(DiscussionMessages.HELLO);
        user.atContactListingAgentSteps.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentSteps.clickOnSendEmailButton();
    }
}
