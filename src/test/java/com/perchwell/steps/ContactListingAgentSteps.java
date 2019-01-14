package com.perchwell.steps;

import com.perchwell.pages.perchwell.ContactListingAgentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactListingAgentSteps extends ScenarioSteps {

    ContactListingAgentPage onPage;

    @Step
    public void checkIfSendEmailButtonIsDisabled() {
        onPage.checkIfSendEmailButtonIsDisabled();
    }

    @Step
    public void fillInMessageField(String message) {
        onPage.fillInMessageField(message);
    }

    @Step
    public void clickOnCollapseIcon() {
        onPage.clickOnCollapseIcon();
    }

    @Step
    public void checkIfSendEmailButtonIsEnabled() {
        onPage.checkIfSendEmailButtonIsEnabled();
    }

    @Step
    public void clearSubjectField() {
        onPage.clearSubjectField();
    }

    @Step
    public void fillInSubjectField(String message) {
        onPage.fillInSubjectField(message);
    }

    @Step
    public void clickOnSendEmailButton() {
        onPage.clickOnSendEmailButton();
    }

    @Step
    public void fillInEmailField(String email) {
        onPage.fillInEmailField(email);
    }

    @Step
    public void checkIfEmailIsAdded(String email) {
        onPage.checkIfEmailIsAdded(email);
    }

    @Step
    public void checkDefaultAgentCCAddress() {
        onPage.checkDefaultAgentCCAddress();
    }

    @Step
    public void hideKeyboard() {
        onPage.hideKeyboard();
    }

    @Step
    public void clickOnBackButton() {
        onPage.clickOnBackButton();
    }
}
