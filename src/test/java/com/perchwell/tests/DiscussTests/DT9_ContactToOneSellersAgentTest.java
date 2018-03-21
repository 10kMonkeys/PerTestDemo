package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
public class DT9_ContactToOneSellersAgentTest extends SampleTest {

    @Test
    public void sendEmailToOneSellersAgent() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        sellersAgentSteps.findBuildingWithOneSellersAgent();
        sellersAgentSteps.swipeDownUntilSellersAgentSection();
        sellersAgentSteps.clickOnSellersAgentSection();
        sellersAgentSteps.clickSendEmailButton();
        sellersAgentSteps.selectConfirmOption();
        sellersAgentSteps.shouldInterestEmailSentToAgent();
    }
}
