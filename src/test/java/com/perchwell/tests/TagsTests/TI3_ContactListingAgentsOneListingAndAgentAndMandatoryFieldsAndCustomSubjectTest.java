package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI3_ContactListingAgentsOneListingAndAgentAndMandatoryFieldsAndCustomSubjectTest extends SampleTest {

    @Test
    public void contactListingAgentsOneListingAndAgentAndMandatoryFieldsAndCustomSubject() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atSellersAgentPage.swipeDownUntilSellersAgentSection();
        user.atOpenedBuildingPage.getTestAgentEmail();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentPage.fillInMessageField(DiscussionMessages.HELLO);
        user.atContactListingAgentPage.clickOnCollapseIcon();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentPage.clearSubjectField();
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentPage.fillInSubjectField(DiscussionMessages.CONTACT_AGENT_SUBJECT);
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentPage.clickOnSendEmailButton();
        user.atPerchwellPage.checkThatTwoListingsAreSelected();
        user.atSellersAgentPage.shouldContactEmailSentToOneAgent();
    }
}
