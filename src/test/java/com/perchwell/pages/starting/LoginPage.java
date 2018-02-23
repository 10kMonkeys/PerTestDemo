package com.perchwell.pages.starting;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){ super (driver);}
  @AndroidFindBy(id ="com.perchwell.perchwellapp:id/email" )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    private WebElement emailTextBox;

    @AndroidFindBy(id ="com.perchwell.perchwellapp:id/password" )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField")
    private WebElement passwordField;

    @AndroidFindBy(id ="com.perchwell.perchwellapp:id/log_in" )
    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;


    public void setEmail(String email) { element(emailTextBox).sendKeys(email); }

    public void clickLogin() { element(loginButton).click(); }

    public void setPassword(String password) { element(passwordField).sendKeys(password); }



}
