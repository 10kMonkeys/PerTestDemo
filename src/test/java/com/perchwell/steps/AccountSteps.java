package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.account.AccountPage;
import org.junit.Assert;

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

    @Step
    public void clickCompareLabel() {
        accountPage.clickCompareLabel();
    }

    @Step
    public void shouldSeeOptionClient() throws Exception {
        Assert.assertTrue(accountPage.optionClientsIsDispalyed());
    }

    @Step
    public void shouldSeeOptionCompare() throws Exception {
        Assert.assertTrue(accountPage.optionCompareIsDispalyed());
    }
    @Step
    public void shouldSeeOptionDisscussions() throws Exception {
        Assert.assertTrue(accountPage.optionDiscussionsIsDispalyed());
    }
    @Step
    public void shouldSeeOptionTags() throws Exception {
        Assert.assertTrue(accountPage.optionTagsIsDispalyed());
    }

    @Step
    public void shouldSeeOptionAgents() throws Exception {
        Assert.assertTrue(accountPage.optionAgentsIsDispalyed());
    }
}
