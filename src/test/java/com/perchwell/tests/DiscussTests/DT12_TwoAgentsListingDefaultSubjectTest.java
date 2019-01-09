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
        user.atSearchPage.setMaximumPriceFilter("13000000");
        user.atSearchPage.setMinimumPriceFilter("13000000");
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.clickOnSelectionButtonByAddress("240 East 35th St. #11A");
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
        user.atDiscussThisListingPage.fillInMessageField(DiscussionMessages.LETS_START_DISCUSSION);
        user.atDiscussThisListingPage.clickOnCollapseIcon();
        user.atDiscussThisListingPage.fillInEmailField(AppProperties.INSTANCE.getProperty("client_email"));
        user.atDiscussThisListingPage.checkIfEmailIsAdded(AppProperties.INSTANCE.getProperty("client_email"));
        user.atDiscussThisListingPage.clickOnSendEmailButton();
    }
}
