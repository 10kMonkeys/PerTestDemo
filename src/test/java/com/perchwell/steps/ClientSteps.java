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
        this.clientPage.setClientEmail("TestItechArt2017@gmail.com");
        //this.clientPage.setClientEmail(RandomGenerator.getRandomString("11CLIENTEMAIL")+"@EMAIL.COM");
    }

    @Step
    public void shouldSeeRecentlyCreatedClient() throws Exception {
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
    	if (clientPage.getAddNewClientButton().isDisplayed()){
        clientPage.clickAddNewClientButton();
    }
		{
			clientPage.clickInviteNewClientButton();
		}
    }

    @Step
    public void clickInviteButton() {
        clientPage.clickInviteButton();
    }
}
