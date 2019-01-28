package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch"})
public class DT11_OneListingAgentMandatoryFieldsAndCustomSubjectTest extends SampleTest {

    @Test
    public void oneListingAgentMandatoryFieldsAndCustomSubject() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atSellersAgentPage.swipeDownUntilSellersAgentSection();
        user.atOpenedBuildingPage.getTestAgentEmail();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.selectFirstTestListingWithOneAgent();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
        user.atContactListingAgentPage.checkDefaultAgentCCAddress();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentPage.fillInMessageField(DiscussionMessages.MESSAGE);
        user.atContactListingAgentPage.clickOnCollapseIcon();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentPage.clearSubjectField();
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentPage.fillInSubjectField(DiscussionMessages.CONTACT_AGENT_SUBJECT);
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.shouldContactEmailSentToOneAgent();
    }
}
