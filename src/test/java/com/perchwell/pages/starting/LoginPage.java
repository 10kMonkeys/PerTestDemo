package com.perchwell.pages.starting;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){ super (driver);}

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    private WebElement emailTextBox;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField")
    private WebElement passwordField;

    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;


    public void setEmail(String email) { element(emailTextBox).sendKeys(email); }

    public void clickLogin() { element(loginButton).click(); }

    public void setPassword(String password) { element(passwordField).sendKeys(password); }
}
