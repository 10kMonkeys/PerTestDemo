package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.account.AccountPage;

public class AccountSteps extends ScenarioSteps{
    AccountPage accountPage;

    @Step
    public void clickClientsLabel() {
        accountPage.clickClientsLabel();
    }

    @Step
    public void clickTagsLabel() {
        accountPage.clickTagsLabel();
    }
}
