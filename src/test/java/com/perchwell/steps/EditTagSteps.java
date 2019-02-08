package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.EditTagPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EditTagSteps extends ScenarioSteps {

    EditTagPage onPage;

    @Step
    public void clickOnDeleteButton() {
        onPage.clickOnDeleteButton();
    }

    @Step
    public void confirmRemoving() {
        onPage.confirmRemoving();
    }

    @Step
    public void checkTagsItemsAmount(String valueToCheck) {
        onPage.checkTagsItemsAmount(valueToCheck);
    }

    @Step
    public void checkIfSaveButtonIsDisabled() {
        onPage.checkIfSaveButtonIsDisabled();
    }

    @Step
    public void changeJustCreatedTagName() {
        onPage.changeTagName("TAGNAME");
    }

    @Step
    public void checkIfSaveButtonIsEnabled() {
        onPage.checkIfSaveButtonIsEnabled();
    }

    @Step
    public void clickOnSaveButton() {
        onPage.clickOnSaveButton();
    }

    @Step
    public void changeClientTagName() {
        onPage.changeTagName("11CLIENTNAME");
    }

    @Step
    public void checkIfAlertsAreTurnedOn() {
        onPage.checkIfAlertsAreTurnedOn();
    }

    @Step
    public void switchAlertsToOff() {
        onPage.switchAlertsToOff();
    }

    @Step
    public void checkIfAlertsAreTurnedOff() {
        onPage.checkIfAlertsAreTurnedOff();
    }

    @Step
    public void switchAlertsToOn() {
        onPage.switchAlertsToOn();
    }

    @Step
    public void cancelTagRemoving() {
        onPage.cancelTagRemoving();
    }

    @Step
    public void shouldSeeEditTagLabel() {
        onPage.shouldSeeEditTagLabel();
    }

    @Step
    public void clickOnArrowBackFromEditTagPage() {
        onPage.clickOnArrowBackFromEditTagPage();
    }

    @Step
    public void shouldSeeCustomClient() {
        onPage.shouldSeeClient(SessionVariables.getValueFromSessionVariable("First_Custom_Client"));
    }
}
