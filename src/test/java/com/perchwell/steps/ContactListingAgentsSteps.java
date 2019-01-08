package com.perchwell.steps;

import com.perchwell.pages.perchwell.ContactListingAgentsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactListingAgentsSteps extends ScenarioSteps {

    ContactListingAgentsPage onPage;

    @Step
    public void clickOnBackButton() {
        onPage.clickOnBackButton();
    }

    @Step
    public void fillMessageField(String message){
        onPage.fillMessageField(message);
    }

    public void clickOnSendEmailButton() {
        onPage.clickOnSendEmailButton();
    }
}
