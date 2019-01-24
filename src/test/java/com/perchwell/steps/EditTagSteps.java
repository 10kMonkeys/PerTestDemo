package com.perchwell.steps;

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
}
