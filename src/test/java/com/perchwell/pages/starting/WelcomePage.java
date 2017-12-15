package com.perchwell.pages.starting;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.base.BasePage;

public class WelcomePage extends BasePage {

    public WelcomePage(WebDriver driver) {
        super (driver);
    }


    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;

    @iOSXCUITFindBy(accessibility = "CONNECT WITH")
    private WebElement connectWithButton;

    public void clickConnectWith() { element(connectWithButton).click(); }

    public void clickLoginButton(){
        element(loginButton).click();
    }
}