package com.perchwell.pages.tags;

import com.perchwell.crossPlatform.Config;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ShareTaggedItemsPage extends BasePage {

    //region WebElements

    @AndroidFindBy(id = "com.perchwell.re.staging:id/send")
    @iOSXCUITFindBy(accessibility = "ShareTagsSendButton")
    private WebElement sendButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/recipient_wrapper")
    @iOSXCUITFindBy(accessibility = "RecipientEmailTextField")
    private WebElement recipientTextBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "TitleTextField")
    private WebElement titleTextBox;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/message")
    @iOSXCUITFindBy(accessibility = "MessageTextField")
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
        if (Config.isAndroid()) {
            element(recipientTextBox).click();
            getDriver().navigate().back();
            setImplicitTimeout(1, SECONDS);
            Helper.androidSwipeDownUntilElementVisible(name);
            resetImplicitTimeout();
        } else {
            element(recipientTextBox).sendKeys(name);
        }

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
        if(Config.isAndroid()) {
            element(MobileBy.xpath("//*[@text='" + AppProperties.INSTANCE.getProperty("client_email") + "']")).click();
        } else {
            element(MobileBy.AccessibilityId(AppProperties.INSTANCE.getProperty("client_email"))).click();
        }
    }

    public void doneButtonClick(){
        if(!Config.isAndroid()) {
            element(doneButton).click();
        }
    }

    public String generateCustomMessage() {
        return RandomGenerator.getRandomString("Message ");
    }
}
