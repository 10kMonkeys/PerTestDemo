package com.perchwell.steps;

import com.perchwell.helpers.RandomGenerator;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import com.perchwell.pages.clientdetails.ClientPage;
import com.perchwell.entity.Client;


public class ClientSteps extends ScenarioSteps {

    Client client = new Client();
    ClientPage clientPage;


    @Step
    public void setRundomClientData() {
        client.setUniqueClientName(RandomGenerator.getRandomString("11CLIENTNAME"));
        this.clientPage.setClientName(client.getUniqueClientName());
        this.clientPage.setClientEmail(RandomGenerator.getRandomString("11CLIENTEMAIL")+"@EMAIL.COM");
    }

    @Step
    public void shouldSeeRecentlyCreatedClient() {
        Assert.assertTrue(clientPage.isClientDisplayed(client.getUniqueClientName()));
    }

    @Step
    public void clickGroupLabel() {
        clientPage.clickGroupLabel();
    }

    @Step
    public void selectGroup(String groupName) {
        clientPage.selectGroup(groupName);
    }

    @Step
    public void clickAddNewClientButton() {
        clientPage.clickAddNewClientButton();
    }

    @Step
    public void clickInviteButton() {
        clientPage.clickInviteButton();
    }
}
