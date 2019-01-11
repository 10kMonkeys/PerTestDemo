package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import com.perchwell.pages.perchwell.SellersAgentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SellersAgentSteps extends ScenarioSteps {
    PerchwellPage perchwellPage;
    OpenedBuildingPage openedBuildingPage;
    SellersAgentPage sellersAgentPage;

    @Step
    public void findBuildingWithOneSellersAgent() {
        perchwellPage.openFirstBuilding();
        openedBuildingPage.clickOnDiscussWithMyClientHint();
        if (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickOnArrowBackButtonFromListing();
            perchwellPage.openSecondBuilding();
        }
        while (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickOnArrowBackButtonFromListing();
            perchwellPage.swipeDownUntilNextBuildingVisible();
            perchwellPage.clickOnLastVisibleBuilding();
        }
        SessionVariables.addValueInSessionVariable("building address", openedBuildingPage.getBuildingAddress());
    }

    @Step
    public void swipeDownUntilSellersAgentSection(){
        openedBuildingPage.swipeDownUntilElementVisible(openedBuildingPage.getOneSellersAgentElement());
    }

    @Step
    public void swipeDownUntilSellersSeveralAgentsSection(){
        openedBuildingPage.swipeDownUntilElementVisible(openedBuildingPage.getSeveralSellersAgentsElement());
    }

    @Step
    public void clickOnSellersAgentSection() {
        openedBuildingPage.clickOnOneSellersAgentSection();
    }

    @Step
    public void clickOnSendEmailButton() {
        sellersAgentPage.clickOnSendEmailButton();
    }

    @Step
    public void selectConfirmOption() {
        sellersAgentPage.clickOnConfirmButton();
    }

    @Step
    public void shouldInterestEmailSentToAgent() {
        sellersAgentPage.shouldInterestEmailSentToOneAgent();
    }

    @Step
    public void updateMessage() {
        SessionVariables.addValueInSessionVariable("Agent_message", sellersAgentPage.generateAgentMessage());
        sellersAgentPage.updateMessage(SessionVariables.getValueFromSessionVariable("Agent_message"));
    }

    @Step
    public void shouldInterestEmailSentToTwoAgent() {
        sellersAgentPage.shouldInterestEmailSentToTwoAgent();
    }

    @Step
    public void clickOnPositiveButton() {
        openedBuildingPage.clickOnPositiveButton();

    }

    @Step
    public void shouldContactEmailSentToOneAgent() {
        sellersAgentPage.shouldContactEmailSentToOneAgent();
    }

    @Step
    public void shouldContactEmailSentToTwoAgents() {
        sellersAgentPage.shouldContactEmailSentToTwoAgents();
    }
}
