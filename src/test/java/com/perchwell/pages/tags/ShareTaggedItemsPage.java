package com.perchwell.pages.tags;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShareTaggedItemsPage extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    private WebElement sendButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]")
    private WebElement recipientTextBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
    private WebElement titleTextBox;

    @iOSXCUITFindBy(accessibility= "MESSAGE")
    private WebElement messageTextBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]")
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
}
