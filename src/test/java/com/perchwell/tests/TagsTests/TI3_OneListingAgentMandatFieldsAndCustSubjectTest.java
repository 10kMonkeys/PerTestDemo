package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsFirst", "Android_TagsFirst", "TagsFirst"})
public class TI3_OneListingAgentMandatFieldsAndCustSubjectTest extends SampleTest {

    @Test
    public void oneListingAgentTagMandatoryFieldsAndCustomSubject() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atSellersAgentPage.swipeDownUntilSellersAgentSection();
        user.atOpenedBuildingPage.getTestAgentEmail();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.getFirstBuildingAddress();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnSearchButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
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
        user.atMyTagsPage.checkFirstListingsIsSelected();
        user.atSellersAgentPage.shouldContactEmailSentToOneAgent();
    }
}
