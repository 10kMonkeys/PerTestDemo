package com.perchwell.pages.starting;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.BasePage;

public class WelcomePage extends BasePage {

    public WelcomePage(WebDriver driver) {
        super (driver);
    }


    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;

    public void clickLoginButton(){
        element(loginButton).click();
    }
}