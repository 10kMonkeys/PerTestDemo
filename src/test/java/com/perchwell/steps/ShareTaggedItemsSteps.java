package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.tags.ShareTaggedItemsPage;
import net.thucydides.core.annotations.Step;

public class ShareTaggedItemsSteps {

    ShareTaggedItemsPage onPage;

    @Step
    public void selectClientEmail(){
        onPage.fillInRecipientTextBox(AppProperties.INSTANCE.getProperty("client_name").toUpperCase());
        onPage.selectClient();
    }

    @Step
    public void fillInTitle(String title){
        SessionVariables.addValueInSessionVariable("Report_name", RandomGenerator.getRandomString(title));
        onPage.fillInTitleTextBox(SessionVariables.getValueFromSessionVariable("Report_name"));
    }

    @Step
    public void fillInMessage(String message){
        onPage.fillInMessageTextBox(message);
    }

    @Step
    public void sendButtonClick(){
        onPage.sendButtonClick();
    }

    @Step
    public void doneButtonClick(){
        onPage.doneButtonClick();
    }
}
