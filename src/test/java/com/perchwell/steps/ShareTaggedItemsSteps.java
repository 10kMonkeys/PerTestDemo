package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import com.perchwell.pages.tags.ShareTaggedItemsPage;
import net.thucydides.core.annotations.Step;

public class ShareTaggedItemsSteps {

    ShareTaggedItemsPage onPage;

    @Step
    public void selectClientEmail(){
        onPage.fillInRecipientTextBox(AppProperties.INSTANCE.getProperty("client_name").toUpperCase());
        onPage.selectSecondClient();
    }

    @Step
    public void fillInTitle(String title){
        onPage.fillInTitleTextBox(title);
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
