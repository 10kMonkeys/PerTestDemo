package com.perchwell.pages.tags;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShareTaggedItemsPage extends BasePage {

    @iOSXCUITFindBy(accessibility = "ShareTagsSendButton")
    private WebElement sendButton;

    @iOSXCUITFindBy(accessibility = "RecipientEmailTextField")
    private WebElement recipientTextBox;

    @iOSXCUITFindBy(accessibility = "TitleTextField")
    private WebElement titleTextBox;

    @iOSXCUITFindBy(accessibility= "MessageTextField")
    private WebElement messageTextBox;

    @iOSXCUITFindBy(accessibility ="itech.perch.test@gmail.com")
    private WebElement secondClient;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement doneButton;


    public ShareTaggedItemsPage(WebDriver driver) {
        super(driver);
    }

    public void fillInRecipientTextBox(String name){
        element(recipientTextBox).sendKeys(name);
    }

    public void fillInTitleTextBox(String title){
        element(titleTextBox).sendKeys(title);
    }

    public void fillInMessageTextBox(String message){
        element(messageTextBox).sendKeys(message);
    }

    public void sendButtonClick(){
        element(sendButton).click();
    }

    public void selectSecondClient(){
        element(secondClient).click();
    }

    public void doneButtonClick(){
        element(doneButton).click();
    }

    public String getValueFromSessionVariable(String name) {
        return Serenity.sessionVariableCalled(name);
    }

    public void addValueInSessionVariable(String name, String value) {
        Serenity.setSessionVariable(name).to(value);
    }
}
