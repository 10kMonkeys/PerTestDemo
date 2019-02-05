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
        onPage.changeTagName();
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
        onPage.changeTagName();
    }

    @Step
    public void shouldSeeTestClient() {
        onPage.shouldSeeTestClient();
    }

    @Step
    public void checkClientTagsItemsAmount() {
        onPage.checkClientTagsItemsAmount();
    }

    @Step
    public void changeBackTestClientsName() {
        onPage.changeBackTestClientsName();
    }
}
