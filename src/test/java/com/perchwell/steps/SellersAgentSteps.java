package com.perchwell.steps;

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
    public void findBuildingWithOneSellersAgent() throws Exception {
        perchwellPage.openFirstBuilding();
        openedBuildingPage.clickDiscussWithMyClientHint();
        if (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickBackButton();
            perchwellPage.openSecondBuilding();
        }
        while (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickBackButton();
            perchwellPage.swipeDownUntillNextBuildingVisible();
            perchwellPage.clickLastVisibleBuilding();
        }
        openedBuildingPage.addAddressInSessionVariable("building address", openedBuildingPage.getBuildingAddress());
    }

    @Step
    public void swipeDownUntilSellersAgentSection() throws Exception {
        openedBuildingPage.swipeDownUntilElementVisible(openedBuildingPage.getOneSellersAgentElement());
    }

    @Step
    public void clickOnSellersAgentSection() {
        openedBuildingPage.clickOneSellersAgentSection();
    }

    @Step
    public void clickSendEmailButton() {
        sellersAgentPage.clickSendEmailButton();
    }

    @Step
    public void selectConfirmOption() {
        sellersAgentPage.clickConfirmButton();
    }

    @Step
    public void shouldInterestEmailSentToAgent() {
        Assert.assertTrue(sellersAgentPage.shouldInterestEmailSentToOneAgent());
    }
}
