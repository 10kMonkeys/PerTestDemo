package com.perchwell.pages.tags;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShareTaggedItemsPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "ShareTagsSendButton")
    private WebElement sendButton;

    @iOSXCUITFindBy(accessibility = "RecipientEmailTextField")
    private WebElement recipientTextBox;

    @iOSXCUITFindBy(accessibility = "TitleTextField")
    private WebElement titleTextBox;

    @iOSXCUITFindBy(accessibility= "MessageTextField")
    private WebElement messageTextBox;

    @iOSXCUITFindBy(accessibility ="itech.perchwell@gmail.com")
    private WebElement secondClient;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement doneButton;

    //endregion

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

    public void selectClient(){
        element(secondClient).click();
    }

    public void doneButtonClick(){
        element(doneButton).click();
    }

    public String generateCustomMessage() {
        return RandomGenerator.getRandomString("Message ");
    }
}
