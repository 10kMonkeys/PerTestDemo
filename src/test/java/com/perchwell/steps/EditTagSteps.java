package com.perchwell.steps;

import com.perchwell.helpers.RandomGenerator;
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
    public void clickOnDuplicateButton() {
        onPage.clickOnDuplicateButton();
    }

    @Step
    public void shouldSeeEditTagLabel() {
        onPage.shouldSeeEditTagLabel();
    }

    @Step
    public void clickOnCancelButton() {
        onPage.clickOnCancelButton();
    }

    @Step
    public void clickOnSaveButton() {
        onPage.clickOnSaveButton();
    }

    @Step
    public void fillInDuplicateTagName() {
        SessionVariables.addValueInSessionVariable("Duplicated_Tag", RandomGenerator.getRandomString("TAGNAME"));
        onPage.fillInRandomTagName(SessionVariables.getValueFromSessionVariable("Duplicated_Tag"));
    }
}
