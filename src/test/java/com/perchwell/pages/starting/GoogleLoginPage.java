package com.perchwell.pages.starting;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLoginPage  extends BasePage {


    @iOSXCUITFindBy(accessibility= "Email or phone")
    private WebElement emailTextBox;


    @iOSXCUITFindBy(accessibility = "NEXT")
    private WebElement loginButton;


    @iOSXCUITFindBy(accessibility= "Enter your password")
    private WebElement passwordField;

    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }


    public void setEmail(String email) { element(emailTextBox).sendKeys(email); }

    public void clickLogin() { element(loginButton).click(); }

    public void setPassword(String password) { element(passwordField).sendKeys(password); }

}
