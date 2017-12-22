package com.perchwell.pages.starting;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.NoSuchElementException;
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

    @iOSXCUITFindBy(accessibility = "“Perchwell Staging” Wants to Use “google.com” to Sign In")
    private WebElement useGoogleComMsg;

	@iOSXCUITFindBy(accessibility = "Continue")
	private WebElement continueButton;

    public void clickConnectWith() { element(connectWithButton).click(); }

    public void clickLoginButton(){
        element(loginButton).click();
    }
	public void clickContinueButton(){
		element(continueButton).click();
	}

	public WebElement getUseGoogleComMsg() {
		return useGoogleComMsg;
	}


	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}